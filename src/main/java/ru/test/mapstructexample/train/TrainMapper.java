package ru.test.mapstructexample.train;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ru.test.mapstructexample.space.SpaceShip;

@Mapper
public interface TrainMapper {
    TrainMapper INSTANCE = Mappers.getMapper(TrainMapper.class);

    @Mapping(target = "name", source = "model")
    @Mapping(target = "speed", source = "maxSpeed")
    @Mapping(target = "fuel", constant = "12.22")
    SpaceShip trainToSpaceShip(Train train);

}
