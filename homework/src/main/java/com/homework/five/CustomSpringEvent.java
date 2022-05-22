package com.homework.five;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.*;

@Component
public class CustomSpringEvent {

    @EventListener
    public void Listener(MyCustomApplicationEvent event) {
        System.out.println("Message : " + event.getMessage());
    }

    @Async
    @EventListener
    void AsyncListener(MyCustomApplicationEvent event) {
        System.out.println("Message : " + event.getMessage());
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void handleCustom(MyCustomApplicationEvent event) {
        System.out.println("Message : " + event.getMessage());
    }
}
