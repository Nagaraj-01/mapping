package com.example.curd.dto;

import lombok.Data;

@Data
public class AddressDTO {

	private long id;
	
	private String addressType;
	
	private String doorNo;

	private String street;

	private String district;

	private String state;
	
	private EmployeeDTO employeeDTO;
	
}
