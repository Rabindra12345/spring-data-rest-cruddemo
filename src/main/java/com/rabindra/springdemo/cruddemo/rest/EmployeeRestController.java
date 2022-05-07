package com.rabindra.springdemo.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabindra.springdemo.cruddemo.dao.EmployeeRepository;
//import com.rabindra.springdemo.cruddemo.dao.EmployeeDAO;
//import com.rabindra.springdemo.cruddemo.entity.Customer;
import com.rabindra.springdemo.cruddemo.entity.Employee;
//import com.rabindra.springdemo.cruddemo.service.EmployeeService;
//import com.rabindra.springdemo.rest.CustomerNotFoundException;

@RestController

@RequestMapping("/test")
@Profile({"dev"})
public class EmployeeRestController {

	//inject the DAO 
	@Autowired
	private EmployeeRepository employeeRepo;
	
	int count = 0;
	
	
	@Scheduled(cron="0 * * * * *")
	public List<Employee> getAll(){
		
		final  int tempCount = employeeRepo.getNOofUser();
		
		if (count != tempCount) {
            return employeeRepo.findAll();
        } else {
        	List<Employee> theEmployee = null;
			return theEmployee;
        }
		
	}
}

