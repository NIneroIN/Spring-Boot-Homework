package com.homework.springboot;

import org.springframework.stereotype.Component;

@Component("frigate")
public class frigate implements SpaceShip{

    @Override
    public void fly() {
        System.out.println("вжжжжжжж");
    }
}

