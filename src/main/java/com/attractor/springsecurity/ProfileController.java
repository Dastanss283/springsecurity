package com.attractor.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Autowired
    private ProfileRepository repo;

    @RequestMapping("/profile/{userId}")
    public Profile getProfile(@PathVariable("userId") int userId) {
        return repo.getProfileById(userId);
    }

}
