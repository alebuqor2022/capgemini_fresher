package com.capgemini.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="cursos")
public class Curso {
	private static final long serialVersionUID=-1L;
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column
	private String nombre;
	
	@ManyToMany(mappedBy="cursos")
	List<Estudiante> estudiantes=new ArrayList<Estudiante>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	
	
}
