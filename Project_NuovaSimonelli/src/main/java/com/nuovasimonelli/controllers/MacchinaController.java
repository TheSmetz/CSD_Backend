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

import com.nuovasimonelli.entities.Macchina;
import com.nuovasimonelli.interfaces.InterventiLinee;
import com.nuovasimonelli.interfaces.Linee;
import com.nuovasimonelli.interfaces.ProduttivitaLinee;
import com.nuovasimonelli.interfaces.ProduttivitaOperai;
import com.nuovasimonelli.interfaces.ProduzioneAnnuale;
import com.nuovasimonelli.repositories.MacchinaRepository;

@RestController
@RequestMapping(value = "/macchine")
public class MacchinaController {
	@Autowired
	private final MacchinaRepository macchinaRepository;

	public MacchinaController(MacchinaRepository macchinaRepository) {
		this.macchinaRepository = macchinaRepository;
	}

	@GetMapping(value = { "/", "" })
	public List<Macchina> getAllInterventi(@RequestParam int a, int b) {
		return macchinaRepository.findMacchinaLimited(a, b);
	}

	@GetMapping(value = { "produzioneAnnuale/", "produzioneAnnuale" })
	public int[][] getProduzioneAnnuale() {
		List<ProduzioneAnnuale> pa = macchinaRepository.findAnnualProduction();
		List<Integer> differentLines = getDifferentLines(pa);
		List<Integer> differentYears = getDifferentYears(pa);
		int[][] lines = new int[differentLines.size()][differentYears.size()];
		for (int i = 0; i < lines.length; i++) {
			for (int j = 0; j < lines[i].length; j++) {
				lines[i][j] = getProduzione(differentYears.get(j), differentLines.get(i), pa);
			}
		}
		return lines;
	}

	@GetMapping(value = { "produttivitaOperai/", "produttivitaOperai" })
	public List<ProduttivitaOperai> getOperativesProductive() {
		return macchinaRepository.findOperativesProduction();
	}

	@GetMapping(value = { "produttivitaLinee/", "produttivitaLinee" })
	public List<Linee> getLineeProduttivita() {
		List<ProduttivitaLinee> a = macchinaRepository.findLineeProduction();
		List<InterventiLinee> b = macchinaRepository.findLineeInterventi();
		List<Linee> c = new ArrayList<Linee>();
		a.forEach(pl -> {
			int[] numInterventi = {0};
			b.forEach(intL -> {
				if (pl.getLinea() == intL.getLinea()) {
					numInterventi[0] = intL.getInterventi();
				}
			});
			c.add(new Linee(numInterventi[0], pl.getLinea(), pl.getProduttivita()));
		});
		return c;
	}

	public static List<Integer> getDifferentLines(List<ProduzioneAnnuale> l) {
		List<Integer> lines = new ArrayList<Integer>();

		l.forEach(p -> {
			if (!lines.contains(p.getLinea())) {
				lines.add(p.getLinea());
			}
		});

		return lines;
	}

	public static List<Integer> getDifferentYears(List<ProduzioneAnnuale> l) {
		List<Integer> years = new ArrayList<Integer>();

		l.forEach(p -> {
			if (!years.contains(p.getAnno())) {
				years.add(p.getAnno());
			}
		});

		return years;
	}

	@GetMapping(value = { "getYears/", "getYears" })
	public List<String> getYears() {
		return macchinaRepository.findDifferentYears();
	}

	@GetMapping(value = { "getLinee/", "getLinee" })
	public List<String> getLinee() {
		return macchinaRepository.findDifferentLinee();
	}

	public static int getProduzione(int anno, int linea, List<ProduzioneAnnuale> l) {

		int[] v = { 0 };

		l.forEach(p -> {
			if (p.getAnno() == anno && p.getLinea() == linea) {
				v[0] = p.getProduzione();

			}
		});

		return v[0];
	}

//@GetMapping(value= {"/",""})
//public List<Macchina> getAllMacchina(){
//	return macchinaRepository.findAll();
//}

//@GetMapping(value= {"/grafoLineeAnno","/grafoLineeAnno/"})
//public List<Integer> getLineeAnno(@RequestBody int year){
//	return macchinaRepository.selectLineaWithCounterForYear(year);
//}

	@PostMapping(value = { "/add", "/add/" })
	public ResponseEntity<String> addMacchina(@RequestBody Macchina macchina) {
		if (macchinaRepository.existsByCodiceProg(macchina.getCodiceProg())) {
			return ResponseEntity.status(409).body("Conflict");
		} else {
			macchinaRepository.save(macchina);
			return ResponseEntity.ok("Successfully created");
		}
	}
}
