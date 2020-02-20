package com.nuovasimonelli.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nuovasimonelli.entities.Interventi;
import com.nuovasimonelli.interfaces.DifettiComponenti;
import com.nuovasimonelli.interfaces.Linee;
import com.nuovasimonelli.interfaces.TipiDifettiComponenti;
import com.nuovasimonelli.repositories.InterventiRepository;

@RestController
@RequestMapping(value = "/interventi")
public class InterventiController {
	@Autowired
	private final InterventiRepository interventiRepository;

	public InterventiController(InterventiRepository interventiRepository) {
		this.interventiRepository = interventiRepository;
	}

	@GetMapping(value = { "/", "" })
	public List<Interventi> getAllInterventi(@RequestParam int a, int b) {
		return interventiRepository.findInterventiLimited(a, b);
	}

	@GetMapping(value = { "/difettiComponenti", "/difettiComponenti/" })
	public List<DifettiComponenti> getNumeroAzioni() {
		return interventiRepository.findDifettiComponenti();
	}
	@GetMapping(value= {"/tipiDifettiComponenti","/tipiDifettiComponente/"})
	public List<TipiDifettiComponenti> getTipiDifettiComponenti() {
		List<TipiDifettiComponenti> a = new ArrayList<TipiDifettiComponenti>();
		a.add(new TipiDifettiComponenti("Tubo", 0, 5));
		a.add(new TipiDifettiComponenti("Valvola Ritegno", 5, 0));
		a.add(new TipiDifettiComponenti("EV Erogazione", 3, 2));
		a.add(new TipiDifettiComponenti("Gigleur", 5, 0));
		a.add(new TipiDifettiComponenti("Cablaggio Alta Tensione", 1, 4));
		return a;
	}

	@PostMapping(value = { "/add", "/add/" })
	public ResponseEntity<String> addInterventi(@RequestBody Interventi interventi) {
		if (interventiRepository.existsById(interventi.getId())) {
			return ResponseEntity.status(409).body("Conflict");
		} else {
			interventiRepository.save(interventi);
			return ResponseEntity.ok("Successfully created");
		}
	}
}
