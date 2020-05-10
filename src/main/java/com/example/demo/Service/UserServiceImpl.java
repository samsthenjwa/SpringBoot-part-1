package com.example.demo.Service;

import com.example.demo.DAO.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    private final FakeRepo user;

    @Autowired
    public UserServiceImpl(@Qualifier("postgres")  FakeRepo user) {
        this.user = user;
    }


    public void addUser(long id, String name, String surname){
        user.insertUser(id,name,surname);
        System.out.println(user);
    }

    public void getUser(long id){
        user.findUserById(id);
        System.out.println("Hello " + user);
    }

    public void removeUser(long id){
        user.deleteUser(id);
        System.out.println(user + " removed");
    }

}
