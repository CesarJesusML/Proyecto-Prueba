package com.cibertec.gestrestaurante.service;

import java.util.List;

import com.cibertec.gestrestaurante.model.PurchaseOrderDetail;

public interface PurchaseOrderDetailService {
	PurchaseOrderDetail create(PurchaseOrderDetail porderdetail);
	
	List<PurchaseOrderDetail> getAll();
	
	PurchaseOrderDetail update(PurchaseOrderDetail porderdetail);
	
	void delete(PurchaseOrderDetail porderdetail);
}
