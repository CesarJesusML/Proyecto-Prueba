package com.cibertec.gestrestaurante.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
    private int tablenum;

    @Column(nullable = false)
    private boolean state = true;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "purchase_id")
    private List<PurchaseOrderDetail> purchasedetail; 
    
	public PurchaseOrder() {
	}
	
	
	
	public PurchaseOrder(Long id, String name, String doc, LocalDateTime purchasedate, int tablenum, boolean state,
			List<PurchaseOrderDetail> purchasedetail) {
		this.id = id;
		this.name = name;
		this.doc = doc;
		this.purchasedate = purchasedate;
		this.tablenum = tablenum;
		this.state = state;
		this.purchasedetail = purchasedetail;
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

	public int getTablenum() {
		return tablenum;
	}

	public void setTablenum(int tablenum) {
		this.tablenum = tablenum;
	}
	
	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}



	public List<PurchaseOrderDetail> getPurchasedetail() {
		return purchasedetail;
	}



	public void setPurchasedetail(List<PurchaseOrderDetail> purchasedetail) {
		this.purchasedetail = purchasedetail;
	}
	
	
	
}
