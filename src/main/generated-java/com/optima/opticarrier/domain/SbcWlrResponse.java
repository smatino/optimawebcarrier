/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/domain/Entity.e.vm.java
 */
package com.optima.opticarrier.domain;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.TemporalType.DATE;
import static javax.persistence.TemporalType.TIMESTAMP;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Objects;

@Entity
@Table(name = "SBC_WLR_RESPONSE")
public class SbcWlrResponse implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(SbcWlrResponse.class);

    // Raw attributes
    private Integer id;
    private String tipoNotifica;
    private Date dataEstrazioneWL;
    private String borchiaISDN;
    private String codicePiattaforma;
    private Date dataAttivazione;
    private Date dataValidazioneFormaleContrattua;
    private Date dataValidazioneTecnicoGestionale;
    private String dn;
    private String flagLineaBtsNaked;
    private String note;
    private String nuovoDN;
    private String cognomeReferente;
    private String nomeReferente;
    private String qualificaRef;
    private String telefonoFissoReferente;
    private String telefonoMobileReferente;
    private String codiceMotivoRifiuto;
    private String motivoRifiuto;
    private String tipoCausaleRifiuto;
    private String tipoDn;
    private String tipoLinea;
    private String codiceCausaleAccodamento;
    private Date dataPrevistaSoluzione;
    private String descrizioneCausaleAccodamento;
    private String dimensioneCoda;
    private String posizioneCoda;
    private String codiceCausaleAnnullamento;
    private Date taAnnullamento;
    private String descrizioneCausaleAnnullamento;
    private Date dataEspletamento;
    private Date dataContatto;
    private String nuovaDA;
    private String oraAppuntamento;
    private String oraContatto;
    private String referenteContattato;
    private String telefonoReferenteContattato;
    private Date taInizioLavorazione;
    private String fasciaOraria;
    private String nuovaDAC;
    private String flagPermessi;
    private String giorniPrevisti;
    private String codiceCausaleRimodulazione;
    private String descrizioneCausaleRimodulazione;
    private String nuovaDataPrevistaSoluzione;
    private String codiceCausaleSospensione;
    private Date dataSospensione;
    private String descrizioneCausale;
    private String codiceFornitore;
    private String codiceOrdineFornitore;
    private Date dataDRO;
    private Date dataNotifica;
    private String statoOrdine;
    private String codiceOrdineRichiedente;
    private Boolean variation;

    // Many to one
    private OloCps olo;
    private SbcFileResponse file;

    // -- [id] ------------------------

    @Override
    @Column(name = "id", precision = 10)
    @GeneratedValue
    @Id
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public SbcWlrResponse id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [tipoNotifica] ------------------------

    @Size(max = 30)
    @Column(name = "tipoNotifica", length = 30)
    public String getTipoNotifica() {
        return tipoNotifica;
    }

    public void setTipoNotifica(String tipoNotifica) {
        this.tipoNotifica = tipoNotifica;
    }

    public SbcWlrResponse tipoNotifica(String tipoNotifica) {
        setTipoNotifica(tipoNotifica);
        return this;
    }

    // -- [dataEstrazioneWL] ------------------------

    @Column(name = "dataEstrazioneWL", length = 10)
    @Temporal(DATE)
    public Date getDataEstrazioneWL() {
        return dataEstrazioneWL;
    }

    public void setDataEstrazioneWL(Date dataEstrazioneWL) {
        this.dataEstrazioneWL = dataEstrazioneWL;
    }

    public SbcWlrResponse dataEstrazioneWL(Date dataEstrazioneWL) {
        setDataEstrazioneWL(dataEstrazioneWL);
        return this;
    }

    // -- [borchiaISDN] ------------------------

    @Size(max = 30)
    @Column(name = "borchiaISDN", length = 30)
    public String getBorchiaISDN() {
        return borchiaISDN;
    }

    public void setBorchiaISDN(String borchiaISDN) {
        this.borchiaISDN = borchiaISDN;
    }

    public SbcWlrResponse borchiaISDN(String borchiaISDN) {
        setBorchiaISDN(borchiaISDN);
        return this;
    }

    // -- [codicePiattaforma] ------------------------

    @Size(max = 30)
    @Column(name = "codicePiattaforma", length = 30)
    public String getCodicePiattaforma() {
        return codicePiattaforma;
    }

    public void setCodicePiattaforma(String codicePiattaforma) {
        this.codicePiattaforma = codicePiattaforma;
    }

    public SbcWlrResponse codicePiattaforma(String codicePiattaforma) {
        setCodicePiattaforma(codicePiattaforma);
        return this;
    }

    // -- [dataAttivazione] ------------------------

    @Column(name = "dataAttivazione", length = 10)
    @Temporal(DATE)
    public Date getDataAttivazione() {
        return dataAttivazione;
    }

    public void setDataAttivazione(Date dataAttivazione) {
        this.dataAttivazione = dataAttivazione;
    }

    public SbcWlrResponse dataAttivazione(Date dataAttivazione) {
        setDataAttivazione(dataAttivazione);
        return this;
    }

    // -- [dataValidazioneFormaleContrattua] ------------------------

    @Column(name = "dataValidazioneFormaleContrattua", length = 10)
    @Temporal(DATE)
    public Date getDataValidazioneFormaleContrattua() {
        return dataValidazioneFormaleContrattua;
    }

    public void setDataValidazioneFormaleContrattua(Date dataValidazioneFormaleContrattua) {
        this.dataValidazioneFormaleContrattua = dataValidazioneFormaleContrattua;
    }

    public SbcWlrResponse dataValidazioneFormaleContrattua(Date dataValidazioneFormaleContrattua) {
        setDataValidazioneFormaleContrattua(dataValidazioneFormaleContrattua);
        return this;
    }

    // -- [dataValidazioneTecnicoGestionale] ------------------------

    @Column(name = "dataValidazioneTecnicoGestionale", length = 10)
    @Temporal(DATE)
    public Date getDataValidazioneTecnicoGestionale() {
        return dataValidazioneTecnicoGestionale;
    }

    public void setDataValidazioneTecnicoGestionale(Date dataValidazioneTecnicoGestionale) {
        this.dataValidazioneTecnicoGestionale = dataValidazioneTecnicoGestionale;
    }

    public SbcWlrResponse dataValidazioneTecnicoGestionale(Date dataValidazioneTecnicoGestionale) {
        setDataValidazioneTecnicoGestionale(dataValidazioneTecnicoGestionale);
        return this;
    }

    // -- [dn] ------------------------

    @Size(max = 30)
    @Column(name = "dn", length = 30)
    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public SbcWlrResponse dn(String dn) {
        setDn(dn);
        return this;
    }

    // -- [flagLineaBtsNaked] ------------------------

    @Size(max = 30)
    @Column(name = "flagLineaBtsNaked", length = 30)
    public String getFlagLineaBtsNaked() {
        return flagLineaBtsNaked;
    }

    public void setFlagLineaBtsNaked(String flagLineaBtsNaked) {
        this.flagLineaBtsNaked = flagLineaBtsNaked;
    }

    public SbcWlrResponse flagLineaBtsNaked(String flagLineaBtsNaked) {
        setFlagLineaBtsNaked(flagLineaBtsNaked);
        return this;
    }

    // -- [note] ------------------------

    @Size(max = 30)
    @Column(name = "note", length = 30)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public SbcWlrResponse note(String note) {
        setNote(note);
        return this;
    }

    // -- [nuovoDN] ------------------------

    @Size(max = 30)
    @Column(name = "nuovoDN", length = 30)
    public String getNuovoDN() {
        return nuovoDN;
    }

    public void setNuovoDN(String nuovoDN) {
        this.nuovoDN = nuovoDN;
    }

    public SbcWlrResponse nuovoDN(String nuovoDN) {
        setNuovoDN(nuovoDN);
        return this;
    }

    // -- [cognomeReferente] ------------------------

    @Size(max = 30)
    @Column(name = "cognomeReferente", length = 30)
    public String getCognomeReferente() {
        return cognomeReferente;
    }

    public void setCognomeReferente(String cognomeReferente) {
        this.cognomeReferente = cognomeReferente;
    }

    public SbcWlrResponse cognomeReferente(String cognomeReferente) {
        setCognomeReferente(cognomeReferente);
        return this;
    }

    // -- [nomeReferente] ------------------------

    @Size(max = 30)
    @Column(name = "nomeReferente", length = 30)
    public String getNomeReferente() {
        return nomeReferente;
    }

    public void setNomeReferente(String nomeReferente) {
        this.nomeReferente = nomeReferente;
    }

    public SbcWlrResponse nomeReferente(String nomeReferente) {
        setNomeReferente(nomeReferente);
        return this;
    }

    // -- [qualificaRef] ------------------------

    @Size(max = 30)
    @Column(name = "qualificaRef", length = 30)
    public String getQualificaRef() {
        return qualificaRef;
    }

    public void setQualificaRef(String qualificaRef) {
        this.qualificaRef = qualificaRef;
    }

    public SbcWlrResponse qualificaRef(String qualificaRef) {
        setQualificaRef(qualificaRef);
        return this;
    }

    // -- [telefonoFissoReferente] ------------------------

    @Size(max = 30)
    @Column(name = "telefonoFissoReferente", length = 30)
    public String getTelefonoFissoReferente() {
        return telefonoFissoReferente;
    }

    public void setTelefonoFissoReferente(String telefonoFissoReferente) {
        this.telefonoFissoReferente = telefonoFissoReferente;
    }

    public SbcWlrResponse telefonoFissoReferente(String telefonoFissoReferente) {
        setTelefonoFissoReferente(telefonoFissoReferente);
        return this;
    }

    // -- [telefonoMobileReferente] ------------------------

    @Size(max = 30)
    @Column(name = "telefonoMobileReferente", length = 30)
    public String getTelefonoMobileReferente() {
        return telefonoMobileReferente;
    }

    public void setTelefonoMobileReferente(String telefonoMobileReferente) {
        this.telefonoMobileReferente = telefonoMobileReferente;
    }

    public SbcWlrResponse telefonoMobileReferente(String telefonoMobileReferente) {
        setTelefonoMobileReferente(telefonoMobileReferente);
        return this;
    }

    // -- [codiceMotivoRifiuto] ------------------------

    @Size(max = 30)
    @Column(name = "codiceMotivoRifiuto", length = 30)
    public String getCodiceMotivoRifiuto() {
        return codiceMotivoRifiuto;
    }

    public void setCodiceMotivoRifiuto(String codiceMotivoRifiuto) {
        this.codiceMotivoRifiuto = codiceMotivoRifiuto;
    }

    public SbcWlrResponse codiceMotivoRifiuto(String codiceMotivoRifiuto) {
        setCodiceMotivoRifiuto(codiceMotivoRifiuto);
        return this;
    }

    // -- [motivoRifiuto] ------------------------

    @Size(max = 300)
    @Column(name = "motivoRifiuto", length = 300)
    public String getMotivoRifiuto() {
        return motivoRifiuto;
    }

    public void setMotivoRifiuto(String motivoRifiuto) {
        this.motivoRifiuto = motivoRifiuto;
    }

    public SbcWlrResponse motivoRifiuto(String motivoRifiuto) {
        setMotivoRifiuto(motivoRifiuto);
        return this;
    }

    // -- [tipoCausaleRifiuto] ------------------------

    @Size(max = 30)
    @Column(name = "tipoCausaleRifiuto", length = 30)
    public String getTipoCausaleRifiuto() {
        return tipoCausaleRifiuto;
    }

    public void setTipoCausaleRifiuto(String tipoCausaleRifiuto) {
        this.tipoCausaleRifiuto = tipoCausaleRifiuto;
    }

    public SbcWlrResponse tipoCausaleRifiuto(String tipoCausaleRifiuto) {
        setTipoCausaleRifiuto(tipoCausaleRifiuto);
        return this;
    }

    // -- [tipoDn] ------------------------

    @Size(max = 30)
    @Column(name = "tipoDn", length = 30)
    public String getTipoDn() {
        return tipoDn;
    }

    public void setTipoDn(String tipoDn) {
        this.tipoDn = tipoDn;
    }

    public SbcWlrResponse tipoDn(String tipoDn) {
        setTipoDn(tipoDn);
        return this;
    }

    // -- [tipoLinea] ------------------------

    @Size(max = 30)
    @Column(name = "tipoLinea", length = 30)
    public String getTipoLinea() {
        return tipoLinea;
    }

    public void setTipoLinea(String tipoLinea) {
        this.tipoLinea = tipoLinea;
    }

    public SbcWlrResponse tipoLinea(String tipoLinea) {
        setTipoLinea(tipoLinea);
        return this;
    }

    // -- [codiceCausaleAccodamento] ------------------------

    @Size(max = 30)
    @Column(name = "codiceCausaleAccodamento", length = 30)
    public String getCodiceCausaleAccodamento() {
        return codiceCausaleAccodamento;
    }

    public void setCodiceCausaleAccodamento(String codiceCausaleAccodamento) {
        this.codiceCausaleAccodamento = codiceCausaleAccodamento;
    }

    public SbcWlrResponse codiceCausaleAccodamento(String codiceCausaleAccodamento) {
        setCodiceCausaleAccodamento(codiceCausaleAccodamento);
        return this;
    }

    // -- [dataPrevistaSoluzione] ------------------------

    @Column(name = "dataPrevistaSoluzione", length = 10)
    @Temporal(DATE)
    public Date getDataPrevistaSoluzione() {
        return dataPrevistaSoluzione;
    }

    public void setDataPrevistaSoluzione(Date dataPrevistaSoluzione) {
        this.dataPrevistaSoluzione = dataPrevistaSoluzione;
    }

    public SbcWlrResponse dataPrevistaSoluzione(Date dataPrevistaSoluzione) {
        setDataPrevistaSoluzione(dataPrevistaSoluzione);
        return this;
    }

    // -- [descrizioneCausaleAccodamento] ------------------------

    @Size(max = 30)
    @Column(name = "descrizioneCausaleAccodamento", length = 30)
    public String getDescrizioneCausaleAccodamento() {
        return descrizioneCausaleAccodamento;
    }

    public void setDescrizioneCausaleAccodamento(String descrizioneCausaleAccodamento) {
        this.descrizioneCausaleAccodamento = descrizioneCausaleAccodamento;
    }

    public SbcWlrResponse descrizioneCausaleAccodamento(String descrizioneCausaleAccodamento) {
        setDescrizioneCausaleAccodamento(descrizioneCausaleAccodamento);
        return this;
    }

    // -- [dimensioneCoda] ------------------------

    @Size(max = 30)
    @Column(name = "dimensioneCoda", length = 30)
    public String getDimensioneCoda() {
        return dimensioneCoda;
    }

    public void setDimensioneCoda(String dimensioneCoda) {
        this.dimensioneCoda = dimensioneCoda;
    }

    public SbcWlrResponse dimensioneCoda(String dimensioneCoda) {
        setDimensioneCoda(dimensioneCoda);
        return this;
    }

    // -- [posizioneCoda] ------------------------

    @Size(max = 30)
    @Column(name = "posizioneCoda", length = 30)
    public String getPosizioneCoda() {
        return posizioneCoda;
    }

    public void setPosizioneCoda(String posizioneCoda) {
        this.posizioneCoda = posizioneCoda;
    }

    public SbcWlrResponse posizioneCoda(String posizioneCoda) {
        setPosizioneCoda(posizioneCoda);
        return this;
    }

    // -- [codiceCausaleAnnullamento] ------------------------

    @Size(max = 30)
    @Column(name = "codiceCausaleAnnullamento", length = 30)
    public String getCodiceCausaleAnnullamento() {
        return codiceCausaleAnnullamento;
    }

    public void setCodiceCausaleAnnullamento(String codiceCausaleAnnullamento) {
        this.codiceCausaleAnnullamento = codiceCausaleAnnullamento;
    }

    public SbcWlrResponse codiceCausaleAnnullamento(String codiceCausaleAnnullamento) {
        setCodiceCausaleAnnullamento(codiceCausaleAnnullamento);
        return this;
    }

    // -- [taAnnullamento] ------------------------

    @Column(name = "taAnnullamento", length = 10)
    @Temporal(DATE)
    public Date getTaAnnullamento() {
        return taAnnullamento;
    }

    public void setTaAnnullamento(Date taAnnullamento) {
        this.taAnnullamento = taAnnullamento;
    }

    public SbcWlrResponse taAnnullamento(Date taAnnullamento) {
        setTaAnnullamento(taAnnullamento);
        return this;
    }

    // -- [descrizioneCausaleAnnullamento] ------------------------

    @Size(max = 30)
    @Column(name = "descrizioneCausaleAnnullamento", length = 30)
    public String getDescrizioneCausaleAnnullamento() {
        return descrizioneCausaleAnnullamento;
    }

    public void setDescrizioneCausaleAnnullamento(String descrizioneCausaleAnnullamento) {
        this.descrizioneCausaleAnnullamento = descrizioneCausaleAnnullamento;
    }

    public SbcWlrResponse descrizioneCausaleAnnullamento(String descrizioneCausaleAnnullamento) {
        setDescrizioneCausaleAnnullamento(descrizioneCausaleAnnullamento);
        return this;
    }

    // -- [dataEspletamento] ------------------------

    @Column(name = "dataEspletamento", length = 19)
    @Temporal(TIMESTAMP)
    public Date getDataEspletamento() {
        return dataEspletamento;
    }

    public void setDataEspletamento(Date dataEspletamento) {
        this.dataEspletamento = dataEspletamento;
    }

    public SbcWlrResponse dataEspletamento(Date dataEspletamento) {
        setDataEspletamento(dataEspletamento);
        return this;
    }

    // -- [dataContatto] ------------------------

    @Column(name = "dataContatto", length = 10)
    @Temporal(DATE)
    public Date getDataContatto() {
        return dataContatto;
    }

    public void setDataContatto(Date dataContatto) {
        this.dataContatto = dataContatto;
    }

    public SbcWlrResponse dataContatto(Date dataContatto) {
        setDataContatto(dataContatto);
        return this;
    }

    // -- [nuovaDA] ------------------------

    @Size(max = 30)
    @Column(name = "nuovaDA", length = 30)
    public String getNuovaDA() {
        return nuovaDA;
    }

    public void setNuovaDA(String nuovaDA) {
        this.nuovaDA = nuovaDA;
    }

    public SbcWlrResponse nuovaDA(String nuovaDA) {
        setNuovaDA(nuovaDA);
        return this;
    }

    // -- [oraAppuntamento] ------------------------

    @Size(max = 30)
    @Column(name = "oraAppuntamento", length = 30)
    public String getOraAppuntamento() {
        return oraAppuntamento;
    }

    public void setOraAppuntamento(String oraAppuntamento) {
        this.oraAppuntamento = oraAppuntamento;
    }

    public SbcWlrResponse oraAppuntamento(String oraAppuntamento) {
        setOraAppuntamento(oraAppuntamento);
        return this;
    }

    // -- [oraContatto] ------------------------

    @Size(max = 30)
    @Column(name = "oraContatto", length = 30)
    public String getOraContatto() {
        return oraContatto;
    }

    public void setOraContatto(String oraContatto) {
        this.oraContatto = oraContatto;
    }

    public SbcWlrResponse oraContatto(String oraContatto) {
        setOraContatto(oraContatto);
        return this;
    }

    // -- [referenteContattato] ------------------------

    @Size(max = 30)
    @Column(name = "referenteContattato", length = 30)
    public String getReferenteContattato() {
        return referenteContattato;
    }

    public void setReferenteContattato(String referenteContattato) {
        this.referenteContattato = referenteContattato;
    }

    public SbcWlrResponse referenteContattato(String referenteContattato) {
        setReferenteContattato(referenteContattato);
        return this;
    }

    // -- [telefonoReferenteContattato] ------------------------

    @Size(max = 30)
    @Column(name = "telefonoReferenteContattato", length = 30)
    public String getTelefonoReferenteContattato() {
        return telefonoReferenteContattato;
    }

    public void setTelefonoReferenteContattato(String telefonoReferenteContattato) {
        this.telefonoReferenteContattato = telefonoReferenteContattato;
    }

    public SbcWlrResponse telefonoReferenteContattato(String telefonoReferenteContattato) {
        setTelefonoReferenteContattato(telefonoReferenteContattato);
        return this;
    }

    // -- [taInizioLavorazione] ------------------------

    @Column(name = "taInizioLavorazione", length = 10)
    @Temporal(DATE)
    public Date getTaInizioLavorazione() {
        return taInizioLavorazione;
    }

    public void setTaInizioLavorazione(Date taInizioLavorazione) {
        this.taInizioLavorazione = taInizioLavorazione;
    }

    public SbcWlrResponse taInizioLavorazione(Date taInizioLavorazione) {
        setTaInizioLavorazione(taInizioLavorazione);
        return this;
    }

    // -- [fasciaOraria] ------------------------

    @Size(max = 30)
    @Column(name = "fasciaOraria", length = 30)
    public String getFasciaOraria() {
        return fasciaOraria;
    }

    public void setFasciaOraria(String fasciaOraria) {
        this.fasciaOraria = fasciaOraria;
    }

    public SbcWlrResponse fasciaOraria(String fasciaOraria) {
        setFasciaOraria(fasciaOraria);
        return this;
    }

    // -- [nuovaDAC] ------------------------

    @Size(max = 30)
    @Column(name = "nuovaDAC", length = 30)
    public String getNuovaDAC() {
        return nuovaDAC;
    }

    public void setNuovaDAC(String nuovaDAC) {
        this.nuovaDAC = nuovaDAC;
    }

    public SbcWlrResponse nuovaDAC(String nuovaDAC) {
        setNuovaDAC(nuovaDAC);
        return this;
    }

    // -- [flagPermessi] ------------------------

    @Size(max = 30)
    @Column(name = "flagPermessi", length = 30)
    public String getFlagPermessi() {
        return flagPermessi;
    }

    public void setFlagPermessi(String flagPermessi) {
        this.flagPermessi = flagPermessi;
    }

    public SbcWlrResponse flagPermessi(String flagPermessi) {
        setFlagPermessi(flagPermessi);
        return this;
    }

    // -- [giorniPrevisti] ------------------------

    @Size(max = 30)
    @Column(name = "giorniPrevisti", length = 30)
    public String getGiorniPrevisti() {
        return giorniPrevisti;
    }

    public void setGiorniPrevisti(String giorniPrevisti) {
        this.giorniPrevisti = giorniPrevisti;
    }

    public SbcWlrResponse giorniPrevisti(String giorniPrevisti) {
        setGiorniPrevisti(giorniPrevisti);
        return this;
    }

    // -- [codiceCausaleRimodulazione] ------------------------

    @Size(max = 30)
    @Column(name = "codiceCausaleRimodulazione", length = 30)
    public String getCodiceCausaleRimodulazione() {
        return codiceCausaleRimodulazione;
    }

    public void setCodiceCausaleRimodulazione(String codiceCausaleRimodulazione) {
        this.codiceCausaleRimodulazione = codiceCausaleRimodulazione;
    }

    public SbcWlrResponse codiceCausaleRimodulazione(String codiceCausaleRimodulazione) {
        setCodiceCausaleRimodulazione(codiceCausaleRimodulazione);
        return this;
    }

    // -- [descrizioneCausaleRimodulazione] ------------------------

    @Size(max = 30)
    @Column(name = "descrizioneCausaleRimodulazione", length = 30)
    public String getDescrizioneCausaleRimodulazione() {
        return descrizioneCausaleRimodulazione;
    }

    public void setDescrizioneCausaleRimodulazione(String descrizioneCausaleRimodulazione) {
        this.descrizioneCausaleRimodulazione = descrizioneCausaleRimodulazione;
    }

    public SbcWlrResponse descrizioneCausaleRimodulazione(String descrizioneCausaleRimodulazione) {
        setDescrizioneCausaleRimodulazione(descrizioneCausaleRimodulazione);
        return this;
    }

    // -- [nuovaDataPrevistaSoluzione] ------------------------

    @Size(max = 30)
    @Column(name = "nuovaDataPrevistaSoluzione", length = 30)
    public String getNuovaDataPrevistaSoluzione() {
        return nuovaDataPrevistaSoluzione;
    }

    public void setNuovaDataPrevistaSoluzione(String nuovaDataPrevistaSoluzione) {
        this.nuovaDataPrevistaSoluzione = nuovaDataPrevistaSoluzione;
    }

    public SbcWlrResponse nuovaDataPrevistaSoluzione(String nuovaDataPrevistaSoluzione) {
        setNuovaDataPrevistaSoluzione(nuovaDataPrevistaSoluzione);
        return this;
    }

    // -- [codiceCausaleSospensione] ------------------------

    @Size(max = 30)
    @Column(name = "codiceCausaleSospensione", length = 30)
    public String getCodiceCausaleSospensione() {
        return codiceCausaleSospensione;
    }

    public void setCodiceCausaleSospensione(String codiceCausaleSospensione) {
        this.codiceCausaleSospensione = codiceCausaleSospensione;
    }

    public SbcWlrResponse codiceCausaleSospensione(String codiceCausaleSospensione) {
        setCodiceCausaleSospensione(codiceCausaleSospensione);
        return this;
    }

    // -- [dataSospensione] ------------------------

    @Column(name = "dataSospensione", length = 10)
    @Temporal(DATE)
    public Date getDataSospensione() {
        return dataSospensione;
    }

    public void setDataSospensione(Date dataSospensione) {
        this.dataSospensione = dataSospensione;
    }

    public SbcWlrResponse dataSospensione(Date dataSospensione) {
        setDataSospensione(dataSospensione);
        return this;
    }

    // -- [descrizioneCausale] ------------------------

    @Size(max = 30)
    @Column(name = "descrizioneCausale", length = 30)
    public String getDescrizioneCausale() {
        return descrizioneCausale;
    }

    public void setDescrizioneCausale(String descrizioneCausale) {
        this.descrizioneCausale = descrizioneCausale;
    }

    public SbcWlrResponse descrizioneCausale(String descrizioneCausale) {
        setDescrizioneCausale(descrizioneCausale);
        return this;
    }

    // -- [codiceFornitore] ------------------------

    @Size(max = 30)
    @Column(name = "codiceFornitore", length = 30)
    public String getCodiceFornitore() {
        return codiceFornitore;
    }

    public void setCodiceFornitore(String codiceFornitore) {
        this.codiceFornitore = codiceFornitore;
    }

    public SbcWlrResponse codiceFornitore(String codiceFornitore) {
        setCodiceFornitore(codiceFornitore);
        return this;
    }

    // -- [codiceOrdineFornitore] ------------------------

    @Size(max = 30)
    @Column(name = "codiceOrdineFornitore", length = 30)
    public String getCodiceOrdineFornitore() {
        return codiceOrdineFornitore;
    }

    public void setCodiceOrdineFornitore(String codiceOrdineFornitore) {
        this.codiceOrdineFornitore = codiceOrdineFornitore;
    }

    public SbcWlrResponse codiceOrdineFornitore(String codiceOrdineFornitore) {
        setCodiceOrdineFornitore(codiceOrdineFornitore);
        return this;
    }

    // -- [dataDRO] ------------------------

    @Column(name = "dataDRO", length = 10)
    @Temporal(DATE)
    public Date getDataDRO() {
        return dataDRO;
    }

    public void setDataDRO(Date dataDRO) {
        this.dataDRO = dataDRO;
    }

    public SbcWlrResponse dataDRO(Date dataDRO) {
        setDataDRO(dataDRO);
        return this;
    }

    // -- [dataNotifica] ------------------------

    @Column(name = "dataNotifica", length = 10)
    @Temporal(DATE)
    public Date getDataNotifica() {
        return dataNotifica;
    }

    public void setDataNotifica(Date dataNotifica) {
        this.dataNotifica = dataNotifica;
    }

    public SbcWlrResponse dataNotifica(Date dataNotifica) {
        setDataNotifica(dataNotifica);
        return this;
    }

    // -- [statoOrdine] ------------------------

    @Size(max = 30)
    @Column(name = "statoOrdine", length = 30)
    public String getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(String statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    public SbcWlrResponse statoOrdine(String statoOrdine) {
        setStatoOrdine(statoOrdine);
        return this;
    }

    // -- [codiceOrdineRichiedente] ------------------------

    @Size(max = 30)
    @Column(name = "codiceOrdineRichiedente", length = 30)
    public String getCodiceOrdineRichiedente() {
        return codiceOrdineRichiedente;
    }

    public void setCodiceOrdineRichiedente(String codiceOrdineRichiedente) {
        this.codiceOrdineRichiedente = codiceOrdineRichiedente;
    }

    public SbcWlrResponse codiceOrdineRichiedente(String codiceOrdineRichiedente) {
        setCodiceOrdineRichiedente(codiceOrdineRichiedente);
        return this;
    }

    // -- [variation] ------------------------

    @Column(name = "variation", length = 1)
    public Boolean getVariation() {
        return variation;
    }

    public void setVariation(Boolean variation) {
        this.variation = variation;
    }

    public SbcWlrResponse variation(Boolean variation) {
        setVariation(variation);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: SbcWlrResponse.olo ==> OloCps.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "olo")
    @ManyToOne(cascade = { PERSIST, MERGE }, fetch = LAZY)
    public OloCps getOlo() {
        return olo;
    }

    /**
     * Set the {@link #olo} without adding this SbcWlrResponse instance on the passed {@link #olo}
     */
    public void setOlo(OloCps olo) {
        this.olo = olo;
    }

    public SbcWlrResponse olo(OloCps olo) {
        setOlo(olo);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: SbcWlrResponse.file ==> SbcFileResponse.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "file_Id")
    @ManyToOne(cascade = { PERSIST, MERGE }, fetch = LAZY)
    public SbcFileResponse getFile() {
        return file;
    }

    /**
     * Set the {@link #file} without adding this SbcWlrResponse instance on the passed {@link #file}
     */
    public void setFile(SbcFileResponse file) {
        this.file = file;
    }

    public SbcWlrResponse file(SbcFileResponse file) {
        setFile(file);
        return this;
    }

    /**
     * Apply the default values.
     */
    public SbcWlrResponse withDefaults() {
        setVariation(false);
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof SbcWlrResponse && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this SbcWlrResponse instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("id", getId()) //
                .add("tipoNotifica", getTipoNotifica()) //
                .add("dataEstrazioneWL", getDataEstrazioneWL()) //
                .add("borchiaISDN", getBorchiaISDN()) //
                .add("codicePiattaforma", getCodicePiattaforma()) //
                .add("dataAttivazione", getDataAttivazione()) //
                .add("dataValidazioneFormaleContrattua", getDataValidazioneFormaleContrattua()) //
                .add("dataValidazioneTecnicoGestionale", getDataValidazioneTecnicoGestionale()) //
                .add("dn", getDn()) //
                .add("flagLineaBtsNaked", getFlagLineaBtsNaked()) //
                .add("note", getNote()) //
                .add("nuovoDN", getNuovoDN()) //
                .add("cognomeReferente", getCognomeReferente()) //
                .add("nomeReferente", getNomeReferente()) //
                .add("qualificaRef", getQualificaRef()) //
                .add("telefonoFissoReferente", getTelefonoFissoReferente()) //
                .add("telefonoMobileReferente", getTelefonoMobileReferente()) //
                .add("codiceMotivoRifiuto", getCodiceMotivoRifiuto()) //
                .add("motivoRifiuto", getMotivoRifiuto()) //
                .add("tipoCausaleRifiuto", getTipoCausaleRifiuto()) //
                .add("tipoDn", getTipoDn()) //
                .add("tipoLinea", getTipoLinea()) //
                .add("codiceCausaleAccodamento", getCodiceCausaleAccodamento()) //
                .add("dataPrevistaSoluzione", getDataPrevistaSoluzione()) //
                .add("descrizioneCausaleAccodamento", getDescrizioneCausaleAccodamento()) //
                .add("dimensioneCoda", getDimensioneCoda()) //
                .add("posizioneCoda", getPosizioneCoda()) //
                .add("codiceCausaleAnnullamento", getCodiceCausaleAnnullamento()) //
                .add("taAnnullamento", getTaAnnullamento()) //
                .add("descrizioneCausaleAnnullamento", getDescrizioneCausaleAnnullamento()) //
                .add("dataEspletamento", getDataEspletamento()) //
                .add("dataContatto", getDataContatto()) //
                .add("nuovaDA", getNuovaDA()) //
                .add("oraAppuntamento", getOraAppuntamento()) //
                .add("oraContatto", getOraContatto()) //
                .add("referenteContattato", getReferenteContattato()) //
                .add("telefonoReferenteContattato", getTelefonoReferenteContattato()) //
                .add("taInizioLavorazione", getTaInizioLavorazione()) //
                .add("fasciaOraria", getFasciaOraria()) //
                .add("nuovaDAC", getNuovaDAC()) //
                .add("flagPermessi", getFlagPermessi()) //
                .add("giorniPrevisti", getGiorniPrevisti()) //
                .add("codiceCausaleRimodulazione", getCodiceCausaleRimodulazione()) //
                .add("descrizioneCausaleRimodulazione", getDescrizioneCausaleRimodulazione()) //
                .add("nuovaDataPrevistaSoluzione", getNuovaDataPrevistaSoluzione()) //
                .add("codiceCausaleSospensione", getCodiceCausaleSospensione()) //
                .add("dataSospensione", getDataSospensione()) //
                .add("descrizioneCausale", getDescrizioneCausale()) //
                .add("codiceFornitore", getCodiceFornitore()) //
                .add("codiceOrdineFornitore", getCodiceOrdineFornitore()) //
                .add("dataDRO", getDataDRO()) //
                .add("dataNotifica", getDataNotifica()) //
                .add("statoOrdine", getStatoOrdine()) //
                .add("codiceOrdineRichiedente", getCodiceOrdineRichiedente()) //
                .add("variation", getVariation()) //
                .toString();
    }
}