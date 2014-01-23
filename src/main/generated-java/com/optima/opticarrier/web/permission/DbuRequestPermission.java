package com.optima.opticarrier.web.permission;

import com.optima.opticarrier.domain.DbuRequest;
import com.optima.opticarrier.web.permission.support.GenericPermission;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class DbuRequestPermission extends GenericPermission<DbuRequest> {

    public DbuRequestPermission() {
        super(DbuRequest.class);
    }
}
