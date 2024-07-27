package com.hissDev.studying_spring_boot;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile() {
        System.out.println("Application compiled with Laptop is successfully");
    }

}
