package com.ats.scuola.web;

import java.util.Collection;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ats.scuola.domain.Course;
import com.ats.scuola.infrastructure.SchoolRepository;

public class AllCoursesAction implements Command{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		SchoolRepository rs=new SchoolRepository();
		Collection<Course> result=rs.allCourses();
		request.setAttribute("allCourses",result);
		return "WEB-INF/jsp/allCourses.jsp";
	}

}
