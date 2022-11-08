package com.project.feestplannerbackend.Service;
import com.project.feestplannerbackend.Model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
