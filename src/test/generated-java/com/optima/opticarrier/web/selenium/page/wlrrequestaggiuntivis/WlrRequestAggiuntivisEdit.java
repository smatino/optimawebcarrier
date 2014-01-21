/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/EditPage.e.vm.java
 */
package com.optima.opticarrier.web.selenium.page.wlrrequestaggiuntivis;

import com.optima.opticarrier.web.selenium.support.Page;
import com.optima.opticarrier.web.selenium.support.elements.Checkbox;
import com.optima.opticarrier.web.selenium.support.elements.CustomWebElement;
import com.optima.opticarrier.web.selenium.support.elements.EditAction;
import com.optima.opticarrier.web.selenium.support.elements.EntityAction;
import com.optima.opticarrier.web.selenium.support.elements.Messages;
import com.optima.opticarrier.web.selenium.support.elements.NoInverseManyToOne;
import com.optima.opticarrier.web.selenium.support.elements.StringInput;

@Page
public class WlrRequestAggiuntivisEdit {
    public EditAction action;
    public Messages messages;
    public EntityAction entity;
    public WlrRequestAggiuntivisEditForm form;
    public WlrRequestAggiuntivisEditTabs tabs;

    public static class WlrRequestAggiuntivisEditForm extends CustomWebElement {
        public StringInput aggiuntivi = new StringInput("form:aggiuntivi");
        public Checkbox completed = new Checkbox("form:completed");

        public NoInverseManyToOne request = new NoInverseManyToOne("form:request");
    };

    public static class WlrRequestAggiuntivisEditTabs extends CustomWebElement {
    };
}