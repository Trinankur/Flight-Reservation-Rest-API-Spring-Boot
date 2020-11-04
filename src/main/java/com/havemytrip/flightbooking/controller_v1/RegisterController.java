package com.havemytrip.flightbooking.controller_v1;

import com.havemytrip.flightbooking.dao.UserDAO;
import com.havemytrip.flightbooking.model.User;
import com.havemytrip.flightbooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RegisterController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void registerUser(@RequestBody User theUser) {
        userService.save(theUser);
    }

}
