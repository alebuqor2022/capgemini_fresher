package com.capgemini.DemoSpirngBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas") // http://localhost:8080/personas
public class Controlador {
@Autowired
PersonaService servicio;
// @Autowired .... hace esto ...Dependency Injection
//public Controlador(PersonaService service) {
//	this.service=service;
//}

@GetMapping // tironeando info del backend
public List<Persona> listar(){
	return servicio.listar();
}

}
