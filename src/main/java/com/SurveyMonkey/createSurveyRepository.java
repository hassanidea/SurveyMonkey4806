
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "addressBookData")
public interface createSurveyRepository extends CrudRepository<AddressBook, Long> {
}
