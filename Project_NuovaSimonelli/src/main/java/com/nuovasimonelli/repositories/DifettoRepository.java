package com.nuovasimonelli.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nuovasimonelli.entities.Difetto;

public interface DifettoRepository extends JpaRepository<Difetto,Integer>{
	Optional<Difetto> findById(int id);
	Boolean existsByNome(String nome);

}
