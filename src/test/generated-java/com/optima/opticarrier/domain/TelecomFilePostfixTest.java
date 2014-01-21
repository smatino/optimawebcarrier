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
 * Basic tests for TelecomFilePostfix
 */
@SuppressWarnings("unused")
public class TelecomFilePostfixTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        TelecomFilePostfix model = new TelecomFilePostfix();
        assertThat(model.isIdSet()).isFalse();
    }

    @Test
    public void isIdSetReturnsTrue() {
        TelecomFilePostfix model = new TelecomFilePostfix();
        model.setId(ValueGenerator.getUniqueString(8));
        assertThat(model.getId()).isNotNull();
        assertThat(model.isIdSet()).isTrue();
    }

    /*
     public void equalsUsingPk() {
     TelecomFilePostfix model1 = new TelecomFilePostfix();
     TelecomFilePostfix model2 = new TelecomFilePostfix();

     String id = ValueGenerator.getUniqueString(8);
     model1.setId(id);
     model2.setId(id);

     model1.setNumber(1);
     model2.setNumber(1);

     model1.setOlo(1);
     model2.setOlo(1);

     model1.setExtension("dddd");
     model2.setExtension("dddd");
     assertThat(model1.isIdSet()).isTrue();
     assertThat(model2.isIdSet()).isTrue();
     assertThat(model1.hashCode()).isEqualTo(model2.hashCode());
     assertThat(model1).isEqualTo(model2);
     assertThat(model2).isEqualTo(model1);
     }
     */
}