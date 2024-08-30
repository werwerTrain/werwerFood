package com.buaa.werwerfood.client.fallback;

import com.buaa.werwerfood.client.MessageClient;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MessageClientFallback implements MessageClient {

    @Override
    public void addMessage(Map<String, Object> messageMap) {
        System.out.println("addMessage request failed, fallback method executed.");
    }
}
