package hello;

import hello.model.Subscribers;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called subscribersRepository
// CRUD refers Create, Read, Update, Delete

public interface SubscribersRepository extends CrudRepository<Subscribers, Long> {

}
