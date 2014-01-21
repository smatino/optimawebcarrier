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
import com.optima.opticarrier.domain.SbcFileRequest;
import com.optima.opticarrier.domain.SbcWlrRequestVariation;
import com.optima.opticarrier.domain.SbcWlrRequestVariation_;
import com.optima.opticarrier.repository.support.PropertySelector;
import com.optima.opticarrier.repository.support.Range;
import com.optima.opticarrier.repository.support.SearchParameters;
import com.optima.opticarrier.web.domain.support.GenericSearchForm;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link SbcWlrRequestVariation}.
 * It exposes a {@link SbcWlrRequestVariation} instance so it can be used in search by-example-query.
 */
@Named
@ConversationContextScoped
public class SbcWlrRequestVariationSearchForm extends GenericSearchForm<SbcWlrRequestVariation, Integer, SbcWlrRequestVariationSearchForm> {
    private static final long serialVersionUID = 1L;
    protected SbcWlrRequestVariation sbcWlrRequestVariation = new SbcWlrRequestVariation();
    protected Range<SbcWlrRequestVariation, Integer> actionTypeRange = newRange(SbcWlrRequestVariation_.actionType);
    protected Range<SbcWlrRequestVariation, Integer> wlrTypeRange = newRange(SbcWlrRequestVariation_.wlrType);
    protected Range<SbcWlrRequestVariation, Date> dataSottoscrizioneContrattoRange = newRange(SbcWlrRequestVariation_.dataSottoscrizioneContratto);
    protected Range<SbcWlrRequestVariation, Integer> waitsRange = newRange(SbcWlrRequestVariation_.waits);
    protected PropertySelector<SbcWlrRequestVariation, String> progressiveRichiestaSelector = newPropertySelector(SbcWlrRequestVariation_.progressiveRichiesta);
    protected PropertySelector<SbcWlrRequestVariation, Integer> actionTypeSelector = newPropertySelector(SbcWlrRequestVariation_.actionType);
    protected PropertySelector<SbcWlrRequestVariation, Integer> wlrTypeSelector = newPropertySelector(SbcWlrRequestVariation_.wlrType);
    protected PropertySelector<SbcWlrRequestVariation, String> dnSelector = newPropertySelector(SbcWlrRequestVariation_.dn);
    protected PropertySelector<SbcWlrRequestVariation, String> customerSurnameSelector = newPropertySelector(SbcWlrRequestVariation_.customerSurname);
    protected PropertySelector<SbcWlrRequestVariation, String> serviceNumberSelector = newPropertySelector(SbcWlrRequestVariation_.serviceNumber);
    protected PropertySelector<SbcWlrRequestVariation, String> numberAdditionalSelector = newPropertySelector(SbcWlrRequestVariation_.numberAdditional);
    protected PropertySelector<SbcWlrRequestVariation, String> codicePrestazioneSelector = newPropertySelector(SbcWlrRequestVariation_.codicePrestazione);
    protected PropertySelector<SbcWlrRequestVariation, String> aggiuntivo1Selector = newPropertySelector(SbcWlrRequestVariation_.aggiuntivo1);
    protected PropertySelector<SbcWlrRequestVariation, String> aggiuntivo2Selector = newPropertySelector(SbcWlrRequestVariation_.aggiuntivo2);
    protected PropertySelector<SbcWlrRequestVariation, String> aggiuntivo3Selector = newPropertySelector(SbcWlrRequestVariation_.aggiuntivo3);
    protected PropertySelector<SbcWlrRequestVariation, String> aggiuntivo4Selector = newPropertySelector(SbcWlrRequestVariation_.aggiuntivo4);
    protected PropertySelector<SbcWlrRequestVariation, String> aggiuntivo5Selector = newPropertySelector(SbcWlrRequestVariation_.aggiuntivo5);
    protected PropertySelector<SbcWlrRequestVariation, String> aggiuntivo6Selector = newPropertySelector(SbcWlrRequestVariation_.aggiuntivo6);
    protected PropertySelector<SbcWlrRequestVariation, String> aggiuntivo7Selector = newPropertySelector(SbcWlrRequestVariation_.aggiuntivo7);
    protected PropertySelector<SbcWlrRequestVariation, String> codeMoveSelector = newPropertySelector(SbcWlrRequestVariation_.codeMove);
    protected PropertySelector<SbcWlrRequestVariation, String> lineNumberSelector = newPropertySelector(SbcWlrRequestVariation_.lineNumber);
    protected PropertySelector<SbcWlrRequestVariation, String> directionalitySelector = newPropertySelector(SbcWlrRequestVariation_.directionality);
    protected PropertySelector<SbcWlrRequestVariation, String> codeDriveTypeSelector = newPropertySelector(SbcWlrRequestVariation_.codeDriveType);
    protected PropertySelector<SbcWlrRequestVariation, String> statusSelector = newPropertySelector(SbcWlrRequestVariation_.status);
    protected PropertySelector<SbcWlrRequestVariation, Integer> waitsSelector = newPropertySelector(SbcWlrRequestVariation_.waits);
    protected PropertySelector<SbcWlrRequestVariation, Boolean> elaboratedSelector = newPropertySelector(SbcWlrRequestVariation_.elaborated);
    protected PropertySelector<SbcWlrRequestVariation, OloCps> oloSelector = newPropertySelector(SbcWlrRequestVariation_.olo);
    protected PropertySelector<SbcWlrRequestVariation, SbcFileRequest> fileSelector = newPropertySelector(SbcWlrRequestVariation_.file);

    public SbcWlrRequestVariation getSbcWlrRequestVariation() {
        return sbcWlrRequestVariation;
    }

    @Override
    protected SbcWlrRequestVariation getEntity() {
        return getSbcWlrRequestVariation();
    }

