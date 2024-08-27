package com.buaa.werwerfood.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service",contextId = "userClient", path = "/api/users")
public interface UserClient {
    @GetMapping("/getEmail/{userId}")
    public String getEmail(@PathVariable String userId);
}
