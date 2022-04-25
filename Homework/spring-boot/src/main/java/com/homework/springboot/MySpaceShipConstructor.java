package com.homework.springboot;

import org.springframework.stereotype.Component;

@Component
public class MySpaceShipConstructor {

    private final Reactor reactor;

    public MySpaceShipConstructor(Reactor reactor) {
        this.reactor = reactor;
    }

    public void reactorStart() {
        reactor.start();
    }

    public void runAfterObjectCreated() {
        System.out.println("Создание корабля успешно!");
    }

    public void runAfterObjectDestroyed() {
        System.out.println("Уничтожение корабля успешно!");
    }
}
