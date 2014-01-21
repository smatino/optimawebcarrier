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

import com.optima.opticarrier.domain.SbcFileRequest;
import com.optima.opticarrier.web.domain.support.GenericExcelExporter;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

/**
 * Exports to excel document {@link SbcFileRequest} search criteria and result. 
 */
@Named
@ConversationContextScoped
public class SbcFileRequestExcelExporter extends GenericExcelExporter<SbcFileRequest> {
    @Inject
    protected SbcFileRequestSearchForm sf;

    public SbcFileRequestExcelExporter() {
        super("sbcFileRequest_nomeFile", "sbcFileRequest_dataCreazione", "sbcFileRequest_olo", "sbcFileRequest_stato", "sbcFileRequest_rowNumber",
                "sbcFileRequest_status");
    }

    @Override
    protected void fillResultItem(int row, SbcFileRequest item) {
        int col = 0;
        setValue(row, col++, item.getNomeFile());
        setDateTime(row, col++, item.getDataCreazione());
        setValue(row, col++, item.getOlo());
        setValue(row, col++, item.getStato());
        setValue(row, col++, item.getRowNumber());
        setValue(row, col++, item.getStatus());
    }

    @Override
    public void fillSearchCriteria(int row) {
        useCriteriaSheet();

        setSelector(row++, 0, "sbcFileRequest_nomeFile", sf.getNomeFileSelector());
        setRangeDateTime(row++, 0, "sbcFileRequest_dataCreazione", sf.getDataCreazioneRange());
        setSelector(row++, 0, "sbcFileRequest_olo", sf.getOloSelector());
        setSelector(row++, 0, "sbcFileRequest_stato", sf.getStatoSelector());
        setRangeNumber(row++, 0, "sbcFileRequest_rowNumber", sf.getRowNumberRange());
        setSelector(row++, 0, "sbcFileRequest_status", sf.getStatusSelector());
    }
}