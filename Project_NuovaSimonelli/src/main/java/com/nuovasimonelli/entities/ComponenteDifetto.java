package com.nuovasimonelli.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COL_COMPONENTE_DIFETTO")
public class ComponenteDifetto {
	@Id
	@Column(name="CODICE_COMPONENTE")
	private int codiceComponente;
	@Column(name="CODICE_DIFETTO")
	private int codiceDifetto;
	@Column(name="CODICE_TIPO_MACCHINA")
	private int codiceTipoMacchina;
	@Column(name="CODICE_TIPO_PARTE")
	private int codiceTipoParte;
	
	public ComponenteDifetto() {
		
	}
	public ComponenteDifetto(int codiceComponente,int codiceDifetto,int codiceTipoMacchina,int codiceTipoParte) {
		this.codiceComponente=codiceComponente;
		this.codiceDifetto=codiceDifetto;
		this.codiceTipoMacchina=codiceTipoMacchina;
		this.codiceTipoParte=codiceTipoParte;
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
	public int getCodiceTipoMacchina() {
		return codiceTipoMacchina;
	}
	public void setCodiceTipoMacchina(int codiceTipoMacchina) {
		this.codiceTipoMacchina = codiceTipoMacchina;
	}
	public int getCodiceTipoParte() {
		return codiceTipoParte;
	}
	public void setCodiceTipoParte(int codiceTipoParte) {
		this.codiceTipoParte = codiceTipoParte;
	}
	@Override
	public String toString() {
		return "ComponenteDifetto [codiceComponente=" + codiceComponente + ", codiceDifetto=" + codiceDifetto
				+ ", codiceTipoMacchina=" + codiceTipoMacchina + ", codiceTipoParte=" + codiceTipoParte + "]";
	}
	
	
	
}
