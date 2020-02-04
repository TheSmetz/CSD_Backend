package com.nuovasimonelli.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuovasimonelli.entities.Difetto;
import com.nuovasimonelli.repositories.DifettoRepository;

@RestController
@RequestMapping(value="/difetto")
public class DifettoController {	 	
@Autowired
private final DifettoRepository difettoRepository;

public DifettoController(DifettoRepository difettoRepository) {
	this.difettoRepository=difettoRepository;
}

@GetMapping(value= {"/",""})
public List<Difetto> getAllDifetto(){
	return difettoRepository.findAll();
}

@PostMapping(value= {"/add","/add/"})
public ResponseEntity<String> addDifetto(@RequestBody Difetto difetto) {
	if(difettoRepository.existsByNome(difetto.getNome()) || difettoRepository.existsById(difetto.getId())) {
		return ResponseEntity.status(409).body("Conflict");
	}else {
		difettoRepository.save(difetto);
		return ResponseEntity.ok("Successfully created");
	}
}}
