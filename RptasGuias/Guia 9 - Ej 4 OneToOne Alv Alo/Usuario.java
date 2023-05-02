package com.capgemini.guia9.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Usuarios")
public class Usuario {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String firstname;

	@Column
	private String lastname;

	@Column
	private String username;

	@Column
	private String password;

	@Column
	private String email;

	@Column
	private int ranking;

	@Column
	private boolean admin;

	@OneToOne
	@JoinColumn(name = "fk_particular")
	private Address domicilioParticular;
	
	@OneToOne
	@JoinColumn(name = "fk_trabajo")
	private Address domicilioTrabajo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public Address getDomicilioParticular() {
		return domicilioParticular;
	}

	public void setDomicilioParticular(Address domicilioParticular) {
		this.domicilioParticular = domicilioParticular;
	}

	public Address getDomicilioTrabajo() {
		return domicilioTrabajo;
	}

	public void setDomicilioTrabajo(Address domicilioTrabajo) {
		this.domicilioTrabajo = domicilioTrabajo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", username=" + username
				+ ", password=" + password + ", email=" + email + ", ranking=" + ranking + ", admin=" + admin
				+ ", domicilioParticular=" + domicilioParticular + ", domicilioTrabajo=" + domicilioTrabajo + "]";
	}
	
	
}
