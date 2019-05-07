package com.br.projeto.model;

import org.hibernate.validator.constraints.NotEmpty;

public class SearchCriteria {

	@NotEmpty(message = "Username can't empty!")
	String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
