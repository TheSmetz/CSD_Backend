package com.nuovasimonelli.interfaces;

public class TipiDifettiComponenti {

	public String nomeComponente;
	public int difettiProcesso;
	public int difettiComponente;

	public TipiDifettiComponenti(String nomeComponente, int difettiProcesso, int difettiComponente) {
		this.nomeComponente = nomeComponente;
		this.difettiProcesso = difettiProcesso;
		this.difettiComponente = difettiComponente;
	}

	public String getNomeComponente() {
		return nomeComponente;
	}

	public void setNomeComponente(String nomeComponente) {
		this.nomeComponente = nomeComponente;
	}

	public int getDifettiProcesso() {
		return difettiProcesso;
	}

	public void setDifettiProcesso(int difettiProcesso) {
		this.difettiProcesso = difettiProcesso;
	}

	public int getDifettiComponente() {
		return difettiComponente;
	}

	public void setDifettiComponente(int difettiComponente) {
		this.difettiComponente = difettiComponente;
	}

}
