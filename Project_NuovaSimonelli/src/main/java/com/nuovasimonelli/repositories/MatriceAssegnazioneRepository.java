package com.nuovasimonelli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuovasimonelli.entities.MatriceAssegnazione;

public interface MatriceAssegnazioneRepository extends JpaRepository<MatriceAssegnazione,Integer>{
//non dovrebbero servire controlli
}
