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
import com.optima.opticarrier.domain.SbcWlrRequest;
import com.optima.opticarrier.domain.SbcWlrRequest_;
import com.optima.opticarrier.repository.support.PropertySelector;
import com.optima.opticarrier.repository.support.Range;
import com.optima.opticarrier.repository.support.SearchParameters;
import com.optima.opticarrier.web.domain.support.GenericSearchForm;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link SbcWlrRequest}.
 * It exposes a {@link SbcWlrRequest} instance so it can be used in search by-example-query.
 */
@Named
@ConversationContextScoped
public class SbcWlrRequestSearchForm extends GenericSearchForm<SbcWlrRequest, Integer, SbcWlrRequestSearchForm> {
    private static final long serialVersionUID = 1L;
    protected SbcWlrRequest sbcWlrRequest = new SbcWlrRequest();
    protected Range<SbcWlrRequest, Integer> actionTypeRange = newRange(SbcWlrRequest_.actionType);
    protected Range<SbcWlrRequest, Integer> wlrTypeRange = newRange(SbcWlrRequest_.wlrType);
    protected Range<SbcWlrRequest, Integer> flagmantenimentoProdottoRange = newRange(SbcWlrRequest_.flagmantenimentoProdotto);
    protected Range<SbcWlrRequest, Date> datasottoscrizioneContrattoRange = newRange(SbcWlrRequest_.datasottoscrizioneContratto);
    protected Range<SbcWlrRequest, Date> dataDacRange = newRange(SbcWlrRequest_.dataDac);
    protected Range<SbcWlrRequest, Integer> amountRange = newRange(SbcWlrRequest_.amount);
    protected Range<SbcWlrRequest, Integer> rientroRange = newRange(SbcWlrRequest_.rientro);
    protected PropertySelector<SbcWlrRequest, String> progressivoRichiestaSelector = newPropertySelector(SbcWlrRequest_.progressivoRichiesta);
    protected PropertySelector<SbcWlrRequest, Integer> actionTypeSelector = newPropertySelector(SbcWlrRequest_.actionType);
    protected PropertySelector<SbcWlrRequest, Integer> wlrTypeSelector = newPropertySelector(SbcWlrRequest_.wlrType);
    protected PropertySelector<SbcWlrRequest, String> dnSelector = newPropertySelector(SbcWlrRequest_.dn);
    protected PropertySelector<SbcWlrRequest, Integer> flagmantenimentoProdottoSelector = newPropertySelector(SbcWlrRequest_.flagmantenimentoProdotto);
    protected PropertySelector<SbcWlrRequest, String> customerSurnameSelector = newPropertySelector(SbcWlrRequest_.customerSurname);
    protected PropertySelector<SbcWlrRequest, String> particellaToponomasticaSelector = newPropertySelector(SbcWlrRequest_.particellaToponomastica);
    protected PropertySelector<SbcWlrRequest, String> viaSelector = newPropertySelector(SbcWlrRequest_.via);
    protected PropertySelector<SbcWlrRequest, String> civicoSelector = newPropertySelector(SbcWlrRequest_.civico);
    protected PropertySelector<SbcWlrRequest, String> localitaSelector = newPropertySelector(SbcWlrRequest_.localita);
    protected PropertySelector<SbcWlrRequest, String> codiceComuneSelector = newPropertySelector(SbcWlrRequest_.codiceComune);
    protected PropertySelector<SbcWlrRequest, String> cfPivaSelector = newPropertySelector(SbcWlrRequest_.cfPiva);
    protected PropertySelector<SbcWlrRequest, String> typeServiceSelector = newPropertySelector(SbcWlrRequest_.typeService);
    protected PropertySelector<SbcWlrRequest, String> tipeLineSelector = newPropertySelector(SbcWlrRequest_.tipeLine);
    protected PropertySelector<SbcWlrRequest, Integer> amountSelector = newPropertySelector(SbcWlrRequest_.amount);
    protected PropertySelector<SbcWlrRequest, String> customerPhoneSelector = newPropertySelector(SbcWlrRequest_.customerPhone);
    protected PropertySelector<SbcWlrRequest, String> errorSelector = newPropertySelector(SbcWlrRequest_.error);
    protected PropertySelector<SbcWlrRequest, Integer> rientroSelector = newPropertySelector(SbcWlrRequest_.rientro);
    protected PropertySelector<SbcWlrRequest, Boolean> btExecutedSelector = newPropertySelector(SbcWlrRequest_.btExecuted);
    protected PropertySelector<SbcWlrRequest, Boolean> sentToTelecomSelector = newPropertySelector(SbcWlrRequest_.sentToTelecom);
    protected PropertySelector<SbcWlrRequest, OloCps> oloSelector = newPropertySelector(SbcWlrRequest_.olo);
    protected PropertySelector<SbcWlrRequest, SbcFileRequest> fileSelector = newPropertySelector(SbcWlrRequest_.file);

