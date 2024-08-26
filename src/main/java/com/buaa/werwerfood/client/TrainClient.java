package com.buaa.werwerfood.client;

import com.buaa.werwerfood.DTO.TrainDTO;
import com.buaa.werwerfood.DTO.TrainOrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "train-service")
public interface TrainClient {

    @GetMapping("train/{tid}/{date}/{userID}")
    public List<TrainOrderDTO> getTrainOrderByTrainAndIdentification(
            @PathVariable String tid,
            @PathVariable String date,
            @PathVariable String userID
    );

    @GetMapping("trains/{tid}/{date}")
    public TrainDTO getTrainByTidAndDate(
            @PathVariable String tid,
            @PathVariable String date
    );

}
