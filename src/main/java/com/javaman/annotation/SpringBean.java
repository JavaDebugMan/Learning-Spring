package com.javaman.annotation;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {

    private String name = "name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void init() {
        System.out.println("init");
    }
}
