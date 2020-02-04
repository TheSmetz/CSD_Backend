package com.nuovasimonelli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuovasimonelli.entities.Macrogruppi;

public interface MacrogruppiRepository extends JpaRepository<Macrogruppi,Integer>{
Boolean existsByCodiceMacrogruppo(int codiceMacrogruppo);
Boolean existsByDescrizione(String descrizione);
Boolean existsByTipoDifetto(String tipoDifetto);

}
