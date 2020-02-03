package com.nuovasimonelli.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COL_TIPO_PARTE")
public class TipoParte {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NOME")
	private String nome;
	
	public TipoParte() {
		
	}
	
	public TipoParte(int id, String nome) {
		this.id=id;
		this.nome=nome;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "TipoParte [id=" + id + ", nome=" + nome + "]";
	}
	
	
}
