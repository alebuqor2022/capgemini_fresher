package com.capgemini.DemoSpirngBoot;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface PersonaRepository extends Repository<Persona, Integer>{
// esta interfaz dialoga hacia el motor de la BD
// CRUD ...ABM ... create,read, update, delete
	
	Persona findById(int id);
	List<Persona> findAll();
	Persona save(Persona p);
	void delete(Persona p);
}
