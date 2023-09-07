package com.employee.globalExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.employee.customexception.SalaryLessException;

@RestControllerAdvice
public class GlobalHandle {
@ExceptionHandler(SalaryLessException.class)
public ResponseEntity<Object> handlingSalaryLess() {
	return new ResponseEntity<Object>("Salary Less 75000",HttpStatus.BAD_GATEWAY);
}
}
