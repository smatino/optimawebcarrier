/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/GraphLoader.e.vm.java
 */
package com.optima.opticarrier.web.domain;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.optima.opticarrier.domain.CpsQuoteResponse;
import com.optima.opticarrier.repository.CpsQuoteResponseRepository;
import com.optima.opticarrier.repository.support.EntityGraphLoader;

/**
 * Preloads the {@link CpsQuoteResponse} associations required by the view layer.
 * 
 * Do not use other GraphLoaders in this GraphLoader. 
 */
@Named
@Singleton
public class CpsQuoteResponseGraphLoader extends EntityGraphLoader<CpsQuoteResponse, Integer> {
    // required by cglib to create a proxy around the object as we are using the @Transactional annotation
    protected CpsQuoteResponseGraphLoader() {
        super();
    }

    @Inject
    public CpsQuoteResponseGraphLoader(CpsQuoteResponseRepository cpsQuoteResponseRepository) {
        super(cpsQuoteResponseRepository);
    }

    @Override
    public void loadGraph(CpsQuoteResponse cpsQuoteResponse) {
        loadSingular(cpsQuoteResponse.getFile());
        loadSingular(cpsQuoteResponse.getOlo());
    }
}