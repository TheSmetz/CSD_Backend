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
@RequestMapping(value="/codiceTipoMacchina")
public class ComponenteTipoMacchinaController {	 	
@Autowired
private final ComponenteTipoMacchinaRepository codiceTipoMacchinaRepository;

public ComponenteTipoMacchinaController(ComponenteTipoMacchinaRepository codiceTipoMacchinaRepository) {
	this.codiceTipoMacchinaRepository=codiceTipoMacchinaRepository;
}

@GetMapping(value= {"/",""})
public List<ComponenteTipoMacchina> getAllCodiceTipoMacchina(){
	return codiceTipoMacchinaRepository.findAll();
}

@PostMapping(value= {"/add","/add/"})
public ResponseEntity<String> addCodiceTipoMacchina(@RequestBody ComponenteTipoMacchina codiceTipoMacchina) {
	//Da controllare se mettere o meno condizioni
	codiceTipoMacchinaRepository.save(codiceTipoMacchina);
	return ResponseEntity.ok("Successfully created");
}}
