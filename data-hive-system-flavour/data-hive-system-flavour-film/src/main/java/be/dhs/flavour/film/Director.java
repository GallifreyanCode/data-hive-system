package be.dhs.flavour.film;

import javax.persistence.Entity;

import be.dhs.persistence.abs.AbstractCreator;

/** Director entity object from the film flavour.
 * @author	GallifreyanCode
 * @version	0.0.1-alpha
 */
@Entity
public class Director extends AbstractCreator {
	private static final long serialVersionUID = -1979225730110187353L;
	
	public Director(){
		super();
	}
}
