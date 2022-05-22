package com.homework.springboot;

import com.homework.hw5.MyEvent;
import com.homework.hw5.MyEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw3Application {

	public static void main(String[] args) {
		SpringApplication.run(Hw3Application.class, args);
		fighter a = new fighter();
		frigate b = new frigate();
		Space space = new Space(a, b);

		MyEvent event = new MyEvent("fv");
		MyEventListener listener = new MyEventListener();

		listener.onApplicationEvent(event);
	}

}
