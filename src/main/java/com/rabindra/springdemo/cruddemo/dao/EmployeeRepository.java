package com.rabindra.springdemo.cruddemo.dao;

//import java.util.List;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rabindra.springdemo.cruddemo.entity.Employee;

@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//that's it ........no need to write any code.........
	
//	@Query(value="select * from employee e where e.age<25",nativeQuery=true)
//	List<Employee> getUserByage(int age);
	
	@Query(value="select count(*) from employee",nativeQuery=true)
	public int getNOofUser();
}

