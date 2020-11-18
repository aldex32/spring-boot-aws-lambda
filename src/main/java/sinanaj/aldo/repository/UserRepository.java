package sinanaj.aldo.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import sinanaj.aldo.model.User;

import java.util.List;

@EnableScan
public interface UserRepository extends CrudRepository<User, String> {

    List<User> findByLastName(String lastName);

    List<User> findByFirstName(String firstName);
}
