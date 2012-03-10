package be.dhs.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.dhs.spring.application.ContextConfig;
import be.dhs.spring.persistence.PersistenceJPAConfig;
/** This is the <b>main class</b> for the client,
 * it starts the Spring context.
 * @author	GallifreyanCode
 * @version	0.0.1-alpha
 */
public class MainClass {
	private static final Logger logger = LoggerFactory.getLogger(MainClass.class);
	
	public static void main(String args[]){
		logger.info("Application Main Started");
		logger.warn("TEST CLIENT STARTING - JUST A LOCAL DEMO");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class, PersistenceJPAConfig.class);  
		logger.debug("AnnotationConfigApplicationContext Loaded");
		for(String bean : context.getBeanDefinitionNames()){
			logger.debug(bean);
		}
		MainController controller = (MainController) context.getBean("mainController");
		/**
		 * Application start outside of Spring container
		 * MainController controller = new MainController(context);
		 */
		controller.start();
	}
}
