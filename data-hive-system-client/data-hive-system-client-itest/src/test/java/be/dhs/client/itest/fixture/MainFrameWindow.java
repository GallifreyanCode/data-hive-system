package be.dhs.client.itest.fixture;

import be.dhs.client.ui.main.MainFrame;

public class MainFrameWindow extends AbstractWindow<MainFrame> {

	private MainFrameWindow() {
		super("MainFrame");
	}
	
	public static MainFrameWindow aMainFrameWindow() {
		return new MainFrameWindow();
	}
}
