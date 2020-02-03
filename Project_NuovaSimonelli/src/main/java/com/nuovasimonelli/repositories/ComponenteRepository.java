package com.nuovasimonelli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuovasimonelli.entities.Componente;
import java.util.Optional;


public interface ComponenteRepository extends JpaRepository<Componente,Integer>{
	Optional<Componente> findById(int id);
	Boolean existsByNome(String nome);
}
