package com.springboot.CRUDdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.CRUDdemo.entity.Employee;

//@RepositoryRestResource(path="members") //8080/magic-api/members
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// that's it ... no need to write any code LOL!
}
