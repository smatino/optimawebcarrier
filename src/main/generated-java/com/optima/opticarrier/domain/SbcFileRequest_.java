/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/domain/EntityMeta_.e.vm.java
 */
package com.optima.opticarrier.domain;

import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(SbcFileRequest.class)
public abstract class SbcFileRequest_ {

    // Raw attributes
    public static volatile SingularAttribute<SbcFileRequest, Integer> id;
    public static volatile SingularAttribute<SbcFileRequest, String> nomeFile;
    public static volatile SingularAttribute<SbcFileRequest, Date> dataCreazione;
    public static volatile SingularAttribute<SbcFileRequest, String> olo;
    public static volatile SingularAttribute<SbcFileRequest, String> stato;
    public static volatile SingularAttribute<SbcFileRequest, Integer> rowNumber;
    public static volatile SingularAttribute<SbcFileRequest, String> status;
}