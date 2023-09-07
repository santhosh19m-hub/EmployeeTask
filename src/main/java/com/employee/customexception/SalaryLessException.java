package com.employee.customexception;

public class SalaryLessException extends Exception {
	public SalaryLessException(String msg) {
		super(msg);
	}

}
