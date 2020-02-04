package com.nuovasimonelli.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuovasimonelli.entities.Interventi;

public interface InterventiRepository extends JpaRepository<Interventi,Integer>{
	Optional<Interventi> findById(int id);
	//Da vedere se mettere altri controlli
}
