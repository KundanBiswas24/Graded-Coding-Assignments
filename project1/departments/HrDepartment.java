package com.gl.oops.project1.departments;

import com.gl.oops.project1.base.SuperDepartment;

public class HrDepartment extends SuperDepartment{//extending all the properties and functionalities of super class
	
	//defining all the functionalities(methods) of HrDepartment without any parameters 
    //hence, returning a String for every method
	
	public String departmentName() {
		return "HR Department";
		
	}
	 public String getTodaysWork() {
		 return "Fill today's timesheet and mark your attendance";
		 
	 }
	public String getWorkDeadline() {
		return "Complete by EOD";
		
	}
	public String doActivity() {
		return "Team Lunch";
	}

}
