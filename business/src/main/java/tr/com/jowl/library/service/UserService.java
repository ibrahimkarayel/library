package tr.com.jowl.library.service;


import tr.com.jowl.library.model.User;

import java.util.List;

/**
 * The UserService interface
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * Date 4/27/2018.
 */
public interface UserService {

    List<User> findAll();

    User findByNameOrEmail(String param);


}
