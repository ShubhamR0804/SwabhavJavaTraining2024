package com.techlabs.adapter.model;

public class HatAdapter implements CartItem {
	   private Hat hat;

	   public HatAdapter(Hat hat) {
	       this.hat = hat;
	   }

	   @Override
	   public String getItemName() {
	       return hat.getHatName();
	   }

	   @Override
	   public double getPrice() {
	       return hat.getHatPrice();
	   }

}
