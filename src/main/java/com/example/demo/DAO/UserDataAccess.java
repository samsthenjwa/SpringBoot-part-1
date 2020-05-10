package com.example.demo.DAO;

import com.example.demo.Model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository("postgres")
public class UserDataAccess implements FakeRepoInterface {

    private static Map<Integer, User> users;


    static{
        users=new HashMap<Integer, User>(){
            {
                put(1,new User(1001, "Mbajwana", "Mkhize"));

                put(2,new User(1002, "Sbusiso" , "Mhlongo"));

                put(3,new User(1003, "Xolani","Sbiya" ));
                put(4,new User(1004, "Ayabonga","Zungu"));

                put(5,new User(1005,"Nomfundo","Ngwenya" ));
            }
        };
    }

    // Add the user
    public void insertUser(long id, String name, String surname) {
        users.put((int) id , (User) users);
    }


    // find object by value
    public void findUserById(long id) {
        users.get((int)id);
    }


    //  removes object's values or entities.
    public void deleteUser(long id) {
        users.remove((int)id);
    }
}
