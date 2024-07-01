package com.cibertec.gestrestaurante.dto;

import java.util.List;

import com.cibertec.gestrestaurante.model.PurchaseOrderDetail;

public class PurchaseOrderRequest {
	
    private String name;

    private String doc;
	
    private int tablenum;
    
    private List<PurchaseOrderDetailRequest> purchasedetail;

    private Long product_id;
    
    
	public PurchaseOrderRequest() {
	}




	public PurchaseOrderRequest(String name, String doc, int tablenum, List<PurchaseOrderDetailRequest> purchasedetail,
			Long product_id) {
		this.name = name;
		this.doc = doc;
		this.tablenum = tablenum;
		this.purchasedetail = purchasedetail;
		this.product_id = product_id;
	}






	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDoc() {
		return doc;
	}



	public void setDoc(String doc) {
		this.doc = doc;
	}





	public int getTablenum() {
		return tablenum;
	}



	public void setTablenum(int tablenum) {
		this.tablenum = tablenum;
	}



	public List<PurchaseOrderDetailRequest> getPurchasedetail() {
		return purchasedetail;
	}



	public void setPurchasedetail(List<PurchaseOrderDetailRequest> purchasedetail) {
		this.purchasedetail = purchasedetail;
	}



	public Long getProduct_id() {
		return product_id;
	}



	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	} 
    
	
    
}
