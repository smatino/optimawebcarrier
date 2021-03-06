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

import com.optima.opticarrier.domain.WlrRequestAggiuntivis;
import com.optima.opticarrier.domain.WlrRequestAggiuntivis_;
import com.optima.opticarrier.printer.support.GenericPrinter;

/**
 * {@link GenericPrinter} for {@link WlrRequestAggiuntivis} 
 *
 * @see GenericPrinter
 * @see TypeAwarePrinter
 */
@Named
@Singleton
public class WlrRequestAggiuntivisPrinter extends GenericPrinter<WlrRequestAggiuntivis> {
    public WlrRequestAggiuntivisPrinter() {
        super(WlrRequestAggiuntivis.class, WlrRequestAggiuntivis_.aggiuntivi);
    }

    @Override
    public String print(WlrRequestAggiuntivis wlrRequestAggiuntivis, Locale locale) {
        if (wlrRequestAggiuntivis == null) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        appendIfNotEmpty(ret, wlrRequestAggiuntivis.getAggiuntivi());
        return ret.toString();
    }
}