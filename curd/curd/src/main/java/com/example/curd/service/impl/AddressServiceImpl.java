package com.example.curd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curd.dto.AddressDTO;
import com.example.curd.modal.Address;
import com.example.curd.repository.AddressRepository;
import com.example.curd.service.AddressService;
import com.example.curd.utils.AddressUtils;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public AddressDTO saveAddress(AddressDTO addressDTO) {
		Address save = addressRepository.save(AddressUtils.convertAddressDTOToDO(addressDTO));
		return AddressUtils.convertAddressDOToDTO(save);
	}

	@Override
	public AddressDTO getAddressById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAddressById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddressDTO updateAddress(AddressDTO addressDTO) {
		// TODO Auto-generated method stub
		return null;
	}


}
