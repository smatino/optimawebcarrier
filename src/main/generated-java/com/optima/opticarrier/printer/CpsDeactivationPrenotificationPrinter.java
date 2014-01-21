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

import com.optima.opticarrier.domain.CpsDeactivationPrenotification;
import com.optima.opticarrier.domain.CpsDeactivationPrenotification_;
import com.optima.opticarrier.printer.support.GenericPrinter;

/**
 * {@link GenericPrinter} for {@link CpsDeactivationPrenotification} 
 *
 * @see GenericPrinter
 * @see TypeAwarePrinter
 */
@Named
@Singleton
public class CpsDeactivationPrenotificationPrinter extends GenericPrinter<CpsDeactivationPrenotification> {
    public CpsDeactivationPrenotificationPrinter() {
        super(CpsDeactivationPrenotification.class, CpsDeactivationPrenotification_.codiceFornitore, CpsDeactivationPrenotification_.codiceOrdineFornitore,
                CpsDeactivationPrenotification_.dn);
    }

    @Override
    public String print(CpsDeactivationPrenotification cpsDeactivationPrenotification, Locale locale) {
        if (cpsDeactivationPrenotification == null) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        appendIfNotEmpty(ret, cpsDeactivationPrenotification.getCodiceFornitore());
        appendIfNotEmpty(ret, cpsDeactivationPrenotification.getCodiceOrdineFornitore());
        appendIfNotEmpty(ret, cpsDeactivationPrenotification.getDn());
        return ret.toString();
    }
}