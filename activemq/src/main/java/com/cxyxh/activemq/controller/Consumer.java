package com.cxyxh.activemq.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author ： cxyxh
 * @date : 2021/2/15 23:04
 * @describetion :
 */
@Component
public class Consumer {

    @JmsListener(destination = "cehae")
    public void readMessage(String text) {
        System.out.println("接收到消息：" + text);
    }

    @JmsListener(destination = "cehae_map")
    public void readMessageMap(Map map) {
        System.out.println("接收到消息：" + map.toString());
    }
}
