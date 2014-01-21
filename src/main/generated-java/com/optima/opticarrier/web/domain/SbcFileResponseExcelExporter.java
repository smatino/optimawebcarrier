/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/ExcelExporter.e.vm.java
 */
package com.optima.opticarrier.web.domain;

import javax.inject.Inject;
import javax.inject.Named;

import com.optima.opticarrier.domain.SbcFileResponse;
import com.optima.opticarrier.web.domain.support.GenericExcelExporter;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

/**
 * Exports to excel document {@link SbcFileResponse} search criteria and result. 
 */
@Named
@ConversationContextScoped
public class SbcFileResponseExcelExporter extends GenericExcelExporter<SbcFileResponse> {
    @Inject
    protected SbcFileResponseSearchForm sf;

    public SbcFileResponseExcelExporter() {
        super("sbcFileResponse_nomeFile", "sbcFileResponse_dataCreazione", "sbcFileResponse_olo", "sbcFileResponse_stato");
    }

    @Override
    protected void fillResultItem(int row, SbcFileResponse item) {
        int col = 0;
        setValue(row, col++, item.getNomeFile());
        setDateTime(row, col++, item.getDataCreazione());
        setValue(row, col++, item.getOlo());
        setValue(row, col++, item.getStato());
    }

    @Override
    public void fillSearchCriteria(int row) {
        useCriteriaSheet();

        setSelector(row++, 0, "sbcFileResponse_nomeFile", sf.getNomeFileSelector());
        setRangeDateTime(row++, 0, "sbcFileResponse_dataCreazione", sf.getDataCreazioneRange());
        setSelector(row++, 0, "sbcFileResponse_olo", sf.getOloSelector());
        setSelector(row++, 0, "sbcFileResponse_stato", sf.getStatoSelector());
    }
}