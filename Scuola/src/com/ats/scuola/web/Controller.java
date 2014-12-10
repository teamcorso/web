package com.ats.scuola.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class Controller extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		int beginIndex=uri.lastIndexOf("/");
		int endIndex=uri.lastIndexOf(".do");
		String command=uri.substring(beginIndex+1, endIndex);
		System.out.println(command);
     	Command action= new NoCommandAction();
		switch (command){
		case "saveStudent":
			action = new SaveStudentAction();
			break;
		case "allCourses": 
			action = new AllCoursesAction();
			//destination = allCourses(request,response);
			break;
		case "searchCourses": 
			action = new SearchCoursesAction();
			break;
		case "enrollStudent": 
			action = new EnrollStudentAction();
			break;
		case "studentsInCourse": 
			action = new StudentInCourseAction();
			break;
		}
		String destination = action.execute(request, response);
		RequestDispatcher rd= request.getRequestDispatcher(destination);
		rd.forward(request, response);
	}
}
