/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/EditPage.e.vm.java
 */
package com.optima.opticarrier.web.selenium.page.sbccpsrequest;

import com.optima.opticarrier.web.selenium.support.Page;
import com.optima.opticarrier.web.selenium.support.elements.CustomWebElement;
import com.optima.opticarrier.web.selenium.support.elements.DateInput;
import com.optima.opticarrier.web.selenium.support.elements.EditAction;
import com.optima.opticarrier.web.selenium.support.elements.EntityAction;
import com.optima.opticarrier.web.selenium.support.elements.IntegerInput;
import com.optima.opticarrier.web.selenium.support.elements.Messages;
import com.optima.opticarrier.web.selenium.support.elements.NoInverseManyToOne;
import com.optima.opticarrier.web.selenium.support.elements.StringInput;

@Page
public class SbcCpsRequestEdit {
    public EditAction action;
    public Messages messages;
    public EntityAction entity;
    public SbcCpsRequestEditForm form;
    public SbcCpsRequestEditTabs tabs;

    public static class SbcCpsRequestEditForm extends CustomWebElement {
        public StringInput cli = new StringInput("form:cli");
        public StringInput requestId = new StringInput("form:requestId");
        public StringInput tipoOperazione = new StringInput("form:tipoOperazione");
        public StringInput tipoServizio = new StringInput("form:tipoServizio");
        public StringInput tipoLinea = new StringInput("form:tipoLinea");
        public StringInput tipoAttivazione = new StringInput("form:tipoAttivazione");
        public DateInput dataCreazione = new DateInput("form:dataCreazione");
        public IntegerInput numeroLinee = new IntegerInput("form:numeroLinee");
        public StringInput userInformation = new StringInput("form:userInformation");
        public IntegerInput codiceErrore = new IntegerInput("form:codiceErrore");
        public StringInput descrizioneErrore = new StringInput("form:descrizioneErrore");
        public StringInput statoOrdine = new StringInput("form:statoOrdine");
        public StringInput tipoNotifica = new StringInput("form:tipoNotifica");

        public NoInverseManyToOne file = new NoInverseManyToOne("form:file");

        public NoInverseManyToOne olo = new NoInverseManyToOne("form:olo");
    };

    public static class SbcCpsRequestEditTabs extends CustomWebElement {
    };
}