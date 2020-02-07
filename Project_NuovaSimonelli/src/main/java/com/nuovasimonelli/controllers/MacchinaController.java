package com.nuovasimonelli.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuovasimonelli.entities.Macchina;
import com.nuovasimonelli.repositories.MacchinaRepository;

@RestController
@RequestMapping(value="/macchina")
public class MacchinaController {	 	
@Autowired
private final MacchinaRepository macchinaRepository;

public MacchinaController(MacchinaRepository macchinaRepository) {
	this.macchinaRepository=macchinaRepository;
}

@GetMapping(value= {"/",""})
public List<Macchina> getAllMacchina(){
	return macchinaRepository.findAll();
}

@PostMapping(value= {"/add","/add/"})
public ResponseEntity<String> addMacchina(@RequestBody Macchina macchina) {
		//DA VEDERE SE AGGIUNGERE CONTROLLI
		macchinaRepository.save(macchina);
		return ResponseEntity.ok("Successfully created");
}}
