package com.techlabs.model;

public interface Payment {

	void payBill();

	void redeem();

  default void volume() {
		System.out.println("This is volume1 ");
	}
}
