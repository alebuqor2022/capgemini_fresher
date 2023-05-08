package com.capgemini.curso.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor

@Entity
@Table(name="talleres")
public class Curso {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	private String email;
	@Column
	private String instructor;
	@Column
	private String nombreCurso;
	
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Curso(Long id, String email, String instructor, String nombreCurso) {
		super();
		this.id = id;
		this.email = email;
		this.instructor = instructor;
		this.nombreCurso = nombreCurso;
	}
	
	public Curso(String email, String instructor, String nombreCurso) {
		super();
		this.email = email;
		this.instructor = instructor;
		this.nombreCurso = nombreCurso;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getNombreCurso() {
		return nombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	
}
