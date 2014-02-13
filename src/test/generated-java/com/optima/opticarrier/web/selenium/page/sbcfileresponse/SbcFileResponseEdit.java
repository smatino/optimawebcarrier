/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/EditPage.e.vm.java
 */
package com.optima.opticarrier.web.selenium.page.sbcfileresponse;

import com.optima.opticarrier.web.selenium.support.Page;
import com.optima.opticarrier.web.selenium.support.elements.CustomWebElement;
import com.optima.opticarrier.web.selenium.support.elements.DateInput;
import com.optima.opticarrier.web.selenium.support.elements.EditAction;
import com.optima.opticarrier.web.selenium.support.elements.EntityAction;
import com.optima.opticarrier.web.selenium.support.elements.Messages;
import com.optima.opticarrier.web.selenium.support.elements.StringInput;

@Page
public class SbcFileResponseEdit {
    public EditAction action;
    public Messages messages;
    public EntityAction entity;
    public SbcFileResponseEditForm form;
    public SbcFileResponseEditTabs tabs;

    public static class SbcFileResponseEditForm extends CustomWebElement {
        public StringInput nomeFile = new StringInput("form:nomeFile");
        public DateInput dataCreazione = new DateInput("form:dataCreazione");
        public StringInput olo = new StringInput("form:olo");
        public StringInput stato = new StringInput("form:stato");
        public StringInput service = new StringInput("form:service");
    };

    public static class SbcFileResponseEditTabs extends CustomWebElement {
    };
}