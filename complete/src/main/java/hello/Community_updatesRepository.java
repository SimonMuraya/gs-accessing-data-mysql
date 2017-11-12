package hello;

import hello.model.Community_updates;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called subscribersRepository
// CRUD refers Create, Read, Update, Delete

public interface Community_updatesRepository extends CrudRepository<Community_updates, Long> {

}
