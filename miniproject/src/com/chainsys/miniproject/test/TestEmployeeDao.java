package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class TestEmployeeDao {
    public static void testGetAllEmployees() {
        List<Employee> allEmployees = EmployeeDao.getAllEmployee();
        Iterator<Employee> empIterator = allEmployees.iterator();
        while(empIterator.hasNext()) {
            Employee emp = empIterator.next();
            System.out.println(emp.getEmpId()+" "+emp.getFirst_name()+" "+emp.getSalary());
        }
    }
public static void testGetEmployeeById() {
    Employee emp = EmployeeDao.getEmployeeById(126);
    System.out.println(emp.getEmpId()+" "+emp.getFirst_name()+" "+emp.getSalary());
}
public static void testInsertEmployee() {
    Employee newemp = new Employee();
    newemp.setEmpId(300);
    newemp.setFirst_name("Ana");
    newemp.setLast_name("Rose");
    newemp.setEmail("ana23@mail.com");
    Calendar c1 = Calendar.getInstance();
    java.util.Date newDate =c1.getTime();
    newemp.setHireDate(newDate);
    newemp.setJobId("IT_PROG");
    newemp.setSalary(240000);
    int result = EmployeeDao.insertEmployee(newemp);
    System.out.println(result);
    
}
public static void testUpdateEmployee() {
    Employee oldEmployee = EmployeeDao.getEmployeeById(125);
    System.out.println(oldEmployee.getEmpId()+" "+oldEmployee.getFirst_name()+" "+oldEmployee.getSalary());
    oldEmployee.setFirst_name("Little");
    oldEmployee.setLast_name("Joe");
    oldEmployee.setEmail("Jeolil@mail.com");
    Calendar c1 = Calendar.getInstance();
    java.util.Date newDate =c1.getTime();
    oldEmployee.setHireDate(newDate);
    oldEmployee.setJobId("IT_PROG");
    oldEmployee.setSalary(240000);
    int result = EmployeeDao.updateEmployee(oldEmployee);
    System.out.println(result);
    
}
public static void testDeleteEmployee() {
    int result = EmployeeDao.deleteEmployee(101);
    System.out.println(result);
}
}