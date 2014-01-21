/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/EditForm.e.vm.java
 */
package com.optima.opticarrier.web.domain;

import javax.inject.Inject;
import javax.inject.Named;

import com.optima.opticarrier.domain.CpsDeactivationPrenotification;
import com.optima.opticarrier.repository.CpsDeactivationPrenotificationRepository;
import com.optima.opticarrier.web.domain.support.GenericEditForm;
import com.optima.opticarrier.web.faces.ConversationContextScoped;

/**
 * View Helper/Controller to edit {@link CpsDeactivationPrenotification}.
 */
@Named
@ConversationContextScoped
public class CpsDeactivationPrenotificationEditForm extends GenericEditForm<CpsDeactivationPrenotification, Integer> {
    @Inject
    protected CpsDeactivationPrenotificationController cpsDeactivationPrenotificationController;

    @Inject
    public CpsDeactivationPrenotificationEditForm(CpsDeactivationPrenotificationRepository cpsDeactivationPrenotificationRepository) {
        super(cpsDeactivationPrenotificationRepository);
    }

    /**
     * The entity to edit/view.
     */
    public CpsDeactivationPrenotification getCpsDeactivationPrenotification() {
        return getEntity();
    }

    public String print() {
        return cpsDeactivationPrenotificationController.print(getCpsDeactivationPrenotification());
    }
}
