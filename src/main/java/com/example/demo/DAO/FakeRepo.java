package com.example.demo.DAO;

import com.example.demo.DAO.FakeRepoInterface;
import com.example.demo.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("postgres")
public class FakeRepo implements FakeRepoInterface {

    private static List<User> array = new ArrayList<>();

    @Override
    public void insertUser(long id, String name, String surname) {
        array.add(new User(id,name,surname));
    }

    @Override
    public void findUserById(long id) {
        if(array.equals(id)){
            System.out.println("Hello " + array.contains(id));
        }
    }

    @Override
    public void deleteUser(long id) {
        array.remove(id);
            System.out.println("User deleted");
    }
}
