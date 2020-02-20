package com.nuovasimonelli.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nuovasimonelli.entities.Interventi;
import com.nuovasimonelli.interfaces.ConteggioComponenti;
import com.nuovasimonelli.interfaces.DifettiComponenti;
	
public interface InterventiRepository extends JpaRepository<Interventi,Integer>{
	Optional<Interventi> findById(int id);
//	@Query(value = "SELECT id FROM Interventi i ")
//	List<Integer> findAllInterventi();
	@Query(value="SELECT * FROM COL_INTERVENTI i ORDER BY i.id OFFSET ?1 ROWS FETCH NEXT ?2 ROWS ONLY ", nativeQuery = true)
    public List<Interventi> findInterventiLimited(int offset, int limit);
	@Query(value="SELECT TOP 5 count(CODICE_DIFETTO) as conteggio, CODICE_COMPONENTE FROM COL_INTERVENTI group by CODICE_COMPONENTE order by conteggio DESC",nativeQuery=true)
	public List<ConteggioComponenti> findConteggioComponenti();
	
	@Query(value="SELECT COL_COMPONENTE.NOME AS NOMECOMPONENTE, COL_DIFETTO.NOME AS NOMEDIFETTO, PRIMODIFETTO, TOTALE FROM\r\n" + 
			"(SELECT TOP 5 CODICE_COMPONENTE, count(CODICE_DIFETTO) as TOTALE\r\n" + 
			"  FROM [QUALITY_CHECK].[dbo].[COL_INTERVENTI]\r\n" + 
			"  group by CODICE_COMPONENTE order by TOTALE DESC) QUERYTOTALE\r\n" + 
			"INNER JOIN\r\n" + 
			"(SELECT TOP 5 CODICE_COMPONENTE, CODICE_DIFETTO, COUNT(CODICE_DIFETTO) as PRIMODIFETTO\r\n" + 
			"  FROM [QUALITY_CHECK].[dbo].[COL_INTERVENTI]\r\n" + 
			"  WHERE CODICE_COMPONENTE != 46\r\n" + 
			"  GROUP BY CODICE_COMPONENTE, CODICE_DIFETTO ORDER BY PRIMODIFETTO DESC) QUERYDIFETTO\r\n" + 
			"ON QUERYTOTALE.CODICE_COMPONENTE = QUERYDIFETTO.CODICE_COMPONENTE INNER JOIN [QUALITY_CHECK].[dbo].[COL_COMPONENTE]\r\n" + 
			"ON QUERYDIFETTO.CODICE_COMPONENTE = COL_COMPONENTE.ID INNER JOIN [QUALITY_CHECK].[dbo].[COL_DIFETTO]\r\n" + 
			"ON QUERYDIFETTO.CODICE_DIFETTO = COL_DIFETTO.ID\r\n" + 
			"ORDER BY TOTALE DESC",nativeQuery=true)
	public List<DifettiComponenti> findDifettiComponenti();
}