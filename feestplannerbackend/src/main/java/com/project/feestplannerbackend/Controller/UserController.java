package com.project.feestplannerbackend.Controller;

import com.project.feestplannerbackend.Model.User;
import com.project.feestplannerbackend.Repository.UserRepository;
import com.project.feestplannerbackend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Partymember")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/getAll")
    List<User> getallUsers(){
        return userRepository.findAll();
    }


}
