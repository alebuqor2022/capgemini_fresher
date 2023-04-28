package com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.capgemini.model.Ciudad;
import com.capgemini.utils.JpaUtils;

public class DaoCiudad {

	public static void create(Ciudad p) {
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

	public static Ciudad find(Long id) {
		Ciudad p=null;
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		
		try {
			p=em.find(Ciudad.class, id); // Select * from Ciudads where Ciudads.id=id
		} catch (Exception e) {
			System.out.println("ups, no encontre la Ciudad " + e.getMessage());
		} finally {
		    em.close();
		}
		
		return p;
	}

	public static List<Ciudad> findAllCiudades(long fk){
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		Query cdades=em.createNativeQuery("Select nombre from ciudades where fk_pais=" + fk);
		List<Ciudad> ciudades=cdades.getResultList();
		return ciudades;
	}
	
	
	public static void update(Ciudad p) {
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		try {
			em.merge(p); // hace el update
			tx.commit();
			System.out.println("update exitoso!!");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("ups, no pude actualizar la Ciudad " + e.getMessage());;
		} finally {
			em.close();
		}
	}

	public static void delete(Long id) {
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		em.getTransaction().begin();

		try {
			Ciudad p = em.find(Ciudad.class,id);
			em.remove(p); // Delete * from Ciudads where Ciudads.id=id
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("ups, no pude borrar la Ciudad " + e.getMessage());;
		} finally {
			em.close();
		}
	}


}
