package be.dhs.flavour.music;

import javax.persistence.Entity;

import be.dhs.persistence.entity.abs.AbstractCreation;

/** Album entity object from the music flavour.
 * @author	GallifreyanCode
 * @version	0.0.1-alpha
 */
@Entity
public class Album extends AbstractCreation {
	private static final long serialVersionUID = 4868830716106849290L;

	public Album(){
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
