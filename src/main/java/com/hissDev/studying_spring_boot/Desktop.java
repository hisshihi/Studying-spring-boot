package com.hissDev.studying_spring_boot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("Application compiled with Desktop is successfully");
    }
}
