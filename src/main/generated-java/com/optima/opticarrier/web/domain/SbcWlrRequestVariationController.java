/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/Controller.e.vm.java
 */
package com.optima.opticarrier.web.domain;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.optima.opticarrier.domain.SbcWlrRequestVariation;
import com.optima.opticarrier.printer.SbcWlrRequestVariationPrinter;
import com.optima.opticarrier.repository.SbcWlrRequestVariationRepository;
import com.optima.opticarrier.web.domain.support.GenericController;
import com.optima.opticarrier.web.permission.SbcWlrRequestVariationPermission;

/**
 * Stateless controller for {@link SbcWlrRequestVariation} conversation start.
 */
@Named
@Singleton
public class SbcWlrRequestVariationController extends GenericController<SbcWlrRequestVariation, Integer> {
    public static final String SBCWLRREQUESTVARIATION_EDIT_URI = "/domain/sbcWlrRequestVariationEdit.faces";
    public static final String SBCWLRREQUESTVARIATION_SELECT_URI = "/domain/sbcWlrRequestVariationSelect.faces";

    @Inject
    public SbcWlrRequestVariationController(SbcWlrRequestVariationRepository sbcWlrRequestVariationRepository,
            SbcWlrRequestVariationPermission sbcWlrRequestVariationPermission, SbcWlrRequestVariationPrinter sbcWlrRequestVariationPrinter) {
        super(sbcWlrRequestVariationRepository, sbcWlrRequestVariationPermission, sbcWlrRequestVariationPrinter, SBCWLRREQUESTVARIATION_SELECT_URI,
                SBCWLRREQUESTVARIATION_EDIT_URI);
    }
}