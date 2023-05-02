package com.capgemini.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

// 1er ejemplo tradicional de Herencia en JAVA
//public abstract class Disc implements Serializable{
//	
//private static final long serialVersionUID=-1L;
//private Long discId;
//private String name;
//private int price;


// 2do Ejemplo
// MAPEO --> Table por Jerarquia de Clase
//@Entity
//@Inheritance (strategy=InheritanceType.SINGLE_TABLE)  
//@DiscriminatorColumn(name="DISC_TYPE",
//discriminatorType=DiscriminatorType.STRING)
//public class Disc implements Serializable {
//@Id
//@GeneratedValue (strategy=GenerationType.AUTO)  
//@Column (name="DISC_ID")
//private Long discId;
//
//@Column (name="NAME")  private String name;
//@Column (name="PRICE")  private Integer price;

//3er Ejemplo
//MAPEO --> Table per SubClass 
//@Entity
//@Inheritance (strategy=InheritanceType.JOINED)  
//public abstract class Disc implements Serializable {
//
//private static final long serialVersionUID = 3087285416805917315L;  
//@Id
//@GeneratedValue (strategy=GenerationType.AUTO)
//@Column (name="DISC_ID")  
//private Long discId;  
//@Column (name="NAME")  
//private String name;  
//@Column (name="PRICE")  
//private Integer price;

// 4to Ejemplo
//MAPEO --> Table per ConcreteClass  o Clases Hijas
@Entity
@Inheritance (strategy=InheritanceType.TABLE_PER_CLASS)  
public abstract class Disc implements Serializable {
	
private static final long serialVersionUID = 3087285416805917315L;  
@Id
@GeneratedValue (strategy=GenerationType.AUTO)
@Column (name="DISC_ID")  
private Long discId;  
@Column (name="NAME")  
private String name;  
@Column (name="PRICE")  
private Integer price;


////Getters and Setters
}
