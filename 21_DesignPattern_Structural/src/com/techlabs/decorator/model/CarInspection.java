package com.techlabs.decorator.model;

public class CarInspection implements ICarService {
    @Override
    public double getCost() {
        return 1000; // Base cost for car inspection
    }

}
