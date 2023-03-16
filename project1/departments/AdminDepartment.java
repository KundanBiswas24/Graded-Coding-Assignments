package com.gl.oops.project1.departments;

import com.gl.oops.project1.base.SuperDepartment;

public class AdminDepartment extends SuperDepartment{ //extending all the properties and functionalities of super class
	
	
	//defining all the functionalities(methods) of AdminDepartment without any parameters 
    //hence, returning a String for every method
	
	public String departmentName() {
		return "Admin Department";
		
	}
	public String getTodaysWork() {
		return "Complete your documents submission";
		
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
		
	}


}
