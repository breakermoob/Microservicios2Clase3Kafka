package com.microservicios2.clase3.customerService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios2.clase3.customerService.model.Customer;
import com.microservicios2.clase3.customerService.model.Notification;
import com.microservicios2.clase3.customerService.repository.CustomerRepository;
import com.microservicios2.clase3.customerService.service.AccountService;
import com.microservicios2.clase3.customerService.service.NotificationService;


@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	NotificationService notificationService;
	
	@PostMapping(value="/customer")
	public Customer save(@RequestBody Customer customer) {
		Notification notification = new Notification("Cuenta creada", "leon.arango@udea.edu.co", "9852XXX122");
		notificationService.sendNotification(notification);
		return customerRepository.save(customer);
	}
}
