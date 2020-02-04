package com.nuovasimonelli.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuovasimonelli.entities.Azione;
import com.nuovasimonelli.repositories.AzioneRepository;

@RestController
@RequestMapping(value="/azione")
public class AzioneController {	 	
@Autowired
private final AzioneRepository azioneRepository;

public AzioneController(AzioneRepository azioneRepository) {
	this.azioneRepository=azioneRepository;
}

@GetMapping(value= {"/",""})
public List<Azione> getAllAzione(){
	return azioneRepository.findAll();
}

@PostMapping(value= {"/add","/add/"})
public ResponseEntity<String> addAzione(@RequestBody Azione azione) {
	if(azioneRepository.existsByNome(azione.getNome()) || azioneRepository.existsById(azione.getId())) {
		return ResponseEntity.status(409).body("Conflict");
	}else {
		azioneRepository.save(azione);
		return ResponseEntity.ok("Successfully created");
	}
}}
