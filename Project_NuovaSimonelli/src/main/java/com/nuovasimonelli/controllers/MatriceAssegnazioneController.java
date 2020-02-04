package com.nuovasimonelli.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuovasimonelli.entities.MatriceAssegnazione;
import com.nuovasimonelli.repositories.MatriceAssegnazioneRepository;

@RestController
@RequestMapping(value="/matriceAssegnazione")
public class MatriceAssegnazioneController {	 	
@Autowired
private final MatriceAssegnazioneRepository matriceAssegnazioneRepository;

public MatriceAssegnazioneController(MatriceAssegnazioneRepository matriceAssegnazioneRepository) {
	this.matriceAssegnazioneRepository=matriceAssegnazioneRepository;
}

@GetMapping(value= {"/",""})
public List<MatriceAssegnazione> getAllMatriceAssegnazione(){
	return matriceAssegnazioneRepository.findAll();
}

@PostMapping(value= {"/add","/add/"})
public ResponseEntity<String> addMatriceAssegnazione(@RequestBody MatriceAssegnazione matriceAssegnazione) {
	//DA VEDERE CONTROLLI	
	matriceAssegnazioneRepository.save(matriceAssegnazione);
	return ResponseEntity.ok("Successfully created");
}}
