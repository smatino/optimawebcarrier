package com.optima.opticarrier.web.domain;

import com.optima.opticarrier.domain.DbuRequest;
import com.optima.opticarrier.printer.DbuRequestPrinter;
import com.optima.opticarrier.repository.DbuRequestRepository;
import com.optima.opticarrier.web.domain.support.GenericController;
import com.optima.opticarrier.web.permission.DbuRequestPermission;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class DbuRequestController extends GenericController<DbuRequest, Integer> {

    public static final String DBUREQUEST_EDIT_URI = "/domain/dbuRequestEdit.faces";
    public static final String DBUREQUEST_SELECT_URI = "/domain/dbuRequestSelect.faces";

    @Inject
    public DbuRequestController(DbuRequestRepository repository, DbuRequestPermission permission, DbuRequestPrinter printer) {
        super(repository, permission, printer, DBUREQUEST_SELECT_URI, DBUREQUEST_EDIT_URI);
    }
}
