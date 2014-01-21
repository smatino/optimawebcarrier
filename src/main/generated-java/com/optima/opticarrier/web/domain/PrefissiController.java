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

import com.optima.opticarrier.domain.Prefissi;
import com.optima.opticarrier.printer.PrefissiPrinter;
import com.optima.opticarrier.repository.PrefissiRepository;
import com.optima.opticarrier.web.domain.support.GenericController;
import com.optima.opticarrier.web.permission.PrefissiPermission;

/**
 * Stateless controller for {@link Prefissi} conversation start.
 */
@Named
@Singleton
public class PrefissiController extends GenericController<Prefissi, String> {
    public static final String PREFISSI_EDIT_URI = "/domain/prefissiEdit.faces";
    public static final String PREFISSI_SELECT_URI = "/domain/prefissiSelect.faces";

    @Inject
    public PrefissiController(PrefissiRepository prefissiRepository, PrefissiPermission prefissiPermission, PrefissiPrinter prefissiPrinter) {
        super(prefissiRepository, prefissiPermission, prefissiPrinter, PREFISSI_SELECT_URI, PREFISSI_EDIT_URI);
    }
}