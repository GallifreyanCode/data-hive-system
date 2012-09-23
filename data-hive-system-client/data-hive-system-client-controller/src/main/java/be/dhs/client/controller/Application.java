package be.dhs.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.dhs.spring.application.ContextConfig;
import be.dhs.spring.persistence.PersistenceJPAConfig;

public class Application {

	private static final Logger logger = LoggerFactory.getLogger(MainClass.class);
	private static final String PRESENTER = "mainPresenter";
	private MainPresenter presenter;
	
	public Application() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class, PersistenceJPAConfig.class);  
		logger.debug("AnnotationConfigApplicationContext Loaded");
		for(String bean : context.getBeanDefinitionNames()){
			logger.debug(bean);
		}
		presenter = (MainPresenter) context.getBean(PRESENTER);
	}
	
	public static Application startApplication() {
		Application application = new Application();
		application.presenter.start();
		application.presenter.showMainFrame();
		return application;
	}
	
	public void stopApplication() {
		this.presenter.stop();
	}
}
