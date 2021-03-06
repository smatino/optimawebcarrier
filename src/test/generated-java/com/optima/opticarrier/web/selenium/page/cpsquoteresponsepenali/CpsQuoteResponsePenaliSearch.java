/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/SearchPage.e.vm.java
 */
package com.optima.opticarrier.web.selenium.page.cpsquoteresponsepenali;

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
public class CpsQuoteResponsePenaliSearch {
    public Table table;
    public EntityAction entity;
    public Messages messages;
    public CpsQuoteResponsePenaliSearchOrders orders;
    public CpsQuoteResponsePenaliSearchForm form;

    public static class CpsQuoteResponsePenaliSearchOrders extends CustomWebElement {
        public OrderBy totVolRichiestiDueMesiPrec = new OrderBy("cpsQuoteResponsePenali_totVolRichiestiDueMesiPrec");
        public OrderBy totVolAssegnatiDueMesiPrec = new OrderBy("cpsQuoteResponsePenali_totVolAssegnatiDueMesiPrec");
        public OrderBy totVolEffettiviDueMesiPrec = new OrderBy("cpsQuoteResponsePenali_totVolEffettiviDueMesiPrec");
        public OrderBy sogliaPenale = new OrderBy("cpsQuoteResponsePenali_sogliaPenale");
        public OrderBy percentualePenaleApplicata = new OrderBy("cpsQuoteResponsePenali_percentualePenaleApplicata");
        public OrderBy fileId = new OrderBy("cpsQuoteResponsePenali_fileId");
        public OrderBy olo = new OrderBy("cpsQuoteResponsePenali_olo");
    }

    public static class CpsQuoteResponsePenaliSearchForm extends SearchForm {
        public StringRange totVolRichiestiDueMesiPrec = new StringRange("form:totVolRichiestiDueMesiPrec");
        public StringRange totVolAssegnatiDueMesiPrec = new StringRange("form:totVolAssegnatiDueMesiPrec");
        public StringRange totVolEffettiviDueMesiPrec = new StringRange("form:totVolEffettiviDueMesiPrec");
        public StringRange sogliaPenale = new StringRange("form:sogliaPenale");
        public StringRange percentualePenaleApplicata = new StringRange("form:percentualePenaleApplicata");
        public Autocomplete olo = new Autocomplete("form:oloSelector");
        public Autocomplete file = new Autocomplete("form:fileSelector");
    }
}