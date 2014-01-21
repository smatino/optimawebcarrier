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

import com.optima.opticarrier.domain.CpsQuoteResponse;
import com.optima.opticarrier.domain.CpsQuoteResponse_;
import com.optima.opticarrier.printer.support.GenericPrinter;

/**
 * {@link GenericPrinter} for {@link CpsQuoteResponse} 
 *
 * @see GenericPrinter
 * @see TypeAwarePrinter
 */
@Named
@Singleton
public class CpsQuoteResponsePrinter extends GenericPrinter<CpsQuoteResponse> {
    public CpsQuoteResponsePrinter() {
        super(CpsQuoteResponse.class, CpsQuoteResponse_.codiceArea, CpsQuoteResponse_.descrizioneArea);
    }

    @Override
    public String print(CpsQuoteResponse cpsQuoteResponse, Locale locale) {
        if (cpsQuoteResponse == null) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        appendIfNotEmpty(ret, cpsQuoteResponse.getCodiceArea());
        appendIfNotEmpty(ret, cpsQuoteResponse.getDescrizioneArea());
        return ret.toString();
    }
}