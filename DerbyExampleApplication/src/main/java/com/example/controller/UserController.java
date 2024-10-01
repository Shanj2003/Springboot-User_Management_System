package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.service.UserService;
import com.example.model.UserRecord;

@RestController    
public class UserController {    

    @Autowired    
    private UserService userService;     

    @RequestMapping("/")    
    public List<UserRecord> getAllUser() {    
        return userService.getAllUsers();    
    }       

    @RequestMapping(value="/add-user", method=RequestMethod.POST)    
    public void addUser(@RequestBody UserRecord userRecord) {    
        userService.addUser(userRecord);    
    }

    // New DELETE method to delete a user by ID
    @RequestMapping(value="/delete-user/{id}", method=RequestMethod.DELETE)    
    public void deleteUser(@PathVariable int id) {    
        userService.deleteUser(id);    
    }       
}
