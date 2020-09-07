package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import service.UserService;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public User getUserById(int id) {
        return userService.getUserById(id);
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUser();
    }

    @GetMapping
    public boolean updateUser() {
        User user = new User();
        user.setName("Jim");
        user.setUsername("root");
        user.setPassword("123456");
        return userService.updateUser(user);
    }

    @GetMapping
    public boolean delUser(int id) {
        return userService.delUser(id);
    }

}
