/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/EditPage.e.vm.java
 */
package com.optima.opticarrier.web.selenium.page.cpsquoteresponse;

import com.optima.opticarrier.web.selenium.support.Page;
import com.optima.opticarrier.web.selenium.support.elements.CustomWebElement;
import com.optima.opticarrier.web.selenium.support.elements.EditAction;
import com.optima.opticarrier.web.selenium.support.elements.EntityAction;
import com.optima.opticarrier.web.selenium.support.elements.IntegerInput;
import com.optima.opticarrier.web.selenium.support.elements.Messages;
import com.optima.opticarrier.web.selenium.support.elements.NoInverseManyToOne;
import com.optima.opticarrier.web.selenium.support.elements.StringInput;

@Page
public class CpsQuoteResponseEdit {
    public EditAction action;
    public Messages messages;
    public EntityAction entity;
    public CpsQuoteResponseEditForm form;
    public CpsQuoteResponseEditTabs tabs;

    public static class CpsQuoteResponseEditForm extends CustomWebElement {
        public StringInput codiceArea = new StringInput("form:codiceArea");
        public StringInput descrizioneArea = new StringInput("form:descrizioneArea");
        public IntegerInput quantitaRichesta = new IntegerInput("form:quantitaRichesta");
        public IntegerInput volumiMensiliAssegnati = new IntegerInput("form:volumiMensiliAssegnati");
        public IntegerInput tolleranzaMensile = new IntegerInput("form:tolleranzaMensile");
        public IntegerInput volumiGiornalieriAssegnati = new IntegerInput("form:volumiGiornalieriAssegnati");
        public IntegerInput tolleranzaGiornaliera = new IntegerInput("form:tolleranzaGiornaliera");
        public IntegerInput giorniLavorativi = new IntegerInput("form:giorniLavorativi");

        public NoInverseManyToOne file = new NoInverseManyToOne("form:file");

        public NoInverseManyToOne olo = new NoInverseManyToOne("form:olo");
    };

    public static class CpsQuoteResponseEditTabs extends CustomWebElement {
    };
}