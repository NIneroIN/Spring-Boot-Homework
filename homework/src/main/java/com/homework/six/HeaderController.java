package com.homework.six;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class HeaderController {

    @GetMapping
    public String GetHeaders(@RequestHeader Map<String, String> headers) {

        headers.forEach((key, value) -> System.out.println("header: " + key + ", " + value));

        return headers.toString();
    }

}
