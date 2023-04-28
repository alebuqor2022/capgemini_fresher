package com.capgemini.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.capgemini.model.Persona;
import com.capgemini.utils.JpaUtils;

public class DaoPersona {
// data access object =DAO
// crud : create read update delete .... ABM alta baja modificacion
	
public static void create(Persona p) {
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

public static Persona find(Long id) {
	Persona p=null;
	EntityManager em=JpaUtils.getEmf().createEntityManager();
	
	try {
		p=em.find(Persona.class, id); // Select * from personas where personas.id=id
	} catch (Exception e) {
		System.out.println("ups, no encontre la persona " + e.getMessage());
	} finally {
	    em.close();
	}
	
	return p;
}

public static void update(Persona p) {
	EntityManager em=JpaUtils.getEmf().createEntityManager();
	EntityTransaction tx=em.getTransaction();
	tx.begin();
	
	try {
		em.merge(p); // hace el update
		tx.commit();
		System.out.println("update exitoso!!");
	} catch (Exception e) {
		tx.rollback();
		System.out.println("ups, no pude actualizar la persona " + e.getMessage());;
	} finally {
		em.close();
	}
}

public static void delete(Long id) {
	EntityManager em=JpaUtils.getEmf().createEntityManager();
	em.getTransaction().begin();

	try {
		Persona p = em.find(Persona.class,id);
		em.remove(p); // Delete * from personas where personas.id=id
		em.getTransaction().commit();
	} catch (Exception e) {
		em.getTransaction().rollback();
		System.out.println("ups, no pude borrar la persona " + e.getMessage());;
	} finally {
		em.close();
	}
}



}
