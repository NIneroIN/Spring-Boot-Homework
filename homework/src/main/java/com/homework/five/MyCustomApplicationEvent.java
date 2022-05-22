package com.homework.five;

import org.springframework.context.ApplicationEvent;

public class MyCustomApplicationEvent extends ApplicationEvent {

    private final String message;

    public MyCustomApplicationEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
