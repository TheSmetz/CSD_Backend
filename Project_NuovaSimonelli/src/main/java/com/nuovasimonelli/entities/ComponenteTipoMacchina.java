package com.nuovasimonelli.entities;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COL_COMPONENTE_TIPO_MACCHINA")
public class ComponenteTipoMacchina {
	@Column(name="CODICE_COMPONENTE")
	private int codiceComponente;
	@Column(name="CODICE_TIPO_MACCHINA")
	private int codiceTipoMacchina;
	@Column(name="RICHIEDI_COMPONENTE")
	private boolean richiediComponente;
	
	public ComponenteTipoMacchina() {
		
	}
	
	public ComponenteTipoMacchina(int codiceComponente,int codiceTipoMacchina,boolean richiediComponente) {
		this.codiceComponente=codiceComponente;
		this.codiceTipoMacchina=codiceTipoMacchina;
		this.richiediComponente=richiediComponente;
	}

	public int getCodiceComponente() {
		return codiceComponente;
	}

	public void setCodiceComponente(int codiceComponente) {
		this.codiceComponente = codiceComponente;
	}

	public int getCodiceTipoMacchina() {
		return codiceTipoMacchina;
	}

	public void setCodiceTipoMacchina(int codiceTipoMacchina) {
		this.codiceTipoMacchina = codiceTipoMacchina;
	}

	public boolean isRichiediComponente() {
		return richiediComponente;
	}

	public void setRichiediComponente(boolean richiediComponente) {
		this.richiediComponente = richiediComponente;
	}

	@Override
	public String toString() {
		return "CodiceTipoMacchina [codiceComponente=" + codiceComponente + ", codiceTipoMacchina=" + codiceTipoMacchina
				+ ", richiediComponente=" + richiediComponente + "]";
	}
	
}
