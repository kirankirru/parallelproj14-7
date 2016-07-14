package com.flp.ems.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmplyeeServiceImpl;
import com.flp.ems.service.IEmployeeService;
import com.flp.ems.util.Validate;

public class UserInteraction {
	Scanner sc=new Scanner(System.in);
	
	IEmployeeService empService;
		
		public UserInteraction()
		{
			empService= new EmplyeeServiceImpl();
		}
		
		public Employee AddEmployee()
		{   Validate v=new Validate();
			
			Map<String, Object> empDetails=new HashMap<String, Object>();
            System.out.print("Enter employee ID");
			empDetails.put("empId", sc.nextInt());
		    System.out.print("Enter employee Name");
			empDetails.put("empName", sc.next());
			System.out.print("Enter employee Email");
			empDetails.put("Email", sc.next());
			System.out.print("Enter employee phone");
			empDetails.put("phone_no", sc.next());
			
			 boolean b,j;
				
			do{
			System.out.print("Enter employee DOB");
		    String dob=sc.next();
		    b=v.valid_Date(dob);
		    
		    if(b){
		    	System.out.println("Valid");
		    	empDetails.put("DOB",dob );	
		    }
		    else{
		    	System.out.println("Invalid");
		    }
			}while(b==false);
			do{
		    System.out.print("Enter employee DOJ");
			String doj=sc.next();
			  j=v.valid_Date(doj);
					    
			    if(j){
			    	System.out.println("Valid");
			    	empDetails.put("DOJ", doj);
			    }
			    else{
			    	System.out.println("Invalid");
			    }
				

			}while(j==false);
		  	
		 
			System.out.print("Enter employee Address");
			empDetails.put("empAddress", sc.next());
	
			System.out.print("Enter Department id");
			empDetails.put("Dept_Id", sc.nextInt());
			System.out.print("Enter Department DeptName");
			empDetails.put("deptName", sc.next());
			System.out.print("Enter Department Description");
			empDetails.put("DeptDesc", sc.next());

			System.out.print("Enter project proj_id");
			empDetails.put("proj_Id", sc.nextInt());
			System.out.print("Enter project proj_Name");
			empDetails.put("proj_Name", sc.next());
			System.out.print("Enter project ProDescription");
			empDetails.put("ProDescription", sc.next());
            
			System.out.print("Enter Role_id");
			empDetails.put("Role_Id", sc.nextInt());
			System.out.print("Enter Role name");
			empDetails.put("RName", sc.next());
			System.out.print("Enter Role Description");
			empDetails.put("RDesc", sc.next());
			
			return empService.addEmployee(empDetails);
		}
		public void ModifyEmployee()
		{
			
		}
		
		public boolean RemoveEmployee()
		{
			System.out.println("kin_id");
			int empId;
			empId=sc.nextInt();
			return empService.RemoveEmployee(empId);
		}
		
		public Employee SearchEmployee()
		{
			System.out.println("Enter Emp_id");
		    int empId=sc.nextInt();
			return empService.SearchEmployee(empId);
		}
		
		public List<Employee> getAllEmployee(){
			return empService.getAllEmployee();
		}
		

	}



