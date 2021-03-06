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

import com.optima.opticarrier.domain.TelecomFilePostfix;
import com.optima.opticarrier.domain.TelecomFilePostfix_;
import com.optima.opticarrier.printer.support.GenericPrinter;

/**
 * {@link GenericPrinter} for {@link TelecomFilePostfix} 
 *
 * @see GenericPrinter
 * @see TypeAwarePrinter
 */
@Named
@Singleton
public class TelecomFilePostfixPrinter extends GenericPrinter<TelecomFilePostfix> {
    public TelecomFilePostfixPrinter() {
        super(TelecomFilePostfix.class, TelecomFilePostfix_.extension);
    }

    @Override
    public String print(TelecomFilePostfix telecomFilePostfix, Locale locale) {
        if (telecomFilePostfix == null) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        appendIfNotEmpty(ret, telecomFilePostfix.getExtension());
        return ret.toString();
    }
}