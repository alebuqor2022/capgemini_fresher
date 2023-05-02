package com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.capgemini.model.Ciudad;
import com.capgemini.model.Curso;
import com.capgemini.utils.JpaUtils;

public class DaoCurso {
	public static List<Curso> findAllCursos(int fk){
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		Query cursos=em.createNativeQuery(
				"SELECT UPPER(estudiantes.nombre) as student, cursos.nombre as course "
				+ "FROM (estudiantes inner join estudiante_cursos "
				+ "on estudiantes.id=estudiante_cursos.fk_estudiante) inner join cursos "
				+ "on estudiante_cursos.fk_curso = cursos.id "
				+ "where estudiantes.id = " + fk +";");
		List<Curso> c=cursos.getResultList();
		
		return c;
	}
	public static Curso find(Long id) {
		Curso p=null;
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		
		try {
			p=em.find(Curso.class, id); // Select * from personas where personas.id=id
		} catch (Exception e) {
			System.out.println("ups, no encontre el Curso " + e.getMessage());
		} finally {
		    em.close();
		}
		
		return p;
	}

	public static void update(Curso p) {
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		try {
			em.merge(p); // hace el update
			tx.commit();
			System.out.println("update exitoso!!");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("ups, no pude actualizar el Curso " + e.getMessage());;
		} finally {
			em.close();
		}
	}
	public static void create(Curso p) {
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		em.getTransaction().begin();
		
		try {
			em.persist(p); // hacemos el insert
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback(); // retroce, no hace cambios
			e.printStackTrace();
		}finally {
			em.close();
		}
	}
	public static void delete(Long id) {
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		em.getTransaction().begin();

		try {
			Curso p = em.find(Curso.class,id);
			em.remove(p); // Delete * from personas where personas.id=id
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("ups, no pude borrar el Curso " + e.getMessage());;
		} finally {
			em.close();
		}
	}


}
