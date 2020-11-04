package com.havemytrip.flightbooking.dao;

import com.havemytrip.flightbooking.model.User;

import java.util.List;

public interface UserDAO {

    public List<User> findAll();
    public User findById(int theId);
    public void save(User theUser);
    public void deleteById(int theId);

}
