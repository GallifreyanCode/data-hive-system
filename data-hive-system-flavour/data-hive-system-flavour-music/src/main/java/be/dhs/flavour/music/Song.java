package be.dhs.flavour.music;

import javax.persistence.Entity;

import be.dhs.persistence.entity.abs.AbstractComponent;

/** Song entity object from the music flavour.
 * @author	GallifreyanCode
 * @version	0.0.1-alpha
 */
@Entity
public class Song extends AbstractComponent {
	private static final long serialVersionUID = 1081320877505673201L;

	public Song(){
        super();
		setType(getClass().getSimpleName());
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
