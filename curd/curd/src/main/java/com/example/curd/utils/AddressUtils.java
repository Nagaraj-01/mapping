package com.example.curd.utils;

import com.example.curd.dto.AddressDTO;
import com.example.curd.modal.Address;

public class AddressUtils {
	
	public static Address convertAddressDTOToDO(AddressDTO addressDTO) {
		Address address = new Address();
		address.setAddressType(addressDTO.getAddressType());
		address.setDistrict(addressDTO.getDistrict());
		address.setDoorNo(addressDTO.getDoorNo());
		address.setEmployee(EmployeeUtils.convertEmployeeDTOToDO(addressDTO.getEmployeeDTO()));
		address.setId(addressDTO.getId());
		address.setState(addressDTO.getState());
		address.setStreet(addressDTO.getStreet());
		return address;
	}

	public static AddressDTO convertAddressDOToDTO(Address address) {
		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setAddressType(address.getAddressType());
		addressDTO.setDistrict(address.getDistrict());
		addressDTO.setDoorNo(address.getDoorNo());
		addressDTO.setEmployeeDTO(EmployeeUtils.convertEmployeeDOToDTO(address.getEmployee()));
		addressDTO.setId(address.getId());
		addressDTO.setState(address.getState());
		return addressDTO;
	}

}
