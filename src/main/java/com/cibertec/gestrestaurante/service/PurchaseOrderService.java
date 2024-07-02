package com.cibertec.gestrestaurante.service;

import java.util.List;

import com.cibertec.gestrestaurante.model.PurchaseOrder;

public interface PurchaseOrderService {
	PurchaseOrder create(PurchaseOrder porder);
	
	List<PurchaseOrder> getAll();
	
	PurchaseOrder update(PurchaseOrder porder);
	
	void delete(Long id);
	
	PurchaseOrder getById(Long id);
}
