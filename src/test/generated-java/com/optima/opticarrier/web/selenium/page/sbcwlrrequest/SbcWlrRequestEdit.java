/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/EditPage.e.vm.java
 */
package com.optima.opticarrier.web.selenium.page.sbcwlrrequest;

import com.optima.opticarrier.web.selenium.support.Page;
import com.optima.opticarrier.web.selenium.support.elements.Checkbox;
import com.optima.opticarrier.web.selenium.support.elements.CustomWebElement;
import com.optima.opticarrier.web.selenium.support.elements.DateInput;
import com.optima.opticarrier.web.selenium.support.elements.EditAction;
import com.optima.opticarrier.web.selenium.support.elements.EntityAction;
import com.optima.opticarrier.web.selenium.support.elements.IntegerInput;
import com.optima.opticarrier.web.selenium.support.elements.Messages;
import com.optima.opticarrier.web.selenium.support.elements.NoInverseManyToOne;
import com.optima.opticarrier.web.selenium.support.elements.StringInput;

@Page
public class SbcWlrRequestEdit {
    public EditAction action;
    public Messages messages;
    public EntityAction entity;
    public SbcWlrRequestEditForm form;
    public SbcWlrRequestEditTabs tabs;

    public static class SbcWlrRequestEditForm extends CustomWebElement {
        public StringInput progressivoRichiesta = new StringInput("form:progressivoRichiesta");
        public IntegerInput actionType = new IntegerInput("form:actionType");
        public IntegerInput wlrType = new IntegerInput("form:wlrType");
        public StringInput dn = new StringInput("form:dn");
        public IntegerInput flagmantenimentoProdotto = new IntegerInput("form:flagmantenimentoProdotto");
        public DateInput datasottoscrizioneContratto = new DateInput("form:datasottoscrizioneContratto");
        public StringInput customerSurname = new StringInput("form:customerSurname");
        public StringInput particellaToponomastica = new StringInput("form:particellaToponomastica");
        public StringInput via = new StringInput("form:via");
        public StringInput civico = new StringInput("form:civico");
        public StringInput localita = new StringInput("form:localita");
        public StringInput codiceComune = new StringInput("form:codiceComune");
        public StringInput cfPiva = new StringInput("form:cfPiva");
        public DateInput dataDac = new DateInput("form:dataDac");
        public StringInput typeService = new StringInput("form:typeService");
        public StringInput tipeLine = new StringInput("form:tipeLine");
        public IntegerInput amount = new IntegerInput("form:amount");
        public StringInput customerPhone = new StringInput("form:customerPhone");
        public StringInput error = new StringInput("form:error");
        public IntegerInput rientro = new IntegerInput("form:rientro");
        public Checkbox btExecuted = new Checkbox("form:btExecuted");
        public Checkbox sentToTelecom = new Checkbox("form:sentToTelecom");

        public NoInverseManyToOne olo = new NoInverseManyToOne("form:olo");

        public NoInverseManyToOne file = new NoInverseManyToOne("form:file");
    };

    public static class SbcWlrRequestEditTabs extends CustomWebElement {
    };
}