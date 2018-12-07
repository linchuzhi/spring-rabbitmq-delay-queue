package com.example.task;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class DelayTask implements MessageListener {
    public void onMessage(Message message) {
        try {
            String receivedMsg = new String(message.getBody(), "UTF-8");
            System.out.println("Received : " + receivedMsg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
