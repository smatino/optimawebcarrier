package com.optima.opticarrier.printer;

import com.optima.opticarrier.domain.DbuRequest;
import com.optima.opticarrier.domain.DbuRequest_;
import com.optima.opticarrier.printer.support.GenericPrinter;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Locale;

@Named
@Singleton
public class DbuRequestPrinter extends GenericPrinter<DbuRequest> {

    public DbuRequestPrinter() {
        super(DbuRequest.class, DbuRequest_.id, DbuRequest_.dn, DbuRequest_.optProgressivo);
    }

    @Override
    public String print(DbuRequest dbuRequest, Locale locale) {
        if (dbuRequest == null) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        appendIfNotEmpty(ret, dbuRequest.getId());
        appendIfNotEmpty(ret, dbuRequest.getOptProgressivo());
        appendIfNotEmpty(ret, dbuRequest.getDn());
        appendIfNotEmpty(ret, dbuRequest.getFlagPubblicazione());
        appendIfNotEmpty(ret, dbuRequest.getFlagCancellazione());
        appendIfNotEmpty(ret, dbuRequest.getFlagModifica());
        appendIfNotEmpty(ret, dbuRequest.getRagSociale());
        appendIfNotEmpty(ret, dbuRequest.getIndirizzo());
        appendIfNotEmpty(ret, dbuRequest.getLocalita());
        appendIfNotEmpty(ret, dbuRequest.getProvincia());
        appendIfNotEmpty(ret, dbuRequest.getCap());
        appendIfNotEmpty(ret, dbuRequest.getCodFisc());
        appendIfNotEmpty(ret, dbuRequest.getpIva());
        appendIfNotEmpty(ret, dbuRequest.getTelefono());
        appendIfNotEmpty(ret, dbuRequest.getFax());
        appendIfNotEmpty(ret, dbuRequest.getTitoloStudio());
        appendIfNotEmpty(ret, dbuRequest.getAttivita());
        appendIfNotEmpty(ret, dbuRequest.getFlagReverse());
        appendIfNotEmpty(ret, dbuRequest.getFlagPubblicita());
        appendIfNotEmpty(ret, dbuRequest.getDateInsert());
        return ret.toString();
    }
}
