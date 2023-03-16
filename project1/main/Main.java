package com.gl.oops.project1.main;

import com.gl.oops.project1.departments.AdminDepartment;
import com.gl.oops.project1.departments.HrDepartment;
import com.gl.oops.project1.departments.TechDepartment;

public class Main {
	public static void main(String[] args) {

		//creating objects for HrDepartment,TechDepartment,AdminDepartment

		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();

		//displaying all the functionalities of AdminDepartment using an object under AdminDepartment class
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();

		//displaying all the functionalities of HrDepartment using an object under HrDepartment class
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();

		//displaying all the functionalities of TechDepartment using an object under TechDepartment class
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());


	}

}
