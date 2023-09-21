package com.employee.customexception;

public class LessSalaryException extends Exception {
      public LessSalaryException(String msg) {
    	  super(msg);
      }
}
