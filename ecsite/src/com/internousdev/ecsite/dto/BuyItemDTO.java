package com.internousdev.ecsite.dto;

public class BuyItemDTO {
	private int id;
	private String itemName;
	private String itemPrice;

	//Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	//ItemPrice
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	//ItemName
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
}