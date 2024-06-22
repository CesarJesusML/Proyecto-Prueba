package com.cibertec.gestrestaurante.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cibertec.gestrestaurante.model.PurchaseOrder;
import com.cibertec.gestrestaurante.repository.PurchaseOrderRepository;
import com.cibertec.gestrestaurante.service.PurchaseOrderService;

public class PurchaseOrderServiceImpl implements PurchaseOrderService {

	@Autowired
	PurchaseOrderRepository porderRepository;
	
	@Override
	public PurchaseOrder create(PurchaseOrder porder) {
		return porderRepository.save(porder);
	}

	@Override
	public List<PurchaseOrder> getAll() {
		return porderRepository.findAll();
	}

	@Override
	public PurchaseOrder update(PurchaseOrder porder) {
		return null;
	}

	@Override
	public void delete(PurchaseOrder porder) {
		porderRepository.delete(porder);
	}

}
