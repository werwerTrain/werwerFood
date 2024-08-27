package com.buaa.werwerfood.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-service",contextId = "userClient", path = "/api/users")
public interface UserClient {
    @GetMapping("/getEmail")
    public String getEmail(String userId);
}
