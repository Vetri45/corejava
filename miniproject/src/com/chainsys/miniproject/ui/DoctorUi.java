package com.chainsys.miniproject.ui;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.pojo.Employee;

public class DoctorUi {
    public static void addNewDoctor() {
    	 java.util.Scanner sc =new java.util.Scanner(System.in);  
    	 Doctor newdoc=new Doctor();
    	 System.out.println("Enter Doctor_Id :");
    	 String id=sc.nextLine();
       	newdoc.setDoctor_id(Integer.parseInt(id));
       	System.out.println("Enter Name :");
       	newdoc.setName(sc.nextLine());
       	Calendar c1 =Calendar.getInstance();
       	java.util.Date newDate =new java.util.Date();
      // 	System.out.println("Enter DOB :");
       	newdoc.setDate(newDate);
       	System.out.println("Enter Speciality :");
       	newdoc.setSpeciality(sc.nextLine());
       	System.out.println("Enter City :");
       	newdoc.setCity(sc.nextLine());
       	System.out.println("Enter Phone_Number");
       	newdoc.setNumber(sc.nextLine());
       	System.out.println("Enter Standard_Fees :");
           newdoc.setStd_Fees(sc.nextFloat());
       	int result =DoctorDao.insertDoctor(newdoc);
       	System.out.println(result);
    }
    
    public static void updateDoctor() {
   	 java.util.Scanner sc =new java.util.Scanner(System.in);  
   	 Doctor newdoc=new Doctor();
   	 System.out.println("Enter Doctor_Id :");
   	 String id=sc.nextLine();
      	newdoc.setDoctor_id(Integer.parseInt(id));
      	System.out.println("Enter Name :");
      	newdoc.setName(sc.nextLine());
      	Calendar c1 =Calendar.getInstance();
      	java.util.Date newDate =new java.util.Date();
     // 	System.out.println("Enter DOB :");
      	newdoc.setDate(newDate);
      	System.out.println("Enter Speciality :");
      	newdoc.setSpeciality(sc.nextLine());
      	System.out.println("Enter City :");
      	newdoc.setCity(sc.nextLine());
      	System.out.println("Enter Phone_Number");
      	newdoc.setNumber(sc.nextLine());
      	System.out.println("Enter Standard_Fees :");
          newdoc.setStd_Fees(sc.nextFloat());
      	int result =DoctorDao.updateDoctor(newdoc);
      	System.out.println(result);
   }
    
    public static void updateDoctorFirstName() {
    	 java.util.Scanner sc =new java.util.Scanner(System.in);  
       	 Doctor newdoc=new Doctor();
       	 System.out.println("Enter Doctor_Id :");
       	 String id=sc.nextLine();
          	newdoc.setDoctor_id(Integer.parseInt(id));
          	System.out.println("Enter Update Name :");
        	String update_name= sc.nextLine();
    	   	int result =DoctorDao.updateDoctorFirstName(Integer.parseInt(id), update_name);
    	   	System.out.println(result);	
    }
    
    public static void updateDoctorFees() {
   	 java.util.Scanner sc =new java.util.Scanner(System.in);  
      	 Doctor newdoc=new Doctor();
      	 System.out.println("Enter Doctor_Id :");
      	 String id=sc.nextLine();
         	newdoc.setDoctor_id(Integer.parseInt(id));
        System.out.println("Enter Update Name :");
       	float update_fees= sc.nextFloat();
   	   	int result =DoctorDao.updateDoctorFees(Integer.parseInt(id), update_fees);
   	   	System.out.println(result);	
   }
    
    public static void deleteDoctor() {
   	 java.util.Scanner sc =new java.util.Scanner(System.in);  
      	 Doctor newdoc=new Doctor();
      	 System.out.println("Enter Doctor_Id :");
      	 String id=sc.nextLine();
         	newdoc.setDoctor_id(Integer.parseInt(id));
         //	System.out.println("Enter Update Name :");
       	//String update_name= sc.nextLine();
   	   	int result =DoctorDao.deleteDoctor(Integer.parseInt(id));
   	   	System.out.println(result);	
   }
    
    public static void getDoctorById() {
   	 java.util.Scanner sc =new java.util.Scanner(System.in);  
      	 Doctor newdoc=new Doctor();
      	 System.out.println("Enter Doctor_Id :");
      	 String id=sc.nextLine();
         	newdoc.setDoctor_id(Integer.parseInt(id));
   	   Doctor result =DoctorDao.getDoctorById(Integer.parseInt(id));
   	   	System.out.println(result.getDoctor_id()+" "+result.getName()+" "+result.getDate()+" "+result.getSpeciality()+" "+result.getCity()+" "+result.getNumber()+" "+result.getStd_Fees());	
   }
    
    public static void getAllDoctorDetails(){
		   List<Doctor> allDoctor =DoctorDao.getAllDoctor();
	    	 Iterator <Doctor> drIterator = allDoctor.iterator();
	    	 while(drIterator.hasNext()) {
	    		 Doctor dr =drIterator.next();
	    		 System.out.println(dr.getDoctor_id()+" "+dr.getName()+" "+dr.getDate()+" "+dr.getSpeciality()+" "+dr.getCity()+" "+dr.getNumber()+" "+dr.getStd_Fees());	
	    	 }
	 	}
}
