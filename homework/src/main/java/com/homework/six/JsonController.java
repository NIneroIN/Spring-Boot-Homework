package com.homework.six;

import com.homework.six.jsonDTO.jsonDTO;
import org.springframework.web.bind.annotation.*;


@RestController
public class JsonController {

    @PutMapping
    public jsonDTO UpdateJson(@RequestBody jsonDTO body, @PathVariable int id) {

        return null;
    }

}
