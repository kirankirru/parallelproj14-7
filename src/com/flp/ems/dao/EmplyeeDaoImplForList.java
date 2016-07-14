package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Role;
import com.flp.ems.domain.project;

public class EmplyeeDaoImplForList implements IemployeeDao{
	List<Employee>employees=new ArrayList<Employee>();
	List<Department>departments=new ArrayList<Department>();
	List<project>projects=new ArrayList<project>();
	List<Role>roles=new ArrayList<Role>();

	public Employee addEmployee( Employee emp)
	{
		employees.add(emp);
		departments.add(emp.getDepartment());
		projects.add(emp.getProject());
		roles.add(emp.getRole());
		return emp;
	}

	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	
	public boolean RemoveEmployee(int empId) {
	
		for (Employee emp : employees) {
		       if (emp.getEmpid() == empId){
		          employees.remove(emp);
		          return true;
		       }
		 }
		return false;
	}

	public Employee SearchEmployee(int empId) 
	{
		 for(Employee emp : employees) {
		        if(emp.getEmpid() == empId)
		        {
		        	return emp;
		        }
		  }
		 return null;
	}
	
	public List<Employee> getAllEmployee() {
		if(employees.isEmpty())
			return null;
		return employees;
	}

}
