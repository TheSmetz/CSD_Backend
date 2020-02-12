package com.nuovasimonelli.classes;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ComponenteTipoMacchinaPrimaryKey implements Serializable{
	private int codiceComponente;
	private int codiceTipoMacchina;
	private boolean richiediComponente;
	
	public ComponenteTipoMacchinaPrimaryKey() {
		
	}
	
	public ComponenteTipoMacchinaPrimaryKey(int codiceComponente, int codiceTipoMacchina, boolean richiediComponente) {
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
	
	
}
