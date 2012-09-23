package be.dhs.client.controller;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.dhs.client.api.IPresenter;
import be.dhs.client.ui.main.MainFrame;

/**
 * Just a test.
 * 
 * @author GallifreyanCode
 * @version 0
 */
@Named
public class MainPresenter implements IPresenter {
	@SuppressWarnings("unused")
	private AnnotationConfigApplicationContext context;
	private MainFrame mainFrame;
	private ServiceClass serviceClass;

	/**
	 * Default constructor that creates an instance of the MainFrame.
	 */
	public MainPresenter() {
		mainFrame = new MainFrame(this);
	}

	/**
	 * @deprecated
	 * @since MainController is Spring managed bean
	 */
	public MainPresenter(AnnotationConfigApplicationContext context) {
		/*
		 * TODO: Better solution for this context loading and debug logging of
		 * bean def
		 */
		this.context = context;
		/* Example of manual bean searching */
		// AbstractCreatorRepo r = (AbstractCreatorRepo)
		// context.getBean("abstractCreatorRepo");
		// System.out.println(r);
		mainFrame = new MainFrame(this);
	}

	/**
	 * Start method that is invoked. This sets the configurations of the UI.
	 */
	public void start() {
		mainFrame.setDimension(800, 600).setCentered().addMusicFlavor();
	}
	
	public void stop() {
		WindowEvent wev = new WindowEvent(mainFrame, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
	}

	/**
	 * Gives you the created MainFrame.
	 * 
	 * @return MainFrame
	 */
	public MainFrame getMainFrame() {
		return mainFrame;
	}

	/**
	 * Separate the show frame from the start() method. Makes it easy to share
	 * the "showing" responsibility with e.g. the Fest UI tests.
	 */
	public void showMainFrame() {
		mainFrame.showMainFrame();
	}

	/* TODO: ! This should be an Action, not an ActionListener */
	public ActionListener actionAddArtist(final JTextField txt) {

		ActionListener actionAddArtist = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getServiceClass().addArtist(txt.getText());
			}
		};
		return actionAddArtist;
	}

	private ServiceClass getServiceClass() {
		// return (ServiceClass) context.getBean("serviceClass");
		return serviceClass;
	}

	/**
	 * Autowired annotation on setter method. It makes it easier to test = the
	 * class can now be injected with mock objects.
	 * 
	 * @param serviceClass
	 *            : {@link ServiceClass} object
	 */
	@Inject
	public void setServiceClass(ServiceClass serviceClass) {
		this.serviceClass = serviceClass;
	}
}
