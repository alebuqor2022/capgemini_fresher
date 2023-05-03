package com.capgemini.DemoSpirngBoot;

import java.util.List;

public interface PersonaService {
// dialoga hacia el FRONT END
// CRUD ...ABM ... create,read, update, delete	
	
	Persona listarId(int id);
	List<Persona> listar();
	Persona add(Persona p);
	Persona edit(Persona p);
	void delete(int id);
	
}
