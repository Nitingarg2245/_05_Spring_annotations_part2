package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class User {
   @Autowired
   @Qualifier("car")
    private Engine engine;
    public void startJourney(){
        engine.start();
        System.out.println("journey is started ");
    }

    public User() {
        System.out.println("user object created");
    }
}
