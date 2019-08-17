package com.microservicios2.clase3.accountService.model;

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
public class Notification {

	private static final long serialVersionUID = 1L;
	
	private String message;
	private String email;
	private String mobile;
}
