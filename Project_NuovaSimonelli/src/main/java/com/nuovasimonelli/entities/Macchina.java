package com.nuovasimonelli.entities;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="MACCHINA_POST_2013")
public class Macchina {
	@DateTimeFormat(pattern = "yyyy-MM-dd  HH:mm:ss.SSSX")
	@Column(name="NumeroSerie")
	private Integer numeroSerie;
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
	@Column(name="Alimentazione")
	private String alimentazione;
	@Column(name="Note")
	private String note;
	@Column(name="CentralinaElettronica")
	private String centralinaElettronica;
	@Column(name="ReleaseCE")
	private String releaseCE;
	@Column(name="CentralinaAutolivello")
	private String centralinaAutolivello;
	@Column(name="ReleaseCA")
	private String releaseCA;

	@Column(name="DosatoreVolumetrico")
	private String dosatoreVolumetrico;
	@Column(name="PompanteVolumetrico")
	private String pompanteVolumetrico;
	@Column(name="Linea")
	private Integer linea;
	
	@Column(name="DifettositaA")
	private String difettositaA;
	@Column(name="InterventiA")
	private String interventiA;
	@Column(name="TimeInitA")
	private LocalDateTime timeInitA;
	@Column(name="FirmaA")
	private Integer firmaA;
	@Column(name="TimeA")
	private LocalDateTime timeA;
	
	@Column(name="DifettositaB")
	private String difettositaB;
	@Column(name="InterventiB")
	private String interventiB;
	@Column(name="TimeInitB")
	private LocalDateTime timeInitB;
	@Column(name="FirmaB")
	private Integer firmaB;
	@Column(name="TimeB")
	private LocalDateTime timeB;

	@Column(name="DifettositaC")
	private String difettositaC;
	@Column(name="InterventiC")
	private String interventiC;
	@Column(name="TimeInitC")
	private LocalDateTime timeInitC;
	@Column(name="FirmaC")
	private Integer firmaC;
	@Column(name="TimeC")
	private LocalDateTime timeC;

	@Column(name="DifettositaD")
	private String difettositaD;
	@Column(name="InterventiD")
	private String interventiD;
	@Column(name="TimeInitD")
	private LocalDateTime timeInitD;
	@Column(name="FirmaD")
	private Integer firmaD;
	@Column(name="TimeD")
	private LocalDateTime timeD;

	@Column(name="DifettositaE")
	private String difettositaE;
	@Column(name="InterventiE")
	private String interventiE;
	@Column(name="TimeInitE")
	private LocalDateTime timeInitE;
	@Column(name="FirmaE")
	private Integer firmaE;
	@Column(name="TimeE")
	private LocalDateTime timeE;
	
	@Column(name="FirmaRD")
	private Integer firmaRD;
	@Column(name="TimeRD")
	private LocalDateTime timeRD;
	@Column(name="FirmaET")
	private Integer firmaET;
	@Column(name="TimeET")
	private LocalDateTime timeET;
	
	@Column(name="DifettositaF")
	private String difettositaF;
	@Column(name="InterventiF")
	private String interventiF;
	@Column(name="TimeInitF")
	private LocalDateTime timeInitF;
	@Column(name="FirmaF")
	private Integer firmaF;
	@Column(name="TimeF")
	private LocalDateTime timeF;
	
	@Column(name="DataVendita")
	private LocalDateTime dataVendita;
	@Column(name="Prezzo")
	private Integer prezzo;
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
	private Integer priorita;
	@Column(name="Gruppi")
	private String gruppi;
	
	@Id
	@Column(name="CodiceProg")
	private Integer codiceProg;
	@Column(name="MatricolaCaldaia")
	private String matricolaCaldaia;
	@Column(name="NoteDiLinea")
	private String noteDiLinea;
	@Column(name="IsFinita",columnDefinition = "BIT")
	private Boolean isFinita;
	@Column(name="OrdineMacchina")
	private Integer ordineMacchina;
	
	@Column(name="IsCollaudoCaldaia",columnDefinition = "BIT")
	private Boolean isCollaudoCaldaia;
	@Column(name="RigaOrdine")
	private String rigaOrdine;
	@Column(name="TempoTrascorsoA")
	private Integer tempoTrascorsoA;
	@Column(name="TempoTrascorsoB")
	private Integer tempoTrascorsoB;
	@Column(name="TempoTrascorsoC")
	private Integer tempoTrascorsoC;
	@Column(name="TempoTrascorsoD")
	private Integer tempoTrascorsoD;
	@Column(name="TempoTrascorsoE")
	private Integer tempoTrascorsoE;
	@Column(name="TempoTrascorsoF")
	private Integer tempoTrascorsoF;
	
