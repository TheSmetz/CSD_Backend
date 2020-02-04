package com.nuovasimonelli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuovasimonelli.entities.TipoMacchina;
import java.util.Optional;

public interface TipoMacchinaRepository extends JpaRepository<TipoMacchina,Integer>{
	Optional<TipoMacchina> findById(int id);
	Boolean existsByNome(String nome);
}
