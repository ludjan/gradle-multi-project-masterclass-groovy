package no.ludjan.maxirail.model;
import java.time.LocalTime;

public class TrainTime {

    public LocalTime departureTime;
    public LocalTime arrivalTime;
    public String departureStation;
    public String destinationStation;

    public TrainTime(String departureStation, String destinationStation,
                     LocalTime departureTime, LocalTime arrivalTime) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureStation = departureStation;
        this.destinationStation = destinationStation;
    }

    public String destinationStation() {
        return destinationStation;
    }
}