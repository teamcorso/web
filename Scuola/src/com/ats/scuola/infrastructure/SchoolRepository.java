package com.ats.scuola.infrastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.ats.scuola.domain.Course;
import com.ats.scuola.domain.Student;

public class SchoolRepository {
	public Student save(Student s){
		return null;
	}
	
	public Course save(Course c){
		return null;
	}
	
	public Collection<Course> allCourses(){
		List<Course> list=new ArrayList<Course>();
		Course java= new Course(10, "java", "interessantissimo corso su java", 999.99,500);
		Course cobol= new Course(20, "cobol", "non interessantissimo corso su cobol", 9.99,400);
		list.add(cobol);
		list.add(java);
		return list;
	}
	
	public Collection<Course> coursesByName(String name){
		return null;
	}
	
	public Collection<Course> coursesLongerThan(int duration){
		return null;
	}
	
	public void enroll(int studentId, int courseId){
		
	}
	
	public Collection<Student> studentsInCourse(int courseId){
		return null;
	}
	

}
