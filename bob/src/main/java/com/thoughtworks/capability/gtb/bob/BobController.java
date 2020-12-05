package com.thoughtworks.capability.gtb.bob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BobController {
    @GetMapping("/hello")
    public String bobController() {
        return "Hello from Bob!";
    }
}
