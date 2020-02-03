package com.nuovasimonelli.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuovasimonelli.entities.TipoParte;
import com.nuovasimonelli.repositories.TipoParteRepository;

@RestController
@RequestMapping(value="/tipoParte")
public class TipoParteController{
	
	@Autowired
	private final TipoParteRepository tipoParteRepository;
	
	public TipoParteController(TipoParteRepository tipoParteRepository)
	{
		this.tipoParteRepository=tipoParteRepository;
	}
	
	@GetMapping(value= {"/",""})
	public List<TipoParte> getAllTipoParte(){
		return tipoParteRepository.findAll();
	}
	
	@PostMapping(value= {"/add","/add/"})
	public ResponseEntity<String> addTipoParte(@RequestBody TipoParte tipoParte) {
		if(tipoParteRepository.existsByNome(tipoParte.getNome()) || tipoParteRepository.existsById(tipoParte.getId())) {
			return ResponseEntity.status(409).body("Conflict");
		}else {
			tipoParteRepository.save(tipoParte);
			return ResponseEntity.ok("Successfully created");
		}
	}
	
}
