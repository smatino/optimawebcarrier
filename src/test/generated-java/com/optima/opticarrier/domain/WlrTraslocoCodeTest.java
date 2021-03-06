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
 * Basic tests for WlrTraslocoCode
 */
@SuppressWarnings("unused")
public class WlrTraslocoCodeTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        WlrTraslocoCode model = new WlrTraslocoCode();
        assertThat(model.isIdSet()).isFalse();
    }

    @Test
    public void isIdSetReturnsTrue() {
        WlrTraslocoCode model = new WlrTraslocoCode();
        model.setId(ValueGenerator.getUniqueString(20));
        assertThat(model.getId()).isNotNull();
        assertThat(model.isIdSet()).isTrue();
    }

    /*
     public void equalsUsingPk() {
     WlrTraslocoCode model1 = new WlrTraslocoCode();
     WlrTraslocoCode model2 = new WlrTraslocoCode();

     String id = ValueGenerator.getUniqueString(20);
     model1.setId(id);
     model2.setId(id);

     model1.setTelecomSts("a");
     model2.setTelecomSts("a");
     assertThat(model1.isIdSet()).isTrue();
     assertThat(model2.isIdSet()).isTrue();
     assertThat(model1.hashCode()).isEqualTo(model2.hashCode());
     assertThat(model1).isEqualTo(model2);
     assertThat(model2).isEqualTo(model1);
     }
     */
}