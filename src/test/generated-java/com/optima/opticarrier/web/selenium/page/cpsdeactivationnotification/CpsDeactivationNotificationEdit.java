/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/EditPage.e.vm.java
 */
package com.optima.opticarrier.web.selenium.page.cpsdeactivationnotification;

import com.optima.opticarrier.web.selenium.support.Page;
import com.optima.opticarrier.web.selenium.support.elements.CustomWebElement;
import com.optima.opticarrier.web.selenium.support.elements.DateInput;
import com.optima.opticarrier.web.selenium.support.elements.EditAction;
import com.optima.opticarrier.web.selenium.support.elements.EntityAction;
import com.optima.opticarrier.web.selenium.support.elements.Messages;
import com.optima.opticarrier.web.selenium.support.elements.StringInput;

@Page
public class CpsDeactivationNotificationEdit {
    public EditAction action;
    public Messages messages;
    public EntityAction entity;
    public CpsDeactivationNotificationEditForm form;
    public CpsDeactivationNotificationEditTabs tabs;

    public static class CpsDeactivationNotificationEditForm extends CustomWebElement {
        public StringInput codiceFornitore = new StringInput("form:codiceFornitore");
        public DateInput dataNotifica = new DateInput("form:dataNotifica");
        public StringInput dn = new StringInput("form:dn");
        public StringInput dataSottoscrizioneContratto = new StringInput("form:dataSottoscrizioneContratto");
        public StringInput codiceMotivoRifiuto = new StringInput("form:codiceMotivoRifiuto");
        public DateInput dataEsplitamento = new DateInput("form:dataEsplitamento");
        public StringInput motivoRifiuto = new StringInput("form:motivoRifiuto");
        public StringInput status = new StringInput("form:status");
    };

    public static class CpsDeactivationNotificationEditTabs extends CustomWebElement {
    };
}