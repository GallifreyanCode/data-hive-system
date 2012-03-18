package be.dhs.api.role.entity;

import be.dhs.api.Entity;

/** <p>This is a <b>parent interface</b> for entities designated as <b>Creator</b>,
 * it inherits global entity characteristics and behavior from the {@link Entity} interface.
 * It contains characteristics and behavior shared by all entities fulfilling the <b>Creator Role</b>.
 * <p><b>Creator Role:</b><br>
 * Every creator has one or more creations.
 * </p>
 * Each <b>Creator</b> should have
 * <ul> 
 * <li> List of its creations
 * </ul>
 * @author	GallifreyanCode
 * @version	 0.0.1-alpha
 * @see {@link Creation}, {@link Component}
 */
public interface Creator extends Entity {

}
