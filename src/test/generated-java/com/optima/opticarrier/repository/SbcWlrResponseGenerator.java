/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/test/java/service/ModelGenerator.e.vm.java
 */
package com.optima.opticarrier.repository;

import java.util.Date;

import javax.inject.Named;
import javax.inject.Singleton;

import com.optima.opticarrier.domain.SbcWlrResponse;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@Named
@Singleton
public class SbcWlrResponseGenerator {

    /**
     * Returns a new SbcWlrResponse instance filled with random values.
     */
    public SbcWlrResponse getSbcWlrResponse() {
        SbcWlrResponse sbcWlrResponse = new SbcWlrResponse();

        // simple attributes follows
        sbcWlrResponse.setTipoNotifica("a");
        sbcWlrResponse.setDataEstrazioneWL(new Date());
        sbcWlrResponse.setBorchiaISDN("a");
        sbcWlrResponse.setCodicePiattaforma("a");
        sbcWlrResponse.setDataAttivazione(new Date());
        sbcWlrResponse.setDataValidazioneFormaleContrattua(new Date());
        sbcWlrResponse.setDataValidazioneTecnicoGestionale(new Date());
        sbcWlrResponse.setDn("a");
        sbcWlrResponse.setFlagLineaBtsNaked("a");
        sbcWlrResponse.setNote("a");
        sbcWlrResponse.setNuovoDN("a");
        sbcWlrResponse.setCognomeReferente("a");
        sbcWlrResponse.setNomeReferente("a");
        sbcWlrResponse.setQualificaRef("a");
        sbcWlrResponse.setTelefonoFissoReferente("a");
        sbcWlrResponse.setTelefonoMobileReferente("a");
        sbcWlrResponse.setCodiceMotivoRifiuto("a");
        sbcWlrResponse.setMotivoRifiuto("a");
        sbcWlrResponse.setTipoCausaleRifiuto("a");
        sbcWlrResponse.setTipoDn("a");
        sbcWlrResponse.setTipoLinea("a");
        sbcWlrResponse.setCodiceCausaleAccodamento("a");
        sbcWlrResponse.setDataPrevistaSoluzione(new Date());
        sbcWlrResponse.setDescrizioneCausaleAccodamento("a");
        sbcWlrResponse.setDimensioneCoda("a");
        sbcWlrResponse.setPosizioneCoda("a");
        sbcWlrResponse.setCodiceCausaleAnnullamento("a");
        sbcWlrResponse.setTaAnnullamento(new Date());
        sbcWlrResponse.setDescrizioneCausaleAnnullamento("a");
        sbcWlrResponse.setDataEspletamento(new Date());
        sbcWlrResponse.setDataContatto(new Date());
        sbcWlrResponse.setNuovaDA("a");
        sbcWlrResponse.setOraAppuntamento("a");
        sbcWlrResponse.setOraContatto("a");
        sbcWlrResponse.setReferenteContattato("a");
        sbcWlrResponse.setTelefonoReferenteContattato("a");
        sbcWlrResponse.setTaInizioLavorazione(new Date());
        sbcWlrResponse.setFasciaOraria("a");
        sbcWlrResponse.setNuovaDAC("a");
        sbcWlrResponse.setFlagPermessi("a");
        sbcWlrResponse.setGiorniPrevisti("a");
        sbcWlrResponse.setCodiceCausaleRimodulazione("a");
        sbcWlrResponse.setDescrizioneCausaleRimodulazione("a");
        sbcWlrResponse.setNuovaDataPrevistaSoluzione("a");
        sbcWlrResponse.setCodiceCausaleSospensione("a");
        sbcWlrResponse.setDataSospensione(new Date());
        sbcWlrResponse.setDescrizioneCausale("a");
        sbcWlrResponse.setCodiceFornitore("a");
        sbcWlrResponse.setCodiceOrdineFornitore("a");
        sbcWlrResponse.setDataDRO(new Date());
        sbcWlrResponse.setDataNotifica(new Date());
        sbcWlrResponse.setStatoOrdine("a");
        sbcWlrResponse.setCodiceOrdineRichiedente("a");
        sbcWlrResponse.setVariation(true);
        return sbcWlrResponse;
    }

}