package com.nuovasimonelli.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuovasimonelli.entities.ComponenteAzione;
import com.nuovasimonelli.repositories.ComponenteAzioneRepository;

@RestController
@RequestMapping(value="/azione")
public class ComponenteAzioneController {
	 
	
@Autowired
private final ComponenteAzioneRepository componenteAzioneRepository;

public ComponenteAzioneController(ComponenteAzioneRepository componenteAzioneRepository) {
	this.componenteAzioneRepository=componenteAzioneRepository;
}

@GetMapping(value= {"/",""})
public List<ComponenteAzione> getAllAzione(){
	return componenteAzioneRepository.findAll();
}

@PostMapping(value= {"/add","/add/"})
public ResponseEntity<String> addAzione(@RequestBody ComponenteAzione componenteAzione) {
	if(componenteAzioneRepository.existsByCodiceComponenteAndAzione(componenteAzione.getCodiceComponente(), componenteAzione.getCodiceAzione())) {
		return ResponseEntity.status(409).body("Conflict");
	}else {
		componenteAzioneRepository.save(componenteAzione);
		return ResponseEntity.ok("Successfully created");
	}
}}
