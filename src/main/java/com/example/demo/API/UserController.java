package com.example.demo.API;

import com.example.demo.Model.User;
import com.example.demo.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping(value="/add",method = RequestMethod.POST)
    public void addUser(User user){
        userService.addUser(user.getId(),user.getName(),user.getSurname());
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public void findUser(User user){
        userService.getUser(user.getId());
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void removeUser(User user){
        userService.removeUser(user.getId());
    }




}
