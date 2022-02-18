package com.example.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.curd.modal.Address;

@Repository
public interface AddressRepository  extends JpaRepository<Address, Long> {

}
