package com.indra.SpringAOP.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
@Entity
@Table(name="courses")
public class Course {
	public Course(Long id, String courseName, String instructor, String email) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.instructor = instructor;
		this.email = email;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="course_name")
	private String courseName;
	
	@Column(name="instructor")
	private String instructor;
	
	@Column(name="email")
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
