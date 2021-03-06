/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/EditPage.e.vm.java
 */
package com.optima.opticarrier.web.selenium.page.sbccpsresponse;

import com.optima.opticarrier.web.selenium.support.Page;
import com.optima.opticarrier.web.selenium.support.elements.CustomWebElement;
import com.optima.opticarrier.web.selenium.support.elements.DateInput;
import com.optima.opticarrier.web.selenium.support.elements.EditAction;
import com.optima.opticarrier.web.selenium.support.elements.EntityAction;
import com.optima.opticarrier.web.selenium.support.elements.Messages;
import com.optima.opticarrier.web.selenium.support.elements.NoInverseManyToOne;
import com.optima.opticarrier.web.selenium.support.elements.StringInput;

@Page
public class SbcCpsResponseEdit {
    public EditAction action;
    public Messages messages;
    public EntityAction entity;
    public SbcCpsResponseEditForm form;
    public SbcCpsResponseEditTabs tabs;

    public static class SbcCpsResponseEditForm extends CustomWebElement {
        public StringInput cli = new StringInput("form:cli");
        public StringInput tipoNotifica = new StringInput("form:tipoNotifica");
        public StringInput codiceFornitore = new StringInput("form:codiceFornitore");
        public StringInput codiceOrdineFornitore = new StringInput("form:codiceOrdineFornitore");
        public StringInput codiceRichiedente = new StringInput("form:codiceRichiedente");
        public StringInput codiceOrdineRichiedente = new StringInput("form:codiceOrdineRichiedente");
        public DateInput dataNotifica = new DateInput("form:dataNotifica");
        public StringInput statoOrdine = new StringInput("form:statoOrdine");
        public DateInput dataEspletamento = new DateInput("form:dataEspletamento");
        public DateInput dataValidazioneFormaleContrattuale = new DateInput("form:dataValidazioneFormaleContrattuale");
        public DateInput dataValidazioneTecnicoGestionale = new DateInput("form:dataValidazioneTecnicoGestionale");
        public DateInput dataDro = new DateInput("form:dataDro");
        public DateInput dataEstrazioneWl = new DateInput("form:dataEstrazioneWl");
        public StringInput classificazioneOrdine = new StringInput("form:classificazioneOrdine");
        public StringInput note = new StringInput("form:note");
        public StringInput tipoCausaleRifiuto = new StringInput("form:tipoCausaleRifiuto");
        public StringInput codiceMotivorifiuto = new StringInput("form:codiceMotivorifiuto");
        public StringInput motivoRifiuto = new StringInput("form:motivoRifiuto");

        public NoInverseManyToOne file = new NoInverseManyToOne("form:file");

        public NoInverseManyToOne olo = new NoInverseManyToOne("form:olo");
    };

    public static class SbcCpsResponseEditTabs extends CustomWebElement {
    };
}