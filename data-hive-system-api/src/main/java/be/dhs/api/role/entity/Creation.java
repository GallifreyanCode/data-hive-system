package be.dhs.api.role.entity;

import be.dhs.api.Entity;

/** <p>This is a <b>parent interface</b> for entities designated as <b>Creation</b>,
 * it inherits global entity characteristics and behavior from the {@link Entity} interface.
 * It contains characteristics and behavior shared by all entities fulfilling the <b>Creation Role</b>.
 * <p><b>Creation Role:</b><br>
 * Every creation has one or more components and one parent creation.
 * </p>
 * Each <b>Creation</b> should have
 * <ul> 
 * <li> List of its components
 * </ul>
 * @author	GallifreyanCode
 * @version	 0.0.1-alpha
 * @see {@link Creator}, {@link Component}
 */
public interface Creation extends Entity {

}
