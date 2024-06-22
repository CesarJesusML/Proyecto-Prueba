package com.cibertec.gestrestaurante.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cibertec.gestrestaurante.model.PurchaseOrderDetail;
import com.cibertec.gestrestaurante.repository.PurchaseOrderDetailRepository;
import com.cibertec.gestrestaurante.service.PurchaseOrderDetailService;

public class PurchaseOrderDetailServiceImpl implements PurchaseOrderDetailService {

	@Autowired
	PurchaseOrderDetailRepository porderdetailRepository;
	
	@Override
	public PurchaseOrderDetail create(PurchaseOrderDetail porderdetail) {
		return porderdetailRepository.save(porderdetail);
	}

	@Override
	public List<PurchaseOrderDetail> getAll() {
		return porderdetailRepository.findAll();
	}

	@Override
	public PurchaseOrderDetail update(PurchaseOrderDetail porderdetail) {
		return null;
	}

	@Override
	public void delete(PurchaseOrderDetail porderdetail) {
		porderdetailRepository.delete(porderdetail);
	}

}
