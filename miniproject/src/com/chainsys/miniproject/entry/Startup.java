package com.chainsys.miniproject.entry;
import com.chainsys.miniproject.ui.AppointmentUi;
import com.chainsys.miniproject.ui.DoctorUi;
import com.chainsys.miniproject.ui.EmployeeUi;

	public class Startup {
		public static void main(String args[]) {
			//loadMenu();
//			loadMenu();
			loadDoctorMenu();
			
			
		}
	

		private static void loadMenu() {
			System.out.println("Enter Menu : 1 is EmployeeMenu, 2 is Doctor Menu, 3 is Appointment Menu ");
			java.util.Scanner sc = new java.util.Scanner(System.in);
	      try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				loadEmployeeMenu();
				break;
			case 2:
				loadDoctorMenu();
				break;
			case 3:
				loadAppointmentMenu();
				break;
			}
	      }finally {
	    	  sc.close();
	      }
		}

		private static void loadEmployeeMenu() {
			System.out.println(
					"Enter Employee Method : 1=addEmployee, 2=getEmployeeById ,3=upadateEmployee ,4=updateEmployeeFirstName, 5=updateEmployeeSalary, 6=deleteEmployee, 7=getAllEmployeeDetails");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			try {
			int call = sc.nextInt();
			
			switch (call) {
			case 1:
				EmployeeUi.addNewEmployee();
				break;

			case 2:
				EmployeeUi.getEmployeeDetails();
				break;
			case 3:
				EmployeeUi.getAllEmployeeDetails();
				break;
			case 4:
				EmployeeUi.updateEmployeeDetails();
				break;
			case 5:
				EmployeeUi.deleteEmployee();
				break;
			}
			}finally {
				sc.close();
			}
		}

		private static void loadDoctorMenu() {
			System.out.println(
					"Enter Doctor Method : 1=addNewDoctor ,2=getDoctorById ,3=updateDoctor ,4=updateDoctorFees, 5=updateDoctorFirstName, 6=getAllDoctorDetails, 7=deleteDoctor ");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				DoctorUi.addNewDoctor();
				break;
			case 2:
				DoctorUi.getDoctorById();
				break;
			case 3:
				DoctorUi.updateDoctor();
				break;
			case 4:
				DoctorUi.updateDoctorFees();
				break;
			case 5:
				DoctorUi.updateDoctorFirstName();
				break;
			case 6:
				DoctorUi.getAllDoctorDetails();
				break;
			case 7:
				DoctorUi.deleteDoctor();
				break;
			}
			}finally {
				sc.close();
			}
		}

		private static void loadAppointmentMenu() {
			System.out.println(
					"Enter Method : 1=addNewAppointment ,2=getPatientById ,3=updateAppointment ,4=updatePatientName ,5=updateFeesCollected ,6=getAllAppointmentDetails ,7=deleteAppointment ,8= LeftOuterJoin ,9=RightOuterJoin ,10=FullOuterJoin");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				AppointmentUi.addNewAppointment();
				break;
			case 2:
				AppointmentUi.getPatientById();
				break;
			case 3:
				AppointmentUi.updateAppointment();
				break;
			case 4:
				AppointmentUi.updatePatientName();
				break;
			case 5:
				AppointmentUi.updateFeesCollected();
				break;
			case 6:
				AppointmentUi.getAllAppointmentDetails();
				break;
			case 7:
				AppointmentUi.deleteAppointment();
				break;
			case 8:
				AppointmentUi.getLeftOuterJoinDoctorAndAppointment();
				break;
			case 9:
				AppointmentUi.getRightOuterJoinDoctorAndAppointment();
				break;
			case 10:
				AppointmentUi.getFullOuterJoinDoctorAndAppointment();
				break;
			}
			}finally {
				sc.close();
			}
		}




		}

