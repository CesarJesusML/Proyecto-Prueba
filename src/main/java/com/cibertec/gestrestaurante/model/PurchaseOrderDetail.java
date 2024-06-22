package com.cibertec.gestrestaurante.model;


import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "gr_purchase_order_detail")
public class PurchaseOrderDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @Column(nullable = false)
    private int quantity;
    
	@ManyToOne
	@Nullable
	@JoinColumn(name="idproduct")
	Product product;
	
	@ManyToOne
	@Nullable
	@JoinColumn(name="idporder")
	PurchaseOrder porder;

	public PurchaseOrderDetail() {
	}
	
	public PurchaseOrderDetail(Long id, int quantity, Product product) {
		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}
	
	
}
