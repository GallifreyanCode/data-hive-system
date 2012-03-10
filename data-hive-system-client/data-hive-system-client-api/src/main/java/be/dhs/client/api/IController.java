package be.dhs.client.api;

import java.awt.event.ActionListener;

import javax.swing.JTextField;
/**
 * Controller Façade for UI.
 * It elimintes crazy dependencies and restricts UI interactions.
 * @author	GallifreyanCode
 * @version	0.0.1-alpha
 */
public interface IController {
	ActionListener actionAddArtist(JTextField txt);
}
