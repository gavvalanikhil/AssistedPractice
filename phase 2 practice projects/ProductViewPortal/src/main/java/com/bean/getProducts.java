package com.bean;

public class getProducts {
	private String productID;
	private String productName;
	private String model;
	
	
	public getProducts(String productID, String productName, String model) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.model = model;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	

}
