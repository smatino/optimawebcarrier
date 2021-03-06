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

@StaticMetamodel(CpsDeactivationNotification.class)
public abstract class CpsDeactivationNotification_ {

    // Raw attributes
    public static volatile SingularAttribute<CpsDeactivationNotification, Integer> id;
    public static volatile SingularAttribute<CpsDeactivationNotification, String> codiceFornitore;
    public static volatile SingularAttribute<CpsDeactivationNotification, Date> dataNotifica;
    public static volatile SingularAttribute<CpsDeactivationNotification, String> dn;
    public static volatile SingularAttribute<CpsDeactivationNotification, String> dataSottoscrizioneContratto;
    public static volatile SingularAttribute<CpsDeactivationNotification, String> codiceMotivoRifiuto;
    public static volatile SingularAttribute<CpsDeactivationNotification, Date> dataEsplitamento;
    public static volatile SingularAttribute<CpsDeactivationNotification, String> motivoRifiuto;
    public static volatile SingularAttribute<CpsDeactivationNotification, String> status;
}