package com.microservicios2.clase3.customerService.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservicios2.clase3.customerService.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer>{	
	Customer findByCustomerId(Integer customerId);
}
