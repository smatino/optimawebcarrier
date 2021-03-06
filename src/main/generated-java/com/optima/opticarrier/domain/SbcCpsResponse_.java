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

@StaticMetamodel(SbcCpsResponse.class)
public abstract class SbcCpsResponse_ {

    // Raw attributes
    public static volatile SingularAttribute<SbcCpsResponse, Integer> id;
    public static volatile SingularAttribute<SbcCpsResponse, String> cli;
    public static volatile SingularAttribute<SbcCpsResponse, String> tipoNotifica;
    public static volatile SingularAttribute<SbcCpsResponse, String> codiceFornitore;
    public static volatile SingularAttribute<SbcCpsResponse, String> codiceOrdineFornitore;
    public static volatile SingularAttribute<SbcCpsResponse, String> codiceRichiedente;
    public static volatile SingularAttribute<SbcCpsResponse, String> codiceOrdineRichiedente;
    public static volatile SingularAttribute<SbcCpsResponse, Date> dataNotifica;
    public static volatile SingularAttribute<SbcCpsResponse, String> statoOrdine;
    public static volatile SingularAttribute<SbcCpsResponse, Date> dataEspletamento;
    public static volatile SingularAttribute<SbcCpsResponse, Date> dataValidazioneFormaleContrattuale;
    public static volatile SingularAttribute<SbcCpsResponse, Date> dataValidazioneTecnicoGestionale;
    public static volatile SingularAttribute<SbcCpsResponse, Date> dataDro;
    public static volatile SingularAttribute<SbcCpsResponse, Date> dataEstrazioneWl;
    public static volatile SingularAttribute<SbcCpsResponse, String> classificazioneOrdine;
    public static volatile SingularAttribute<SbcCpsResponse, String> note;
    public static volatile SingularAttribute<SbcCpsResponse, String> tipoCausaleRifiuto;
    public static volatile SingularAttribute<SbcCpsResponse, String> codiceMotivorifiuto;
    public static volatile SingularAttribute<SbcCpsResponse, String> motivoRifiuto;

    // Many to one
    public static volatile SingularAttribute<SbcCpsResponse, SbcFileResponse> file;
    public static volatile SingularAttribute<SbcCpsResponse, OloCps> olo;
}