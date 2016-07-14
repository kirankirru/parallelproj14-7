package com.flp.ems.dao;

import java.util.List;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {
	

		public void ModifyEmployee();
		public boolean RemoveEmployee(int empId);
		
		public List<Employee> getAllEmployee();
		public Employee addEmployee(Employee employee);
		public Employee SearchEmployee(int empId);
	
		 

	}



