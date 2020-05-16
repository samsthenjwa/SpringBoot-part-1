package com.example.demo;

import com.example.demo.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DummyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DummyApplication.class, args);

		UserServiceImpl user = new UserServiceImpl();

		try {
		user.addUser("Hello","Sam");
		user.getUser(1);
		user.removeUser(2);

		}catch (Exception ex){
			ex.printStackTrace();
		}


	}

}
