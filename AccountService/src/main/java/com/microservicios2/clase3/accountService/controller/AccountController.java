package com.microservicios2.clase3.accountService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios2.clase3.accountService.model.Account;
import com.microservicios2.clase3.accountService.model.Notification;
import com.microservicios2.clase3.accountService.repository.AccountRepository;
import com.microservicios2.clase3.accountService.service.NotificationService;

@RestController
public class AccountController {

	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	NotificationService notificationService;
	
	@PostMapping(value="/account")
	public Account save(@RequestBody Account account) {
		
		Notification notification = new Notification("Cuenta creada", "leon.arango@udea.edu.co", "9852XXX122");
		notificationService.sendNotification(notification);
		
		return accountRepository.save(account);
	}
	
	@GetMapping(value="/account")
	public Iterable<Account> all(){
		return accountRepository.findAll();
	}
	
	@GetMapping(value="/account/{accountId}")
	public Account findByAccountId (@PathVariable Integer accountId){
		return accountRepository.findAccountByAccountId(accountId);
	}
	
	@PutMapping(value="/account")
	public Account update (@RequestBody Account account) {
		
		return accountRepository.save(account);
	}
	
	@DeleteMapping(value="/account")
	public void delete(@RequestBody Account account) {
		accountRepository.delete(account);
	}
	
	@GetMapping(value="/account/account-type/{type}")
	public List<Account> findByAccountType(@PathVariable String type){
		return accountRepository.findAllByAccountType(type);
	}
	
	@GetMapping(value="/account/bank/{bank}")
	public List<Account> findByBank (@PathVariable String bank){
		return accountRepository.findByBank(bank);
	}
	
	@GetMapping(value="/account/customer/{customer}")
	public List<Account> findByCustomer (@PathVariable Integer customer){
		return accountRepository.findAllByCustomerId(customer);
	}

	
}
