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
import com.optima.opticarrier.domain.SbcCpsResponse;
import com.optima.opticarrier.domain.SbcCpsResponse_;
import com.optima.opticarrier.domain.SbcFileResponse;
import com.optima.opticarrier.repository.support.PropertySelector;
import com.optima.opticarrier.repository.support.Range;
import com.optima.opticarrier.repository.support.SearchParameters;
import com.optima.opticarrier.web.domain.support.GenericSearchForm;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link SbcCpsResponse}.
 * It exposes a {@link SbcCpsResponse} instance so it can be used in search by-example-query.
 */
@Named
@ConversationContextScoped
public class SbcCpsResponseSearchForm extends GenericSearchForm<SbcCpsResponse, Integer, SbcCpsResponseSearchForm> {
    private static final long serialVersionUID = 1L;
    protected SbcCpsResponse sbcCpsResponse = new SbcCpsResponse();
    protected Range<SbcCpsResponse, Date> dataNotificaRange = newRange(SbcCpsResponse_.dataNotifica);
    protected Range<SbcCpsResponse, Date> dataEspletamentoRange = newRange(SbcCpsResponse_.dataEspletamento);
    protected Range<SbcCpsResponse, Date> dataValidazioneFormaleContrattualeRange = newRange(SbcCpsResponse_.dataValidazioneFormaleContrattuale);
    protected Range<SbcCpsResponse, Date> dataValidazioneTecnicoGestionaleRange = newRange(SbcCpsResponse_.dataValidazioneTecnicoGestionale);
    protected Range<SbcCpsResponse, Date> dataDroRange = newRange(SbcCpsResponse_.dataDro);
    protected Range<SbcCpsResponse, Date> dataEstrazioneWlRange = newRange(SbcCpsResponse_.dataEstrazioneWl);
    protected PropertySelector<SbcCpsResponse, String> cliSelector = newPropertySelector(SbcCpsResponse_.cli);
    protected PropertySelector<SbcCpsResponse, String> tipoNotificaSelector = newPropertySelector(SbcCpsResponse_.tipoNotifica);
    protected PropertySelector<SbcCpsResponse, String> codiceFornitoreSelector = newPropertySelector(SbcCpsResponse_.codiceFornitore);
    protected PropertySelector<SbcCpsResponse, String> codiceOrdineFornitoreSelector = newPropertySelector(SbcCpsResponse_.codiceOrdineFornitore);
    protected PropertySelector<SbcCpsResponse, String> codiceRichiedenteSelector = newPropertySelector(SbcCpsResponse_.codiceRichiedente);
    protected PropertySelector<SbcCpsResponse, String> codiceOrdineRichiedenteSelector = newPropertySelector(SbcCpsResponse_.codiceOrdineRichiedente);
    protected PropertySelector<SbcCpsResponse, String> statoOrdineSelector = newPropertySelector(SbcCpsResponse_.statoOrdine);
    protected PropertySelector<SbcCpsResponse, String> classificazioneOrdineSelector = newPropertySelector(SbcCpsResponse_.classificazioneOrdine);
    protected PropertySelector<SbcCpsResponse, String> noteSelector = newPropertySelector(SbcCpsResponse_.note);
    protected PropertySelector<SbcCpsResponse, String> tipoCausaleRifiutoSelector = newPropertySelector(SbcCpsResponse_.tipoCausaleRifiuto);
    protected PropertySelector<SbcCpsResponse, String> codiceMotivorifiutoSelector = newPropertySelector(SbcCpsResponse_.codiceMotivorifiuto);
    protected PropertySelector<SbcCpsResponse, String> motivoRifiutoSelector = newPropertySelector(SbcCpsResponse_.motivoRifiuto);
    protected PropertySelector<SbcCpsResponse, SbcFileResponse> fileSelector = newPropertySelector(SbcCpsResponse_.file);
    protected PropertySelector<SbcCpsResponse, OloCps> oloSelector = newPropertySelector(SbcCpsResponse_.olo);

    public SbcCpsResponse getSbcCpsResponse() {
        return sbcCpsResponse;
    }

    @Override
    protected SbcCpsResponse getEntity() {
        return getSbcCpsResponse();
    }

    @Override
    public SbcCpsResponseSearchForm newInstance() {
        return new SbcCpsResponseSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        SearchParameters sp = searchParameters();
        sp.range(dataNotificaRange, dataEspletamentoRange, dataValidazioneFormaleContrattualeRange, dataValidazioneTecnicoGestionaleRange, dataDroRange,
                dataEstrazioneWlRange);
        sp.property(cliSelector, tipoNotificaSelector, codiceFornitoreSelector, codiceOrdineFornitoreSelector, codiceRichiedenteSelector,
                codiceOrdineRichiedenteSelector, statoOrdineSelector, classificazioneOrdineSelector, noteSelector, tipoCausaleRifiutoSelector,
                codiceMotivorifiutoSelector, motivoRifiutoSelector);
        sp.property(fileSelector, oloSelector);
        return sp;
    }

