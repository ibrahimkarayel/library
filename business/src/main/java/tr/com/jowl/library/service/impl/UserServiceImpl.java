package tr.com.jowl.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tr.com.jowl.library.model.User;
import tr.com.jowl.library.repository.UserRepository;
import tr.com.jowl.library.service.UserService;

import java.util.List;

/**
 * The UserServiceImpl class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * Date 4/27/2018.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        Iterable<User> users = userRepository.findAll();
        return (List<User>) users;
    }

    @Override
    public User findByNameOrEmail(String param) {
        return userRepository.findByUsernameOrEmail(param, param);
    }

}
