package com.cibertec.gestrestaurante.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.gestrestaurante.model.PurchaseOrder;
import com.cibertec.gestrestaurante.repository.PurchaseOrderRepository;
import com.cibertec.gestrestaurante.service.PurchaseOrderService;

@Service
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
	public void delete(Long id) {
		Optional<PurchaseOrder> porderop = porderRepository.findById(id);
				
		if (!porderop.isEmpty()) {
			PurchaseOrder porder = porderop.get();
			
			porderRepository.delete(porder);
	    } 
	}

	@Override
	public PurchaseOrder getById(Long id) {
		Optional<PurchaseOrder> porderop = porderRepository.findById(id);
		PurchaseOrder porder = new PurchaseOrder();
		
		if (!porderop.isEmpty()) {
			porder = porderop.get();
			
	    } 
		
		return porder;
	}

}
