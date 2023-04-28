package com.capgemini.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.capgemini.model.Pais;
import com.capgemini.utils.JpaUtils;

public class DaoPais {

	public static void create(Pais p) {
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

	public static Pais find(Long id) {
		Pais p=null;
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		
		try {
			p=em.find(Pais.class, id); // Select * from personas where personas.id=id
		} catch (Exception e) {
			System.out.println("ups, no encontre el pais " + e.getMessage());
		} finally {
		    em.close();
		}
		
		return p;
	}

	public static void update(Pais p) {
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		try {
			em.merge(p); // hace el update
			tx.commit();
			System.out.println("update exitoso!!");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("ups, no pude actualizar el pais " + e.getMessage());;
		} finally {
			em.close();
		}
	}

	public static void delete(Long id) {
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		em.getTransaction().begin();

		try {
			Pais p = em.find(Pais.class,id);
			em.remove(p); // Delete * from personas where personas.id=id
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("ups, no pude borrar el pais " + e.getMessage());;
		} finally {
			em.close();
		}
	}


	
}
