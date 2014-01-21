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

import com.optima.opticarrier.domain.SbcCpsRequest;
import com.optima.opticarrier.domain.SbcCpsRequest_;
import com.optima.opticarrier.printer.SbcCpsRequestPrinter;
import com.optima.opticarrier.repository.SbcCpsRequestRepository;
import com.optima.opticarrier.repository.support.SearchParameters;
import com.optima.opticarrier.web.domain.support.GenericController;
import com.optima.opticarrier.web.permission.SbcCpsRequestPermission;

/**
 * Stateless controller for {@link SbcCpsRequest} conversation start.
 */
@Named
@Singleton
public class SbcCpsRequestController extends GenericController<SbcCpsRequest, Integer> {
    public static final String SBCCPSREQUEST_EDIT_URI = "/domain/sbcCpsRequestEdit.faces";
    public static final String SBCCPSREQUEST_SELECT_URI = "/domain/sbcCpsRequestSelect.faces";

    @Inject
    public SbcCpsRequestController(SbcCpsRequestRepository sbcCpsRequestRepository, SbcCpsRequestPermission sbcCpsRequestPermission,
            SbcCpsRequestPrinter sbcCpsRequestPrinter) {
        super(sbcCpsRequestRepository, sbcCpsRequestPermission, sbcCpsRequestPrinter, SBCCPSREQUEST_SELECT_URI, SBCCPSREQUEST_EDIT_URI);
    }

    @Override
    protected SearchParameters defaultOrder(SearchParameters searchParameters) {
        return searchParameters.asc(SbcCpsRequest_.requestId);
    }
}