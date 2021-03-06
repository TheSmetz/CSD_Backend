package com.nuovasimonelli.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuovasimonelli.entities.ComponenteTipoMacchina;
import com.nuovasimonelli.repositories.ComponenteTipoMacchinaRepository;

@RestController
@RequestMapping(value="/componenteTipoMacchina")
public class ComponenteTipoMacchinaController {	 	
@Autowired
private final ComponenteTipoMacchinaRepository componenteTipoMacchinaRepository;

public ComponenteTipoMacchinaController(ComponenteTipoMacchinaRepository componenteTipoMacchinaRepository) {
	this.componenteTipoMacchinaRepository=componenteTipoMacchinaRepository;
}

@GetMapping(value= {"/",""})
public List<ComponenteTipoMacchina> getAllComponenteTipoMacchina(){
	return componenteTipoMacchinaRepository.findAll();
}

@PostMapping(value= {"/add","/add/"})
public ResponseEntity<String> addComponenteTipoMacchina(@RequestBody ComponenteTipoMacchina componenteTipoMacchina) {
	//Da controllare se mettere o meno condizioni
	componenteTipoMacchinaRepository.save(componenteTipoMacchina);
	return ResponseEntity.ok("Successfully created");
}}
