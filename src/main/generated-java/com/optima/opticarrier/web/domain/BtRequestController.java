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

import com.optima.opticarrier.domain.BtRequest;
import com.optima.opticarrier.printer.BtRequestPrinter;
import com.optima.opticarrier.repository.BtRequestRepository;
import com.optima.opticarrier.web.domain.support.GenericController;
import com.optima.opticarrier.web.permission.BtRequestPermission;

/**
 * Stateless controller for {@link BtRequest} conversation start.
 */
@Named
@Singleton
public class BtRequestController extends GenericController<BtRequest, Integer> {
    public static final String BTREQUEST_EDIT_URI = "/domain/btRequestEdit.faces";
    public static final String BTREQUEST_SELECT_URI = "/domain/btRequestSelect.faces";

    @Inject
    public BtRequestController(BtRequestRepository btRequestRepository, BtRequestPermission btRequestPermission, BtRequestPrinter btRequestPrinter) {
        super(btRequestRepository, btRequestPermission, btRequestPrinter, BTREQUEST_SELECT_URI, BTREQUEST_EDIT_URI);
    }
}