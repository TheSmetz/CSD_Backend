package com.nuovasimonelli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nuovasimonelli.entities.ComponenteDifetto;

public interface ComponenteDifettoRepository extends JpaRepository<ComponenteDifetto,Integer>{
//per ora non ho trovato utile mettere controlli dato che possono essere ripetuti i valori
//anche se bisognerebbe vedere se esiste sull'altra tabella (problema chiavi esterne)

}
