package com.capgemini.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="estudiantes")
public class Estudiante {
private static final long serialVersionUID=-1L;
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String identificacion;
	
	@ManyToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
			name="estudiante_cursos",
			joinColumns=@JoinColumn(name="fk_estudiante"),
			inverseJoinColumns=@JoinColumn(name="fk_curso")
			)
	private List<Curso> cursos=new ArrayList<Curso>();

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
}
