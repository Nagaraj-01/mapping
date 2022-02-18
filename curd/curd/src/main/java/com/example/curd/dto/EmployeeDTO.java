package com.example.curd.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;

	private String firstName;

	private String lasName;

	private String emailid;
	
	private List<AddressDTO> addressDTO;

}
