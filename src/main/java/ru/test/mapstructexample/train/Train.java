package ru.test.mapstructexample.train;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Train {
    private String model;
    private Float maxSpeed;
    private int param;
    private Address address;
}
