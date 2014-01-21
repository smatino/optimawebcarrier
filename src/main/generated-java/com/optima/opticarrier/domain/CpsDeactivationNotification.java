/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/domain/Entity.e.vm.java
 */
package com.optima.opticarrier.domain;

import static javax.persistence.TemporalType.TIMESTAMP;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Objects;

@Entity
@Table(name = "CPS_DEACTIVATION_NOTIFICATION")
public class CpsDeactivationNotification implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(CpsDeactivationNotification.class);

    // Raw attributes
    private Integer id;
    private String codiceFornitore;
    private Date dataNotifica;
    private String dn;
    private String dataSottoscrizioneContratto;
    private String codiceMotivoRifiuto;
    private Date dataEsplitamento;
    private String motivoRifiuto;
    private String status;

    // -- [id] ------------------------

    @Override
    @Column(name = "id", precision = 10)
    @GeneratedValue
    @Id
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public CpsDeactivationNotification id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [codiceFornitore] ------------------------

    @Size(max = 20)
    @Column(name = "codiceFornitore", length = 20)
    public String getCodiceFornitore() {
        return codiceFornitore;
    }

    public void setCodiceFornitore(String codiceFornitore) {
        this.codiceFornitore = codiceFornitore;
    }

    public CpsDeactivationNotification codiceFornitore(String codiceFornitore) {
        setCodiceFornitore(codiceFornitore);
        return this;
    }

    // -- [dataNotifica] ------------------------

    @NotNull
    @Column(name = "dataNotifica", nullable = false, length = 19)
    @Temporal(TIMESTAMP)
    public Date getDataNotifica() {
        return dataNotifica;
    }

    public void setDataNotifica(Date dataNotifica) {
        this.dataNotifica = dataNotifica;
    }

    public CpsDeactivationNotification dataNotifica(Date dataNotifica) {
        setDataNotifica(dataNotifica);
        return this;
    }

    // -- [dn] ------------------------

    @Size(max = 20)
    @Column(name = "dn", length = 20)
    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public CpsDeactivationNotification dn(String dn) {
        setDn(dn);
        return this;
    }

    // -- [dataSottoscrizioneContratto] ------------------------

    @Size(max = 20)
    @Column(name = "dataSottoscrizioneContratto", length = 20)
    public String getDataSottoscrizioneContratto() {
        return dataSottoscrizioneContratto;
    }

    public void setDataSottoscrizioneContratto(String dataSottoscrizioneContratto) {
        this.dataSottoscrizioneContratto = dataSottoscrizioneContratto;
    }

    public CpsDeactivationNotification dataSottoscrizioneContratto(String dataSottoscrizioneContratto) {
        setDataSottoscrizioneContratto(dataSottoscrizioneContratto);
        return this;
    }

    // -- [codiceMotivoRifiuto] ------------------------

    @Size(max = 10)
    @Column(name = "codiceMotivoRifiuto", length = 10)
    public String getCodiceMotivoRifiuto() {
        return codiceMotivoRifiuto;
    }

    public void setCodiceMotivoRifiuto(String codiceMotivoRifiuto) {
        this.codiceMotivoRifiuto = codiceMotivoRifiuto;
    }

    public CpsDeactivationNotification codiceMotivoRifiuto(String codiceMotivoRifiuto) {
        setCodiceMotivoRifiuto(codiceMotivoRifiuto);
        return this;
    }

    // -- [dataEsplitamento] ------------------------

    @NotNull
    @Column(name = "dataEsplitamento", nullable = false, length = 19)
    @Temporal(TIMESTAMP)
    public Date getDataEsplitamento() {
        return dataEsplitamento;
    }

    public void setDataEsplitamento(Date dataEsplitamento) {
        this.dataEsplitamento = dataEsplitamento;
    }

    public CpsDeactivationNotification dataEsplitamento(Date dataEsplitamento) {
        setDataEsplitamento(dataEsplitamento);
        return this;
    }

    // -- [motivoRifiuto] ------------------------

    @Size(max = 100)
    @Column(name = "motivoRifiuto", length = 100)
    public String getMotivoRifiuto() {
        return motivoRifiuto;
    }

    public void setMotivoRifiuto(String motivoRifiuto) {
        this.motivoRifiuto = motivoRifiuto;
    }

    public CpsDeactivationNotification motivoRifiuto(String motivoRifiuto) {
        setMotivoRifiuto(motivoRifiuto);
        return this;
    }

    // -- [status] ------------------------

    @Size(max = 10)
    @Column(name = "status", length = 10)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CpsDeactivationNotification status(String status) {
        setStatus(status);
        return this;
    }

    /**
     * Apply the default values.
     */
    public CpsDeactivationNotification withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof CpsDeactivationNotification && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this CpsDeactivationNotification instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("id", getId()) //
                .add("codiceFornitore", getCodiceFornitore()) //
                .add("dataNotifica", getDataNotifica()) //
                .add("dn", getDn()) //
                .add("dataSottoscrizioneContratto", getDataSottoscrizioneContratto()) //
                .add("codiceMotivoRifiuto", getCodiceMotivoRifiuto()) //
                .add("dataEsplitamento", getDataEsplitamento()) //
                .add("motivoRifiuto", getMotivoRifiuto()) //
                .add("status", getStatus()) //
                .toString();
    }
}