package com.nuovasimonelli.interfaces;

public class Linee {
	public int interventi;
	public int linea;
	public int produttivita;
	
	public Linee(int interventi, int linea, int prod) {
		this.interventi=interventi;
		this.linea=linea;
		this.produttivita=prod;
	}

	public int getInterventi() {
		return interventi;
	}

	public void setInterventi(int interventi) {
		this.interventi = interventi;
	}

	public int getLinea() {
		return linea;
	}

	public void setLinea(int linea) {
		this.linea = linea;
	}

	public int getProduttivita() {
		return produttivita;
	}

	public void setProduttivita(int produttivita) {
		this.produttivita = produttivita;
	}
	
	
}
