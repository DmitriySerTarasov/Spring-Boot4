package com.example.Spring_Boot3.controller;


import com.example.Spring_Boot3.profile.SystemProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProfileController {

    private SystemProfile profile;

    public ProfileController(SystemProfile profile){
        this.profile = profile;
    }
    @GetMapping("profile")
    public String getProfile(){
        return profile.getProfile();
    }
}