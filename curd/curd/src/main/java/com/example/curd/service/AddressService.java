package com.example.curd.service;

import com.example.curd.dto.AddressDTO;

public interface AddressService {
	
	public AddressDTO saveAddress(AddressDTO addressDTO);
	
	public AddressDTO getAddressById(String id);

	public String deleteAddressById(String id);

	public AddressDTO updateAddress(AddressDTO addressDTO);
	
}
