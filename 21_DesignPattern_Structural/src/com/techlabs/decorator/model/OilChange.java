package com.techlabs.decorator.model;

public class OilChange extends CarServiceDecorator {
    public OilChange(ICarService carService) {
        super(carService);
    }

    @Override
    public double getCost() {
        return super.getCost() + 500; // Adding cost of oil change
    }

}
