package com.bruce.eventpublish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * Created by bruce.ge on 2016/11/22.
 */
@Component
public class MyComponent {
    private final ApplicationEventPublisher publisher;

    @Autowired
    private MyComponent(ApplicationEventPublisher publisher){
        this.publisher = publisher;
    }


    public void createOrder(){
        MyEvent o = new MyEvent();
        o.setId(11);
        o.setName("hehe");
        this.publisher.publishEvent(o);
    }
}
