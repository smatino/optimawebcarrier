/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/test/java/domain/ModelTest.e.vm.java
 */
package com.optima.opticarrier.domain;

import static org.fest.assertions.Assertions.assertThat;

import java.io.*;
import java.util.*;

import org.junit.Test;

import com.optima.opticarrier.util.ValueGenerator;

/**
 * Basic tests for SbcFileResponse
 */
@SuppressWarnings("unused")
public class SbcFileResponseTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        SbcFileResponse model = new SbcFileResponse();
        assertThat(model.isIdSet()).isFalse();
    }

    @Test
    public void isIdSetReturnsTrue() {
        SbcFileResponse model = new SbcFileResponse();
        model.setId(ValueGenerator.getUniqueInteger());
        assertThat(model.getId()).isNotNull();
        assertThat(model.isIdSet()).isTrue();
    }

    /*
     public void equalsUsingPk() {
     SbcFileResponse model1 = new SbcFileResponse();
     SbcFileResponse model2 = new SbcFileResponse();

     Integer id = ValueGenerator.getUniqueInteger();
     model1.setId(id);
     model2.setId(id);

     model1.setNomeFile("a");
     model2.setNomeFile("a");

     model1.setDataCreazione(new Date());
     model2.setDataCreazione(new Date());

     model1.setOlo("a");
     model2.setOlo("a");

     model1.setStato("a");
     model2.setStato("a");
     assertThat(model1.isIdSet()).isTrue();
     assertThat(model2.isIdSet()).isTrue();
     assertThat(model1.hashCode()).isEqualTo(model2.hashCode());
     assertThat(model1).isEqualTo(model2);
     assertThat(model2).isEqualTo(model1);
     }
     */
}