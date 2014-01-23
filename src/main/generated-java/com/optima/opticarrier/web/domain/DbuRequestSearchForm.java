package com.optima.opticarrier.web.domain;

import com.optima.opticarrier.domain.DbuRequest;
import com.optima.opticarrier.domain.DbuRequest_;
import com.optima.opticarrier.repository.support.PropertySelector;
import com.optima.opticarrier.repository.support.Range;
import com.optima.opticarrier.repository.support.SearchParameters;
import com.optima.opticarrier.web.domain.support.GenericSearchForm;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

import javax.inject.Named;
import java.util.Date;

import static com.optima.opticarrier.repository.support.PropertySelector.newPropertySelector;
import static com.optima.opticarrier.repository.support.Range.newRange;

@Named
@ConversationContextScoped
public class DbuRequestSearchForm extends GenericSearchForm<DbuRequest, Integer, DbuRequestSearchForm> {

    protected DbuRequest dbuRequest = new DbuRequest();

    protected PropertySelector<DbuRequest, String> optProgressivoSelector = newPropertySelector(DbuRequest_.optProgressivo);
    protected PropertySelector<DbuRequest, String> dnSelector = newPropertySelector(DbuRequest_.dn);
    protected PropertySelector<DbuRequest, Boolean> flagPubblicazioneSelector = newPropertySelector(DbuRequest_.flagPubblicazione);
    protected PropertySelector<DbuRequest, Boolean> flagCancellazioneSelector = newPropertySelector(DbuRequest_.flagCancellazione);
    protected PropertySelector<DbuRequest, String> flagModificaSelector = newPropertySelector(DbuRequest_.flagModifica);
    protected PropertySelector<DbuRequest, String> ragSocialeSelector = newPropertySelector(DbuRequest_.ragSociale);
    protected PropertySelector<DbuRequest, String> indirizzoSelector = newPropertySelector(DbuRequest_.indirizzo);
    protected PropertySelector<DbuRequest, String> localitaSelector = newPropertySelector(DbuRequest_.localita);
    protected PropertySelector<DbuRequest, String> provinciaSelector = newPropertySelector(DbuRequest_.provincia);
    protected PropertySelector<DbuRequest, String> capSelector = newPropertySelector(DbuRequest_.cap);
    protected PropertySelector<DbuRequest, String> codFiscSelector = newPropertySelector(DbuRequest_.codFisc);
    protected PropertySelector<DbuRequest, String> pIvaSelector = newPropertySelector(DbuRequest_.pIva);
    protected PropertySelector<DbuRequest, String> telefonoSelector = newPropertySelector(DbuRequest_.telefono);
    protected PropertySelector<DbuRequest, String> faxSelector = newPropertySelector(DbuRequest_.fax);
    protected PropertySelector<DbuRequest, String> titoloStudioSelector = newPropertySelector(DbuRequest_.titoloStudio);
    protected PropertySelector<DbuRequest, String> attivitaSelector = newPropertySelector(DbuRequest_.attivita);
    protected PropertySelector<DbuRequest, Boolean> flagReverseSelector = newPropertySelector(DbuRequest_.flagReverse);
    protected PropertySelector<DbuRequest, Boolean> flagPubblicitaSelector = newPropertySelector(DbuRequest_.flagPubblicita);
    protected Range<DbuRequest, Date> dateInsertRange = newRange(DbuRequest_.dateInsert);

    @Override
    protected DbuRequest getEntity() {
        return dbuRequest;
    }

    @Override
    public SearchParameters toSearchParameters() {
        SearchParameters sp = searchParameters();
        sp.property(optProgressivoSelector, dnSelector, flagPubblicazioneSelector, flagCancellazioneSelector,
                flagModificaSelector, ragSocialeSelector, indirizzoSelector, localitaSelector, provinciaSelector,
                capSelector, codFiscSelector, pIvaSelector, telefonoSelector, faxSelector, titoloStudioSelector,
                attivitaSelector, flagReverseSelector, flagPubblicitaSelector);

        sp.range(dateInsertRange);
        return sp;
    }

