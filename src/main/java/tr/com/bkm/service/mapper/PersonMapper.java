package tr.com.bkm.service.mapper;

import org.mapstruct.*;
import tr.com.bkm.domain.Person;
import tr.com.bkm.service.dto.PersonDTO;

/**
 * Mapper for the entity {@link Person} and its DTO {@link PersonDTO}.
 */
@Mapper(componentModel = "spring")
public interface PersonMapper extends EntityMapper<PersonDTO, Person> {}
