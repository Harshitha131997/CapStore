package com.capgemini.capstore.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Cart {

	private int cartId;
	private Product product;
	private int quantity;

	//Constructors
	public Cart(int cartId, Product product, int quantity) {
		super();
		this.cartId = cartId;
		this.product = product;
		this.quantity = quantity;
	}

	public Cart(int cartId) {
		super();
		this.cartId = cartId;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Getters and Setters
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
