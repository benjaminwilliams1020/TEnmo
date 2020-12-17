package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.User;

import java.util.List;

public interface UserDAO {

    List<User> findAll();

    List<User> listAllUsers();

    User findByUsername(String username);

    int findIdByUsername(String username);

    boolean create(String username, String password, String role);

}
