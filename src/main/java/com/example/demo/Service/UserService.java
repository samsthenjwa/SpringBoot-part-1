package com.example.demo.Service;

public interface UserService {
    void addUser(String name,String surname);
    void removerUser(long id);
    void getUser(long id);
}
