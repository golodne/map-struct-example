package ru.test.mapstructexample.api;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.mapstructexample.space.SpaceShip;
import ru.test.mapstructexample.train.Train;
import ru.test.mapstructexample.train.TrainMapper;

@RestController
public class TestController {

    @GetMapping("/spaceship")
    public SpaceShip getSpaceShip() {
        Train train = Train.builder()
                .model("A")
                .maxSpeed(1.2F)
                .build();
        return TrainMapper
                .INSTANCE
                .trainToSpaceShip(train);
    }
}
