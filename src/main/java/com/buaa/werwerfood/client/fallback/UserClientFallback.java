package com.buaa.werwerfood.client.fallback;

import com.buaa.werwerfood.client.UserClient;

public class UserClientFallback implements UserClient {

    @Override
    public String getEmail(String userId) {
        System.out.println("Get email request failed, fallback method executed.");
        // Provide fallback behavior here
        return "fallback@example.com"; // Example fallback value
    }
}