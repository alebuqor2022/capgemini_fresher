package com.capgemini.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

//1er ejemplo tradicional de Herencia en JAVA
//public class AudioDisc extends Disc implements Serializable{
//
//	private static final long serialVersionUID=-1L;
//	private int nroOfSongs;
//	private String singer;
//	// getters y setters


//2do Ejemplo
//MAPEO --> Table por Jerarquia de Clase
//@Entity
//@DiscriminatorValue ("AUDIO")
//public class AudioDisc extends Disc implements Serializable {
//private static final long serialVersionUID = 8510682776718466795L;  
//@Column (name="NO_OF_SONGS")
//private Integer noOfSongs;
//
//@Column (name="SINGER")  private String singer;



//3er Ejemplo
//MAPEO --> Table per SubClass 
//@Entity
//@Table (name="AUDIO_DISC") 
//@PrimaryKeyJoinColumn (name="DISC_ID")
//public class AudioDisc extends Disc implements Serializable {
//	
//private static final long serialVersionUID = 8510682776718466795L;  
//@Column (name="NO_OF_SONGS")
//private Integer noOfSongs;
//@Column (name="SINGER")  private String singer;


//4to Ejemplo
//MAPEO --> Table per ConcreteClass  o Clases Hijas
@Entity
@Table (name="AUDIO_DISC")
public class AudioDisc extends Disc implements Serializable {
	
private static final long serialVersionUID = 8510682776718466795L;  
@Column (name="NO_OF_SONGS")
private Integer noOfSongs;  
@Column (name="SINGER")  
private String singer;

////Getters and Setters
}
