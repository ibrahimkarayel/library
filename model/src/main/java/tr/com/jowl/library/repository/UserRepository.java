package tr.com.jowl.library.repository;

import org.springframework.data.repository.CrudRepository;
import tr.com.jowl.library.model.User;

/**
 * The UserRepository class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * Date 5/19/2018.
 */
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsernameOrEmail(String userName, String email);
}