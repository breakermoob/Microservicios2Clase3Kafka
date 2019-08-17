package com.microservicios2.clase3.accountService.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.microservicios2.clase3.accountService.model.Account;


public interface AccountRepository extends CrudRepository<Account, Integer>{
	
	List<Account> findAllByCustomerId(Integer customerId);
	List<Account> findAllByAccountType(String accountType);
	List<Account> findByBank(String bank);
	
	Account findAccountByAccountId(Integer accountId);

}
