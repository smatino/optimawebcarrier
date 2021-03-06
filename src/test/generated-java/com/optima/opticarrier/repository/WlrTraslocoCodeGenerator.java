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

import com.optima.opticarrier.domain.WlrTraslocoCode;
import com.optima.opticarrier.util.ValueGenerator;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@Named
@Singleton
public class WlrTraslocoCodeGenerator {

    /**
     * Returns a new WlrTraslocoCode instance filled with random values.
     */
    public WlrTraslocoCode getWlrTraslocoCode() {
        WlrTraslocoCode wlrTraslocoCode = new WlrTraslocoCode();

        // primary key column must be set manually
        wlrTraslocoCode.setId(ValueGenerator.getUniqueString(20));
        // simple attributes follows
        wlrTraslocoCode.setTelecomSts("a");
        return wlrTraslocoCode;
    }

}