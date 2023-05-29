package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Employee;


public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

	public List<Employee> findBydesignation(String designation);
	public List<Employee> findByageGreaterThan(int age);
	@Query("from Employee where designation=?1 order by salary desc")
	public List<Employee> myCustomMethod(String desig);
	

}
