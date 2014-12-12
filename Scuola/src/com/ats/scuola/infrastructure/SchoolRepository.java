package com.ats.scuola.infrastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ats.scuola.domain.entities.Course;
import com.ats.scuola.domain.entities.Student;

public class SchoolRepository {

	private static EntityManagerFactory factory = Persistence
			.createEntityManagerFactory("Scuola");

	public static EntityManager createManager() {
		return factory.createEntityManager();
	}

	public Student save(Student s) {
		EntityManager manager = null;
		try {
			manager = createManager();
			manager.getTransaction().begin();
			manager.persist(s);
			manager.getTransaction().commit();
			return s;
		} finally {
			if (manager != null)
				manager.close();
		}
	}

	public Course save(Course c) {
		EntityManager manager = null;
		try {
			manager = createManager();
			manager.getTransaction().begin();
			manager.persist(c);
			manager.getTransaction().commit();
			return c;
		} finally {
			if (manager != null)
				manager.close();
		}
	}

	public Collection<Course> allCourses() {
		EntityManager manager = null;
		try {
			manager = createManager();
			Query q = manager.createQuery("select c from Course c");
			return q.getResultList();
		} finally {
			if (manager != null)
				manager.close();
		}

	}

	public Collection<Course> coursesByName(String name) {
		EntityManager manager = null;
		try {
			manager = createManager();
			Query q = manager.createQuery("select c from Course c where c.name like :name");
			q.setParameter("name", "%"+name+"%");
			return q.getResultList();
		} finally {
			if (manager != null)
				manager.close();
		}
	}

	public Collection<Course> coursesLongerThan(int duration) {
		EntityManager manager = null;
		try {
			manager = createManager();
			Query q = manager.createQuery("select c from Course c where duration > :duration");
			q.setParameter("duration", duration);
			return q.getResultList();
		} finally {
			if (manager != null)
				manager.close();
		}
	}

	public void enroll(int studentId, int courseId) {
		EntityManager manager = null;
		try {
			manager = createManager();
			manager.getTransaction().begin();
			Student st = manager.find(Student.class, studentId);
			Course c = manager.find(Course.class, courseId);
			st.getCourses().add(c);
			c.getStudents().add(st);
			manager.getTransaction().commit();
		} finally {
			if (manager != null)
				manager.close();
		}
	}

	public Collection<Student> studentsInCourse(int courseId) {
		EntityManager manager = null;
		try {
			manager = createManager();
			Course c = manager.find(Course.class, courseId);
			return c.getStudents();
		} finally {
			if (manager != null)
				manager.close();
		}
	}

}
