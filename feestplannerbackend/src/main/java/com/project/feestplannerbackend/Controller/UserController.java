package com.project.feestplannerbackend.Controller;

import com.project.feestplannerbackend.Model.User;
import com.project.feestplannerbackend.Repository.UserRepository;
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

    @DeleteMapping("/delete/{ID}")
    void deleteuser(@PathVariable int ID){
         userRepository.delete(userRepository.findById(ID).orElse(null));
    }

    @PatchMapping("/update")
    User updateUser(@RequestBody User updateduser) {
        return userRepository.save(updateduser);
    }



}
