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

import com.optima.opticarrier.domain.WlrRequestAggiuntivis;
import com.optima.opticarrier.repository.WlrRequestAggiuntivisRepository;
import com.optima.opticarrier.repository.support.EntityGraphLoader;

/**
 * Preloads the {@link WlrRequestAggiuntivis} associations required by the view layer.
 * 
 * Do not use other GraphLoaders in this GraphLoader. 
 */
@Named
@Singleton
public class WlrRequestAggiuntivisGraphLoader extends EntityGraphLoader<WlrRequestAggiuntivis, Integer> {
    // required by cglib to create a proxy around the object as we are using the @Transactional annotation
    protected WlrRequestAggiuntivisGraphLoader() {
        super();
    }

    @Inject
    public WlrRequestAggiuntivisGraphLoader(WlrRequestAggiuntivisRepository wlrRequestAggiuntivisRepository) {
        super(wlrRequestAggiuntivisRepository);
    }

    @Override
    public void loadGraph(WlrRequestAggiuntivis wlrRequestAggiuntivis) {
        loadSingular(wlrRequestAggiuntivis.getRequest());
    }
}