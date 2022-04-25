package com.homework.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpaceShipConfig {
    @Bean(initMethod="runAfterObjectCreated", destroyMethod="runAfterObjectDestroyed")
    public MySpaceShipConstructor MySpaceShipConstructor(Reactor reactor) {
        return new MySpaceShipConstructor(reactor);
    }

    @Bean(initMethod="runAfterObjectCreated", destroyMethod="runAfterObjectDestroyed")
    public Reactor createReactor() {
        return new Reactor();
    }
}

