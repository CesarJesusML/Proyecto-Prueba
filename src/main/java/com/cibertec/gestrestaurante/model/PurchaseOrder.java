package com.cibertec.gestrestaurante.model;

import java.time.LocalDateTime;
import java.util.Set;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "gr_purchase_order")
public class PurchaseOrder {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false)
    private String name;

	@Column(nullable = false)
    private String doc;

    @Column(nullable = false)
    private LocalDateTime purchasedate;
	
	@Column(nullable = false)
    private int table;


	public PurchaseOrder() {
	}
	
	public PurchaseOrder(Long id, String name, String doc, LocalDateTime purchasedate, int table,
			Set<PurchaseOrderDetail> details) {
		this.id = id;
		this.name = name;
		this.doc = doc;
		this.purchasedate = purchasedate;
		this.table = table;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public LocalDateTime getPurchasedate() {
		return purchasedate;
	}

	public void setPurchasedate(LocalDateTime purchasedate) {
		this.purchasedate = purchasedate;
	}

	public int getTable() {
		return table;
	}

	public void setTable(int table) {
		this.table = table;
	}
	
	
	
}
