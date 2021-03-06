/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/domain/EntityMeta_.e.vm.java
 */
package com.optima.opticarrier.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(CpsQuoteResponsePenali.class)
public abstract class CpsQuoteResponsePenali_ {

    // Raw attributes
    public static volatile SingularAttribute<CpsQuoteResponsePenali, Integer> id;
    public static volatile SingularAttribute<CpsQuoteResponsePenali, Integer> totVolRichiestiDueMesiPrec;
    public static volatile SingularAttribute<CpsQuoteResponsePenali, Integer> totVolAssegnatiDueMesiPrec;
    public static volatile SingularAttribute<CpsQuoteResponsePenali, Integer> totVolEffettiviDueMesiPrec;
    public static volatile SingularAttribute<CpsQuoteResponsePenali, Integer> sogliaPenale;
    public static volatile SingularAttribute<CpsQuoteResponsePenali, Integer> percentualePenaleApplicata;

    // Many to one
    public static volatile SingularAttribute<CpsQuoteResponsePenali, OloCps> olo;
    public static volatile SingularAttribute<CpsQuoteResponsePenali, SbcFileResponse> file;
}