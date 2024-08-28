package com.buaa.werwerfood.client;

import com.buaa.werwerfood.DTO.FoodOrderDTO;
import com.buaa.werwerfood.DTO.OrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "food-service", contextId = "foodClient", path = "/api/foods")
public interface FoodClient {
    @GetMapping("food/{oid}")
    public List<FoodOrderDTO> getFoodOrders(
            @PathVariable String oid
    );

    @GetMapping("/getRelate/{tid}/{date}/{uid}")
    public List<OrderDTO> getTrainRelatedFoodOrders(@PathVariable String tid, @PathVariable String date, @PathVariable String uid);
}
