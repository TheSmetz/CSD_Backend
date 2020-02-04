package com.nuovasimonelli.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COL_MACCHINA")
public class Macchina {
	@Id
	@Column(name="NumeroSerie")
	 private int numeroSerie;
	@Column(name="CodiceCaricamento")
	private String codiceCaricamento;
	@Column(name="Colore")
	private String colore;
	@Column(name="Tensione")	       
	private String tensione;
	@Column(name="Approvazione")
	private String approvazione;
	@Column(name="Optionals")
	private String optionals;
	@Column(name="Alimentazine")
	private String alimentazione;
	@Column(name="Note")
	private String note;

	
}
