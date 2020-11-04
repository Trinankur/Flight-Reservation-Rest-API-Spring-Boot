package com.havemytrip.flightbooking.service;

import com.havemytrip.flightbooking.model.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public User findById(int theId);

    public void save(User theUser);

    public void deleteById(int theId);

}
