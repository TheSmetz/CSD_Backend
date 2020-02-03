package com.nuovasimonelli.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuovasimonelli.entities.ComponenteAzione;

public interface ComponenteAzioneRepository extends JpaRepository<ComponenteAzione,Integer>{
	Optional<ComponenteAzione> findByCodiceComponente(int codiceComponente);
	Boolean existsByCodiceComponente(int codiceComponente);
}
