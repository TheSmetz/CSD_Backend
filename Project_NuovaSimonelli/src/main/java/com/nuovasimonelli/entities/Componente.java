package com.nuovasimonelli.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COL_COMPONENTE")
public class Componente {
@Id
@Column(name="ID")
private int id;
@Column(name="NOME")
private String nome;
@Column(name="VIEW_NOTE")
private boolean viewNote;

public Componente() {
	
}
public Componente(int id,String nome,boolean viewNote ) {
	this.id=id;
	this.nome=nome;
	this.viewNote=viewNote;
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
public boolean isViewNote() {
	return viewNote;
}
public void setViewNote(boolean viewNote) {
	this.viewNote = viewNote;
}
@Override
public String toString() {
	return "Azione [id=" + id + ", nome=" + nome + ", viewNote=" + viewNote+ "]";
}



}
