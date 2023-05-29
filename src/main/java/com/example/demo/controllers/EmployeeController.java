package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.models.Employee;
import com.example.demo.repositories.EmployeeDAO;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDAO dao;
	
	@RequestMapping("/")
	public String empinsert()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/addEmp")
	public String addEmp(Employee e)
	{	dao.save(e);
		
		return "index.jsp";
	}
	@GetMapping(value = "/getEmployees",produces = {"application/xml"})
	@ResponseBody
	public Iterable<Employee> getEmp()
	{	
		
		return dao.findAll();
	}
	
	@RequestMapping("/SearchEmployee/{eid}")
	@ResponseBody
	public Optional<Employee> searchEmp(int eid)
	{	
		
		return dao.findById(eid);
	}
	@PostMapping("/updateEmp")
	public String updateEmp(@RequestBody Employee e)
	{	
		dao.save(e);
		return "index.jsp";
	}
	@RequestMapping("/DeleteEmployee")
	@ResponseBody
	public String deleteEmp(int eid)
	{	
		if(dao.existsById(eid))
			{ dao.deleteById(eid);
			return "Record Deleted for EMP ID:" + eid;
			}
		else
			return "Sorry! Record not found for EMP ID :" + eid ;
		
	}
	
	@RequestMapping("/byDesig")
	@ResponseBody
	public List<Employee> Bydesignation(String desig)
	{	
		
		return dao.findBydesignation(desig);
	}
	@RequestMapping("/aboveAge")
	@ResponseBody
	public List<Employee> ageGreaterThan(int age)
	{	
		
		return dao.findByageGreaterThan(age);
	}
	@RequestMapping("/byDesigSalary")
	@ResponseBody
	public List<Employee> byDesignationSortSalary(String desig)
	{	
		
		return dao.myCustomMethod(desig);
	}
}
