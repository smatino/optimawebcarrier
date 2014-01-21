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

import com.optima.opticarrier.domain.SbcWlrRequest;
import com.optima.opticarrier.util.ValueGenerator;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@Named
@Singleton
public class SbcWlrRequestGenerator {

    /**
     * Returns a new SbcWlrRequest instance filled with random values.
     */
    public SbcWlrRequest getSbcWlrRequest() {
        SbcWlrRequest sbcWlrRequest = new SbcWlrRequest();

        // simple attributes follows
        sbcWlrRequest.setProgressivoRichiesta(ValueGenerator.getUniqueString(20));
        sbcWlrRequest.setActionType(1);
        sbcWlrRequest.setWlrType(1);
        sbcWlrRequest.setDn("a");
        sbcWlrRequest.setFlagmantenimentoProdotto(1);
        sbcWlrRequest.setDatasottoscrizioneContratto(new Date());
        sbcWlrRequest.setCustomerSurname("a");
        sbcWlrRequest.setParticellaToponomastica("a");
        sbcWlrRequest.setVia("a");
        sbcWlrRequest.setCivico("a");
        sbcWlrRequest.setLocalita("a");
        sbcWlrRequest.setCodiceComune("a");
        sbcWlrRequest.setCfPiva("a");
        sbcWlrRequest.setDataDac(new Date());
        sbcWlrRequest.setTypeService("a");
        sbcWlrRequest.setTipeLine("a");
        sbcWlrRequest.setAmount(1);
        sbcWlrRequest.setCustomerPhone("a");
        sbcWlrRequest.setError("a");
        sbcWlrRequest.setCreationDate(new Date());
        sbcWlrRequest.setRientro(1);
        sbcWlrRequest.setBtExecuted(true);
        sbcWlrRequest.setSentToTelecom(true);
        return sbcWlrRequest;
    }

}