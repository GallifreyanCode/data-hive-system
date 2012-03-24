package be.dhs.client.itest;

import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;

import be.dhs.client.controller.MainController;
import be.dhs.client.ui.main.MainFrame;

public abstract class AbstractClientTest {
	protected FrameFixture window;
    private MainController controller;
    private MainFrame mainFrame;
    
	@Before
    public void setUp() {
    	/* Create instances and execute the mainFrame with the Fest testing framework 
    	 * The .setVisible() must not be executed by you, its the Fest framework that initiates the visibility*/
    	controller = new MainController();
    	controller.start();
        mainFrame = GuiActionRunner.execute(new GuiQuery<MainFrame>() {
            protected MainFrame executeInEDT() {
                return controller.getMainFrame();
            }
        });
        window = new FrameFixture(mainFrame);
        /*
         * Window.show is optional, if it is used YOU MUST specify the correct dimension.
         * If else it leads to the drawing of a really small screen!
         * You could use a controller.getMainFrameDimension or something to make it reusable!
         */
        //window.show(new Dimension(800,600)); // shows the frame to test
    }
	
	@After
    public void tearDown(){
    	mainFrame.dispose();
        window.cleanUp();
    }
}