    @Override
    public void resetWithOther(SbcCpsResponseSearchForm other) {
        this.sbcCpsResponse = other.getSbcCpsResponse();
        this.dataNotificaRange = other.getDataNotificaRange();
        this.dataEspletamentoRange = other.getDataEspletamentoRange();
        this.dataValidazioneFormaleContrattualeRange = other.getDataValidazioneFormaleContrattualeRange();
        this.dataValidazioneTecnicoGestionaleRange = other.getDataValidazioneTecnicoGestionaleRange();
        this.dataDroRange = other.getDataDroRange();
        this.dataEstrazioneWlRange = other.getDataEstrazioneWlRange();
        this.cliSelector = other.getCliSelector();
        this.tipoNotificaSelector = other.getTipoNotificaSelector();
        this.codiceFornitoreSelector = other.getCodiceFornitoreSelector();
        this.codiceOrdineFornitoreSelector = other.getCodiceOrdineFornitoreSelector();
        this.codiceRichiedenteSelector = other.getCodiceRichiedenteSelector();
        this.codiceOrdineRichiedenteSelector = other.getCodiceOrdineRichiedenteSelector();
        this.statoOrdineSelector = other.getStatoOrdineSelector();
        this.classificazioneOrdineSelector = other.getClassificazioneOrdineSelector();
        this.noteSelector = other.getNoteSelector();
        this.tipoCausaleRifiutoSelector = other.getTipoCausaleRifiutoSelector();
        this.codiceMotivorifiutoSelector = other.getCodiceMotivorifiutoSelector();
        this.motivoRifiutoSelector = other.getMotivoRifiutoSelector();
        this.fileSelector = other.getFileSelector();
        this.oloSelector = other.getOloSelector();
    }

    // Ranges
    public Range<SbcCpsResponse, Date> getDataNotificaRange() {
        return dataNotificaRange;
    }

    public Range<SbcCpsResponse, Date> getDataEspletamentoRange() {
        return dataEspletamentoRange;
    }

    public Range<SbcCpsResponse, Date> getDataValidazioneFormaleContrattualeRange() {
        return dataValidazioneFormaleContrattualeRange;
    }

    public Range<SbcCpsResponse, Date> getDataValidazioneTecnicoGestionaleRange() {
        return dataValidazioneTecnicoGestionaleRange;
    }

    public Range<SbcCpsResponse, Date> getDataDroRange() {
        return dataDroRange;
    }

    public Range<SbcCpsResponse, Date> getDataEstrazioneWlRange() {
        return dataEstrazioneWlRange;
    }

    // Property selectors
    public PropertySelector<SbcCpsResponse, String> getCliSelector() {
        return cliSelector;
    }

    public PropertySelector<SbcCpsResponse, String> getTipoNotificaSelector() {
        return tipoNotificaSelector;
    }

    public PropertySelector<SbcCpsResponse, String> getCodiceFornitoreSelector() {
        return codiceFornitoreSelector;
    }

    public PropertySelector<SbcCpsResponse, String> getCodiceOrdineFornitoreSelector() {
        return codiceOrdineFornitoreSelector;
    }

    public PropertySelector<SbcCpsResponse, String> getCodiceRichiedenteSelector() {
        return codiceRichiedenteSelector;
    }

    public PropertySelector<SbcCpsResponse, String> getCodiceOrdineRichiedenteSelector() {
        return codiceOrdineRichiedenteSelector;
    }

    public PropertySelector<SbcCpsResponse, String> getStatoOrdineSelector() {
        return statoOrdineSelector;
    }

    public PropertySelector<SbcCpsResponse, String> getClassificazioneOrdineSelector() {
        return classificazioneOrdineSelector;
    }

    public PropertySelector<SbcCpsResponse, String> getNoteSelector() {
        return noteSelector;
    }

    public PropertySelector<SbcCpsResponse, String> getTipoCausaleRifiutoSelector() {
        return tipoCausaleRifiutoSelector;
    }

    public PropertySelector<SbcCpsResponse, String> getCodiceMotivorifiutoSelector() {
        return codiceMotivorifiutoSelector;
    }

    public PropertySelector<SbcCpsResponse, String> getMotivoRifiutoSelector() {
        return motivoRifiutoSelector;
    }

    // Relation selectors
    public PropertySelector<SbcCpsResponse, SbcFileResponse> getFileSelector() {
        return fileSelector;
    }

    public PropertySelector<SbcCpsResponse, OloCps> getOloSelector() {
        return oloSelector;
    }
}