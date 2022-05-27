package com.chainsys.miniproject.test;


	import java.util.Calendar;
	import java.util.Scanner;

	import com.chainsys.miniproject.dao.DoctorDao;
	import com.chainsys.miniproject.dao.EmployeeDao;
	import com.chainsys.miniproject.pojo.Doctor;
	public class TestDoctorDao {
	public static void addNewDoctor()
	{
	Scanner sc=new Scanner(System.in);
	Doctor newdoct=new Doctor();
	System.out.println("Enter Doctor Id:");
	String Id=sc.nextLine();
	newdoct.setId(Integer.parseInt(Id));
	System.out.println("Enter Doctor Name:");
	newdoct.setName(sc.nextLine());

	Calendar c1 = Calendar.getInstance();
	java.util.Date newDate =c1.getTime();
	newdoct.setDOB(newDate);

	System.out.println("Enter Doctor Speciality:");
	newdoct.setSpeciality(sc.nextLine());
	System.out.println("Enter Doctor City:");
	newdoct.setCity(sc.nextLine());
	System.out.println("Enter Doctor Phone_no:");
	newdoct.setPhone_no(sc.nextLong());
	System.out.println("Enter Doctor Standard_fees:");
	newdoct.setStandard_fees(sc.nextFloat());
	int result = DoctorDao.insertDoctor(newdoct);
	System.out.println(result);
	}
	}

