package com.hissDev.studying_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Аннотируем класс как @Component, чтобы сам spring boot мог управлять этим объектом.
@Component
public class Dev {

    private Computer computer;

    public Dev(@Qualifier("desktop") Computer computer) {
        this.computer = computer;
    }

    public void build() {

        computer.compile();

        System.out.println("working on Awesome Project");
    }

}
