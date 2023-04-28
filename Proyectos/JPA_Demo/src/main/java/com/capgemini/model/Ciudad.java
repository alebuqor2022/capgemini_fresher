package com.capgemini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ciudades")
public class Ciudad {
	private static final long serialVersionUID=-1L;
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column
	private String nombre;
	
	@ManyToOne(fetch=FetchType.LAZY)//Lazy: carga demorada, haragana -- EAGER: carga temprana
	@JoinColumn(name="fk_pais")
	private Pais pais;

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

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
