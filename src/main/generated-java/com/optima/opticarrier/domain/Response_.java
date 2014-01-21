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

@StaticMetamodel(Response.class)
public abstract class Response_ {

    // Raw attributes
    public static volatile SingularAttribute<Response, Integer> id;
    public static volatile SingularAttribute<Response, Integer> idSBC;
    public static volatile SingularAttribute<Response, Integer> actionType;
    public static volatile SingularAttribute<Response, String> dataCambiamentoStato;
    public static volatile SingularAttribute<Response, String> codiceErrore;
    public static volatile SingularAttribute<Response, String> descrizioneErrore;
    public static volatile SingularAttribute<Response, String> nomeFileDiOrigineRichiesta;
    public static volatile SingularAttribute<Response, String> progressivoRichiesta;
    public static volatile SingularAttribute<Response, String> dataSpedizioneFile;
    public static volatile SingularAttribute<Response, String> tipoOperazione;
    public static volatile SingularAttribute<Response, String> tipoServizio;
    public static volatile SingularAttribute<Response, String> tipoLinea;
    public static volatile SingularAttribute<Response, String> tipoAttivazione;
    public static volatile SingularAttribute<Response, String> numeroLinee;
    public static volatile SingularAttribute<Response, String> cli;
    public static volatile SingularAttribute<Response, String> tipoNotifica;
    public static volatile SingularAttribute<Response, String> statoOrdine;
    public static volatile SingularAttribute<Response, String> type;
    public static volatile SingularAttribute<Response, String> dn;
    public static volatile SingularAttribute<Response, String> dataEsplitamento;
    public static volatile SingularAttribute<Response, String> codiceCausaleAnnullamento;
    public static volatile SingularAttribute<Response, String> descrizioneCausaleAnnullamento;
    public static volatile SingularAttribute<Response, String> dataAnnullamento;
    public static volatile SingularAttribute<Response, String> codiceCausaleSospensione;
    public static volatile SingularAttribute<Response, String> descrizioneCausale;
    public static volatile SingularAttribute<Response, String> dataSospensione;
    public static volatile SingularAttribute<Response, Integer> batchId;
    public static volatile SingularAttribute<Response, Integer> oloId;
    public static volatile SingularAttribute<Response, Boolean> variation;
    public static volatile SingularAttribute<Response, String> responseCode;
    public static volatile SingularAttribute<Response, String> responseDesc;
}