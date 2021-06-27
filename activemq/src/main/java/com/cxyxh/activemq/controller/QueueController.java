package com.cxyxh.activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ： cxyxh
 * @date : 2021/2/15 23:02
 * @describetion :
 */
@RestController
public class QueueController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("/send")
    public void send(String text) {
        jmsMessagingTemplate.convertAndSend("cehae", text);
    }

    @RequestMapping("/sendmap")
    public void sendMap() {
        Map map = new HashMap<>();
        map.put("mobile", "18888888888");
        map.put("content", "恭喜您获得玛莎拉蒂10元代金券");
        jmsMessagingTemplate.convertAndSend("cehae_map", map);
    }
}
