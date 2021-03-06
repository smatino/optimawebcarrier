/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/repository/Repository.e.vm.java
 */
package com.optima.opticarrier.repository;

import javax.inject.Named;
import javax.inject.Singleton;

import com.optima.opticarrier.domain.BtRequest;
import com.optima.opticarrier.repository.support.GenericRepository;

/**
 * {@link GenericRepository} for {@link BtRequest} 
 */
@Named
@Singleton
public class BtRequestRepository extends GenericRepository<BtRequest, Integer> {

    public BtRequestRepository() {
        super(BtRequest.class);
    }

    @Override
    public BtRequest getNew() {
        return new BtRequest();
    }

    @Override
    public BtRequest getNewWithDefaults() {
        return getNew().withDefaults();
    }
}