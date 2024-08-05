package com.techlabs.facade.test;

import com.techlabs.facade.model.HotelFacade;

public class ClientTest {
	public static void main(String[] args) {
        HotelFacade facade = new HotelFacade();
        facade.showIndianMenu();
        facade.showItalianMenu();
    }
}
