package com.microservicios2.clase3.customerService.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservicios2.clase3.customerService.model.Account;

@FeignClient(name="account-service")
public interface AccountService {
	
	@GetMapping(value="/account/customer/{customer}")
	List<Account> findByCustomer(@PathVariable("customer") Integer customer);

}
