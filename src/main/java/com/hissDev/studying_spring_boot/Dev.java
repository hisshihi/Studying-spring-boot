package com.hissDev.studying_spring_boot;

import org.springframework.stereotype.Component;

// Аннотируем класс как @Component, чтобы сам spring boot мог управлять этим объектом.
@Component
public class Dev {

    public void build() {
        System.out.println("working on Awesome Project");
    }

}
