package com.nuovasimonelli.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuovasimonelli.entities.TipoMacchina;
import com.nuovasimonelli.repositories.TipoMacchinaRepository;

@RestController
@RequestMapping(value="/tipoMacchina")
public class TipoMacchinaController {	 	
@Autowired
private final TipoMacchinaRepository tipoMacchinaRepository;

public TipoMacchinaController(TipoMacchinaRepository tipoMacchinaRepository) {
	this.tipoMacchinaRepository=tipoMacchinaRepository;
}

@GetMapping(value= {"/",""})
public List<TipoMacchina> getAllTipoMacchina(){
	return tipoMacchinaRepository.findAll();
}

@PostMapping(value= {"/add","/add/"})
public ResponseEntity<String> addTipoMacchina(@RequestBody TipoMacchina tipoMacchina) {
	if(tipoMacchinaRepository.existsByNome(tipoMacchina.getNome()) || tipoMacchinaRepository.existsById(tipoMacchina.getId())) {
		return ResponseEntity.status(409).body("Conflict");
	}else {
		tipoMacchinaRepository.save(tipoMacchina);
		return ResponseEntity.ok("Successfully created");
	}
}}
