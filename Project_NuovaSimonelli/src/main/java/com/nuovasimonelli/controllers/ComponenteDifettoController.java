package com.nuovasimonelli.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuovasimonelli.entities.ComponenteDifetto;
import com.nuovasimonelli.repositories.ComponenteDifettoRepository;

@RestController
@RequestMapping(value="/componenteDifetto")
public class ComponenteDifettoController {
	 
@Autowired
private final ComponenteDifettoRepository componenteDifettoRepository;

public ComponenteDifettoController(ComponenteDifettoRepository componenteDifettoRepository) {
	this.componenteDifettoRepository=componenteDifettoRepository;
}

@GetMapping(value= {"/",""})
public List<ComponenteDifetto> getAllComponenteDifetto(){
	return componenteDifettoRepository.findAll();
}

@PostMapping(value= {"/add","/add/"})
public ResponseEntity<String> addComponenteDifetto(@RequestBody ComponenteDifetto componenteDifetto) {
	//FORSE DA AGGIUNGERE QUALCHE CONTROLLO
		componenteDifettoRepository.save(componenteDifetto);
		return ResponseEntity.ok("Successfully created");
}}
