package com.ats.scuola.domain.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;



@Entity
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="STUDENT_ID_GENERATOR", sequenceName="STUDENT_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STUDENT_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Column(name="LAST_NAME")
	private String lastName;

	private String name;

	private String sex;

	//bi-directional many-to-many association to Course
	@ManyToMany
	@JoinTable(
		name="ENROLLEMENT"
		, joinColumns={
			@JoinColumn(name="STUDENT_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="COURSE_ID")
			}
		)
	private List<Course> courses;

	public Student() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}