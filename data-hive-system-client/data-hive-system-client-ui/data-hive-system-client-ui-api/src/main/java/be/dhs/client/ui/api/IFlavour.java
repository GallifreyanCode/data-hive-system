package be.dhs.client.ui.api;
/**
 * TODO: This is the first idea to abstract the different kinds of flavour.
 * @author Kim
 *
 */
public interface IFlavour {
	/**
	 * Loads the whole UI for the flavour.
	 */
	void loadFlavor();

	/**
	 * Get the flavour name, this can be used for compiling a list of loaded
	 * flavours.
	 * 
	 * @return String: name of flavor
	 */
	String getName();
}
