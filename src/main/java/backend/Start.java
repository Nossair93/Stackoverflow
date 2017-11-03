package backend;

import backend.entity.User;
import backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class Start implements CommandLineRunner{

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User("mock1", "testFirstname", "testLastname");
        User u2 = new User("mock1", "testFirstname", "testLastname");
        userService.addUser(u1);
        userService.addUser(u2);

    }
}
