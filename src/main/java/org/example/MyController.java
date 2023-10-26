package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.joda.time.DateTime;

@RestController
public class MyController {
    @GetMapping("/")
    public String index() {

        return "Greetings from Spring Boot!";
    }
}
