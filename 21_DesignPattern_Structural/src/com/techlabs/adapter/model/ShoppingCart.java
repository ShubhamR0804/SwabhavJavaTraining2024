package com.techlabs.adapter.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<CartItem> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addItemToCart(CartItem item) {
        cartItems.add(item);
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public double getCartPrice() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getPrice();
        }
        return total;
    }

}
