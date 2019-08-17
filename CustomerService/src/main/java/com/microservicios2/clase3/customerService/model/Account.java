package com.microservicios2.clase3.customerService.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Account {
	
	
	Integer accountId;
	Double balance;
	Integer customerId;
	String accountType;
	String branchCode;
	String bank;
}
