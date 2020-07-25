package ru.test.mapstructexample.space;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpaceShip {
    private String name;
    private Float speed;
    private Double fuel;
    private String userValue;
    private String streetName;
}
