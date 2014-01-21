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

import com.optima.opticarrier.domain.SbcCpsRequest;
import com.optima.opticarrier.util.ValueGenerator;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@Named
@Singleton
public class SbcCpsRequestGenerator {

    /**
     * Returns a new SbcCpsRequest instance filled with random values.
     */
    public SbcCpsRequest getSbcCpsRequest() {
        SbcCpsRequest sbcCpsRequest = new SbcCpsRequest();

        // simple attributes follows
        sbcCpsRequest.setCli("a");
        sbcCpsRequest.setRequestId(ValueGenerator.getUniqueString(20));
        sbcCpsRequest.setTipoOperazione("d");
        sbcCpsRequest.setTipoServizio("a");
        sbcCpsRequest.setTipoLinea("a");
        sbcCpsRequest.setTipoAttivazione("a");
        sbcCpsRequest.setDataCreazione(new Date());
        sbcCpsRequest.setNumeroLinee(1);
        sbcCpsRequest.setUserInformation("a");
        sbcCpsRequest.setCodiceErrore(1);
        sbcCpsRequest
                .setDescrizioneErrore("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        sbcCpsRequest.setStatoOrdine("a");
        sbcCpsRequest.setTipoNotifica("a");
        return sbcCpsRequest;
    }

}