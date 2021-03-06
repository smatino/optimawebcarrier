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

import com.optima.opticarrier.domain.SbcCpsResponse;
import com.optima.opticarrier.repository.support.GenericRepository;

/**
 * {@link GenericRepository} for {@link SbcCpsResponse} 
 */
@Named
@Singleton
public class SbcCpsResponseRepository extends GenericRepository<SbcCpsResponse, Integer> {

    public SbcCpsResponseRepository() {
        super(SbcCpsResponse.class);
    }

    @Override
    public SbcCpsResponse getNew() {
        return new SbcCpsResponse();
    }

    @Override
    public SbcCpsResponse getNewWithDefaults() {
        return getNew().withDefaults();
    }
}