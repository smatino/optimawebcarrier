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
 * Basic tests for CpsDeactivationNotification
 */
@SuppressWarnings("unused")
public class CpsDeactivationNotificationTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        CpsDeactivationNotification model = new CpsDeactivationNotification();
        assertThat(model.isIdSet()).isFalse();
    }

    @Test
    public void isIdSetReturnsTrue() {
        CpsDeactivationNotification model = new CpsDeactivationNotification();
        model.setId(ValueGenerator.getUniqueInteger());
        assertThat(model.getId()).isNotNull();
        assertThat(model.isIdSet()).isTrue();
    }

    /*
     public void equalsUsingPk() {
     CpsDeactivationNotification model1 = new CpsDeactivationNotification();
     CpsDeactivationNotification model2 = new CpsDeactivationNotification();

     Integer id = ValueGenerator.getUniqueInteger();
     model1.setId(id);
     model2.setId(id);

     model1.setCodiceFornitore("a");
     model2.setCodiceFornitore("a");

     model1.setDataNotifica(new Date());
     model2.setDataNotifica(new Date());

     model1.setDn("a");
     model2.setDn("a");

     model1.setDataSottoscrizioneContratto("a");
     model2.setDataSottoscrizioneContratto("a");

     model1.setCodiceMotivoRifiuto("a");
     model2.setCodiceMotivoRifiuto("a");

     model1.setDataEsplitamento(new Date());
     model2.setDataEsplitamento(new Date());

     model1.setMotivoRifiuto("a");
     model2.setMotivoRifiuto("a");

     model1.setStatus("a");
     model2.setStatus("a");
     assertThat(model1.isIdSet()).isTrue();
     assertThat(model2.isIdSet()).isTrue();
     assertThat(model1.hashCode()).isEqualTo(model2.hashCode());
     assertThat(model1).isEqualTo(model2);
     assertThat(model2).isEqualTo(model1);
     }
     */
}