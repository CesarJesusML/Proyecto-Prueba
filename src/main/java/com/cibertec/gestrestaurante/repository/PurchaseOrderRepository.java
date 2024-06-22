package com.cibertec.gestrestaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.gestrestaurante.model.PurchaseOrder;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer> {

}
