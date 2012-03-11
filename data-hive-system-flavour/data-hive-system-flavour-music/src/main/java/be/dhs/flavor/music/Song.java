package be.dhs.flavor.music;

import javax.persistence.Entity;

import be.dhs.persistence.abs.AbstractComponent;

/** Song entity object from the music flavour.
 * @author	GallifreyanCode
 * @version	0.0.1-alpha
 */
@Entity
public class Song extends AbstractComponent {
	private static final long serialVersionUID = 1081320877505673201L;

	public Song(){
        super();
    }
}
