package com.homework.springboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Space {
    SpaceShip frigate;
    SpaceShip fighter;

    public Space(@Qualifier("frigate") SpaceShip a,
                 @Qualifier("fighter") SpaceShip b) {
        this.frigate = a;
        this.fighter = b;
    }

    public void fly() {
        frigate.fly();
        fighter.fly();
    }
}

