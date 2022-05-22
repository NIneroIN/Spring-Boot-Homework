package com.homework.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySpaceShipField {

    @Autowired
    private Reactor reactor;

    public MySpaceShipField() {
    }

    public void reactorStart() {
        reactor.start();
    }
}
