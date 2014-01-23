package com.optima.opticarrier.web.domain;

import com.optima.opticarrier.domain.DbuRequest;
import com.optima.opticarrier.repository.DbuRequestRepository;
import com.optima.opticarrier.web.domain.support.GenericLazyDataModel;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

import javax.inject.Inject;
import javax.inject.Named;

@Named
@ConversationContextScoped
public class DbuRequestLazyDataModel extends GenericLazyDataModel<DbuRequest, Integer, DbuRequestSearchForm> {

    @Inject
    public DbuRequestLazyDataModel(DbuRequestRepository repository, DbuRequestController controller, DbuRequestSearchForm searchForm, DbuRequestExcelExporter excelExporter) {
        super(repository, controller, searchForm, excelExporter);
    }
}
