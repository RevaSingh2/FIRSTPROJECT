package com.maersk.firstproject;

import com.maersk.firstproject.repository.UserRepository;
import com.maersk.firstproject.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstprojectApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(FirstprojectApplication.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);

        //User user=new User();
        //user.setName("Jack");
        //user.setCity("Jaipur");
        //user.setStatus(0);
        //User user1=userRepository.save(user);

//        User user1=new User();
//        user1.setName("Richa");
//        user1.setCity("Udaipur");
//        user1.setStatus(1);
//
//        User user2=new User();
//        user2.setName("Reva");
//        user2.setCity("Jaislmer");
//        user2.setStatus(1);
//
//        User resultUser = userRepository.save(user2);
//
//        System.out.println("saved user"+resultUser);
//        System.out.println(user1);
    }

}
