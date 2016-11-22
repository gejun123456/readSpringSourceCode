package com.bruce;

import com.bruce.eventpublish.MyComponent;
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
        ConfigurableApplicationContext run = SpringApplication.run(App.class);
        MyComponent com = run.getBean(MyComponent.class);
        com.createOrder();
    }
}