    public SbcWlrRequest getSbcWlrRequest() {
        return sbcWlrRequest;
    }

    @Override
    protected SbcWlrRequest getEntity() {
        return getSbcWlrRequest();
    }

    @Override
    public SbcWlrRequestSearchForm newInstance() {
        return new SbcWlrRequestSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        SearchParameters sp = searchParameters();
        sp.range(actionTypeRange, wlrTypeRange, flagmantenimentoProdottoRange, datasottoscrizioneContrattoRange, dataDacRange, amountRange, rientroRange);
        sp.property(progressivoRichiestaSelector, actionTypeSelector, wlrTypeSelector, dnSelector, flagmantenimentoProdottoSelector, customerSurnameSelector,
                particellaToponomasticaSelector, viaSelector, civicoSelector, localitaSelector, codiceComuneSelector, cfPivaSelector, typeServiceSelector,
                tipeLineSelector, amountSelector, customerPhoneSelector, errorSelector, rientroSelector, btExecutedSelector, sentToTelecomSelector);
        sp.property(oloSelector, fileSelector);
        return sp;
    }

    @Override
    public void resetWithOther(SbcWlrRequestSearchForm other) {
        this.sbcWlrRequest = other.getSbcWlrRequest();
        this.actionTypeRange = other.getActionTypeRange();
        this.wlrTypeRange = other.getWlrTypeRange();
        this.flagmantenimentoProdottoRange = other.getFlagmantenimentoProdottoRange();
        this.datasottoscrizioneContrattoRange = other.getDatasottoscrizioneContrattoRange();
        this.dataDacRange = other.getDataDacRange();
        this.amountRange = other.getAmountRange();
        this.rientroRange = other.getRientroRange();
        this.progressivoRichiestaSelector = other.getProgressivoRichiestaSelector();
        this.actionTypeSelector = other.getActionTypeSelector();
        this.wlrTypeSelector = other.getWlrTypeSelector();
        this.dnSelector = other.getDnSelector();
        this.flagmantenimentoProdottoSelector = other.getFlagmantenimentoProdottoSelector();
        this.customerSurnameSelector = other.getCustomerSurnameSelector();
        this.particellaToponomasticaSelector = other.getParticellaToponomasticaSelector();
        this.viaSelector = other.getViaSelector();
        this.civicoSelector = other.getCivicoSelector();
        this.localitaSelector = other.getLocalitaSelector();
        this.codiceComuneSelector = other.getCodiceComuneSelector();
        this.cfPivaSelector = other.getCfPivaSelector();
        this.typeServiceSelector = other.getTypeServiceSelector();
        this.tipeLineSelector = other.getTipeLineSelector();
        this.amountSelector = other.getAmountSelector();
        this.customerPhoneSelector = other.getCustomerPhoneSelector();
        this.errorSelector = other.getErrorSelector();
        this.rientroSelector = other.getRientroSelector();
        this.btExecutedSelector = other.getBtExecutedSelector();
        this.sentToTelecomSelector = other.getSentToTelecomSelector();
        this.oloSelector = other.getOloSelector();
        this.fileSelector = other.getFileSelector();
    }

