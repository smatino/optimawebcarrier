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

import com.optima.opticarrier.domain.WlrRequestAggiuntivis;
import com.optima.opticarrier.web.domain.support.GenericExcelExporter;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

/**
 * Exports to excel document {@link WlrRequestAggiuntivis} search criteria and result. 
 */
@Named
@ConversationContextScoped
public class WlrRequestAggiuntivisExcelExporter extends GenericExcelExporter<WlrRequestAggiuntivis> {
    @Inject
    protected WlrRequestAggiuntivisSearchForm sf;

    public WlrRequestAggiuntivisExcelExporter() {
        super("wlrRequestAggiuntivis_aggiuntivi", "wlrRequestAggiuntivis_completed");
    }

    @Override
    protected void fillResultItem(int row, WlrRequestAggiuntivis item) {
        int col = 0;
        setValue(row, col++, item.getAggiuntivi());
        setValue(row, col++, item.getCompleted());
    }

    @Override
    public void fillSearchCriteria(int row) {
        useCriteriaSheet();

        setSelectedEntities(row++, 0, "wlrRequestAggiuntivis_request", sf.getRequestSelector().getSelected());
        setSelector(row++, 0, "wlrRequestAggiuntivis_aggiuntivi", sf.getAggiuntiviSelector());
        setSelector(row++, 0, "wlrRequestAggiuntivis_completed", sf.getCompletedSelector());
    }
}