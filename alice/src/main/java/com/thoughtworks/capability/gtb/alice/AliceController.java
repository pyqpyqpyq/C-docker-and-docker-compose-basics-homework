package com.thoughtworks.capability.gtb.alice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AliceController {
    @GetMapping("/hello")
    public String aliceController() {
        RestTemplate restTemplate = new RestTemplate();
        String hello = restTemplate.getForObject("http://bob:8081/hello", String.class);
        return hello;
    }
}
