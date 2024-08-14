package org.example;

import org.example.config.Config;
import org.example.service.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac= new AnnotationConfigApplicationContext(Config.class);
        User bean = ac.getBean(User.class);
        bean.startJourney();
    }
}