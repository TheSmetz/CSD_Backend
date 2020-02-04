package com.nuovasimonelli.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COL_MACROGRUPPI")
public class Macrogruppi {
	@Id
	@Column(name="CODICE_MACROGRUPPO")
	private int codiceMacrogruppo;
	@Column(name="DESCRIZIONE")
	private String descrizione;
	@Column(name="TIPO_DIFETTO")
	private String tipoDifetto;

	public Macrogruppi() {	
	}
	
	public Macrogruppi(int codiceMacrogruppo,String descrizione,String tipoDifetto) {
		this.codiceMacrogruppo=codiceMacrogruppo;
		this.descrizione=descrizione;
		this.tipoDifetto=tipoDifetto;
	}

	public int getCodiceMacrogruppo() {
		return codiceMacrogruppo;
	}

	public void setCodiceMacrogruppo(int codiceMacrogruppo) {
		this.codiceMacrogruppo = codiceMacrogruppo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getTipoDifetto() {
		return tipoDifetto;
	}

	public void setTipoDifetto(String tipoDifetto) {
		this.tipoDifetto = tipoDifetto;
	}

	@Override
	public String toString() {
		return "Macrogruppi [codiceMacrogruppo=" + codiceMacrogruppo + ", descrizione=" + descrizione + ", tipoDifetto="
				+ tipoDifetto + "]";
	}
	
	
}
