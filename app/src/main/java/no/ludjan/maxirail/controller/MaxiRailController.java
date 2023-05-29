package no.ludjan.maxirail.controller;

import no.ludjan.maxirail.model.TrainTime;
import no.ludjan.maxirail.service.TrainTimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MaxiRailController {

    private final TrainTimeService trainTimeService;

    public MaxiRailController(TrainTimeService trainTimeService) {
        this.trainTimeService = trainTimeService;
    }

    @GetMapping(path = "/")
    public List<TrainTime> getTimes() {
        return trainTimeService.getTrainTimes();
    }
}
