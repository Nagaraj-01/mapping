package com.example.curd.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "employee_address")
public class Address {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false, updatable = false)
	private long id;
	
	@Column(name = "address_type")
	private String addressType;
	
	@Column(name = "door_no")
	private String doorNo;

	@Column(name = "street")
	private String street;

	@Column(name = "district")
	private String district;

	@Column(name = "state")
	private String state;
	
	@ManyToOne
	private Employee employee;

}
