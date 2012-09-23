package be.dhs.client.ui.main;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import be.dhs.client.api.IPresenter;
/**
 * This is the main frame of the application.
 * Visual components are added using a the builder pattern.
 * Just a test.
 * @author GallifreyanCode
 * @version 0
 */
public class MainFrame extends JFrame {
	private static final long serialVersionUID = -763491454756428767L;
	private static final int DEFAULT_WIDTH = 200;
	private static final int DEFAULT_HEIGHT = 200;
	private IPresenter mainController;
	private DefaultListModel flavorList;	
	/**
	 * Default constructor.
	 */
	public MainFrame(IPresenter mainController){
		this.mainController = mainController;
		setName(getClass().getSimpleName());
		setDefaultSettings();
		loadBaseUI();
	}
	/**
	 * Sets the size of the frame.
	 * @return MainFrame: this instance of JFrame
	 */
	public MainFrame setDimension(int width, int height){
		this.setSize(new Dimension(width, height));
		return this;
	}
	/**
	 * Sets the frame in the center of the screen.
	 * @return MainFrame: this instance of JFrame
	 */
	public MainFrame setCentered(){
		Dimension screenDimensions = Toolkit.getDefaultToolkit().getScreenSize();
		int width = this.getSize().width;
		int height = this.getSize().height;
		int x = (screenDimensions.width-width)/2;
		int y = (screenDimensions.height-height)/2;
		this.setLocation(x, y);
		return this;
	}
	/**
	 * Makes the frame visible on the screen.
	 * @return void; this will stop the builder styled adding
	 */
	public void showMainFrame(){
		this.setVisible(true);
	}
	/* TODO: create an interface for a flavor,
	 *  it takes in a new panel and everything specific can be loaded after that.
	 */
	/**
	 * Adds the music flavor abilities.
	 * TODO: Make this addition dynamic based on settings or service availability.
	 * @return MainFrame: this instance of JFrame
	 */
	public MainFrame addMusicFlavor(){
		/* Add flavor to flavorList */
		flavorList.add(flavorList.getSize(), "Music Flavor");
		/* Add the flavor UI components */
		/* ! This panel should be a seperat ui-component in the future */
		JPanel flavorPanel = new JPanel();
		flavorPanel.setLayout(new BorderLayout());
		
		JTextField txt = new JTextField();
		JButton btn = new JButton("Add Artist");
		btn.addActionListener(mainController.actionAddArtist(txt));
		flavorPanel.add(txt, BorderLayout.CENTER);
		flavorPanel.add(btn, BorderLayout.EAST);
		getContentPane().add(flavorPanel, BorderLayout.CENTER);
		return this;
	}
	/**
	 * Adds the film flavor abilities.
	 * TODO: Make this addition dynamic based on settings or service availability.
	 * @return MainFrame: this instance of JFrame
	 */
	public MainFrame addFilmFlavor(){
		/* Add flavor to flavorList */
		flavorList.add(flavorList.getSize(), "Film Flavor");
		/* Add the flavor UI components */
		return this;
	}
	/**
	 * Adds the film flavor abilities.
	 * TODO: Make this addition dynamic based on settings or service availability.
	 * @return MainFrame: this instance of JFrame
	 */
	public MainFrame addBookFlavor(){
		/* Add flavor to flavorList */
		flavorList.add(flavorList.getSize(), "Book Flavor");
		/* Add the flavor UI components */
		return this;
	}
	/**
	 * Loads the default settings,
	 *  this functions as some sort of backup for when no custom preferences are enabled before drawing the frame.
	 * It can also contains predefined settings which are not overruled by custom preferences.
	 */
	private void setDefaultSettings(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
	}
	/**
	 * Load base UI components here.
	 * Base components are components that are always loaded.
	 */
	private void loadBaseUI(){
		flavorList = new DefaultListModel();
		JList list = new JList(flavorList);
		getContentPane().add(list, BorderLayout.WEST);
	}
}
