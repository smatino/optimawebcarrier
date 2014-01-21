/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/SearchPage.e.vm.java
 */
package com.optima.opticarrier.web.selenium.page.btrequest;

import com.optima.opticarrier.web.selenium.support.Page;
import com.optima.opticarrier.web.selenium.support.elements.Autocomplete;
import com.optima.opticarrier.web.selenium.support.elements.CustomWebElement;
import com.optima.opticarrier.web.selenium.support.elements.EntityAction;
import com.optima.opticarrier.web.selenium.support.elements.Messages;
import com.optima.opticarrier.web.selenium.support.elements.OrderBy;
import com.optima.opticarrier.web.selenium.support.elements.SearchForm;
import com.optima.opticarrier.web.selenium.support.elements.StringRange;
import com.optima.opticarrier.web.selenium.support.elements.Table;

@Page
public class BtRequestSearch {
    public Table table;
    public EntityAction entity;
    public Messages messages;
    public BtRequestSearchOrders orders;
    public BtRequestSearchForm form;

    public static class BtRequestSearchOrders extends CustomWebElement {
        public OrderBy xml = new OrderBy("btRequest_xml");
        public OrderBy status = new OrderBy("btRequest_status");
        public OrderBy dateInsert = new OrderBy("btRequest_dateInsert");
        public OrderBy fileId = new OrderBy("btRequest_fileId");
    }

    public static class BtRequestSearchForm extends SearchForm {
        public Autocomplete xml = new Autocomplete("form:xml");
        public Autocomplete status = new Autocomplete("form:status");
        public StringRange dateInsert = new StringRange("form:dateInsert");
        public StringRange fileId = new StringRange("form:fileId");
    }
}