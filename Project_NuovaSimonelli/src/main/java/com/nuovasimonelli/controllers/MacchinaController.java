package com.nuovasimonelli.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
public Page<Macchina> getAllMacchina(@RequestParam("a") int a,@RequestParam("b") int b){
	PageRequest limit = PageRequest.of(a,b);
	return macchinaRepository.findAll(limit);
}

@PostMapping(value= {"/add","/add/"})
public ResponseEntity<String> addMacchina(@RequestBody Macchina macchina) {
	if(macchinaRepository.existsByCodiceProg(macchina.getCodiceProg())) {
		return ResponseEntity.status(409).body("Conflict");
	}else {
		macchinaRepository.save(macchina);
		return ResponseEntity.ok("Successfully created");
	}
}}
