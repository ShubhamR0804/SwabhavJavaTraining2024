package com.techlabs.decorator.model;

public class CarServiceDecorator implements ICarService {
    protected ICarService carService;

    public CarServiceDecorator(ICarService carService) {
        this.carService = carService;
    }

    @Override
    public double getCost() {
        return carService.getCost();
    }

}
