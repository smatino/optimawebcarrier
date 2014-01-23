package com.optima.opticarrier.web.domain;

import com.optima.opticarrier.domain.DbuRequest;
import com.optima.opticarrier.web.domain.support.GenericExcelExporter;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

import javax.inject.Inject;
import javax.inject.Named;

@Named
@ConversationContextScoped
public class DbuRequestExcelExporter extends GenericExcelExporter<DbuRequest> {

    @Inject
    protected DbuRequestSearchForm sf;

    public DbuRequestExcelExporter() {
        super("dbuRequest_optProgressivo", "dbuRequest_dn", "dbuRequest_flagPubblicazione", "dbuRequest_flagCancellazione",
                "dbuRequest_flagModifica", "dbuRequest_ragSociale", "dbuRequest_indirizzo", "dbuRequest_localita",
                "dbuRequest_provincia", "dbuRequest_cap", "dbuRequest_codFisc", "dbuRequest_pIva", "dbuRequest_telefono",
                "dbuRequest_fax", "dbuRequest_titoloStudio", "dbuRequest_attivita", "dbuRequest_flagReverse",
                "dbuRequest_flagPubblicita", "dbuRequest_dateInsert");
    }

    @Override
    protected void fillResultItem(int row, DbuRequest item) {
        int col = 0;
        setValue(row, col++, item.getOptProgressivo());
        setValue(row, col++, item.getDn());
        setValue(row, col++, item.getFlagPubblicazione());
        setValue(row, col++, item.getFlagCancellazione());
        setValue(row, col++, item.getFlagModifica());
        setValue(row, col++, item.getRagSociale());
        setValue(row, col++, item.getIndirizzo());
        setValue(row, col++, item.getLocalita());
        setValue(row, col++, item.getProvincia());
        setValue(row, col++, item.getCap());
        setValue(row, col++, item.getCodFisc());
        setValue(row, col++, item.getpIva());
        setValue(row, col++, item.getTelefono());
        setValue(row, col++, item.getFax());
        setValue(row, col++, item.getTitoloStudio());
        setValue(row, col++, item.getAttivita());
        setValue(row, col++, item.getFlagReverse());
        setValue(row, col++, item.getFlagPubblicita());
        setDateTime(row, col, item.getDateInsert());
    }

    @Override
    public void fillSearchCriteria(int row) {
        setSelector(row++, 0, "dbuRequest_optProgressivo", sf.getOptProgressivoSelector());
        setSelector(row++, 0, "dbuRequest_dn", sf.getDnSelector());
        setSelector(row++, 0, "dbuRequest_flagPubblicazione", sf.getFlagPubblicazioneSelector());
        setSelector(row++, 0, "dbuRequest_flagCancellazione", sf.getFlagCancellazioneSelector());
        setSelector(row++, 0, "dbuRequest_flagModifica", sf.getFlagModificaSelector());
        setSelector(row++, 0, "dbuRequest_ragSociale", sf.getRagSocialeSelector());
        setSelector(row++, 0, "dbuRequest_indirizzo", sf.getIndirizzoSelector());
        setSelector(row++, 0, "dbuRequest_localita", sf.getLocalitaSelector());
        setSelector(row++, 0, "dbuRequest_provincia", sf.getProvinciaSelector());
        setSelector(row++, 0, "dbuRequest_cap", sf.getCapSelector());
        setSelector(row++, 0, "dbuRequest_codFisc", sf.getCodFiscSelector());
        setSelector(row++, 0, "dbuRequest_pIva", sf.getpIvaSelector());
        setSelector(row++, 0, "dbuRequest_telefono", sf.getTelefonoSelector());
        setSelector(row++, 0, "dbuRequest_fax", sf.getFaxSelector());
        setSelector(row++, 0, "dbuRequest_titoloStudio", sf.getTitoloStudioSelector());
        setSelector(row++, 0, "dbuRequest_attivita", sf.getAttivitaSelector());
        setSelector(row++, 0, "dbuRequest_flagReverse", sf.getFlagReverseSelector());
        setSelector(row++, 0, "dbuRequest_flagPubblicita", sf.getFlagPubblicitaSelector());
        setRangeDateTime(row, 0, "dbuRequest_dateInsert", sf.getDateInsertRange());
    }
}
