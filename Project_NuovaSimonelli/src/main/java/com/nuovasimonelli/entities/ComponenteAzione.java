package com.nuovasimonelli.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COL_COMPONENTE_AZIONE")
public class ComponenteAzione {
	@Id
	@Column(name="CODICE_COMPONENTE")
	private int codiceComponente;
	@Column(name="CODICE_AZIONE")
	private int codiceAzione;
	@Column(name="FLAG_DISCRIMINANTE")
	private char flagDiscriminante;
	@Column(name="CODICE_MACROGRUPPO")
	private int codiceMacrogruppo;
	
	public ComponenteAzione() {
		
	}
	public ComponenteAzione(int codiceComponente ,int codiceAzione ,char flagDiscriminante,int codiceMacrogruppo ) {
		this.codiceComponente=codiceComponente;
		this.codiceAzione=codiceAzione;
		this.flagDiscriminante=flagDiscriminante;
		this.codiceMacrogruppo=codiceMacrogruppo;
	}
	public int getCodiceComponente() {
		return codiceComponente;
	}
	public void setCodiceComponente(int codiceComponente) {
		this.codiceComponente = codiceComponente;
	}
	public int getCodiceAzione() {
		return codiceAzione;
	}
	public void setCodiceAzione(int codiceAzione) {
		this.codiceAzione = codiceAzione;
	}
	public char getFlagDiscriminante() {
		return flagDiscriminante;
	}
	public void setFlagDiscriminante(char flagDiscriminante) {
		this.flagDiscriminante = flagDiscriminante;
	}
	public int getCodiceMacrogruppo() {
		return codiceMacrogruppo;
	}
	public void setCodiceMacrogruppo(int codiceMacrogruppo) {
		this.codiceMacrogruppo = codiceMacrogruppo;
	}
	
	
}
