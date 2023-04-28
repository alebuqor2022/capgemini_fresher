package com.capgemini.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
private static final EntityManagerFactory emf;

// reemplazo el metodo constructor de instancias
// inicializador estatico

static {
	try {
	emf=Persistence.createEntityManagerFactory("JPA_Demo");
	}catch(Throwable ex) {
		System.out.println("la factoria no inicio " + ex.getMessage());
		throw new ExceptionInInitializerError(ex);
	}
}

public static EntityManagerFactory getEmf() {
	return emf;
}



}
