package com.capgemini.DemoSpirngBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService{
	// implementamos los metodos para dialogar con el FrontEnd
	// Dependency Injection ... a traves de la marca de @Autowired
	// @Autowired--> genera un constructor con un argumento del tipo PersonaRepository
	// public PersonaServiceImp(PersonaRepository pr){
	//     this.repositorio=pr; }
	
	@Autowired
	private PersonaRepository repositorio;
	
	@Override
	public Persona listarId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public List<Persona> listar() {
		return repositorio.findAll();
	}

	@Override
	public Persona add(Persona p) {
		return repositorio.save(p);
	}

	@Override
	public Persona edit(Persona p) {
		return repositorio.save(p);
	}

	@Override
	public void delete(int id) {
		Persona p=repositorio.findById(id);
		if(p!=null) {
			repositorio.delete(p);
		}
		
	}

	
	
}