	@Column(name="IsSospesa",columnDefinition = "BIT")
	private Boolean isSospesa;
	@Column(name="Ordine")
	private Integer ordine;
	@Column(name="OrdineProduzione")
	private Integer ordineProduzione;
	@Column(name="DataChiusura")
	private LocalDateTime dataChiusura;
	@Column(name="LineaChiusura")
	private Integer lineaChiusura;
	@Column(name="PreMontaggioEseguito",columnDefinition = "BIT")
	private Boolean preMontaggioEseguito;
	@Column(name="CaldaiaEseguita",columnDefinition = "BIT")
	private Boolean caldaiaEseguita;
	@Column(name="DataConsegna")
	private LocalDateTime dataConsegna;
	@Column(name="DataInserimento")
	private LocalDateTime dataInserimento;
	
	@Column(name="PROPOSTA_MODIFICA")
	private Integer propostaModifica;
	@Column(name="REVISIONE_ATTUAZIONE")
	private Integer revisioneAttuazione;
	@Column(name="ATTUAZIONE")
	private String attuazione;
	@Column(name="UTENTE_ATTUAZIONE")
	private Integer utenteAttuazione;
	@Column(name="NumeroPersonalizzazioneAttuato")
	private String numeroPersonalizzazioneAttuato;
	@Column(name="CadenzaA")
	private Integer cadenzaA;
	@Column(name="CadenzaB")
	private Integer cadenzaB;
	@Column(name="CadenzaC")
	private Integer cadenzaC;
	@Column(name="CadenzaD")
	private Integer cadenzaD;
	@Column(name="CadenzaE")
	private Integer cadenzaE;
	@Column(name="CadenzaF")
	private Integer cadenzaF;
	
	@Column(name="IsInCentroLogistico",columnDefinition = "BIT")
	private Boolean isInCentroLogistico;
	@Column(name="DataSpostamentoCentroLogistico")
	private LocalDateTime dataSpostamentoCentroLogistico;
	@Column(name="IsInSpedizione",columnDefinition = "BIT")
	private Boolean isInSpedizione;

	@Column(name="Release3")
	private String release3;
	@Column(name="NumeroLottoPompante")
	private String numeroLottoPompante;
	@Column(name="CAUSALE_COMPONENTE_QR")
	private Integer causaleComponente;
	
	public Macchina() {
		
	}



	public Macchina(Integer numeroSerie, String codiceCaricamento, String colore, String tensione, String approvazione,
			String optionals, String alimentazione, String note, String centralinaElettronica, String releaseCE,
			String centralinaAutolivello, String releaseCA, String dosatoreVolumetrico, String pompanteVolumetrico,
			Integer linea, String difettositaA, String interventiA, LocalDateTime timeInitA, Integer firmaA, LocalDateTime timeA,
			String difettositaB, String interventiB, LocalDateTime timeInitB, Integer firmaB, LocalDateTime timeB, String difettositaC,
			String interventiC, LocalDateTime timeInitC, Integer firmaC, LocalDateTime timeC, String difettositaD, String interventiD,
			LocalDateTime timeInitD, Integer firmaD, LocalDateTime timeD, String difettositaE, String interventiE, LocalDateTime timeInitE, Integer firmaE,
			LocalDateTime timeE, Integer firmaRD, LocalDateTime timeRD, Integer firmaET, LocalDateTime timeET, String difettositaF, String interventiF,
			LocalDateTime timeInitF, Integer firmaF, LocalDateTime timeF, LocalDateTime dataVendita, Integer prezzo, String cliente,
			String schedaCollaudo, String tag, String descrizione, String pianoLavorazione, String personalizzata,
			Integer priorita, String gruppi, Integer codiceProg, String matricolaCaldaia, String noteDiLinea, Boolean isFinita,
			Integer ordineMacchina, Boolean isCollaudoCaldaia, String rigaOrdine, Integer tempoTrascorsoA, Integer tempoTrascorsoB,
			Integer tempoTrascorsoC, Integer tempoTrascorsoD, Integer tempoTrascorsoE, Integer tempoTrascorsoF, Boolean isSospesa,
			Integer ordine, Integer ordineProduzione, LocalDateTime dataChiusura, Integer lineaChiusura, Boolean preMontaggioEseguito,
			Boolean caldaiaEseguita, LocalDateTime dataConsegna, LocalDateTime dataInserimento, Integer propostaModifica,
			Integer revisioneAttuazione, String attuazione, Integer utenteAttuazione, String numeroPersonalizzazioneAttuato,
			Integer cadenzaA, Integer cadenzaB, Integer cadenzaC, Integer cadenzaD, Integer cadenzaE, Integer cadenzaF,
			Boolean isInCentroLogistico, LocalDateTime dataSpostamentoCentroLogistico, Boolean isInSpedizione, String release3,
			String numeroLottoPompante, Integer causaleComponente) {
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
		this.releaseCE = releaseCE;
		this.centralinaAutolivello = centralinaAutolivello;
		this.releaseCA = releaseCA;
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
		this.timeRD = timeRD;
		this.firmaET = firmaET;
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
		this.ordineMacchina = ordineMacchina;
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
		this.dataSpostamentoCentroLogistico = dataSpostamentoCentroLogistico;
		this.isInSpedizione = isInSpedizione;
		this.release3 = release3;
		this.numeroLottoPompante = numeroLottoPompante;
		this.causaleComponente = causaleComponente;
	}



