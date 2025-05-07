package FullStack.fullStackdemo.controller;

import FullStack.fullStackdemo.entity.User;
import FullStack.fullStackdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping("/createUser")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable int id){
        return userService.getUserById(id);
    }
    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUserById(id);
    }
}
