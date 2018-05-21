package tr.com.jowl.library.web.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tr.com.jowl.library.model.User;
import tr.com.jowl.library.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class UserRestService {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public List<User> findAll() {
        Iterable<User> users = userRepository.findAll();
        return (List<User>) users;
    }

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public User findByNameOrEmail(@RequestParam String param) {
        return userRepository.findByUsernameOrEmail(param, param);
    }
}
