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

import com.optima.opticarrier.domain.CpsQuoteResponsePenali;
import com.optima.opticarrier.repository.CpsQuoteResponsePenaliRepository;
import com.optima.opticarrier.web.domain.support.GenericLazyDataModel;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

/**
 * Provide PrimeFaces {@link LazyDataModel} for {@link CpsQuoteResponsePenali}
 */
@Named
@ConversationContextScoped
public class CpsQuoteResponsePenaliLazyDataModel extends GenericLazyDataModel<CpsQuoteResponsePenali, Integer, CpsQuoteResponsePenaliSearchForm> {
    private static final long serialVersionUID = 1L;

    @Inject
    public CpsQuoteResponsePenaliLazyDataModel(CpsQuoteResponsePenaliRepository cpsQuoteResponsePenaliRepository,
            CpsQuoteResponsePenaliController cpsQuoteResponsePenaliController, CpsQuoteResponsePenaliSearchForm cpsQuoteResponsePenaliSearchForm,
            CpsQuoteResponsePenaliExcelExporter cpsQuoteResponsePenaliExcelExporter) {
        super(cpsQuoteResponsePenaliRepository, cpsQuoteResponsePenaliController, cpsQuoteResponsePenaliSearchForm, cpsQuoteResponsePenaliExcelExporter);
    }
}