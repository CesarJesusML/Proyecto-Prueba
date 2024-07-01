package com.cibertec.gestrestaurante.model;

import java.time.LocalDateTime;

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
@Table(name = "gr_booking")
public class Booking {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false)
    private String name;
	
	@Column(nullable = false)
    private String email;
	
	@Column(nullable = false)
    private String phone;
	
	@Column(nullable = false)
    private String doc;
	
    @Column(nullable = false)
    private int quantity;
	
    @Column(nullable = false)
    private LocalDateTime bookingdate;
    
    @Column(nullable = false)
    private boolean state;
    
	@ManyToOne
	@Nullable
	@JoinColumn(name="iduseraprov")
	User useraprov;
    
    public Booking() {
	}

	public Booking(Long id, String name, String email, String phone, String doc, int quantity,
			LocalDateTime bookingdate, boolean state, User useraprov) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.doc = doc;
		this.quantity = quantity;
		this.bookingdate = bookingdate;
		this.state = state;
		this.useraprov = useraprov;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDateTime getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(LocalDateTime bookingdate) {
		this.bookingdate = bookingdate;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public User getUseraprov() {
		return useraprov;
	}

	public void setUseraprov(User useraprov) {
		this.useraprov = useraprov;
	}
    

    	
    
}
