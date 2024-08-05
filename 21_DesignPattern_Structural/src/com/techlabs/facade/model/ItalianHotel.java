package com.techlabs.facade.model;

public class ItalianHotel extends Hotel {
    @Override
    public IMenu getMenu() {
        return new ItalianMenu();
    }

}
