package com.nuovasimonelli.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuovasimonelli.entities.TipoParte;

public interface TipoParteRepository extends JpaRepository<TipoParte,Integer>{
	Optional<TipoParte> findById(int id);
	Boolean existsByNome(String nome);
}
