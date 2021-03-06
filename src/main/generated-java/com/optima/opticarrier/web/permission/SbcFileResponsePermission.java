/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/permission/Permission.e.vm.java
 */
package com.optima.opticarrier.web.permission;

import javax.inject.Named;
import javax.inject.Singleton;

import com.optima.opticarrier.domain.SbcFileResponse;
import com.optima.opticarrier.web.permission.support.GenericPermission;

@Named
@Singleton
public class SbcFileResponsePermission extends GenericPermission<SbcFileResponse> {
    public SbcFileResponsePermission() {
        super(SbcFileResponse.class);
    }
}