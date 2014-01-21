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

import com.optima.opticarrier.domain.WlrServiceCode;
import com.optima.opticarrier.web.domain.support.GenericExcelExporter;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

/**
 * Exports to excel document {@link WlrServiceCode} search criteria and result. 
 */
@Named
@ConversationContextScoped
public class WlrServiceCodeExcelExporter extends GenericExcelExporter<WlrServiceCode> {
    @Inject
    protected WlrServiceCodeSearchForm sf;

    public WlrServiceCodeExcelExporter() {
        super("wlrServiceCode_id", "wlrServiceCode_telecomSts");
    }

    @Override
    protected void fillResultItem(int row, WlrServiceCode item) {
        int col = 0;
        setValue(row, col++, item.getId());
        setValue(row, col++, item.getTelecomSts());
    }

    @Override
    public void fillSearchCriteria(int row) {
        useCriteriaSheet();

        setSelector(row++, 0, "wlrServiceCode_id", sf.getIdSelector());
        setSelector(row++, 0, "wlrServiceCode_telecomSts", sf.getTelecomStsSelector());
    }
}