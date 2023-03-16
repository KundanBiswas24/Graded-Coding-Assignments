package com.gl.oops.project1.departments;

import com.gl.oops.project1.base.SuperDepartment;

public class TechDepartment extends SuperDepartment{//extending all the properties and functionalities of super class
	
	//defining all the functionalities(methods) of TechDepartment without any parameters 
    //hence, returning a String for every method

	public String departmentName() {
		return "Tech Department";

	}
	public String getTodaysWork() {
		return "Complete coding of module1";

	}
	public String getWorkDeadline() {
		return "Complete by EOD";

	}
	public String getTechStackInformation() {
		return "Core java";
	}

}
