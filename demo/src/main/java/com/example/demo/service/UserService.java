package com.example.demo.service;

import java.util.List;
import com.example.demo.domain.Role;
import com.example.demo.domain.Users;

public interface UserService {
    Users saveUser(Users user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    Users getUser(String username);

    List<Users> getUsers();
}
