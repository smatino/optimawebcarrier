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

@StaticMetamodel(CpsQuoteRequest.class)
public abstract class CpsQuoteRequest_ {

    // Raw attributes
    public static volatile SingularAttribute<CpsQuoteRequest, Integer> id;
    public static volatile SingularAttribute<CpsQuoteRequest, Integer> codiceArea;
    public static volatile SingularAttribute<CpsQuoteRequest, String> descrizioneArea;
    public static volatile SingularAttribute<CpsQuoteRequest, Integer> quantitaRichiesta;
    public static volatile SingularAttribute<CpsQuoteRequest, Integer> mm;
    public static volatile SingularAttribute<CpsQuoteRequest, Integer> yyyy;
    public static volatile SingularAttribute<CpsQuoteRequest, String> status;

    // Many to one
    public static volatile SingularAttribute<CpsQuoteRequest, OloCps> olo;
    public static volatile SingularAttribute<CpsQuoteRequest, SbcFileRequest> file;
}