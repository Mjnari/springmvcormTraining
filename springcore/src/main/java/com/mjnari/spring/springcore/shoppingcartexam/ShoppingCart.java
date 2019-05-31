package com.mjnari.spring.springcore.shoppingcartexam;

public class ShoppingCart {
	private Item item;

	@Override
	public String toString() {
		return "ShoppingCart [item=" + item + "]";
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}
