/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/Controller.e.vm.java
 */
package com.optima.opticarrier.web.domain;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.optima.opticarrier.domain.CpsDeactivationNotification;
import com.optima.opticarrier.printer.CpsDeactivationNotificationPrinter;
import com.optima.opticarrier.repository.CpsDeactivationNotificationRepository;
import com.optima.opticarrier.web.domain.support.GenericController;
import com.optima.opticarrier.web.permission.CpsDeactivationNotificationPermission;

/**
 * Stateless controller for {@link CpsDeactivationNotification} conversation start.
 */
@Named
@Singleton
public class CpsDeactivationNotificationController extends GenericController<CpsDeactivationNotification, Integer> {
    public static final String CPSDEACTIVATIONNOTIFICATION_EDIT_URI = "/domain/cpsDeactivationNotificationEdit.faces";
    public static final String CPSDEACTIVATIONNOTIFICATION_SELECT_URI = "/domain/cpsDeactivationNotificationSelect.faces";

    @Inject
    public CpsDeactivationNotificationController(CpsDeactivationNotificationRepository cpsDeactivationNotificationRepository,
            CpsDeactivationNotificationPermission cpsDeactivationNotificationPermission, CpsDeactivationNotificationPrinter cpsDeactivationNotificationPrinter) {
        super(cpsDeactivationNotificationRepository, cpsDeactivationNotificationPermission, cpsDeactivationNotificationPrinter,
                CPSDEACTIVATIONNOTIFICATION_SELECT_URI, CPSDEACTIVATIONNOTIFICATION_EDIT_URI);
    }
}