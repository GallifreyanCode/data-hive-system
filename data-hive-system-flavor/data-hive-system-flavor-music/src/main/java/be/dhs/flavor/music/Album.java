package be.dhs.flavor.music;

import be.dhs.persistence.abs.AbstractCreation;

import javax.persistence.Entity;

/** Album entity object from the music flavour.
 * @author	GallifreyanCode
 * @version	0.0.1-alpha
 */
@Entity
public class Album extends AbstractCreation {
	private static final long serialVersionUID = 4868830716106849290L;

	public Album(){
		super();
	}

}
