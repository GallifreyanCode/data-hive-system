package be.dhs.spring.persistence;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Loader for JPA & Persistence related Spring configurations.
 * @author	GallifreyanCode
 * @version	0.0.1-alpha
 */
@Configuration
@EnableTransactionManagement
@ImportResource( "classpath*:*springDataConfig.xml" )
@ComponentScan( { "be.gallifreyan.code.dhs" } )
public class PersistenceJPAConfig {
    @Value( "${jdbc.driverClassName}" ) private String driverClassName;
    @Value( "${jdbc.url}" ) private String url;
    @Value( "${jpa.generateDdl}" ) boolean jpaGenerateDdl;

    // Hibernate specific
    @Value( "${hibernate.dialect}" ) String hibernateDialect;
    @Value( "${hibernate.show_sql}" ) boolean hibernateShowSql;
    @Value( "${hibernate.hbm2ddl.auto}" ) String hibernateHbm2ddlAuto;

    public PersistenceJPAConfig(){
        super();
    }

    /* Bean configurations */

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(){
        final LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource( getDataSource() );
        factoryBean.setPackagesToScan( new String[ ] { "be.gallifreyan.code.dhs.flavor" } );

        final JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter(){
            {
                // setDatabase( Database.H2 ); // TODO: is this necessary?
                setDatabasePlatform( hibernateDialect );
                setShowSql( hibernateShowSql );
                setGenerateDdl( jpaGenerateDdl );
            }
        };
        factoryBean.setJpaVendorAdapter( vendorAdapter );

        factoryBean.setJpaProperties( additionlProperties() );

        return factoryBean;
    }

    @Bean
    public DataSource getDataSource(){
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName( driverClassName );
        dataSource.setUrl( url );
        dataSource.setUsername( "kim" );
        dataSource.setPassword( "8svcXUwGPjZHdVmV" );
        return dataSource;
    }

    @Bean
    public JpaTransactionManager transactionManager(){
        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory( entityManagerFactoryBean().getObject() );
        return transactionManager;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor(){
        return new PersistenceExceptionTranslationPostProcessor();
    }

    //
    final Properties additionlProperties(){
        return new Properties(){
			private static final long serialVersionUID = -5849145376429000522L;

			{
                // use this to inject additional properties in the EntityManager
                setProperty( "hibernate.hbm2ddl.auto", hibernateHbm2ddlAuto );
            }
        };
    }
}

