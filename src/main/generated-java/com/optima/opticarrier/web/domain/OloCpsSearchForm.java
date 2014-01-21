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
import static com.optima.opticarrier.repository.support.Range.newRange;

import java.util.Date;

import javax.inject.Named;

import com.optima.opticarrier.domain.OloCps;
import com.optima.opticarrier.domain.OloCps_;
import com.optima.opticarrier.repository.support.PropertySelector;
import com.optima.opticarrier.repository.support.Range;
import com.optima.opticarrier.repository.support.SearchParameters;
import com.optima.opticarrier.web.domain.support.GenericSearchForm;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link OloCps}.
 * It exposes a {@link OloCps} instance so it can be used in search by-example-query.
 */
@Named
@ConversationContextScoped
public class OloCpsSearchForm extends GenericSearchForm<OloCps, Integer, OloCpsSearchForm> {
    private static final long serialVersionUID = 1L;
    protected OloCps oloCps = new OloCps();
    protected Range<OloCps, Date> oloDtinivalRange = newRange(OloCps_.oloDtinival);
    protected Range<OloCps, Date> oloDtfinvalRange = newRange(OloCps_.oloDtfinval);
    protected PropertySelector<OloCps, String> codiceOloSelector = newPropertySelector(OloCps_.codiceOlo);
    protected PropertySelector<OloCps, String> oloDescrizioneSelector = newPropertySelector(OloCps_.oloDescrizione);
    protected PropertySelector<OloCps, String> codiceTelecomSelector = newPropertySelector(OloCps_.codiceTelecom);

    public OloCps getOloCps() {
        return oloCps;
    }

    @Override
    protected OloCps getEntity() {
        return getOloCps();
    }

    @Override
    public OloCpsSearchForm newInstance() {
        return new OloCpsSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        SearchParameters sp = searchParameters();
        sp.range(oloDtinivalRange, oloDtfinvalRange);
        sp.property(codiceOloSelector, oloDescrizioneSelector, codiceTelecomSelector);
        return sp;
    }

    @Override
    public void resetWithOther(OloCpsSearchForm other) {
        this.oloCps = other.getOloCps();
        this.oloDtinivalRange = other.getOloDtinivalRange();
        this.oloDtfinvalRange = other.getOloDtfinvalRange();
        this.codiceOloSelector = other.getCodiceOloSelector();
        this.oloDescrizioneSelector = other.getOloDescrizioneSelector();
        this.codiceTelecomSelector = other.getCodiceTelecomSelector();
    }

    // Ranges
    public Range<OloCps, Date> getOloDtinivalRange() {
        return oloDtinivalRange;
    }

    public Range<OloCps, Date> getOloDtfinvalRange() {
        return oloDtfinvalRange;
    }

    // Property selectors
    public PropertySelector<OloCps, String> getCodiceOloSelector() {
        return codiceOloSelector;
    }

    public PropertySelector<OloCps, String> getOloDescrizioneSelector() {
        return oloDescrizioneSelector;
    }

    public PropertySelector<OloCps, String> getCodiceTelecomSelector() {
        return codiceTelecomSelector;
    }
}
