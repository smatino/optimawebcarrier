/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/domain/Entity.e.vm.java
 */
package com.optima.opticarrier.domain;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.LAZY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
@Table(name = "CPS_QUOTE_REQUEST")
public class CpsQuoteRequest implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(CpsQuoteRequest.class);

    // Raw attributes
    private Integer id;
    private Integer codiceArea;
    private String descrizioneArea;
    private Integer quantitaRichiesta;
    private Integer mm;
    private Integer yyyy;
    private String status;

    // Many to one
    private OloCps olo;
    private SbcFileRequest file;

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

    public CpsQuoteRequest id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [codiceArea] ------------------------

    @Digits(integer = 5, fraction = 0)
    @NotNull
    @Column(name = "codice_area", nullable = false, precision = 5)
    public Integer getCodiceArea() {
        return codiceArea;
    }

    public void setCodiceArea(Integer codiceArea) {
        this.codiceArea = codiceArea;
    }

    public CpsQuoteRequest codiceArea(Integer codiceArea) {
        setCodiceArea(codiceArea);
        return this;
    }

    // -- [descrizioneArea] ------------------------

    @NotEmpty
    @Size(max = 30)
    @Column(name = "descrizione_area", nullable = false, length = 30)
    public String getDescrizioneArea() {
        return descrizioneArea;
    }

    public void setDescrizioneArea(String descrizioneArea) {
        this.descrizioneArea = descrizioneArea;
    }

    public CpsQuoteRequest descrizioneArea(String descrizioneArea) {
        setDescrizioneArea(descrizioneArea);
        return this;
    }

    // -- [quantitaRichiesta] ------------------------

    @Digits(integer = 5, fraction = 0)
    @NotNull
    @Column(name = "quantita_richiesta", nullable = false, precision = 5)
    public Integer getQuantitaRichiesta() {
        return quantitaRichiesta;
    }

    public void setQuantitaRichiesta(Integer quantitaRichiesta) {
        this.quantitaRichiesta = quantitaRichiesta;
    }

    public CpsQuoteRequest quantitaRichiesta(Integer quantitaRichiesta) {
        setQuantitaRichiesta(quantitaRichiesta);
        return this;
    }

    // -- [mm] ------------------------

    @Digits(integer = 5, fraction = 0)
    @NotNull
    @Column(name = "mm", nullable = false, precision = 5)
    public Integer getMm() {
        return mm;
    }

    public void setMm(Integer mm) {
        this.mm = mm;
    }

    public CpsQuoteRequest mm(Integer mm) {
        setMm(mm);
        return this;
    }

    // -- [yyyy] ------------------------

    @Digits(integer = 5, fraction = 0)
    @NotNull
    @Column(name = "yyyy", nullable = false, precision = 5)
    public Integer getYyyy() {
        return yyyy;
    }

    public void setYyyy(Integer yyyy) {
        this.yyyy = yyyy;
    }

    public CpsQuoteRequest yyyy(Integer yyyy) {
        setYyyy(yyyy);
        return this;
    }

    // -- [status] ------------------------

    @NotEmpty
    @Size(max = 50)
    @Column(name = "status", nullable = false, length = 50)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CpsQuoteRequest status(String status) {
        setStatus(status);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CpsQuoteRequest.olo ==> OloCps.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "olo")
    @ManyToOne(cascade = { PERSIST, MERGE }, fetch = LAZY)
    public OloCps getOlo() {
        return olo;
    }

    /**
     * Set the {@link #olo} without adding this CpsQuoteRequest instance on the passed {@link #olo}
     */
    public void setOlo(OloCps olo) {
        this.olo = olo;
    }

    public CpsQuoteRequest olo(OloCps olo) {
        setOlo(olo);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CpsQuoteRequest.file ==> SbcFileRequest.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "file_id")
    @ManyToOne(cascade = { PERSIST, MERGE }, fetch = LAZY)
    public SbcFileRequest getFile() {
        return file;
    }

    /**
     * Set the {@link #file} without adding this CpsQuoteRequest instance on the passed {@link #file}
     */
    public void setFile(SbcFileRequest file) {
        this.file = file;
    }

    public CpsQuoteRequest file(SbcFileRequest file) {
        setFile(file);
        return this;
    }

    /**
     * Apply the default values.
     */
    public CpsQuoteRequest withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof CpsQuoteRequest && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this CpsQuoteRequest instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("id", getId()) //
                .add("codiceArea", getCodiceArea()) //
                .add("descrizioneArea", getDescrizioneArea()) //
                .add("quantitaRichiesta", getQuantitaRichiesta()) //
                .add("mm", getMm()) //
                .add("yyyy", getYyyy()) //
                .add("status", getStatus()) //
                .toString();
    }
}