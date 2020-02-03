package com.nuovasimonelli.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuovasimonelli.entities.Componente;
import com.nuovasimonelli.repositories.ComponenteRepository;

@RestController
@RequestMapping(value="/componente")
public class ComponenteController {
@Autowired
private final ComponenteRepository componenteRepository;

public ComponenteController(ComponenteRepository componenteRepository) {
	this.componenteRepository=componenteRepository;
}

@GetMapping(value= {"/",""})
public List<Componente> getAllComponente(){
	return componenteRepository.findAll();
}

@PostMapping(value= {"/add","/add/"})
public ResponseEntity<String> addComponente(@RequestBody Componente componente) {
	if(componenteRepository.existsByNome(componente.getNome()) || componenteRepository.existsById(componente.getId())) {
		return ResponseEntity.status(409).body("Conflict");
	}else {
		componenteRepository.save(componente);
		return ResponseEntity.ok("Successfully created");
	}
}}
