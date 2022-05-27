 package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionState
 */
public class SessionState extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionState() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head><title>HelloWorld</title></head><body>");
       String submitvalue=request.getParameter("submit");
       HttpSession session = request.getSession(true); // create session id (token)
       System.out.println(session.getId());
       if(submitvalue.equals("set"))
       {
       String SalaryInput=request.getParameter("salary"); 
       // Salary is the key stored data in session for each user
       session.setAttribute("Salary", SalaryInput);  
       // session.setAttribute() stores the data in a  collection using key and value.
       // Salary = key, salaryInput = value
       out.println("<h1>Value set</h1>"+SalaryInput);
   }
   else if(submitvalue.equals("fetch"))
   {
      
       String sessionSalary=(String) session.getAttribute("salary");
       if(sessionSalary==null) {
           out.print("<h1>SESSION CONTEXT NOT YET SET</h1>");
       }
        //String sessionSalary=(String) session.getAttribute("salary").toString();
       else {
       out.println("<h1>value fetched</h1>" + sessionSalary); // returning value from sessionAttribute  to html
   }
       out.println("<h1>Value fetched</h1>"+sessionSalary);  // Returning value from session Attribute
   }
       out.println("</body></html>");
   }}