    @Override
    public SbcWlrRequestVariationSearchForm newInstance() {
        return new SbcWlrRequestVariationSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        SearchParameters sp = searchParameters();
        sp.range(actionTypeRange, wlrTypeRange, dataSottoscrizioneContrattoRange, waitsRange);
        sp.property(progressiveRichiestaSelector, actionTypeSelector, wlrTypeSelector, dnSelector, customerSurnameSelector, serviceNumberSelector,
                numberAdditionalSelector, codicePrestazioneSelector, aggiuntivo1Selector, aggiuntivo2Selector, aggiuntivo3Selector, aggiuntivo4Selector,
                aggiuntivo5Selector, aggiuntivo6Selector, aggiuntivo7Selector, codeMoveSelector, lineNumberSelector, directionalitySelector,
                codeDriveTypeSelector, statusSelector, waitsSelector, elaboratedSelector);
        sp.property(oloSelector, fileSelector);
        return sp;
    }

    @Override
    public void resetWithOther(SbcWlrRequestVariationSearchForm other) {
        this.sbcWlrRequestVariation = other.getSbcWlrRequestVariation();
        this.actionTypeRange = other.getActionTypeRange();
        this.wlrTypeRange = other.getWlrTypeRange();
        this.dataSottoscrizioneContrattoRange = other.getDataSottoscrizioneContrattoRange();
        this.waitsRange = other.getWaitsRange();
        this.progressiveRichiestaSelector = other.getProgressiveRichiestaSelector();
        this.actionTypeSelector = other.getActionTypeSelector();
        this.wlrTypeSelector = other.getWlrTypeSelector();
        this.dnSelector = other.getDnSelector();
        this.customerSurnameSelector = other.getCustomerSurnameSelector();
        this.serviceNumberSelector = other.getServiceNumberSelector();
        this.numberAdditionalSelector = other.getNumberAdditionalSelector();
        this.codicePrestazioneSelector = other.getCodicePrestazioneSelector();
        this.aggiuntivo1Selector = other.getAggiuntivo1Selector();
        this.aggiuntivo2Selector = other.getAggiuntivo2Selector();
        this.aggiuntivo3Selector = other.getAggiuntivo3Selector();
        this.aggiuntivo4Selector = other.getAggiuntivo4Selector();
        this.aggiuntivo5Selector = other.getAggiuntivo5Selector();
        this.aggiuntivo6Selector = other.getAggiuntivo6Selector();
        this.aggiuntivo7Selector = other.getAggiuntivo7Selector();
        this.codeMoveSelector = other.getCodeMoveSelector();
        this.lineNumberSelector = other.getLineNumberSelector();
        this.directionalitySelector = other.getDirectionalitySelector();
        this.codeDriveTypeSelector = other.getCodeDriveTypeSelector();
        this.statusSelector = other.getStatusSelector();
        this.waitsSelector = other.getWaitsSelector();
        this.elaboratedSelector = other.getElaboratedSelector();
        this.oloSelector = other.getOloSelector();
        this.fileSelector = other.getFileSelector();
    }

    // Ranges
    public Range<SbcWlrRequestVariation, Integer> getActionTypeRange() {
        return actionTypeRange;
    }

    public Range<SbcWlrRequestVariation, Integer> getWlrTypeRange() {
        return wlrTypeRange;
    }

    public Range<SbcWlrRequestVariation, Date> getDataSottoscrizioneContrattoRange() {
        return dataSottoscrizioneContrattoRange;
    }

    public Range<SbcWlrRequestVariation, Integer> getWaitsRange() {
        return waitsRange;
    }

    // Property selectors
    public PropertySelector<SbcWlrRequestVariation, String> getProgressiveRichiestaSelector() {
        return progressiveRichiestaSelector;
    }

    public PropertySelector<SbcWlrRequestVariation, Integer> getActionTypeSelector() {
        return actionTypeSelector;
    }

    public PropertySelector<SbcWlrRequestVariation, Integer> getWlrTypeSelector() {
        return wlrTypeSelector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getDnSelector() {
        return dnSelector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getCustomerSurnameSelector() {
        return customerSurnameSelector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getServiceNumberSelector() {
        return serviceNumberSelector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getNumberAdditionalSelector() {
        return numberAdditionalSelector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getCodicePrestazioneSelector() {
        return codicePrestazioneSelector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getAggiuntivo1Selector() {
        return aggiuntivo1Selector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getAggiuntivo2Selector() {
        return aggiuntivo2Selector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getAggiuntivo3Selector() {
        return aggiuntivo3Selector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getAggiuntivo4Selector() {
        return aggiuntivo4Selector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getAggiuntivo5Selector() {
        return aggiuntivo5Selector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getAggiuntivo6Selector() {
        return aggiuntivo6Selector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getAggiuntivo7Selector() {
        return aggiuntivo7Selector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getCodeMoveSelector() {
        return codeMoveSelector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getLineNumberSelector() {
        return lineNumberSelector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getDirectionalitySelector() {
        return directionalitySelector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getCodeDriveTypeSelector() {
        return codeDriveTypeSelector;
    }

    public PropertySelector<SbcWlrRequestVariation, String> getStatusSelector() {
        return statusSelector;
    }

    public PropertySelector<SbcWlrRequestVariation, Integer> getWaitsSelector() {
        return waitsSelector;
    }

    public PropertySelector<SbcWlrRequestVariation, Boolean> getElaboratedSelector() {
        return elaboratedSelector;
    }

    // Relation selectors
    public PropertySelector<SbcWlrRequestVariation, OloCps> getOloSelector() {
        return oloSelector;
    }

    public PropertySelector<SbcWlrRequestVariation, SbcFileRequest> getFileSelector() {
        return fileSelector;
    }
}