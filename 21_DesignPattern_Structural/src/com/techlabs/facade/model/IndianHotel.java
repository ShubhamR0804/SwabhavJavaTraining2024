package com.techlabs.facade.model;

public class IndianHotel extends Hotel {
    @Override
    public IMenu getMenu() {
        return new IndianMenu();
    }

}
