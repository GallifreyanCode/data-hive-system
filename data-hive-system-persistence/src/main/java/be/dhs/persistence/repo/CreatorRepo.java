package be.dhs.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import be.dhs.api.role.Creator;

/**
 * Repository interface for Creator. This is not the repository bean to be used.
 * A proxy interface is used to pass AbstractCreator instead of Creator objects.<br>
 * TODO: This is a work in progress.<br>
 * TODO: Remove double code.
 * @author	GallifreyanCode
 * @version	0.0.1-alpha
 * @see	<a href="http://forum.springsource.org/showthread.php?120993-Entity-not-found-in-JpaRepository-when-using-generics">Spring Forum Issue</a>
 */
@NoRepositoryBean
public interface CreatorRepo<T extends Creator> extends JpaSpecificationExecutor<T>, JpaRepository<T, Long> {
    T findByName(final String name);
}
