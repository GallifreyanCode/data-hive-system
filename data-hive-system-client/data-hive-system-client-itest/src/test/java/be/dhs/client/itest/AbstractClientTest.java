package be.dhs.client.itest;

import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.edt.GuiTask;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import be.dhs.client.controller.MainPresenter;
import be.dhs.client.ui.main.MainFrame;

public class AbstractClientTest {
	//protected FrameFixture window;
    private static MainPresenter controller;
    private static MainFrame mainFrame;
    
	@BeforeClass
    public static void setUp() {
    	/* Create instances and execute the mainFrame with the Fest testing framework 
    	 * The .setVisible() must not be executed by you, its the Fest framework that initiates the visibility*/
    	controller = new MainPresenter();
    	controller.start();
        mainFrame = GuiActionRunner.execute(new GuiQuery<MainFrame>() {
            protected MainFrame executeInEDT() {
                return controller.getMainFrame();
            }
        });
        
        GuiActionRunner.execute(new GuiTask() {
          public void executeInEDT() {
        	  mainFrame.showMainFrame();
          }
        });
        
        //window = new FrameFixture(mainFrame);
        /*
         * Window.show is optional, if it is used YOU MUST specify the correct dimension.
         * If else it leads to the drawing of a really small screen!
         * You could use a controller.getMainFrameDimension or something to make it reusable!
         */
        //window.show(new Dimension(800,600)); // shows the frame to test
    }
	
	@AfterClass
    public static void tearDown(){
        controller.stop();
    }
}
