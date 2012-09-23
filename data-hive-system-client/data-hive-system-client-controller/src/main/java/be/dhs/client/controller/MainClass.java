package be.dhs.client.controller;

import static be.dhs.client.controller.Application.startApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
		
		startApplication();
	}
}
