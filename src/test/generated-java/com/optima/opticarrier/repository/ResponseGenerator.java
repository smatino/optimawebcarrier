/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/test/java/service/ModelGenerator.e.vm.java
 */
package com.optima.opticarrier.repository;

import javax.inject.Named;
import javax.inject.Singleton;

import com.optima.opticarrier.domain.Response;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@Named
@Singleton
public class ResponseGenerator {

    /**
     * Returns a new Response instance filled with random values.
     */
    public Response getResponse() {
        Response response = new Response();

        // simple attributes follows
        response.setIdSBC(1);
        response.setActionType(1);
        response.setDataCambiamentoStato("a");
        response.setCodiceErrore("a");
        response.setDescrizioneErrore("a");
        response.setNomeFileDiOrigineRichiesta("a");
        response.setProgressivoRichiesta("a");
        response.setDataSpedizioneFile("a");
        response.setTipoOperazione("a");
        response.setTipoServizio("a");
        response.setTipoLinea("a");
        response.setTipoAttivazione("a");
        response.setNumeroLinee("a");
        response.setCli("a");
        response.setTipoNotifica("a");
        response.setStatoOrdine("a");
        response.setType("a");
        response.setDn("a");
        response.setDataEsplitamento("a");
        response.setCodiceCausaleAnnullamento("a");
        response.setDescrizioneCausaleAnnullamento("a");
        response.setDataAnnullamento("a");
        response.setCodiceCausaleSospensione("a");
        response.setDescrizioneCausale("a");
        response.setDataSospensione("a");
        response.setBatchId(1);
        response.setOloId(1);
        response.setVariation(true);
        response.setResponseCode("a");
        response.setResponseDesc("a");
        return response;
    }

}