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
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Objects;

@Entity
@Table(name = "SBC_FILE_REQUEST")
public class SbcFileRequest implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(SbcFileRequest.class);

    // Raw attributes
    private Integer id;
    private String nomeFile;
    private Date dataCreazione;
    private String olo;
    private String stato;
    private Integer rowNumber;
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

    public SbcFileRequest id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [nomeFile] ------------------------

    @NotEmpty
    @Size(max = 100)
    @Column(name = "nome_file", nullable = false, length = 100)
    public String getNomeFile() {
        return nomeFile;
    }

    public void setNomeFile(String nomeFile) {
        this.nomeFile = nomeFile;
    }

    public SbcFileRequest nomeFile(String nomeFile) {
        setNomeFile(nomeFile);
        return this;
    }

    // -- [dataCreazione] ------------------------

    @NotNull
    @Column(name = "data_creazione", nullable = false, length = 19)
    @Temporal(TIMESTAMP)
    public Date getDataCreazione() {
        return dataCreazione;
    }

    public void setDataCreazione(Date dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public SbcFileRequest dataCreazione(Date dataCreazione) {
        setDataCreazione(dataCreazione);
        return this;
    }

    // -- [olo] ------------------------

    @NotEmpty
    @Size(max = 50)
    @Column(name = "olo", nullable = false, length = 50)
    public String getOlo() {
        return olo;
    }

    public void setOlo(String olo) {
        this.olo = olo;
    }

    public SbcFileRequest olo(String olo) {
        setOlo(olo);
        return this;
    }

    // -- [stato] ------------------------

    @NotEmpty
    @Size(max = 50)
    @Column(name = "stato", nullable = false, length = 50)
    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public SbcFileRequest stato(String stato) {
        setStato(stato);
        return this;
    }

    // -- [rowNumber] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "row_number", precision = 10)
    public Integer getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    public SbcFileRequest rowNumber(Integer rowNumber) {
        setRowNumber(rowNumber);
        return this;
    }

    // -- [status] ------------------------

    @Size(max = 15)
    @Column(name = "status", length = 15)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SbcFileRequest status(String status) {
        setStatus(status);
        return this;
    }

    /**
     * Apply the default values.
     */
    public SbcFileRequest withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof SbcFileRequest && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this SbcFileRequest instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("id", getId()) //
                .add("nomeFile", getNomeFile()) //
                .add("dataCreazione", getDataCreazione()) //
                .add("olo", getOlo()) //
                .add("stato", getStato()) //
                .add("rowNumber", getRowNumber()) //
                .add("status", getStatus()) //
                .toString();
    }
}