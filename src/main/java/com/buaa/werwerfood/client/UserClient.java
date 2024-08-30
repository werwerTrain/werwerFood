package com.buaa.werwerfood.client;

import com.buaa.werwerfood.client.fallback.UserClientFallback;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service",contextId = "userClient", path = "/api/users",
fallback = UserClientFallback.class)
public interface UserClient {
    @GetMapping("/getEmail/{userId}")
    public String getEmail(@PathVariable String userId);
}
