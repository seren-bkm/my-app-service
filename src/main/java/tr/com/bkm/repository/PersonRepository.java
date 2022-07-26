package tr.com.bkm.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import tr.com.bkm.domain.Person;

/**
 * Spring Data SQL repository for the Person entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}
