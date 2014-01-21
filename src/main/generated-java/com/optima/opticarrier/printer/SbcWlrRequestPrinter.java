/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/printer/Printer.e.vm.java
 */
package com.optima.opticarrier.printer;

import java.util.Locale;

import javax.inject.Named;
import javax.inject.Singleton;

import com.optima.opticarrier.domain.SbcWlrRequest;
import com.optima.opticarrier.domain.SbcWlrRequest_;
import com.optima.opticarrier.printer.support.GenericPrinter;

/**
 * {@link GenericPrinter} for {@link SbcWlrRequest} 
 *
 * @see GenericPrinter
 * @see TypeAwarePrinter
 */
@Named
@Singleton
public class SbcWlrRequestPrinter extends GenericPrinter<SbcWlrRequest> {
    public SbcWlrRequestPrinter() {
        super(SbcWlrRequest.class, SbcWlrRequest_.progressivoRichiesta);
    }

    @Override
    public String print(SbcWlrRequest sbcWlrRequest, Locale locale) {
        if (sbcWlrRequest == null) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        appendIfNotEmpty(ret, sbcWlrRequest.getProgressivoRichiesta());
        return ret.toString();
    }
}