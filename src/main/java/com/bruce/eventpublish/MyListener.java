package com.bruce.eventpublish;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by bruce.ge on 2016/11/22.
 */
@Component
public class MyListener {

    @EventListener
    public void handleMyEvent(MyEvent event){
        System.out.println(event.getId());
        System.out.println(event.getName());
    }
}
