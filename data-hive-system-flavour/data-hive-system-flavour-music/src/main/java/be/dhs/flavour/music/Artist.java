package be.dhs.flavour.music;

import javax.persistence.Entity;

import be.dhs.persistence.entity.abs.AbstractCreator;

/** Artist entity object from the music flavour.
 * @author	GallifreyanCode
 * @version	0.0.1-alpha
 */
@Entity
public class Artist extends AbstractCreator {
	private static final long serialVersionUID = -5477109320566538252L;

	public Artist(){
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