    // Ranges
    public Range<SbcWlrRequest, Integer> getActionTypeRange() {
        return actionTypeRange;
    }

    public Range<SbcWlrRequest, Integer> getWlrTypeRange() {
        return wlrTypeRange;
    }

    public Range<SbcWlrRequest, Integer> getFlagmantenimentoProdottoRange() {
        return flagmantenimentoProdottoRange;
    }

    public Range<SbcWlrRequest, Date> getDatasottoscrizioneContrattoRange() {
        return datasottoscrizioneContrattoRange;
    }

    public Range<SbcWlrRequest, Date> getDataDacRange() {
        return dataDacRange;
    }

    public Range<SbcWlrRequest, Integer> getAmountRange() {
        return amountRange;
    }

    public Range<SbcWlrRequest, Integer> getRientroRange() {
        return rientroRange;
    }

    // Property selectors
    public PropertySelector<SbcWlrRequest, String> getProgressivoRichiestaSelector() {
        return progressivoRichiestaSelector;
    }

    public PropertySelector<SbcWlrRequest, Integer> getActionTypeSelector() {
        return actionTypeSelector;
    }

    public PropertySelector<SbcWlrRequest, Integer> getWlrTypeSelector() {
        return wlrTypeSelector;
    }

    public PropertySelector<SbcWlrRequest, String> getDnSelector() {
        return dnSelector;
    }

    public PropertySelector<SbcWlrRequest, Integer> getFlagmantenimentoProdottoSelector() {
        return flagmantenimentoProdottoSelector;
    }

    public PropertySelector<SbcWlrRequest, String> getCustomerSurnameSelector() {
        return customerSurnameSelector;
    }

    public PropertySelector<SbcWlrRequest, String> getParticellaToponomasticaSelector() {
        return particellaToponomasticaSelector;
    }

    public PropertySelector<SbcWlrRequest, String> getViaSelector() {
        return viaSelector;
    }

    public PropertySelector<SbcWlrRequest, String> getCivicoSelector() {
        return civicoSelector;
    }

    public PropertySelector<SbcWlrRequest, String> getLocalitaSelector() {
        return localitaSelector;
    }

    public PropertySelector<SbcWlrRequest, String> getCodiceComuneSelector() {
        return codiceComuneSelector;
    }

    public PropertySelector<SbcWlrRequest, String> getCfPivaSelector() {
        return cfPivaSelector;
    }

    public PropertySelector<SbcWlrRequest, String> getTypeServiceSelector() {
        return typeServiceSelector;
    }

    public PropertySelector<SbcWlrRequest, String> getTipeLineSelector() {
        return tipeLineSelector;
    }

    public PropertySelector<SbcWlrRequest, Integer> getAmountSelector() {
        return amountSelector;
    }

    public PropertySelector<SbcWlrRequest, String> getCustomerPhoneSelector() {
        return customerPhoneSelector;
    }

    public PropertySelector<SbcWlrRequest, String> getErrorSelector() {
        return errorSelector;
    }

    public PropertySelector<SbcWlrRequest, Integer> getRientroSelector() {
        return rientroSelector;
    }

    public PropertySelector<SbcWlrRequest, Boolean> getBtExecutedSelector() {
        return btExecutedSelector;
    }

    public PropertySelector<SbcWlrRequest, Boolean> getSentToTelecomSelector() {
        return sentToTelecomSelector;
    }

    // Relation selectors
    public PropertySelector<SbcWlrRequest, OloCps> getOloSelector() {
        return oloSelector;
    }

    public PropertySelector<SbcWlrRequest, SbcFileRequest> getFileSelector() {
        return fileSelector;
    }
}
