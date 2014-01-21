/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/EditForm.e.vm.java
 */
package com.optima.opticarrier.web.domain;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import com.optima.opticarrier.domain.CpsQuoteResponsePenali;
import com.optima.opticarrier.domain.CpsQuoteResponsePenali_;
import com.optima.opticarrier.domain.OloCps;
import com.optima.opticarrier.domain.SbcFileResponse;
import com.optima.opticarrier.repository.CpsQuoteResponsePenaliRepository;
import com.optima.opticarrier.web.domain.support.GenericEditForm;
import com.optima.opticarrier.web.domain.support.GenericToOneAssociation;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

/**
 * View Helper/Controller to edit {@link CpsQuoteResponsePenali}.
 */
@Named
@ConversationContextScoped
public class CpsQuoteResponsePenaliEditForm extends GenericEditForm<CpsQuoteResponsePenali, Integer> {
    @Inject
    protected CpsQuoteResponsePenaliController cpsQuoteResponsePenaliController;
    @Inject
    protected OloCpsController oloCpsController;
    protected GenericToOneAssociation<OloCps, Integer> olo;
    @Inject
    protected SbcFileResponseController sbcFileResponseController;
    protected GenericToOneAssociation<SbcFileResponse, Integer> file;

    @Inject
    public CpsQuoteResponsePenaliEditForm(CpsQuoteResponsePenaliRepository cpsQuoteResponsePenaliRepository,
            CpsQuoteResponsePenaliGraphLoader cpsQuoteResponsePenaliGraphLoader) {
        super(cpsQuoteResponsePenaliRepository, cpsQuoteResponsePenaliGraphLoader);
    }

    /**
     * The entity to edit/view.
     */
    public CpsQuoteResponsePenali getCpsQuoteResponsePenali() {
        return getEntity();
    }

    public String print() {
        return cpsQuoteResponsePenaliController.print(getCpsQuoteResponsePenali());
    }

    @PostConstruct
    void setupOloActions() {
        olo = new GenericToOneAssociation<OloCps, Integer>(oloCpsController, CpsQuoteResponsePenali_.olo) {
            @Override
            protected OloCps get() {
                return getCpsQuoteResponsePenali().getOlo();
            }

            @Override
            protected void set(OloCps oloCps) {
                getCpsQuoteResponsePenali().setOlo(oloCps);
            }
        };
    }

    public GenericToOneAssociation<OloCps, Integer> getOlo() {
        return olo;
    }

    @PostConstruct
    void setupFileActions() {
        file = new GenericToOneAssociation<SbcFileResponse, Integer>(sbcFileResponseController, CpsQuoteResponsePenali_.file) {
            @Override
            protected SbcFileResponse get() {
                return getCpsQuoteResponsePenali().getFile();
            }

            @Override
            protected void set(SbcFileResponse sbcFileResponse) {
                getCpsQuoteResponsePenali().setFile(sbcFileResponse);
            }
        };
    }

    public GenericToOneAssociation<SbcFileResponse, Integer> getFile() {
        return file;
    }
}
