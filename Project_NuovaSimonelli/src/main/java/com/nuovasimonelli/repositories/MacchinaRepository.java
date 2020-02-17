package com.nuovasimonelli.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nuovasimonelli.entities.Macchina;
import com.nuovasimonelli.interfaces.ProduzioneAnnuale;

public interface MacchinaRepository extends JpaRepository<Macchina,Integer>{
	Boolean existsByCodiceProg(Integer integer);
//	@Query("SELECT Count(m.Linea) as Conteggio FROM MACCHINA_POST_2013 m where Year(TimeE)=:year group by Linea")
//	List<Integer> selectLineaWithCounterForYear(@Param("year")int year);
	@Query(value="SELECT * FROM MACCHINA_POST_2013 m ORDER BY m.Codice_Prog OFFSET ?1 ROWS FETCH NEXT ?2 ROWS ONLY ", nativeQuery = true)
    public List<Macchina> findMacchinaLimited(int offset, int limit);
	
	@Query(value="SELECT Linea,Count(Linea) as Produzione,Year(TimeE) as Anno FROM MACCHINA_POST_2013 m GROUP BY m.Linea, Year(m.TimeE) ORDER BY m.Linea,Anno", nativeQuery = true)
    public List<ProduzioneAnnuale> findAnnualProduction();
}
