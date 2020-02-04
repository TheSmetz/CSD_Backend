package com.nuovasimonelli.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COL_MATRICE_ASSEGNAZIONE")
public class MatriceAssegnazione {
	@Id
	@Column(name="CODICE_COMPONENTE")
	private int codiceComponente;
	@Column(name="CODICE_DIFETTO")
	private int codiceDifetto;
	@Column(name="CODICE_AZIONE")
	private int codiceAzione;
	@Column(name="TIPO_PARTE")
	private String tipoParte;
	
	public MatriceAssegnazione() {
	}
	
	public MatriceAssegnazione(int codiceComponente,int codiceDifetto,int codiceAzione,String tipoParte) {
		this.codiceAzione=codiceAzione;
		this.codiceComponente=codiceComponente;
		this.codiceDifetto=codiceDifetto;
		this.tipoParte=tipoParte;
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

	public String getTipoParte() {
		return tipoParte;
	}

	public void setTipoParte(String tipoParte) {
		this.tipoParte = tipoParte;
	}

	@Override
	public String toString() {
		return "MatriceAssegnazione [codiceComponente=" + codiceComponente + ", codiceDifetto=" + codiceDifetto
				+ ", codiceAzione=" + codiceAzione + ", tipoParte=" + tipoParte + "]";
	}
	
}
