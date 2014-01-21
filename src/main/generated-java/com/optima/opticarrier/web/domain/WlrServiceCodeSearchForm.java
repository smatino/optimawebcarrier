/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/SearchForm.e.vm.java
 */
package com.optima.opticarrier.web.domain;

import static com.optima.opticarrier.repository.support.PropertySelector.newPropertySelector;

import javax.inject.Named;

import com.optima.opticarrier.domain.WlrServiceCode;
import com.optima.opticarrier.domain.WlrServiceCode_;
import com.optima.opticarrier.repository.support.PropertySelector;
import com.optima.opticarrier.repository.support.SearchParameters;
import com.optima.opticarrier.web.domain.support.GenericSearchForm;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link WlrServiceCode}.
 * It exposes a {@link WlrServiceCode} instance so it can be used in search by-example-query.
 */
@Named
@ConversationContextScoped
public class WlrServiceCodeSearchForm extends GenericSearchForm<WlrServiceCode, String, WlrServiceCodeSearchForm> {
    private static final long serialVersionUID = 1L;
    protected WlrServiceCode wlrServiceCode = new WlrServiceCode();
    protected PropertySelector<WlrServiceCode, String> idSelector = newPropertySelector(WlrServiceCode_.id);
    protected PropertySelector<WlrServiceCode, String> telecomStsSelector = newPropertySelector(WlrServiceCode_.telecomSts);

    public WlrServiceCode getWlrServiceCode() {
        return wlrServiceCode;
    }

    @Override
    protected WlrServiceCode getEntity() {
        return getWlrServiceCode();
    }

    @Override
    public WlrServiceCodeSearchForm newInstance() {
        return new WlrServiceCodeSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        SearchParameters sp = searchParameters();
        sp.property(idSelector, telecomStsSelector);
        return sp;
    }

    @Override
    public void resetWithOther(WlrServiceCodeSearchForm other) {
        this.wlrServiceCode = other.getWlrServiceCode();
        this.idSelector = other.getIdSelector();
        this.telecomStsSelector = other.getTelecomStsSelector();
    }

    // Property selectors
    public PropertySelector<WlrServiceCode, String> getIdSelector() {
        return idSelector;
    }

    public PropertySelector<WlrServiceCode, String> getTelecomStsSelector() {
        return telecomStsSelector;
    }
}