package be.dhs.client.itest;

import java.awt.Dimension;

import org.junit.Test;

public class ITMainFrame extends AbstractClientTest {
	
	@Test
    public void testDefaultSize(){
        Dimension expectedSize = new Dimension(800, 600);
        window.requireSize(expectedSize);
    }

	@Test
    public void testDefaultSize3() throws Exception {
            Dimension expectedSize = new Dimension(800, 600);
            window.requireSize(expectedSize);
    }
}
