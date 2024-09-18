package com.dbocharov;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    private final AdditionalProperties additionalProperties;

    public MyController(AdditionalProperties additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @GetMapping(value = {"", "greeting"})
    public String greeting() {
        return additionalProperties.getName();
    }
}