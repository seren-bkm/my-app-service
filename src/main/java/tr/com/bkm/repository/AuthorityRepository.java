package tr.com.bkm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.bkm.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
