package com.bruce.constructorautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by bruce.ge on 2016/11/23.
 */
@Component
public class B {
    private A a;

    @Autowired
    private B(A a) {
        this.a = a;
    }
}
