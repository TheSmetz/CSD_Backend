package com.nuovasimonelli.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nuovasimonelli.entities.Interventi;
	
public interface InterventiRepository extends JpaRepository<Interventi,Integer>{
	Optional<Interventi> findById(int id);
//	@Query(value = "SELECT id FROM Interventi i ")
//	List<Integer> findAllInterventi();
	@Query(value="SELECT * FROM COL_INTERVENTI i ORDER BY i.id OFFSET ?1 ROWS FETCH NEXT ?2 ROWS ONLY ", nativeQuery = true)
    public List<Interventi> findInterventiLimited(int offset, int limit);
}
