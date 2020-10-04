package dk.kaloyan.event.controller;

import dk.kaloyan.event.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value="firstname", defaultValue="Kaloyan") String firstname,
                                @RequestParam(value="lastname", defaultValue="Penov") String lastname,
                                @RequestParam(value="age", defaultValue="38") int age){
        User user = new User();

        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User setUser(User user){
        System.out.println(user.getFirstname());
        return user;
    }

}
