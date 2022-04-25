package com.homework.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySpaceShipSetter {

    private Reactor reactor;

    public MySpaceShipSetter() {
    }

    @Autowired
    public void setReactor(Reactor reactor) {
        this.reactor = reactor;
    }

    public void reactorStart() {
        reactor.start();
    }
}
