package org.example.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("car")
public class Car implements Engine {
    public Car() {
        System.out.println("car object created");
    }

    @Override
    public void start() {
        System.out.println("car engine  started");
    }
}
