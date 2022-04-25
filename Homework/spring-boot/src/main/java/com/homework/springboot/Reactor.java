package com.homework.springboot;

public class Reactor {
    public void start() {
    }

    public void runAfterObjectCreated() {
        System.out.println("Создание реактора успешно!");
    }

    public void runAfterObjectDestroyed() {
        System.out.println("Уничтожение реактора успешно!");
    }
}
