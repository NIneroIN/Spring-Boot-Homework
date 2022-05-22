package com.homework.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("fighter")
public class fighter implements SpaceShip{

    @Bean
    public void fly() {
        System.out.println("вжжжжжжж");
    }
}
