/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/SearchPage.e.vm.java
 */
package com.optima.opticarrier.web.selenium.page.wlrservicecode;

import com.optima.opticarrier.web.selenium.support.Page;
import com.optima.opticarrier.web.selenium.support.elements.Autocomplete;
import com.optima.opticarrier.web.selenium.support.elements.CustomWebElement;
import com.optima.opticarrier.web.selenium.support.elements.EntityAction;
import com.optima.opticarrier.web.selenium.support.elements.Messages;
import com.optima.opticarrier.web.selenium.support.elements.OrderBy;
import com.optima.opticarrier.web.selenium.support.elements.SearchForm;
import com.optima.opticarrier.web.selenium.support.elements.Table;

@Page
public class WlrServiceCodeSearch {
    public Table table;
    public EntityAction entity;
    public Messages messages;
    public WlrServiceCodeSearchOrders orders;
    public WlrServiceCodeSearchForm form;

    public static class WlrServiceCodeSearchOrders extends CustomWebElement {
        public OrderBy id = new OrderBy("wlrServiceCode_id");
        public OrderBy telecomSts = new OrderBy("wlrServiceCode_telecomSts");
    }

    public static class WlrServiceCodeSearchForm extends SearchForm {
        public Autocomplete id = new Autocomplete("form:id");
        public Autocomplete telecomSts = new Autocomplete("form:telecomSts");
    }
}