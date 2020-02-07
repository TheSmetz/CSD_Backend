package com.nuovasimonelli.entities;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Macchina")
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
	@Column(name="CentralinaElettronica")
	private String centralinaElettronica;
	@Column(name="ReleaseCA")
	private String releaseCA;
	@Column(name="CentralinaAutolivello")
	private String centralinaAutolivello;
	@Column(name="ReleaseCE")
	private String releaseCE;
	@Column(name="DosatoreVolumetrico")
	private String dosatoreVolumetrico;
	@Column(name="PompanteVolumetrico")
	private String pompanteVolumetrico;
	@Column(name="Linea")
	private int linea;
	@Column(name="DifettositaA")
	private String difettositaA;
	@Column(name="InterventiA")
	private String interventiA;
	@Column(name="TimeInitA")
	private Date timeInitA;
	@Column(name="FirmaA")
	private String firmaA;
	@Column(name="TimeA")
	private Date timeA;
	
	@Column(name="DifettositaB")
	private String difettositaB;
	@Column(name="InterventiB")
	private String interventiB;
	@Column(name="TimeInitB")
	private Date timeInitB;
	@Column(name="FirmaB")
	private String firmaB;
	@Column(name="TimeB")
	private Date timeB;

	@Column(name="DifettositaC")
	private String difettositaC;
	@Column(name="InterventiC")
	private String interventiC;
	@Column(name="TimeInitC")
	private Date timeInitC;
	@Column(name="FirmaC")
	private String firmaC;
	@Column(name="TimeC")
	private Date timeC;

	@Column(name="DifettositaD")
	private String difettositaD;
	@Column(name="InterventiD")
	private String interventiD;
	@Column(name="TimeInitD")
	private Date timeInitD;
	@Column(name="FirmaD")
	private String firmaD;
	@Column(name="TimeD")
	private Date timeD;

	@Column(name="DifettositaE")
	private String difettositaE;
	@Column(name="InterventiE")
	private String interventiE;
	@Column(name="TimeInitE")
	private Date timeInitE;
	@Column(name="FirmaE")
	private String firmaE;
	@Column(name="TimeE")
	private Date timeE;
	
	@Column(name="FirmaRD")
	private String firmaRD;
	@Column(name="TimeET")
	private Date timeET;
	
	@Column(name="DifettositaF")
	private String difettositaF;
	@Column(name="InterventiF")
	private String interventiF;
	@Column(name="TimeInitF")
	private Date timeInitF;
	@Column(name="FirmaF")
	private String firmaF;
	@Column(name="TimeF")
	private Date timeF;
	
	@Column(name="DataVendita")
	private Date dataVendita;
	@Column(name="Prezzo")
	private int prezzo;
	@Column(name="Cliente")
	private String cliente;
	@Column(name="SchedaCollaudo")
	private String schedaCollaudo;
	@Column(name="Tag")
	private String tag;
	
	@Column(name="Descrizione")
	private String descrizione;
	@Column(name="PianoLavorazione")
	private String pianoLavorazione;
	@Column(name="Personalizzata")
	private String personalizzata;
	@Column(name="Priorita")
	private int priorita;
	@Column(name="Gruppi")
	private int gruppi;
	
	@Column(name="CodiceProg")
	private int codiceProg;
	@Column(name="MatricolaCaldaia")
	private String matricolaCaldaia;
	@Column(name="NoteDiLinea")
	private String noteDiLinea;
	@Column(name="IsFinita")
	private boolean isFinita;
	@Column(name="OrdinaMacchina")
	private int ordinaMacchina;
	
	@Column(name="IsCollaudoCaldaia")
	private boolean isCollaudoCaldaia;
	@Column(name="RigaOrdine")
	private int rigaOrdine;
	@Column(name="TempoTrascorsoA")
	private int tempoTrascorsoA;
	@Column(name="TempoTrascorsoB")
	private int tempoTrascorsoB;
	@Column(name="TempoTrascorsoC")
	private int tempoTrascorsoC;
	@Column(name="TempoTrascorsoD")
	private int tempoTrascorsoD;
	@Column(name="TempoTrascorsoE")
	private int tempoTrascorsoE;
	@Column(name="TempoTrascorsoF")
	private String tempoTrascorsoF;
	
	@Column(name="IsSospesa")
	private boolean isSospesa;
	@Column(name="Ordine")
	private int ordine;
	@Column(name="OrdineProduzione")
	private int ordineProduzione;
	@Column(name="DataChiusura")
	private Date dataChiusura;
	@Column(name="LineaChiusura")
	private int lineaChiusura;
	@Column(name="PreMontaggioEseguito")
	private boolean preMontaggioEseguito;
	@Column(name="CaldaiaEseguita")
	private boolean caldaiaEseguita;
	@Column(name="DataConsegna")
	private Date dataConsegna;
	@Column(name="DataInserimento")
	private Date dataInserimento;
	
	@Column(name="PROPOSTA_MODIFICA")
	private int propostaModifica;
	@Column(name="REVISIONE_ATTUAZIONE")
	private int revisioneAttuazione;
	@Column(name="ATTUAZIONE")
	private int attuazione;
	@Column(name="UTENTE_ATTUAZIONE")
	private int utenteAttuazione;
	@Column(name="NumeroPersonalizzazioneAttuato")
	private int numeroPersonalizzazioneAttuato;
	@Column(name="CadenzaA")
	private int cadenzaA;
	@Column(name="CadenzaB")
	private int cadenzaB;
	@Column(name="CadenzaC")
	private int cadenzaC;
	@Column(name="CadenzaD")
	private int cadenzaD;
	@Column(name="CadenzaE")
	private int cadenzaE;
	@Column(name="CadenzaF")
	private int cadenzaF;
	
	@Column(name="IsInCentroLogistico")
	private boolean isInCentroLogistico;
	@Column(name="IsInSpedizione")
	private boolean isInSpedizione;
	@Column(name="DataSpostamentoCentroLogistico")
	private Date dataSpostamentoCentroLogistico;
	@Column(name="Release3")
	private String release3;
	@Column(name="NumeroLottoPompante")
	private String NumeroLottoPompante;
	@Column(name="CAUSALE_COMPONENTE")
	private int causaleComponente;
	
	public Macchina() {
		
	}
	
	
	
	
	public Macchina(int numeroSerie, String codiceCaricamento, String colore, String tensione, String approvazione,
			String optionals, String alimentazione, String note, String centralinaElettronica, String releaseCA,
			String centralinaAutolivello, String releaseCE, String dosatoreVolumetrico, String pompanteVolumetrico,
			int linea, String difettositaA, String interventiA, Date timeInitA, String firmaA, Date timeA,
			String difettositaB, String interventiB, Date timeInitB, String firmaB, Date timeB, String difettositaC,
			String interventiC, Date timeInitC, String firmaC, Date timeC, String difettositaD, String interventiD,
			Date timeInitD, String firmaD, Date timeD, String difettositaE, String interventiE, Date timeInitE,
			String firmaE, Date timeE, String firmaRD, Date timeET, String difettositaF, String interventiF,
			Date timeInitF, String firmaF, Date timeF, Date dataVendita, int prezzo, String cliente,
			String schedaCollaudo, String tag, String descrizione, String pianoLavorazione, String personalizzata,
			int priorita, int gruppi, int codiceProg, String matricolaCaldaia, String noteDiLinea, boolean isFinita,
			int ordinaMacchina, boolean isCollaudoCaldaia, int rigaOrdine, int tempoTrascorsoA, int tempoTrascorsoB,
			int tempoTrascorsoC, int tempoTrascorsoD, int tempoTrascorsoE, String tempoTrascorsoF, boolean isSospesa,
			int ordine, int ordineProduzione, Date dataChiusura, int lineaChiusura, boolean preMontaggioEseguito,
			boolean caldaiaEseguita, Date dataConsegna, Date dataInserimento, int propostaModifica,
			int revisioneAttuazione, int attuazione, int utenteAttuazione, int numeroPersonalizzazioneAttuato,
			int cadenzaA, int cadenzaB, int cadenzaC, int cadenzaD, int cadenzaE, int cadenzaF,
			boolean isInCentroLogistico, boolean isInSpedizione, Date dataSpostamentoCentroLogistico, String release3,
			String numeroLottoPompante, int causaleComponente) {
		super();
		this.numeroSerie = numeroSerie;
		this.codiceCaricamento = codiceCaricamento;
		this.colore = colore;
		this.tensione = tensione;
		this.approvazione = approvazione;
		this.optionals = optionals;
		this.alimentazione = alimentazione;
		this.note = note;
		this.centralinaElettronica = centralinaElettronica;
		this.releaseCA = releaseCA;
		this.centralinaAutolivello = centralinaAutolivello;
		this.releaseCE = releaseCE;
		this.dosatoreVolumetrico = dosatoreVolumetrico;
		this.pompanteVolumetrico = pompanteVolumetrico;
		this.linea = linea;
		this.difettositaA = difettositaA;
		this.interventiA = interventiA;
		this.timeInitA = timeInitA;
		this.firmaA = firmaA;
		this.timeA = timeA;
		this.difettositaB = difettositaB;
		this.interventiB = interventiB;
		this.timeInitB = timeInitB;
		this.firmaB = firmaB;
		this.timeB = timeB;
		this.difettositaC = difettositaC;
		this.interventiC = interventiC;
		this.timeInitC = timeInitC;
		this.firmaC = firmaC;
		this.timeC = timeC;
		this.difettositaD = difettositaD;
		this.interventiD = interventiD;
		this.timeInitD = timeInitD;
		this.firmaD = firmaD;
		this.timeD = timeD;
		this.difettositaE = difettositaE;
		this.interventiE = interventiE;
		this.timeInitE = timeInitE;
		this.firmaE = firmaE;
		this.timeE = timeE;
		this.firmaRD = firmaRD;
		this.timeET = timeET;
		this.difettositaF = difettositaF;
		this.interventiF = interventiF;
		this.timeInitF = timeInitF;
		this.firmaF = firmaF;
		this.timeF = timeF;
		this.dataVendita = dataVendita;
		this.prezzo = prezzo;
		this.cliente = cliente;
		this.schedaCollaudo = schedaCollaudo;
		this.tag = tag;
		this.descrizione = descrizione;
		this.pianoLavorazione = pianoLavorazione;
		this.personalizzata = personalizzata;
		this.priorita = priorita;
		this.gruppi = gruppi;
		this.codiceProg = codiceProg;
		this.matricolaCaldaia = matricolaCaldaia;
		this.noteDiLinea = noteDiLinea;
		this.isFinita = isFinita;
		this.ordinaMacchina = ordinaMacchina;
		this.isCollaudoCaldaia = isCollaudoCaldaia;
		this.rigaOrdine = rigaOrdine;
		this.tempoTrascorsoA = tempoTrascorsoA;
		this.tempoTrascorsoB = tempoTrascorsoB;
		this.tempoTrascorsoC = tempoTrascorsoC;
		this.tempoTrascorsoD = tempoTrascorsoD;
		this.tempoTrascorsoE = tempoTrascorsoE;
		this.tempoTrascorsoF = tempoTrascorsoF;
		this.isSospesa = isSospesa;
		this.ordine = ordine;
		this.ordineProduzione = ordineProduzione;
		this.dataChiusura = dataChiusura;
		this.lineaChiusura = lineaChiusura;
		this.preMontaggioEseguito = preMontaggioEseguito;
		this.caldaiaEseguita = caldaiaEseguita;
		this.dataConsegna = dataConsegna;
		this.dataInserimento = dataInserimento;
		this.propostaModifica = propostaModifica;
		this.revisioneAttuazione = revisioneAttuazione;
		this.attuazione = attuazione;
		this.utenteAttuazione = utenteAttuazione;
		this.numeroPersonalizzazioneAttuato = numeroPersonalizzazioneAttuato;
		this.cadenzaA = cadenzaA;
		this.cadenzaB = cadenzaB;
		this.cadenzaC = cadenzaC;
		this.cadenzaD = cadenzaD;
		this.cadenzaE = cadenzaE;
		this.cadenzaF = cadenzaF;
		this.isInCentroLogistico = isInCentroLogistico;
		this.isInSpedizione = isInSpedizione;
		this.dataSpostamentoCentroLogistico = dataSpostamentoCentroLogistico;
		this.release3 = release3;
		NumeroLottoPompante = numeroLottoPompante;
		this.causaleComponente = causaleComponente;
	}




	public int getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public String getCodiceCaricamento() {
		return codiceCaricamento;
	}
	public void setCodiceCaricamento(String codiceCaricamento) {
		this.codiceCaricamento = codiceCaricamento;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public String getTensione() {
		return tensione;
	}
	public void setTensione(String tensione) {
		this.tensione = tensione;
	}
	public String getApprovazione() {
		return approvazione;
	}
	public void setApprovazione(String approvazione) {
		this.approvazione = approvazione;
	}
	public String getOptionals() {
		return optionals;
	}
	public void setOptionals(String optionals) {
		this.optionals = optionals;
	}
	public String getAlimentazione() {
		return alimentazione;
	}
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getCentralinaElettronica() {
		return centralinaElettronica;
	}
	public void setCentralinaElettronica(String centralinaElettronica) {
		this.centralinaElettronica = centralinaElettronica;
	}
	public String getReleaseCA() {
		return releaseCA;
	}
	public void setReleaseCA(String releaseCA) {
		this.releaseCA = releaseCA;
	}
	public String getCentralinaAutolivello() {
		return centralinaAutolivello;
	}
	public void setCentralinaAutolivello(String centralinaAutolivello) {
		this.centralinaAutolivello = centralinaAutolivello;
	}
	public String getReleaseCE() {
		return releaseCE;
	}
	public void setReleaseCE(String releaseCE) {
		this.releaseCE = releaseCE;
	}
	public String getDosatoreVolumetrico() {
		return dosatoreVolumetrico;
	}
	public void setDosatoreVolumetrico(String dosatoreVolumetrico) {
		this.dosatoreVolumetrico = dosatoreVolumetrico;
	}
	public String getPompanteVolumetrico() {
		return pompanteVolumetrico;
	}
	public void setPompanteVolumetrico(String pompanteVolumetrico) {
		this.pompanteVolumetrico = pompanteVolumetrico;
	}
	public int getLinea() {
		return linea;
	}
	public void setLinea(int linea) {
		this.linea = linea;
	}
	public String getDifettositaA() {
		return difettositaA;
	}
	public void setDifettositaA(String difettositaA) {
		this.difettositaA = difettositaA;
	}
	public String getInterventiA() {
		return interventiA;
	}
	public void setInterventiA(String interventiA) {
		this.interventiA = interventiA;
	}
	public Date getTimeInitA() {
		return timeInitA;
	}
	public void setTimeInitA(Date timeInitA) {
		this.timeInitA = timeInitA;
	}
	public String getFirmaA() {
		return firmaA;
	}
	public void setFirmaA(String firmaA) {
		this.firmaA = firmaA;
	}
	public Date getTimeA() {
		return timeA;
	}
	public void setTimeA(Date timeA) {
		this.timeA = timeA;
	}
	public String getDifettositaB() {
		return difettositaB;
	}
	public void setDifettositaB(String difettositaB) {
		this.difettositaB = difettositaB;
	}
	public String getInterventiB() {
		return interventiB;
	}
	public void setInterventiB(String interventiB) {
		this.interventiB = interventiB;
	}
	public Date getTimeInitB() {
		return timeInitB;
	}
	public void setTimeInitB(Date timeInitB) {
		this.timeInitB = timeInitB;
	}
	public String getFirmaB() {
		return firmaB;
	}
	public void setFirmaB(String firmaB) {
		this.firmaB = firmaB;
	}
	public Date getTimeB() {
		return timeB;
	}
	public void setTimeB(Date timeB) {
		this.timeB = timeB;
	}
	public String getDifettositaC() {
		return difettositaC;
	}
	public void setDifettositaC(String difettositaC) {
		this.difettositaC = difettositaC;
	}
	public String getInterventiC() {
		return interventiC;
	}
	public void setInterventiC(String interventiC) {
		this.interventiC = interventiC;
	}
	public Date getTimeInitC() {
		return timeInitC;
	}
	public void setTimeInitC(Date timeInitC) {
		this.timeInitC = timeInitC;
	}
	public String getFirmaC() {
		return firmaC;
	}
	public void setFirmaC(String firmaC) {
		this.firmaC = firmaC;
	}
	public Date getTimeC() {
		return timeC;
	}
	public void setTimeC(Date timeC) {
		this.timeC = timeC;
	}
	public String getDifettositaD() {
		return difettositaD;
	}
	public void setDifettositaD(String difettositaD) {
		this.difettositaD = difettositaD;
	}
	public String getInterventiD() {
		return interventiD;
	}
	public void setInterventiD(String interventiD) {
		this.interventiD = interventiD;
	}
	public Date getTimeInitD() {
		return timeInitD;
	}
	public void setTimeInitD(Date timeInitD) {
		this.timeInitD = timeInitD;
	}
	public String getFirmaD() {
		return firmaD;
	}
	public void setFirmaD(String firmaD) {
		this.firmaD = firmaD;
	}
	public Date getTimeD() {
		return timeD;
	}
	public void setTimeD(Date timeD) {
		this.timeD = timeD;
	}
	public String getDifettositaE() {
		return difettositaE;
	}
	public void setDifettositaE(String difettositaE) {
		this.difettositaE = difettositaE;
	}
	public String getInterventiE() {
		return interventiE;
	}
	public void setInterventiE(String interventiE) {
		this.interventiE = interventiE;
	}
	public Date getTimeInitE() {
		return timeInitE;
	}
	public void setTimeInitE(Date timeInitE) {
		this.timeInitE = timeInitE;
	}
	public String getFirmaE() {
		return firmaE;
	}
	public void setFirmaE(String firmaE) {
		this.firmaE = firmaE;
	}
	public Date getTimeE() {
		return timeE;
	}
	public void setTimeE(Date timeE) {
		this.timeE = timeE;
	}
	public String getFirmaRD() {
		return firmaRD;
	}
	public void setFirmaRD(String firmaRD) {
		this.firmaRD = firmaRD;
	}
	public Date getTimeET() {
		return timeET;
	}
	public void setTimeET(Date timeET) {
		this.timeET = timeET;
	}
	public String getDifettositaF() {
		return difettositaF;
	}
	public void setDifettositaF(String difettositaF) {
		this.difettositaF = difettositaF;
	}
	public String getInterventiF() {
		return interventiF;
	}
	public void setInterventiF(String interventiF) {
		this.interventiF = interventiF;
	}
	public Date getTimeInitF() {
		return timeInitF;
	}
	public void setTimeInitF(Date timeInitF) {
		this.timeInitF = timeInitF;
	}
	public String getFirmaF() {
		return firmaF;
	}
	public void setFirmaF(String firmaF) {
		this.firmaF = firmaF;
	}
	public Date getTimeF() {
		return timeF;
	}
	public void setTimeF(Date timeF) {
		this.timeF = timeF;
	}
	public Date getDataVendita() {
		return dataVendita;
	}
	public void setDataVendita(Date dataVendita) {
		this.dataVendita = dataVendita;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getSchedaCollaudo() {
		return schedaCollaudo;
	}
	public void setSchedaCollaudo(String schedaCollaudo) {
		this.schedaCollaudo = schedaCollaudo;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getPianoLavorazione() {
		return pianoLavorazione;
	}
	public void setPianoLavorazione(String pianoLavorazione) {
		this.pianoLavorazione = pianoLavorazione;
	}
	public String getPersonalizzata() {
		return personalizzata;
	}
	public void setPersonalizzata(String personalizzata) {
		this.personalizzata = personalizzata;
	}
	public int getPriorita() {
		return priorita;
	}
	public void setPriorita(int priorita) {
		this.priorita = priorita;
	}
	public int getGruppi() {
		return gruppi;
	}
	public void setGruppi(int gruppi) {
		this.gruppi = gruppi;
	}
	public int getCodiceProg() {
		return codiceProg;
	}
	public void setCodiceProg(int codiceProg) {
		this.codiceProg = codiceProg;
	}
	public String getMatricolaCaldaia() {
		return matricolaCaldaia;
	}
	public void setMatricolaCaldaia(String matricolaCaldaia) {
		this.matricolaCaldaia = matricolaCaldaia;
	}
	public String getNoteDiLinea() {
		return noteDiLinea;
	}
	public void setNoteDiLinea(String noteDiLinea) {
		this.noteDiLinea = noteDiLinea;
	}
	public boolean isFinita() {
		return isFinita;
	}
	public void setFinita(boolean isFinita) {
		this.isFinita = isFinita;
	}
	public int getOrdinaMacchina() {
		return ordinaMacchina;
	}
	public void setOrdinaMacchina(int ordinaMacchina) {
		this.ordinaMacchina = ordinaMacchina;
	}
	public boolean isCollaudoCaldaia() {
		return isCollaudoCaldaia;
	}
	public void setCollaudoCaldaia(boolean isCollaudoCaldaia) {
		this.isCollaudoCaldaia = isCollaudoCaldaia;
	}
	public int getRigaOrdine() {
		return rigaOrdine;
	}
	public void setRigaOrdine(int rigaOrdine) {
		this.rigaOrdine = rigaOrdine;
	}
	public int getTempoTrascorsoA() {
		return tempoTrascorsoA;
	}
	public void setTempoTrascorsoA(int tempoTrascorsoA) {
		this.tempoTrascorsoA = tempoTrascorsoA;
	}
	public int getTempoTrascorsoB() {
		return tempoTrascorsoB;
	}
	public void setTempoTrascorsoB(int tempoTrascorsoB) {
		this.tempoTrascorsoB = tempoTrascorsoB;
	}
	public int getTempoTrascorsoC() {
		return tempoTrascorsoC;
	}
	public void setTempoTrascorsoC(int tempoTrascorsoC) {
		this.tempoTrascorsoC = tempoTrascorsoC;
	}
	public int getTempoTrascorsoD() {
		return tempoTrascorsoD;
	}
	public void setTempoTrascorsoD(int tempoTrascorsoD) {
		this.tempoTrascorsoD = tempoTrascorsoD;
	}
	public int getTempoTrascorsoE() {
		return tempoTrascorsoE;
	}
	public void setTempoTrascorsoE(int tempoTrascorsoE) {
		this.tempoTrascorsoE = tempoTrascorsoE;
	}
	public String getTempoTrascorsoF() {
		return tempoTrascorsoF;
	}
	public void setTempoTrascorsoF(String tempoTrascorsoF) {
		this.tempoTrascorsoF = tempoTrascorsoF;
	}
	public boolean isSospesa() {
		return isSospesa;
	}
	public void setSospesa(boolean isSospesa) {
		this.isSospesa = isSospesa;
	}
	public int getOrdine() {
		return ordine;
	}
	public void setOrdine(int ordine) {
		this.ordine = ordine;
	}
	public int getOrdineProduzione() {
		return ordineProduzione;
	}
	public void setOrdineProduzione(int ordineProduzione) {
		this.ordineProduzione = ordineProduzione;
	}
	public Date getDataChiusura() {
		return dataChiusura;
	}
	public void setDataChiusura(Date dataChiusura) {
		this.dataChiusura = dataChiusura;
	}
	public int getLineaChiusura() {
		return lineaChiusura;
	}
	public void setLineaChiusura(int lineaChiusura) {
		this.lineaChiusura = lineaChiusura;
	}
	public boolean isPreMontaggioEseguito() {
		return preMontaggioEseguito;
	}
	public void setPreMontaggioEseguito(boolean preMontaggioEseguito) {
		this.preMontaggioEseguito = preMontaggioEseguito;
	}
	public boolean isCaldaiaEseguita() {
		return caldaiaEseguita;
	}
	public void setCaldaiaEseguita(boolean caldaiaEseguita) {
		this.caldaiaEseguita = caldaiaEseguita;
	}
	public Date getDataConsegna() {
		return dataConsegna;
	}
	public void setDataConsegna(Date dataConsegna) {
		this.dataConsegna = dataConsegna;
	}
	public Date getDataInserimento() {
		return dataInserimento;
	}
	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}
	public int getPropostaModifica() {
		return propostaModifica;
	}
	public void setPropostaModifica(int propostaModifica) {
		this.propostaModifica = propostaModifica;
	}
	public int getRevisioneAttuazione() {
		return revisioneAttuazione;
	}
	public void setRevisioneAttuazione(int revisioneAttuazione) {
		this.revisioneAttuazione = revisioneAttuazione;
	}
	public int getAttuazione() {
		return attuazione;
	}
	public void setAttuazione(int attuazione) {
		this.attuazione = attuazione;
	}
	public int getUtenteAttuazione() {
		return utenteAttuazione;
	}
	public void setUtenteAttuazione(int utenteAttuazione) {
		this.utenteAttuazione = utenteAttuazione;
	}
	public int getNumeroPersonalizzazioneAttuato() {
		return numeroPersonalizzazioneAttuato;
	}
	public void setNumeroPersonalizzazioneAttuato(int numeroPersonalizzazioneAttuato) {
		this.numeroPersonalizzazioneAttuato = numeroPersonalizzazioneAttuato;
	}
	public int getCadenzaA() {
		return cadenzaA;
	}
	public void setCadenzaA(int cadenzaA) {
		this.cadenzaA = cadenzaA;
	}
	public int getCadenzaB() {
		return cadenzaB;
	}
	public void setCadenzaB(int cadenzaB) {
		this.cadenzaB = cadenzaB;
	}
	public int getCadenzaC() {
		return cadenzaC;
	}
	public void setCadenzaC(int cadenzaC) {
		this.cadenzaC = cadenzaC;
	}
	public int getCadenzaD() {
		return cadenzaD;
	}
	public void setCadenzaD(int cadenzaD) {
		this.cadenzaD = cadenzaD;
	}
	public int getCadenzaE() {
		return cadenzaE;
	}
	public void setCadenzaE(int cadenzaE) {
		this.cadenzaE = cadenzaE;
	}
	public int getCadenzaF() {
		return cadenzaF;
	}
	public void setCadenzaF(int cadenzaF) {
		this.cadenzaF = cadenzaF;
	}
	public boolean isInCentroLogistico() {
		return isInCentroLogistico;
	}
	public void setInCentroLogistico(boolean isInCentroLogistico) {
		this.isInCentroLogistico = isInCentroLogistico;
	}
	public boolean isInSpedizione() {
		return isInSpedizione;
	}
	public void setInSpedizione(boolean isInSpedizione) {
		this.isInSpedizione = isInSpedizione;
	}
	public Date getDataSpostamentoCentroLogistico() {
		return dataSpostamentoCentroLogistico;
	}
	public void setDataSpostamentoCentroLogistico(Date dataSpostamentoCentroLogistico) {
		this.dataSpostamentoCentroLogistico = dataSpostamentoCentroLogistico;
	}
	public String getRelease3() {
		return release3;
	}
	public void setRelease3(String release3) {
		this.release3 = release3;
	}
	public String getNumeroLottoPompante() {
		return NumeroLottoPompante;
	}
	public void setNumeroLottoPompante(String numeroLottoPompante) {
		NumeroLottoPompante = numeroLottoPompante;
	}
	public int getCausaleComponente() {
		return causaleComponente;
	}
	public void setCausaleComponente(int causaleComponente) {
		this.causaleComponente = causaleComponente;
	}
	
	
	
	
	
	
	

	
}
