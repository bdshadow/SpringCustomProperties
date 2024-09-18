package com.dbocharov;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component
@ConfigurationProperties
@PropertySource(value = "classpath:my.properties")
public class AdditionalProperties {

    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}