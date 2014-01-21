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

import com.optima.opticarrier.domain.CpsDeactivationPrenotification;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@Named
@Singleton
public class CpsDeactivationPrenotificationGenerator {

    /**
     * Returns a new CpsDeactivationPrenotification instance filled with random values.
     */
    public CpsDeactivationPrenotification getCpsDeactivationPrenotification() {
        CpsDeactivationPrenotification cpsDeactivationPrenotification = new CpsDeactivationPrenotification();

        // simple attributes follows
        cpsDeactivationPrenotification.setCodiceFornitore("a");
        cpsDeactivationPrenotification.setCodiceOrdineFornitore("a");
        cpsDeactivationPrenotification.setDataNotifica(new Date());
        cpsDeactivationPrenotification.setDn("a");
        cpsDeactivationPrenotification.setDataSottoscrizioneContratto(new Date());
        cpsDeactivationPrenotification.setDataPrevistaCessazione(new Date());
        cpsDeactivationPrenotification.setCognomeRagSoc("a");
        cpsDeactivationPrenotification.setNome("a");
        cpsDeactivationPrenotification.setDataRichiestaCessazione(new Date());
        cpsDeactivationPrenotification.setStatus("dddddddddddddddddddddddddddddddddddddddddddddddddd");
        return cpsDeactivationPrenotification;
    }

}