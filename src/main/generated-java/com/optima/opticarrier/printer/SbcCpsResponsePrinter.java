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

import com.optima.opticarrier.domain.SbcCpsResponse;
import com.optima.opticarrier.domain.SbcCpsResponse_;
import com.optima.opticarrier.printer.support.GenericPrinter;

/**
 * {@link GenericPrinter} for {@link SbcCpsResponse} 
 *
 * @see GenericPrinter
 * @see TypeAwarePrinter
 */
@Named
@Singleton
public class SbcCpsResponsePrinter extends GenericPrinter<SbcCpsResponse> {
    public SbcCpsResponsePrinter() {
        super(SbcCpsResponse.class, SbcCpsResponse_.cli, SbcCpsResponse_.tipoNotifica);
    }

    @Override
    public String print(SbcCpsResponse sbcCpsResponse, Locale locale) {
        if (sbcCpsResponse == null) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        appendIfNotEmpty(ret, sbcCpsResponse.getCli());
        appendIfNotEmpty(ret, sbcCpsResponse.getTipoNotifica());
        return ret.toString();
    }
}