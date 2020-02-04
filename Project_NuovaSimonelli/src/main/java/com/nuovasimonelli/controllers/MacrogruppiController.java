package com.nuovasimonelli.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuovasimonelli.entities.Macrogruppi;
import com.nuovasimonelli.repositories.MacrogruppiRepository;

@RestController
@RequestMapping(value="/macrogruppi")
public class MacrogruppiController {	 	
@Autowired
private final MacrogruppiRepository macrogruppiRepository;

public MacrogruppiController(MacrogruppiRepository macrogruppiRepository) {
	this.macrogruppiRepository=macrogruppiRepository;
}

@GetMapping(value= {"/",""})
public List<Macrogruppi> getAllMacrogruppi(){
	return macrogruppiRepository.findAll();
}

@PostMapping(value= {"/add","/add/"})
public ResponseEntity<String> addMacrogruppi(@RequestBody Macrogruppi macrogruppi) {
	if(macrogruppiRepository.existsByDescrizione(macrogruppi.getDescrizione()) || macrogruppiRepository.existsById(macrogruppi.getCodiceMacrogruppo()) || macrogruppiRepository.existsByTipoDifetto(macrogruppi.getTipoDifetto())) {
		return ResponseEntity.status(409).body("Conflict");
	}else {
		macrogruppiRepository.save(macrogruppi);
		return ResponseEntity.ok("Successfully created");
	}
}}
