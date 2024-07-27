package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnection.studentdb;
import models.student;
import services_dao.studentservice_dao;

@WebServlet("/register")
public class studentservlet extends HttpServlet{
      
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String Name = req.getParameter("Name"); // the passing parameter should be same as the name in frontend
		
		String Branch =  req.getParameter("Branch");
		
		String Email = req.getParameter("Email");
		
		long Phoneno = Long.parseLong(req.getParameter("Phoneno"));
		
		student std = new student(0,Name,Branch,Email,Phoneno);
		 
		studentservice_dao service = new studentservice_dao(studentdb.getconnection());
		
		boolean i = service.addstudent(std); // we use boolean for addstudent method in service so, we use boolean here
		
		if(i) {
			resp.sendRedirect("welcome.jsp");
		}
		else {
			resp.sendRedirect("register.jsp");
		}
		
	}
}