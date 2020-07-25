package ru.test.mapstructexample.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.mapstructexample.space.SpaceShip;
import ru.test.mapstructexample.train.Address;
import ru.test.mapstructexample.train.Train;
import ru.test.mapstructexample.train.TrainMapper;

@RestController
public class TestController {

    @GetMapping("/spaceship")
    public SpaceShip getSpaceShip() {
        Train train = Train.builder()
                .model("A")
                .maxSpeed(1.2F)
                .address(Address.builder().street("Pushkina 3").build())
                .build();
        return TrainMapper
                .INSTANCE
                .trainToSpaceShip(train);
    }
}
