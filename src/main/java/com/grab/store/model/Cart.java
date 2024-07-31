package com.grab.store.model;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cartId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private Customer customer;
	
	@OneToMany(targetEntity = Item.class,cascade = CascadeType.ALL)
	private List<Item> itemList;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(Integer cartId, Customer customer, List<Item> itemList) {
		super();
		this.cartId = cartId;
		this.customer = customer;
		this.itemList = itemList;
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	
	
}