package com.buaa.werwerfood.client;

import com.buaa.werwerfood.DTO.OrderDTO;
import com.buaa.werwerfood.client.fallback.OrderClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "user-service", contextId = "orderClient", path = "/api/users",
fallback = OrderClientFallback.class)
public interface OrderClient {

    @GetMapping("/orders/{uid}/status")
    List<OrderDTO> getOrdersByUidAndStatus(@PathVariable("uid") String uid,
                                           @RequestParam("status") String status,
                                           @RequestParam("type") String type);

    @GetMapping("/orders/byUid/{uid}")
    List<OrderDTO> getOrderByUid(@PathVariable("uid") String uid,
                                 @RequestParam("type") String type);

    @GetMapping("/orders/byOidAndUid/{oid}/{uid}")
    OrderDTO getOrderByOidAndUid(@PathVariable("oid") String oid,
                                 @PathVariable("uid") String uid);

    @GetMapping("/orders/byOid/{oid}")
    OrderDTO getOrder(@PathVariable("oid") String oid);

    @PostMapping("/orders/addOrder")
    void addOrder(@RequestBody OrderDTO orderDTO);

    @PostMapping("/orders/cancel")
    void cancelOrder(@RequestBody OrderDTO orderDTO);

    @DeleteMapping("/orders/deleteOrder")
    void deleteOrder(@RequestBody OrderDTO orderDTO);

    @PostMapping("/orders/{oid}/cancel-time")
    void setCancelTime(@PathVariable("oid") String oid,
                       @RequestParam("cancelTime") String cancelTime);

    @GetMapping("/orders/{userID}/status-id")
    List<OrderDTO> getIdByUidAndStatus(@PathVariable("userID") String userID,
                                       @RequestParam("status") String status);

    @GetMapping("/orders/{userID}/id")
    List<OrderDTO> getIdByUid(@PathVariable("userID") String userID);

    @GetMapping("/orders/trains")
    List<OrderDTO> getAllTrain();

    @GetMapping("/orders/{orderId}/get-message-sent")
    Boolean getMessageSend(@PathVariable("orderId") String orderId);

    @PostMapping("/orders/{orderId}/set-message-sent")
    void setMessageHaveSend(@PathVariable("orderId") String orderId);

    @PostMapping("/orders/{oid}/finish")
    void finishOrder(@PathVariable("oid") String oid);
}

