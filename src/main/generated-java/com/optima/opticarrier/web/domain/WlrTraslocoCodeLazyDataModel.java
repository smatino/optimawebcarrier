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

import com.optima.opticarrier.domain.WlrTraslocoCode;
import com.optima.opticarrier.repository.WlrTraslocoCodeRepository;
import com.optima.opticarrier.web.domain.support.GenericLazyDataModel;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

/**
 * Provide PrimeFaces {@link LazyDataModel} for {@link WlrTraslocoCode}
 */
@Named
@ConversationContextScoped
public class WlrTraslocoCodeLazyDataModel extends GenericLazyDataModel<WlrTraslocoCode, String, WlrTraslocoCodeSearchForm> {
    private static final long serialVersionUID = 1L;

    @Inject
    public WlrTraslocoCodeLazyDataModel(WlrTraslocoCodeRepository wlrTraslocoCodeRepository, WlrTraslocoCodeController wlrTraslocoCodeController,
            WlrTraslocoCodeSearchForm wlrTraslocoCodeSearchForm, WlrTraslocoCodeExcelExporter wlrTraslocoCodeExcelExporter) {
        super(wlrTraslocoCodeRepository, wlrTraslocoCodeController, wlrTraslocoCodeSearchForm, wlrTraslocoCodeExcelExporter);
    }
}