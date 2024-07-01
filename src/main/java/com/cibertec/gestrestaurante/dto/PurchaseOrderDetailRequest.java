package com.cibertec.gestrestaurante.dto;


public class PurchaseOrderDetailRequest {
	
    private String name;

    private double price;

    private int quantity;

    private Long product_id;

    
    
	public PurchaseOrderDetailRequest() {
	}



	public PurchaseOrderDetailRequest(String name, double price, int quantity, Long product_id) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.product_id = product_id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public Long getProduct_id() {
		return product_id;
	}



	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
    
    
	
    
	
    
}
