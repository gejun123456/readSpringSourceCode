package com.bruce.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by bruce.ge on 2016/11/23.
 */
@Component
public class A {
    private B b;

    @Autowired
    public A(B b){
        this.b = b;
    }
}
