package com.nuovasimonelli.entities;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="COL_INTERVENTI")
public class Interventi {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="CODICE_PROGRESSIVO_MACCHINA")
	private int codiceProgressivoMacchina;
	@Column(name="CODICE_COMPONENTE")
	private int codiceComponente;
	@Column(name="CODICE_DIFETTO")
	private int codiceDifetto;
	@Column(name="CODICE_AZIONE")
	private int codiceAzione;
	@Column(name="CODICE_COMPONENTE_AGAIN")
	private int codiceComponenteAgain;
	@Column(name="NOTA_COMPONENTE")
	private String notaComponente;
	@Column(name="NOTA_DIFETTO")
	private String notaDifetto;
	@Column(name="NOTA_AZIONE")
	private String notaAzione;
	@Column(name="NOTA_COMPONENTE_AGAIN")
	private String notaComponenteAgain;
	@Column(name="DATA_COLLAUDO")
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataCollaudo;
	
	public Interventi() {
	}
	
	public Interventi(int id,int codiceProgressivoMacchina,int codiceComponente,
			int codiceDifetto,int codiceComponenteAgain,String notaComponente,String notaDifetto,
			String notaAzione,String notaComponenteAgain,Date dataCollaudo, int codiceAzione) {
		this.id=id;
		this.codiceAzione=codiceAzione;
		this.codiceComponente=codiceComponente;
		this.codiceComponenteAgain=codiceComponenteAgain;
		this.codiceDifetto=codiceDifetto;
		this.codiceProgressivoMacchina=codiceProgressivoMacchina;
		this.dataCollaudo=dataCollaudo;
		this.notaAzione=notaAzione;
		this.notaComponente=notaComponente;
		this.notaComponenteAgain=notaComponenteAgain;
		this.notaDifetto=notaDifetto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodiceProgressivoMacchina() {
		return codiceProgressivoMacchina;
	}

	public void setCodiceProgressivoMacchina(int codiceProgressivoMacchina) {
		this.codiceProgressivoMacchina = codiceProgressivoMacchina;
	}

	public int getCodiceComponente() {
		return codiceComponente;
	}

	public void setCodiceComponente(int codiceComponente) {
		this.codiceComponente = codiceComponente;
	}

	public int getCodiceDifetto() {
		return codiceDifetto;
	}

	public void setCodiceDifetto(int codiceDifetto) {
		this.codiceDifetto = codiceDifetto;
	}

	public int getCodiceAzione() {
		return codiceAzione;
	}

	public void setCodiceAzione(int codiceAzione) {
		this.codiceAzione = codiceAzione;
	}

	public int getCodiceComponenteAgain() {
		return codiceComponenteAgain;
	}

	public void setCodiceComponenteAgain(int codiceComponenteAgain) {
		this.codiceComponenteAgain = codiceComponenteAgain;
	}

	public String getNotaComponente() {
		return notaComponente;
	}

	public void setNotaComponente(String notaComponente) {
		this.notaComponente = notaComponente;
	}

	public String getNotaDifetto() {
		return notaDifetto;
	}

	public void setNotaDifetto(String notaDifetto) {
		this.notaDifetto = notaDifetto;
	}

	public String getNotaAzione() {
		return notaAzione;
	}

	public void setNotaAzione(String notaAzione) {
		this.notaAzione = notaAzione;
	}

	public String getNotaComponenteAgain() {
		return notaComponenteAgain;
	}

	public void setNotaComponenteAgain(String notaComponenteAgain) {
		this.notaComponenteAgain = notaComponenteAgain;
	}

	public Date getDataCollaudo() {
		return dataCollaudo;
	}

	public void setDataCollaudo(Date dataCollaudo) {
		this.dataCollaudo = dataCollaudo;
	}
	
}
