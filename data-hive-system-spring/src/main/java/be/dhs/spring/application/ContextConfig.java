package be.dhs.spring.application;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Loader for standard Spring configurations.
 * @author	GallifreyanCode
 * @version	0.0.1-alpha
 */
@Configuration
@ImportResource( "classpath*:contextConfig.xml" )
public class ContextConfig{

    public ContextConfig(){
        super();
    }
}
