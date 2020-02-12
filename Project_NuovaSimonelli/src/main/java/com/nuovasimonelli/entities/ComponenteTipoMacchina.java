package com.nuovasimonelli.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.nuovasimonelli.classes.ComponenteTipoMacchinaPrimaryKey;

@Entity
@IdClass(ComponenteTipoMacchinaPrimaryKey.class)
@Table(name="COL_COMPONENTE_TIPO_MACCHINA")
public class ComponenteTipoMacchina {
	@Id
	@Column(name="CODICE_COMPONENTE")
	private int codiceComponente;
	@Id
	@Column(name="CODICE_TIPO_MACCHINA")
	private int codiceTipoMacchina;
	@Id
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
