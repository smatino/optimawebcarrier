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

import com.optima.opticarrier.domain.BtRequest;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@Named
@Singleton
public class BtRequestGenerator {

    /**
     * Returns a new BtRequest instance filled with random values.
     */
    public BtRequest getBtRequest() {
        BtRequest btRequest = new BtRequest();

        // simple attributes follows
        btRequest.setXml("a");
        btRequest.setStatus("a");
        btRequest.setDateInsert(new Date());
        btRequest.setFileId(1);
        return btRequest;
    }

}