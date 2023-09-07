package com.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.customexception.SalaryLessException;
import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;
@Service
public class EmployeeService {
@Autowired
EmployeeDao ed;
	public String setAll(List<Employee> e) throws SalaryLessException {
		List<Employee> temp=new ArrayList<>();
		for(Employee x:e) {
			if(x.getSalary()<75000) {
				throw new SalaryLessException("Salary is below 75000");
			}
			else {
				temp.add(x);
			}
		}
		return ed.setAll(temp);
	}
	public static Logger log=Logger.getLogger("EmployeeService.class");
	public List<Employee> getAll() {
		PropertyConfigurator.configure("logging.properties");
		log.info(ed.getAll());
		return ed.getAll();
	}

}
