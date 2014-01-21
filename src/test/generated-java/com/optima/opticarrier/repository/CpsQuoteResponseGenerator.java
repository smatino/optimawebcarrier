/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/test/java/service/ModelGenerator.e.vm.java
 */
package com.optima.opticarrier.repository;

import javax.inject.Named;
import javax.inject.Singleton;

import com.optima.opticarrier.domain.CpsQuoteResponse;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@Named
@Singleton
public class CpsQuoteResponseGenerator {

    /**
     * Returns a new CpsQuoteResponse instance filled with random values.
     */
    public CpsQuoteResponse getCpsQuoteResponse() {
        CpsQuoteResponse cpsQuoteResponse = new CpsQuoteResponse();

        // simple attributes follows
        cpsQuoteResponse.setCodiceArea("ddddd");
        cpsQuoteResponse.setDescrizioneArea("dddddddddddddddddddddddddddddd");
        cpsQuoteResponse.setQuantitaRichesta(1);
        cpsQuoteResponse.setVolumiMensiliAssegnati(1);
        cpsQuoteResponse.setTolleranzaMensile(1);
        cpsQuoteResponse.setVolumiGiornalieriAssegnati(1);
        cpsQuoteResponse.setTolleranzaGiornaliera(1);
        cpsQuoteResponse.setGiorniLavorativi(1);
        return cpsQuoteResponse;
    }

}