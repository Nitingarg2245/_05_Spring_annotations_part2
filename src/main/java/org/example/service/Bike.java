package org.example.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("bike")
public class Bike implements Engine {
    public Bike() {
        System.out.println("bike object created");
    }

    @Override
    public void start() {
        System.out.println("bike engine   started");
    }
}
