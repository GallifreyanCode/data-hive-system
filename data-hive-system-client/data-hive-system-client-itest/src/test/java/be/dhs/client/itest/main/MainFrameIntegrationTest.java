package be.dhs.client.itest.main;

import static be.dhs.client.itest.fixture.MainFrameWindow.aMainFrameWindow;

import java.awt.Dimension;

import org.junit.Test;

import be.dhs.client.itest.AbstractClientTest;
import be.dhs.client.itest.fixture.MainFrameWindow;

public class MainFrameIntegrationTest extends AbstractClientTest {

	private MainFrameWindow mainFrameWindow = aMainFrameWindow();
	
	@Test
	public void whenApplicationIsStartedMainFrameShouldBeVisible() {
		mainFrameWindow.assertVisible();
	}

	@Test
	public void whenApplicationIsStartedMainFrameShouldHaveDefaultSize() {
		Dimension expectedSize = new Dimension(800, 600);
		mainFrameWindow.requireSize(expectedSize);
	}
}
