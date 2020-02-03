package com.nuovasimonelli.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="COL_COMPONENTE_AZIONE")
public class ComponenteAzione {
	@Id
	@Column(name="CODICE_COMPONENTE")
	private int codiceComponente;
	@Column(name="CODICE_AZIONE")
	private int codiceAzione;
	@Column(name="FLAG_DISCRIMINANTE")
	@Size(min=1,max=1)
	private String flagDiscriminante;
	@Column(name="CODICE_MACROGRUPPO")
	private int codiceMacrogruppo;
	
	public ComponenteAzione() {
		
	}
	public ComponenteAzione(int codiceComponente ,int codiceAzione ,String flagDiscriminante,int codiceMacrogruppo ) {
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
	public String getFlagDiscriminante() {
		return flagDiscriminante;
	}
	public void setFlagDiscriminante(String flagDiscriminante) {
		this.flagDiscriminante = flagDiscriminante;
	}
	public int getCodiceMacrogruppo() {
		return codiceMacrogruppo;
	}
	public void setCodiceMacrogruppo(int codiceMacrogruppo) {
		this.codiceMacrogruppo = codiceMacrogruppo;
	}
	
	
}
