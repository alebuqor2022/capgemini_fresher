package com.capgemini.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

//1er ejemplo tradicional de Herencia en JAVA
//public class VideoDisc extends Disc implements Serializable{
//
//	private static final long serialVersionUID=-1L;
//	private String director;
//	private String lenguage;
	
	//getters y setters

	//2do Ejemplo
	//MAPEO --> Table por Jerarquia de Clase
//@Entity
//@DiscriminatorValue ("VIDEO")
//public class VideoDisc extends Disc implements Serializable {
//	
//private static final long serialVersionUID =-3637473456207740684L;  
//@Column (name="DIRECTOR")
//private String director;  
//@Column (name="LANGUAGE")  
//private String language;
////Getters and Setters


//3er Ejemplo
//MAPEO --> Table per SubClass 
//@Entity
//@Table (name="VIDEO_DISC")  
//@PrimaryKeyJoinColumn (name="DISC_ID")
//public class VideoDisc extends Disc implements Serializable {
//	
//private static final long serialVersionUID = -3637473456207740684L;  
//@Column (name="DIRECTOR")
//private String director;  
//@Column (name="LANGUAGE")  
//private String language;

//4to Ejemplo
//MAPEO --> Table per ConcreteClass  o Clases Hijas
@Entity
@Table (name="VIDEO_DISC")
public class VideoDisc extends Disc implements Serializable {
	
private static final long serialVersionUID = -3637473456207740684L;  
@Column (name="DIRECTOR")
private String director;  
@Column (name="LANGUAGE")  
private String language;



////getter and setters
}
