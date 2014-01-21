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

import org.springframework.transaction.annotation.Transactional;

import com.optima.opticarrier.domain.SbcWlrRequest;
import com.optima.opticarrier.repository.support.GenericRepository;

/**
 * {@link GenericRepository} for {@link SbcWlrRequest} 
 */
@Named
@Singleton
public class SbcWlrRequestRepository extends GenericRepository<SbcWlrRequest, Integer> {

    public SbcWlrRequestRepository() {
        super(SbcWlrRequest.class);
    }

    @Override
    public SbcWlrRequest getNew() {
        return new SbcWlrRequest();
    }

    @Override
    public SbcWlrRequest getNewWithDefaults() {
        return getNew().withDefaults();
    }

    /**
     * Return the persistent instance of {@link SbcWlrRequest} with the given unique property value progressivoRichiesta,
     * or null if there is no such persistent instance.
     *
     * @param progressivoRichiesta the unique value
     * @return the corresponding {@link SbcWlrRequest} persistent instance or null
     */
    @Transactional(readOnly = true)
    public SbcWlrRequest getByProgressivoRichiesta(String progressivoRichiesta) {
        return findUniqueOrNone(new SbcWlrRequest().progressivoRichiesta(progressivoRichiesta));
    }

    /**
     * Delete a {@link SbcWlrRequest} using the unique column progressivoRichiesta
     *
     * @param progressivoRichiesta the unique value
     */
    @Transactional
    public void deleteByProgressivoRichiesta(String progressivoRichiesta) {
        delete(getByProgressivoRichiesta(progressivoRichiesta));
    }
}