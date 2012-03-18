package be.dhs.api.role.entity;

import be.dhs.api.Entity;

/** <p>This is a <b>parent interface</b> for entities designated as <b>Component</b>,
 * it inherits global entity characteristics and behavior from the {@link Entity} interface.
 * It contains characteristics and behavior shared by all entities fulfilling the <b>Component Role</b>.
 * <p><b>Component Role:</b><br>
 * Every component one parent creation.
 * </p>
 * Each <b>Component</b> should have
 * <ul> 
 * <li> Reference to its parent creation.
 * </ul>
 * @author	GallifreyanCode
 * @version	 0.0.1-alpha
 * @see {@link Creator}, {@link Creation}
 */
public interface Component extends Entity {

}
