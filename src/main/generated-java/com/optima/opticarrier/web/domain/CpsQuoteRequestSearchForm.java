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

import javax.inject.Named;

import com.optima.opticarrier.domain.CpsQuoteRequest;
import com.optima.opticarrier.domain.CpsQuoteRequest_;
import com.optima.opticarrier.domain.OloCps;
import com.optima.opticarrier.domain.SbcFileRequest;
import com.optima.opticarrier.repository.support.PropertySelector;
import com.optima.opticarrier.repository.support.Range;
import com.optima.opticarrier.repository.support.SearchParameters;
import com.optima.opticarrier.web.domain.support.GenericSearchForm;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link CpsQuoteRequest}.
 * It exposes a {@link CpsQuoteRequest} instance so it can be used in search by-example-query.
 */
@Named
@ConversationContextScoped
public class CpsQuoteRequestSearchForm extends GenericSearchForm<CpsQuoteRequest, Integer, CpsQuoteRequestSearchForm> {
    private static final long serialVersionUID = 1L;
    protected CpsQuoteRequest cpsQuoteRequest = new CpsQuoteRequest();
    protected Range<CpsQuoteRequest, Integer> codiceAreaRange = newRange(CpsQuoteRequest_.codiceArea);
    protected Range<CpsQuoteRequest, Integer> quantitaRichiestaRange = newRange(CpsQuoteRequest_.quantitaRichiesta);
    protected Range<CpsQuoteRequest, Integer> mmRange = newRange(CpsQuoteRequest_.mm);
    protected Range<CpsQuoteRequest, Integer> yyyyRange = newRange(CpsQuoteRequest_.yyyy);
    protected PropertySelector<CpsQuoteRequest, Integer> codiceAreaSelector = newPropertySelector(CpsQuoteRequest_.codiceArea);
    protected PropertySelector<CpsQuoteRequest, String> descrizioneAreaSelector = newPropertySelector(CpsQuoteRequest_.descrizioneArea);
    protected PropertySelector<CpsQuoteRequest, Integer> quantitaRichiestaSelector = newPropertySelector(CpsQuoteRequest_.quantitaRichiesta);
    protected PropertySelector<CpsQuoteRequest, Integer> mmSelector = newPropertySelector(CpsQuoteRequest_.mm);
    protected PropertySelector<CpsQuoteRequest, Integer> yyyySelector = newPropertySelector(CpsQuoteRequest_.yyyy);
    protected PropertySelector<CpsQuoteRequest, String> statusSelector = newPropertySelector(CpsQuoteRequest_.status);
    protected PropertySelector<CpsQuoteRequest, OloCps> oloSelector = newPropertySelector(CpsQuoteRequest_.olo);
    protected PropertySelector<CpsQuoteRequest, SbcFileRequest> fileSelector = newPropertySelector(CpsQuoteRequest_.file);

    public CpsQuoteRequest getCpsQuoteRequest() {
        return cpsQuoteRequest;
    }

    @Override
    protected CpsQuoteRequest getEntity() {
        return getCpsQuoteRequest();
    }

    @Override
    public CpsQuoteRequestSearchForm newInstance() {
        return new CpsQuoteRequestSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        SearchParameters sp = searchParameters();
        sp.range(codiceAreaRange, quantitaRichiestaRange, mmRange, yyyyRange);
        sp.property(codiceAreaSelector, descrizioneAreaSelector, quantitaRichiestaSelector, mmSelector, yyyySelector, statusSelector);
        sp.property(oloSelector, fileSelector);
        return sp;
    }

    @Override
    public void resetWithOther(CpsQuoteRequestSearchForm other) {
        this.cpsQuoteRequest = other.getCpsQuoteRequest();
        this.codiceAreaRange = other.getCodiceAreaRange();
        this.quantitaRichiestaRange = other.getQuantitaRichiestaRange();
        this.mmRange = other.getMmRange();
        this.yyyyRange = other.getYyyyRange();
        this.codiceAreaSelector = other.getCodiceAreaSelector();
        this.descrizioneAreaSelector = other.getDescrizioneAreaSelector();
        this.quantitaRichiestaSelector = other.getQuantitaRichiestaSelector();
        this.mmSelector = other.getMmSelector();
        this.yyyySelector = other.getYyyySelector();
        this.statusSelector = other.getStatusSelector();
        this.oloSelector = other.getOloSelector();
        this.fileSelector = other.getFileSelector();
    }

    // Ranges
    public Range<CpsQuoteRequest, Integer> getCodiceAreaRange() {
        return codiceAreaRange;
    }

    public Range<CpsQuoteRequest, Integer> getQuantitaRichiestaRange() {
        return quantitaRichiestaRange;
    }

    public Range<CpsQuoteRequest, Integer> getMmRange() {
        return mmRange;
    }

    public Range<CpsQuoteRequest, Integer> getYyyyRange() {
        return yyyyRange;
    }

    // Property selectors
    public PropertySelector<CpsQuoteRequest, Integer> getCodiceAreaSelector() {
        return codiceAreaSelector;
    }

    public PropertySelector<CpsQuoteRequest, String> getDescrizioneAreaSelector() {
        return descrizioneAreaSelector;
    }

    public PropertySelector<CpsQuoteRequest, Integer> getQuantitaRichiestaSelector() {
        return quantitaRichiestaSelector;
    }

    public PropertySelector<CpsQuoteRequest, Integer> getMmSelector() {
        return mmSelector;
    }

    public PropertySelector<CpsQuoteRequest, Integer> getYyyySelector() {
        return yyyySelector;
    }

    public PropertySelector<CpsQuoteRequest, String> getStatusSelector() {
        return statusSelector;
    }

    // Relation selectors
    public PropertySelector<CpsQuoteRequest, OloCps> getOloSelector() {
        return oloSelector;
    }

    public PropertySelector<CpsQuoteRequest, SbcFileRequest> getFileSelector() {
        return fileSelector;
    }
}