	public Integer getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(Integer numeroSerie) {
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

	public String getReleaseCE() {
		return releaseCE;
	}

	public void setReleaseCE(String releaseCE) {
		this.releaseCE = releaseCE;
	}

	public String getCentralinaAutolivello() {
		return centralinaAutolivello;
	}

	public void setCentralinaAutolivello(String centralinaAutolivello) {
		this.centralinaAutolivello = centralinaAutolivello;
	}

	public String getReleaseCA() {
		return releaseCA;
	}

	public void setReleaseCA(String releaseCA) {
		this.releaseCA = releaseCA;
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

	public Integer getLinea() {
		return linea;
	}

	public void setLinea(Integer linea) {
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

	public LocalDateTime getTimeInitA() {
		return timeInitA;
	}

	public void setTimeInitA(LocalDateTime timeInitA) {
		this.timeInitA = timeInitA;
	}

	public Integer getFirmaA() {
		return firmaA;
	}

	public void setFirmaA(Integer firmaA) {
		this.firmaA = firmaA;
	}

	public LocalDateTime getTimeA() {
		return timeA;
	}

	public void setTimeA(LocalDateTime timeA) {
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

	public LocalDateTime getTimeInitB() {
		return timeInitB;
	}

	public void setTimeInitB(LocalDateTime timeInitB) {
		this.timeInitB = timeInitB;
	}

	public Integer getFirmaB() {
		return firmaB;
	}

	public void setFirmaB(Integer firmaB) {
		this.firmaB = firmaB;
	}

	public LocalDateTime getTimeB() {
		return timeB;
	}

	public void setTimeB(LocalDateTime timeB) {
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

	public LocalDateTime getTimeInitC() {
		return timeInitC;
	}

	public void setTimeInitC(LocalDateTime timeInitC) {
		this.timeInitC = timeInitC;
	}

	public Integer getFirmaC() {
		return firmaC;
	}

	public void setFirmaC(Integer firmaC) {
		this.firmaC = firmaC;
	}

	public LocalDateTime getTimeC() {
		return timeC;
	}

	public void setTimeC(LocalDateTime timeC) {
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

	public LocalDateTime getTimeInitD() {
		return timeInitD;
	}

	public void setTimeInitD(LocalDateTime timeInitD) {
		this.timeInitD = timeInitD;
	}

	public Integer getFirmaD() {
		return firmaD;
	}

	public void setFirmaD(Integer firmaD) {
		this.firmaD = firmaD;
	}

	public LocalDateTime getTimeD() {
		return timeD;
	}

	public void setTimeD(LocalDateTime timeD) {
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

	public LocalDateTime getTimeInitE() {
		return timeInitE;
	}

	public void setTimeInitE(LocalDateTime timeInitE) {
		this.timeInitE = timeInitE;
	}

	public Integer getFirmaE() {
		return firmaE;
	}

	public void setFirmaE(Integer firmaE) {
		this.firmaE = firmaE;
	}

	public LocalDateTime getTimeE() {
		return timeE;
	}

	public void setTimeE(LocalDateTime timeE) {
		this.timeE = timeE;
	}

	public Integer getFirmaRD() {
		return firmaRD;
	}

	public void setFirmaRD(Integer firmaRD) {
		this.firmaRD = firmaRD;
	}

	public LocalDateTime getTimeRD() {
		return timeRD;
	}

	public void setTimeRD(LocalDateTime timeRD) {
		this.timeRD = timeRD;
	}

	public Integer getFirmaET() {
		return firmaET;
	}

	public void setFirmaET(Integer firmaET) {
		this.firmaET = firmaET;
	}

	public LocalDateTime getTimeET() {
		return timeET;
	}

	public void setTimeET(LocalDateTime timeET) {
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

	public LocalDateTime getTimeInitF() {
		return timeInitF;
	}

	public void setTimeInitF(LocalDateTime timeInitF) {
		this.timeInitF = timeInitF;
	}

	public Integer getFirmaF() {
		return firmaF;
	}

	public void setFirmaF(Integer firmaF) {
		this.firmaF = firmaF;
	}

	public LocalDateTime getTimeF() {
		return timeF;
	}

	public void setTimeF(LocalDateTime timeF) {
		this.timeF = timeF;
	}

	public LocalDateTime getDataVendita() {
		return dataVendita;
	}

	public void setDataVendita(LocalDateTime dataVendita) {
		this.dataVendita = dataVendita;
	}

	public Integer getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Integer prezzo) {
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

	public Integer getPriorita() {
		return priorita;
	}

	public void setPriorita(Integer priorita) {
		this.priorita = priorita;
	}

	public String getGruppi() {
		return gruppi;
	}

	public void setGruppi(String gruppi) {
		this.gruppi = gruppi;
	}

	public Integer getCodiceProg() {
		return codiceProg;
	}

	public void setCodiceProg(Integer codiceProg) {
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

	public Boolean isFinita() {
		return isFinita;
	}

	public void setFinita(Boolean isFinita) {
		this.isFinita = isFinita;
	}

	public Integer getOrdineMacchina() {
		return ordineMacchina;
	}

	public void setOrdineMacchina(Integer ordineMacchina) {
		this.ordineMacchina = ordineMacchina;
	}

	public Boolean isCollaudoCaldaia() {
		return isCollaudoCaldaia;
	}

	public void setCollaudoCaldaia(Boolean isCollaudoCaldaia) {
		this.isCollaudoCaldaia = isCollaudoCaldaia;
	}

	public String getRigaOrdine() {
		return rigaOrdine;
	}

	public void setRigaOrdine(String rigaOrdine) {
		this.rigaOrdine = rigaOrdine;
	}

	public Integer getTempoTrascorsoA() {
		return tempoTrascorsoA;
	}

	public void setTempoTrascorsoA(Integer tempoTrascorsoA) {
		this.tempoTrascorsoA = tempoTrascorsoA;
	}

	public Integer getTempoTrascorsoB() {
		return tempoTrascorsoB;
	}

	public void setTempoTrascorsoB(Integer tempoTrascorsoB) {
		this.tempoTrascorsoB = tempoTrascorsoB;
	}

	public Integer getTempoTrascorsoC() {
		return tempoTrascorsoC;
	}

	public void setTempoTrascorsoC(Integer tempoTrascorsoC) {
		this.tempoTrascorsoC = tempoTrascorsoC;
	}

	public Integer getTempoTrascorsoD() {
		return tempoTrascorsoD;
	}

	public void setTempoTrascorsoD(Integer tempoTrascorsoD) {
		this.tempoTrascorsoD = tempoTrascorsoD;
	}

	public Integer getTempoTrascorsoE() {
		return tempoTrascorsoE;
	}

	public void setTempoTrascorsoE(Integer tempoTrascorsoE) {
		this.tempoTrascorsoE = tempoTrascorsoE;
	}

	public Integer getTempoTrascorsoF() {
		return tempoTrascorsoF;
	}

	public void setTempoTrascorsoF(Integer tempoTrascorsoF) {
		this.tempoTrascorsoF = tempoTrascorsoF;
	}

	public Boolean isSospesa() {
		return isSospesa;
	}

	public void setSospesa(Boolean isSospesa) {
		this.isSospesa = isSospesa;
	}

	public Integer getOrdine() {
		return ordine;
	}

	public void setOrdine(Integer ordine) {
		this.ordine = ordine;
	}

	public Integer getOrdineProduzione() {
		return ordineProduzione;
	}

	public void setOrdineProduzione(Integer ordineProduzione) {
		this.ordineProduzione = ordineProduzione;
	}

	public LocalDateTime getDataChiusura() {
		return dataChiusura;
	}

	public void setDataChiusura(LocalDateTime dataChiusura) {
		this.dataChiusura = dataChiusura;
	}

	public Integer getLineaChiusura() {
		return lineaChiusura;
	}

	public void setLineaChiusura(Integer lineaChiusura) {
		this.lineaChiusura = lineaChiusura;
	}

	public Boolean isPreMontaggioEseguito() {
		return preMontaggioEseguito;
	}

	public void setPreMontaggioEseguito(Boolean preMontaggioEseguito) {
		this.preMontaggioEseguito = preMontaggioEseguito;
	}

	public Boolean isCaldaiaEseguita() {
		return caldaiaEseguita;
	}

	public void setCaldaiaEseguita(Boolean caldaiaEseguita) {
		this.caldaiaEseguita = caldaiaEseguita;
	}

	public LocalDateTime getDataConsegna() {
		return dataConsegna;
	}

	public void setDataConsegna(LocalDateTime dataConsegna) {
		this.dataConsegna = dataConsegna;
	}

	public LocalDateTime getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(LocalDateTime dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public Integer getPropostaModifica() {
		return propostaModifica;
	}

	public void setPropostaModifica(Integer propostaModifica) {
		this.propostaModifica = propostaModifica;
	}

	public Integer getRevisioneAttuazione() {
		return revisioneAttuazione;
	}

	public void setRevisioneAttuazione(Integer revisioneAttuazione) {
		this.revisioneAttuazione = revisioneAttuazione;
	}

	public String getAttuazione() {
		return attuazione;
	}

	public void setAttuazione(String attuazione) {
		this.attuazione = attuazione;
	}

	public Integer getUtenteAttuazione() {
		return utenteAttuazione;
	}

	public void setUtenteAttuazione(Integer utenteAttuazione) {
		this.utenteAttuazione = utenteAttuazione;
	}

	public String getNumeroPersonalizzazioneAttuato() {
		return numeroPersonalizzazioneAttuato;
	}

	public void setNumeroPersonalizzazioneAttuato(String numeroPersonalizzazioneAttuato) {
		this.numeroPersonalizzazioneAttuato = numeroPersonalizzazioneAttuato;
	}

	public Integer getCadenzaA() {
		return cadenzaA;
	}

	public void setCadenzaA(Integer cadenzaA) {
		this.cadenzaA = cadenzaA;
	}

	public Integer getCadenzaB() {
		return cadenzaB;
	}

	public void setCadenzaB(Integer cadenzaB) {
		this.cadenzaB = cadenzaB;
	}

	public Integer getCadenzaC() {
		return cadenzaC;
	}

	public void setCadenzaC(Integer cadenzaC) {
		this.cadenzaC = cadenzaC;
	}

	public Integer getCadenzaD() {
		return cadenzaD;
	}

	public void setCadenzaD(Integer cadenzaD) {
		this.cadenzaD = cadenzaD;
	}

	public Integer getCadenzaE() {
		return cadenzaE;
	}

	public void setCadenzaE(Integer cadenzaE) {
		this.cadenzaE = cadenzaE;
	}

	public Integer getCadenzaF() {
		return cadenzaF;
	}

	public void setCadenzaF(Integer cadenzaF) {
		this.cadenzaF = cadenzaF;
	}

	public Boolean isInCentroLogistico() {
		return isInCentroLogistico;
	}

	public void setInCentroLogistico(Boolean isInCentroLogistico) {
		this.isInCentroLogistico = isInCentroLogistico;
	}

	public LocalDateTime getDataSpostamentoCentroLogistico() {
		return dataSpostamentoCentroLogistico;
	}

	public void setDataSpostamentoCentroLogistico(LocalDateTime dataSpostamentoCentroLogistico) {
		this.dataSpostamentoCentroLogistico = dataSpostamentoCentroLogistico;
	}

	public Boolean isInSpedizione() {
		return isInSpedizione;
	}

	public void setInSpedizione(Boolean isInSpedizione) {
		this.isInSpedizione = isInSpedizione;
	}

	public String getRelease3() {
		return release3;
	}

	public void setRelease3(String release3) {
		this.release3 = release3;
	}

	public String getNumeroLottoPompante() {
		return numeroLottoPompante;
	}

	public void setNumeroLottoPompante(String numeroLottoPompante) {
		this.numeroLottoPompante = numeroLottoPompante;
	}

	public Integer getCausaleComponente() {
		return causaleComponente;
	}

	public void setCausaleComponente(Integer causaleComponente) {
		this.causaleComponente = causaleComponente;
	}

	
}
