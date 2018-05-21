package tr.com.jowl.library.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tr.com.jowl.library.model.User;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    UserService userService;

    @Test
    public void testFindAll(){
       List<User> users=userService.findAll();
        System.out.println(users.size());

    }
}
