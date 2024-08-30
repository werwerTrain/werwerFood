package com.buaa.werwerfood.client.fallback;

import com.buaa.werwerfood.DTO.TrainDTO;
import com.buaa.werwerfood.DTO.TrainOrderDTO;
import com.buaa.werwerfood.client.TrainClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TrainClientFallback implements TrainClient {
    @Override
    public List<TrainOrderDTO> getTrainOrderByTrainAndIdentification(String tid, String date, String userID) {
        System.out.println("Get trainOrder by train and id request failed, fallback method executed.");
        return new ArrayList<>();
    }

    @Override
    public TrainDTO getTrainByTidAndDate(String tid, String date) {
        System.out.println("Get train by tid and date request failed, fallback method executed.");
        return new TrainDTO();
    }
}
