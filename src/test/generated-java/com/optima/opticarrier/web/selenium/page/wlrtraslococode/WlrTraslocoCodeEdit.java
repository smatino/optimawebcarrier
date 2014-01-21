/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/EditPage.e.vm.java
 */
package com.optima.opticarrier.web.selenium.page.wlrtraslococode;

import com.optima.opticarrier.web.selenium.support.Page;
import com.optima.opticarrier.web.selenium.support.elements.CustomWebElement;
import com.optima.opticarrier.web.selenium.support.elements.EditAction;
import com.optima.opticarrier.web.selenium.support.elements.EntityAction;
import com.optima.opticarrier.web.selenium.support.elements.Messages;
import com.optima.opticarrier.web.selenium.support.elements.StringInput;

@Page
public class WlrTraslocoCodeEdit {
    public EditAction action;
    public Messages messages;
    public EntityAction entity;
    public WlrTraslocoCodeEditForm form;
    public WlrTraslocoCodeEditTabs tabs;

    public static class WlrTraslocoCodeEditForm extends CustomWebElement {
        public StringInput id = new StringInput("form:id");
        public StringInput telecomSts = new StringInput("form:telecomSts");
    };

    public static class WlrTraslocoCodeEditTabs extends CustomWebElement {
    };
}