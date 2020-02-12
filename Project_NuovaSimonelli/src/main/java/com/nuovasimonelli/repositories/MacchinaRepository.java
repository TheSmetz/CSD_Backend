package com.nuovasimonelli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuovasimonelli.entities.Macchina;

public interface MacchinaRepository extends JpaRepository<Macchina,Integer>{
	Boolean existsByCodiceProg(Integer integer);
	
	
}
