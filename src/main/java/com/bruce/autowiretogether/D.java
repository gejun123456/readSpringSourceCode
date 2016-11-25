package com.bruce.autowiretogether;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by bruce.ge on 2016/11/23.
 */
@Component
public class D {
    @Autowired
    private C c;
}
