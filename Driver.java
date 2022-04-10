package com.bhalani.mitul;

public class Driver {
	
	public static void main(String[] args) {
		
		//admin departments starts//
		
		AdminDepartment a1=new AdminDepartment();
		a1.departmentName();
		System.out.println("welcome to " +a1.departmentName());
		
		AdminDepartment a2=new AdminDepartment();
		a2.getTodayWork();
		System.out.println(a2.getTodayWork());
			
		AdminDepartment a3=new AdminDepartment();
		a3.getWorkDeadline();
		System.out.println(a3.getWorkDeadline());
			
		AdminDepartment a4=new AdminDepartment();
		a4.isTodayAHoliday();
		System.out.println(a4.isTodayAHoliday()+"\n");
		
		// Hr Department Starts//
		
		
		HrDepartment a5=new HrDepartment();
		a5.departmentName();
		System.out.println("welcome to " +a5.departmentName());
		
		HrDepartment a6=new HrDepartment();
		a6.doActivity();
		System.out.println(a6.doActivity());
		
		HrDepartment a7=new HrDepartment();
		a7.getTodayWork();
		System.out.println(a7.getTodayWork());
		
		HrDepartment a8=new HrDepartment();
		a8.getWorkDeadline();
		System.out.println(a8.getWorkDeadline());
		
		HrDepartment a9=new HrDepartment();
		a9.isTodayAHoliday();
		System.out.println(a9.isTodayAHoliday()+"\n");
		
		
		//Tech department starts//
		
		TechDepartment a10 = new TechDepartment();
		a10.departmentName();
		System.out.println("welcome to " +a10.departmentName());
		
		TechDepartment a11 = new TechDepartment();
		a11.getTodayWork();
		System.out.println(a11.getTodayWork());
		
		TechDepartment a12 = new TechDepartment();
		a12.getWorkDeadline();
		System.out.println(a12.getWorkDeadline());
		
		TechDepartment a13 = new TechDepartment();
		a13.isTodayAHoliday();
		System.out.println(a13.isTodayAHoliday());
		
		
		
		
		
		
		
	
	}
		
		

}
