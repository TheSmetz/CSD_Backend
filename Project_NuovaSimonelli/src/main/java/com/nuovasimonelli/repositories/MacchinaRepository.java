package com.nuovasimonelli.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nuovasimonelli.entities.Macchina;
import com.nuovasimonelli.interfaces.InterventiLinee;
import com.nuovasimonelli.interfaces.ProduttivitaLinee;
import com.nuovasimonelli.interfaces.ProduttivitaOperai;
import com.nuovasimonelli.interfaces.ProduzioneAnnuale;

public interface MacchinaRepository extends JpaRepository<Macchina,Integer>{
	Boolean existsByCodiceProg(Integer integer);
//	@Query("SELECT Count(m.Linea) as Conteggio FROM MACCHINA_POST_2013 m where Year(TimeE)=:year group by Linea")
//	List<Integer> selectLineaWithCounterForYear(@Param("year")int year);
	@Query(value="SELECT * FROM MACCHINA_POST_2013 m ORDER BY m.Codice_Prog OFFSET ?1 ROWS FETCH NEXT ?2 ROWS ONLY ", nativeQuery = true)
    public List<Macchina> findMacchinaLimited(int offset, int limit);
	
	@Query(value="SELECT Linea,Count(Linea) as Produzione,Year(TimeE) as Anno FROM MACCHINA_POST_2013 m GROUP BY m.Linea, Year(m.TimeE) ORDER BY m.Linea,Anno", nativeQuery = true)
    public List<ProduzioneAnnuale> findAnnualProduction();
	
	@Query(value="SELECT TOP 10 m.FirmaE, count(m.FirmaE) as Produttivita FROM MACCHINA_POST_2013 m GROUP BY m.FirmaE ORDER BY Produttivita DESC", nativeQuery = true)
	public List<ProduttivitaOperai> findOperativesProduction();
	
	@Query(value="SELECT m.Linea, Count(m.FirmaE) as Produttivita FROM MACCHINA_POST_2013 m group by m.Linea order by m.Linea ASC", nativeQuery = true)
	public List<ProduttivitaLinee> findLineeProduction();
	@Query(value="select count(*) as Interventi, m.Linea FROM MACCHINA_POST_2013 m where m.InterventiE not like '' group by m.Linea order by m.Linea ASC", nativeQuery = true)
	public List<InterventiLinee> findLineeInterventi();
	@Query(value="SELECT Distinct Year(m.TimeE) FROM MACCHINA_POST_2013 m order by Year(m.TimeE)", nativeQuery=true)
	public List<String> findDifferentYears();
	@Query(value="SELECT Distinct m.Linea FROM MACCHINA_POST_2013 m order by m.Linea", nativeQuery=true)
	public List<String> findDifferentLinee();
	
}
