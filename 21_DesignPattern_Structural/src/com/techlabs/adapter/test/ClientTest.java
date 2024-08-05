package com.techlabs.adapter.test;

import com.techlabs.adapter.model.CartItem;
import com.techlabs.adapter.model.Hat;
import com.techlabs.adapter.model.HatAdapter;
import com.techlabs.adapter.model.Item;
import com.techlabs.adapter.model.ShoppingCart;

public class ClientTest {
	
	public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding regular items
        Item item1 = new Item("Biscuit", 10, 0.1);
        cart.addItemToCart(item1);

        // Adding hat using HatAdapter
        Hat hat = new Hat("Stylish Hat", 50);
        HatAdapter hatAdapter = new HatAdapter(hat);
        cart.addItemToCart(hatAdapter);

        // Displaying cart items and total price
        for (CartItem item : cart.getCartItems()) {
            System.out.println("Item: " + item.getItemName() + ", Price: " + item.getPrice());
        }
        System.out.println("Total Cart Price: " + cart.getCartPrice());
    }

}
