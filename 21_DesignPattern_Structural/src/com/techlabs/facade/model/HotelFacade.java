package com.techlabs.facade.model;

public class HotelFacade {
	private Hotel indianHotel;
	private Hotel italianHotel;

	public HotelFacade() {
		indianHotel = new IndianHotel();
		italianHotel = new ItalianHotel();
	}

	public void showIndianMenu() {
		IMenu menu = indianHotel.getMenu();
		menu.displayMenu();
	}

	public void showItalianMenu() {
		IMenu menu = italianHotel.getMenu();
		menu.displayMenu();

	}
}