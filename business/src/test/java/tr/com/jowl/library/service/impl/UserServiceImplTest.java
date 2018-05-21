package tr.com.jowl.library.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tr.com.jowl.library.ServiceApplication;
import tr.com.jowl.library.model.User;
import tr.com.jowl.library.service.UserService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceApplication.class)
public class UserServiceImplTest {


    @Autowired
    UserService userService;
    @Test
    public void findAll() {
        List<User> userList=userService.findAll();
        System.out.println(userList.size());
    }

    @Test
    public void findByNameOrEmail() {
    }
}