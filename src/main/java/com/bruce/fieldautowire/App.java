package com.bruce.fieldautowire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by bruce.ge on 2016/11/22.
 */
@SpringBootConfiguration
@ComponentScan
public class App {
    public static void main(String[] args) {
        //will run with error here but where in the source code?
        ConfigurableApplicationContext run = SpringApplication.run(App.class);
    }
}
