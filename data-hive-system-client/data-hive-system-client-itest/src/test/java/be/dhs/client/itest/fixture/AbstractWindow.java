package be.dhs.client.itest.fixture;

import java.awt.Window;

import org.fest.swing.fixture.FrameFixture;

public class AbstractWindow<T extends Window> extends FrameFixture  {

	public AbstractWindow(String name) {
		super(name);
	}

	public AbstractWindow<T> assertVisible() {
		this.requireVisible();
		return this;
	}
}
