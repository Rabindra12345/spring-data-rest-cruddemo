package com.rabindra.springdemo.cruddemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.rabindra.springdemo.cruddemo.dao.EmployeeRepository;
import com.rabindra.springdemo.cruddemo.entity.Employee;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class UserRepositoryTest {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Test
	void testUserByAge() {
		
		
//		int age =23;
//		
//		List<Employee> users = empRepo.getUserByage(age);
//		
		
		
		
	}

}
