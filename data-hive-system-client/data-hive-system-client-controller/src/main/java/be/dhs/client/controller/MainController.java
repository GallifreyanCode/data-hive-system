package be.dhs.client.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import be.dhs.client.api.IController;
import be.dhs.client.ui.main.MainFrame;
/**
 * Just a test.
 * @author	GallifreyanCode
 * @version 0
 */
@Controller
public class MainController implements IController {
	@SuppressWarnings("unused")
	private AnnotationConfigApplicationContext context;
	private MainFrame mainFrame;
	private ServiceClass serviceClass;
	
	public MainController(){
		mainFrame = new MainFrame(this);
	}
	
	/** @deprecated 
	 * 	@since MainController is Spring managed bean */
	public MainController(AnnotationConfigApplicationContext context){
		/* TODO: Better solution for this context loading and debug logging of bean def */
		this.context = context;
		/* Example of manual bean searching */
		//AbstractCreatorRepo r = (AbstractCreatorRepo) context.getBean("abstractCreatorRepo");
		//System.out.println(r);
		mainFrame = new MainFrame(this);
	}
	
	public void start(){
		mainFrame.setDimension(800, 600).setCentered().addMusicFlavor().showMainFrame();
	}
	
	/* TODO: ! This should be an Action, not an ActionListener */
	public ActionListener actionAddArtist(final JTextField txt){

		ActionListener actionAddArtist = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getServiceClass().addArtist(txt.getText());
			}
		};
		return actionAddArtist;
	}
	
	private ServiceClass getServiceClass(){
		//return (ServiceClass) context.getBean("serviceClass");
		return serviceClass;
	}
	/**
	 * Autowired annotation on setter method.
	 * It makes it easier to test = the class can now be injected with mock objects.
	 * @param serviceClass: {@link ServiceClass} object
	 */
	@Autowired
	public void setServiceClass(ServiceClass serviceClass){
		this.serviceClass = serviceClass;
	}
}
