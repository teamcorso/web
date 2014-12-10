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
		String destination="WEB-INF/jsp/error.jsp";
		switch (command){
		case "saveStudent":
			saveStudent();
			break;
		case "allCourses": 
			destination = allCourses(request,response);
			break;
		case "searchCourses": 
			searchCourses();
			break;
		case "enrollStudent": 
			enrollStudent();
			break;
		case "studentsInCourse": 
			studentsInCourse();
			break;
		}
		RequestDispatcher rd= request.getRequestDispatcher(destination);
		rd.forward(request, response);
	}


	private void studentsInCourse() {
		// TODO Auto-generated method stub
		
	}


	private void enrollStudent() {
		// TODO Auto-generated method stub
		
	}


	private void searchCourses() {
		// TODO Auto-generated method stub
		
	}


	private String allCourses(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		Command action=new AllCoursesAction();
		 return action.execute(request, response);
		
	}


	private void saveStudent() {
		// TODO Auto-generated method stub
		
	}

}
