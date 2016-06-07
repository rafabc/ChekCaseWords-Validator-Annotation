package com.mvc.validators;

public enum CaseMode {
	
	UPPER("El campo debe estar en mayúsculas"), 
	LOWER("El campo debe estar en minúsculas");

	private final String msg;
	
	CaseMode(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
}
