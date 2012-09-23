package be.dhs.flavour.film;

import javax.persistence.Entity;

import be.dhs.persistence.entity.abs.AbstractCreation;

/** Film entity object from the film flavour.
 * @author	GallifreyanCode
 * @version	0.0.1-alpha
 */
@Entity
public class Film extends AbstractCreation {
	private static final long serialVersionUID = -5011058222043308454L;

	public Film(){
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
