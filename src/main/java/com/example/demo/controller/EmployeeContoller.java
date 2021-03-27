package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeContoller {
	@Autowired
	phone ph;
	@RequestMapping("show")
public String 	showAllEployees(){
	
	return "all Employees";
	
}
	@RequestMapping("getintarray")
	public int[] getArray(){
		int[] array=  {1,2,3,4,5,6};
		return array;
	

}
	@RequestMapping("/getarraylist")
	public ArrayList<Integer> getarraylist()
	{
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		
		return  al ;
	}
	@RequestMapping("/getstudentlist")
	public ArrayList<Student> getStudentList()
	{
		ArrayList<Student> arraylist= new ArrayList<Student>();
		Student s1= new Student();
		s1.setRoll_no(100);
		s1.setName("abc");
		
		Student s2= new Student();
		s2.setRoll_no(101);
		s2.setName("pqr");
		
		Student s3= new Student();
		s3.setRoll_no(102);
		s3.setName("xyz");
		
		arraylist.add(s1);
		arraylist.add(s2);
		arraylist.add(s3);
		
		return arraylist;
	}
	@RequestMapping("/getemployee")
	  public ArrayList<Employee> employeeAPI(){
		ArrayList<Employee> arrlist= new ArrayList<Employee>();
		  Employee emp= new Employee();
		  emp.setAge(25);
		  emp.setName("abc");
		  
		  Employee emp1= new Employee();
		  emp1.setAge(30);
		  emp1.setName("xyz");
		  arrlist.add(emp);
		  arrlist.add(emp1);
		  
		  return arrlist;
		  
	  }

	@RequestMapping("/getPhone")
	public phone getPhone(){
		ph.setCost(10000);
		return ph;
		
	}
}