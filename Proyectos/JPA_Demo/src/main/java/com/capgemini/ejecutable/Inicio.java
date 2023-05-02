package com.capgemini.ejecutable;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.capgemini.dao.DaoCiudad;
import com.capgemini.dao.DaoCurso;
import com.capgemini.dao.DaoEstudiante;
import com.capgemini.dao.DaoPais;
import com.capgemini.dao.DaoPersona;
import com.capgemini.model.Ciudad;
import com.capgemini.model.Curso;
import com.capgemini.model.Estudiante;
import com.capgemini.model.Pais;
import com.capgemini.model.Persona;

public class Inicio {

	public static void main(String[] args) {
//		crearPersona();
//		buscarPersona();
//		actualizarPersona();
//		borrarPersona();
//		testPaisCiudad();
		testEstudianteCurso();
	}

	public static void testPaisCiudad() {
		Pais p=DaoPais.find(1L);
		System.out.println("--- Pais de BD -----");
		System.out.println(p.getNombre());
		
		System.out.println("--- Ciudades de BD -----");
		List<Ciudad> ciudades=DaoCiudad.findAllCiudades(1L);
		for(int i=0; i<ciudades.size();i++) {
			System.out.println(ciudades.get(i));
		}
	}
	public static void crearPaisCiudad() {
		Pais p=new Pais();
		p.setNombre("Alemania");
		DaoPais.create(p);
		
		Pais p1=new Pais();
		p1.setNombre("Brasil");
		DaoPais.create(p1);
		
		Ciudad c=new Ciudad();
		c.setNombre("Berlin");
		c.setPais(p);
		DaoCiudad.create(c);
		
		Ciudad c1=new Ciudad();
		c1.setNombre("Munich");
		c1.setPais(p);
		DaoCiudad.create(c1);
		
		
	}
	
	public static void crearPersona() {
		Persona p=new Persona();
		p.setApellido("Lopez");
		p.setNombre("Francisco");
		p.setCedula("DFC162");
		Date fecha=new Date("1998/01/17");
		p.setFechaNacimiento(fecha);
		DaoPersona.create(p);
	}
	
	public static void buscarPersona() {
		Persona p=DaoPersona.find(52L);
		System.out.println(p.getNombre());
	}
	
	public static void actualizarPersona() {
		Persona p=DaoPersona.find(52L);
		p.setCedula("HIBA111");
		
		DaoPersona.update(p);
		System.out.println(p.getNombre()+ ", " + p.getCedula());
	}
	
	public static void borrarPersona() {
		DaoPersona.delete(152L);
	}

	public static void testEstudianteCurso() {
		Estudiante e=DaoEstudiante.find(2L);
		System.out.println("----Estudiante------");
		System.out.println(e.getNombre()+" "+e.getApellido());
		System.out.println("----Cursos------");
		List<Curso> cursos= DaoCurso.findAllCursos(1);
		
		for(Object o: cursos) {
			System.out.println(resultado(o));
		}
		
	}
	
	private static String resultado(Object o) {
		return Arrays.asList((Object[])o).toString();
	}
}
