package com.cibertec.gestrestaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.gestrestaurante.model.PurchaseOrderDetail;

public interface PurchaseOrderDetailRepository extends JpaRepository<PurchaseOrderDetail, Integer> {

}
