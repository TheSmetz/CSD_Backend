package com.nuovasimonelli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nuovasimonelli.entities.Azione;
import java.util.Optional;


public interface AzioneRepository extends JpaRepository<Azione,Integer>{
	Optional<Azione> findById(int id);
	Boolean existsByNome(String nome);
}
