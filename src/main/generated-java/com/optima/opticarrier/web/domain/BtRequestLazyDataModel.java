/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/LazyDataModel.e.vm.java
 */
package com.optima.opticarrier.web.domain;

import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.LazyDataModel;

import com.optima.opticarrier.domain.BtRequest;
import com.optima.opticarrier.repository.BtRequestRepository;
import com.optima.opticarrier.web.domain.support.GenericLazyDataModel;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

/**
 * Provide PrimeFaces {@link LazyDataModel} for {@link BtRequest}
 */
@Named
@ConversationContextScoped
public class BtRequestLazyDataModel extends GenericLazyDataModel<BtRequest, Integer, BtRequestSearchForm> {
    private static final long serialVersionUID = 1L;

    @Inject
    public BtRequestLazyDataModel(BtRequestRepository btRequestRepository, BtRequestController btRequestController, BtRequestSearchForm btRequestSearchForm,
            BtRequestExcelExporter btRequestExcelExporter) {
        super(btRequestRepository, btRequestController, btRequestSearchForm, btRequestExcelExporter);
    }
}