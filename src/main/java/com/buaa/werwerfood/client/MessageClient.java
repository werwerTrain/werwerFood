package com.buaa.werwerfood.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(name = "user-service",contextId = "messageClient")
public interface MessageClient {
    @PostMapping("/addMessage")
    void addMessage(@RequestBody Map<String, Object> messageMap);
}
