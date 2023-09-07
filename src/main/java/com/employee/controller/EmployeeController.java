package com.employee.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.customexception.SalaryLessException;
import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
EmployeeService es;
@PostMapping("/setAll") 
public String setAll(@RequestBody List<Employee> e) throws SalaryLessException {
	return es.setAll(e);
}
public static Logger log=Logger.getLogger("EmployeeController.class");
@GetMapping("/getAll")
public List<Employee> getAll() {
	PropertyConfigurator.configure("logging.properties");
	log.info(es.getAll());
	return es.getAll();
}
}