    @Override
    public DbuRequestSearchForm newInstance() {
        return new DbuRequestSearchForm();
    }

    @Override
    public void resetWithOther(DbuRequestSearchForm other) {
        this.dbuRequest = other.getEntity();
        this.optProgressivoSelector = other.getOptProgressivoSelector();
        this.dnSelector = other.getDnSelector();
        this.flagPubblicazioneSelector = other.getFlagPubblicazioneSelector();
        this.flagCancellazioneSelector = other.getFlagCancellazioneSelector();
        this.flagModificaSelector = other.getFlagModificaSelector();
        this.ragSocialeSelector = other.getRagSocialeSelector();
        this.indirizzoSelector = other.getIndirizzoSelector();
        this.localitaSelector = other.getLocalitaSelector();
        this.provinciaSelector = other.getProvinciaSelector();
        this.capSelector = other.getCapSelector();
        this.codFiscSelector = other.getCodFiscSelector();
        this.pIvaSelector = other.getpIvaSelector();
        this.telefonoSelector = other.getTelefonoSelector();
        this.faxSelector = other.getFaxSelector();
        this.titoloStudioSelector = other.getTitoloStudioSelector();
        this.attivitaSelector = other.getAttivitaSelector();
        this.flagReverseSelector = other.getFlagReverseSelector();
        this.flagPubblicitaSelector = other.getFlagPubblicitaSelector();
        this.dateInsertRange = other.getDateInsertRange();
    }

    public void setDnSelector(PropertySelector<DbuRequest, String> dnSelector) {
        this.dnSelector = dnSelector;
    }

    public PropertySelector<DbuRequest, String> getDnSelector() {
        return dnSelector;
    }

    public PropertySelector<DbuRequest, String> getOptProgressivoSelector() {
        return optProgressivoSelector;
    }

    public PropertySelector<DbuRequest, Boolean> getFlagPubblicazioneSelector() {
        return flagPubblicazioneSelector;
    }

    public PropertySelector<DbuRequest, Boolean> getFlagCancellazioneSelector() {
        return flagCancellazioneSelector;
    }

    public PropertySelector<DbuRequest, String> getFlagModificaSelector() {
        return flagModificaSelector;
    }

    public PropertySelector<DbuRequest, String> getRagSocialeSelector() {
        return ragSocialeSelector;
    }

    public PropertySelector<DbuRequest, String> getIndirizzoSelector() {
        return indirizzoSelector;
    }

    public PropertySelector<DbuRequest, String> getLocalitaSelector() {
        return localitaSelector;
    }

    public PropertySelector<DbuRequest, String> getProvinciaSelector() {
        return provinciaSelector;
    }

    public PropertySelector<DbuRequest, String> getCapSelector() {
        return capSelector;
    }

    public PropertySelector<DbuRequest, String> getCodFiscSelector() {
        return codFiscSelector;
    }

    public PropertySelector<DbuRequest, String> getpIvaSelector() {
        return pIvaSelector;
    }

    public PropertySelector<DbuRequest, String> getTelefonoSelector() {
        return telefonoSelector;
    }

    public PropertySelector<DbuRequest, String> getFaxSelector() {
        return faxSelector;
    }

    public PropertySelector<DbuRequest, String> getTitoloStudioSelector() {
        return titoloStudioSelector;
    }

    public PropertySelector<DbuRequest, String> getAttivitaSelector() {
        return attivitaSelector;
    }

    public PropertySelector<DbuRequest, Boolean> getFlagReverseSelector() {
        return flagReverseSelector;
    }

    public PropertySelector<DbuRequest, Boolean> getFlagPubblicitaSelector() {
        return flagPubblicitaSelector;
    }

    public Range<DbuRequest, Date> getDateInsertRange() {
        return dateInsertRange;
    }
}
