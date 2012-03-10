package be.dhs.persistence.abs;

import be.dhs.api.role.Creation;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Version;

/**
 * Abstract implementation of Creation.
 * It enables to pass concrete Creation behavior to subclasses.<br>
 * TODO: Extract common behavior from abstract classes in the future,
 * only specifics should remain.
 * @author	GallifreyanCode
 * @version	0.0.1-alpha
 */
// @MappedSuperclass
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractCreation implements Creation, Serializable {
	private static final long serialVersionUID = 7843682500904580609L;

	@Id @GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	@Version
	private Integer version;
	private String name;

	public AbstractCreation() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
