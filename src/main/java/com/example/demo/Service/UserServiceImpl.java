package com.example.demo.Service;

import com.example.demo.DAO.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  FakeRepo user;

    @Override
    public void addUser( String name, String surname){
        user.insertUser(1,name,surname);
        System.out.println(user);
    }

    public void getUser(long id){
        user.findUserById(id);
        System.out.println("Hello " + user);
    }

    @Override
    public void removeUser(long id){
        user.deleteUser(id);
        System.out.println(user + " removed");
    }

}
