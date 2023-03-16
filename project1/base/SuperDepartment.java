package com.gl.oops.project1.base;

//this the Parent/Base/Super class
public class SuperDepartment {

	
	//defining all the functionalities(methods) of SuperDepartment without any parameters 
	//hence, returning a String for every method
	
	public String departmentName() {
		return "Super Department";
		
	}
	  public String getTodaysWork() {
		  return "No Work as of now";
		  
	  }
	 public String getWorkDeadline() {
		 return "Nil";
	 }
	 public String isTodayAHoliday() {
		 return "Today is not a Holiday"; 
	 }
}
