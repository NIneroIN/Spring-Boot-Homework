package com.homework.six;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(HeaderIsNull.class)
    public ResponseEntity<Object> GetHeaderNull(HeaderIsNull ex) {
        return new ResponseEntity<>("Header is NULL", HttpStatus.NOT_FOUND);
    }

}
