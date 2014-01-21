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
import javax.xml.bind.annotation.XmlTransient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Objects;
import com.optima.opticarrier.validation.FixedLength;

@Entity
@Table(name = "CPS_QUOTE_RESPONSE")
public class CpsQuoteResponse implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(CpsQuoteResponse.class);

    // Raw attributes
    private Integer id;
    private String codiceArea;
    private String descrizioneArea;
    private Integer quantitaRichesta;
    private Integer volumiMensiliAssegnati;
    private Integer tolleranzaMensile;
    private Integer volumiGiornalieriAssegnati;
    private Integer tolleranzaGiornaliera;
    private Integer giorniLavorativi;

    // Many to one
    private SbcFileResponse file;
    private OloCps olo;

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

    public CpsQuoteResponse id(Integer id) {
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

    @FixedLength(length = 5)
    @Column(name = "codiceArea", length = 5)
    public String getCodiceArea() {
        return codiceArea;
    }

    public void setCodiceArea(String codiceArea) {
        this.codiceArea = codiceArea;
    }

    public CpsQuoteResponse codiceArea(String codiceArea) {
        setCodiceArea(codiceArea);
        return this;
    }

    // -- [descrizioneArea] ------------------------

    @FixedLength(length = 30)
    @Column(name = "descrizioneArea", length = 30)
    public String getDescrizioneArea() {
        return descrizioneArea;
    }

    public void setDescrizioneArea(String descrizioneArea) {
        this.descrizioneArea = descrizioneArea;
    }

    public CpsQuoteResponse descrizioneArea(String descrizioneArea) {
        setDescrizioneArea(descrizioneArea);
        return this;
    }

    // -- [quantitaRichesta] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "quantitaRichesta", precision = 10)
    public Integer getQuantitaRichesta() {
        return quantitaRichesta;
    }

    public void setQuantitaRichesta(Integer quantitaRichesta) {
        this.quantitaRichesta = quantitaRichesta;
    }

    public CpsQuoteResponse quantitaRichesta(Integer quantitaRichesta) {
        setQuantitaRichesta(quantitaRichesta);
        return this;
    }

    // -- [volumiMensiliAssegnati] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "volumiMensiliAssegnati", precision = 10)
    public Integer getVolumiMensiliAssegnati() {
        return volumiMensiliAssegnati;
    }

    public void setVolumiMensiliAssegnati(Integer volumiMensiliAssegnati) {
        this.volumiMensiliAssegnati = volumiMensiliAssegnati;
    }

    public CpsQuoteResponse volumiMensiliAssegnati(Integer volumiMensiliAssegnati) {
        setVolumiMensiliAssegnati(volumiMensiliAssegnati);
        return this;
    }

    // -- [tolleranzaMensile] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "tolleranzaMensile", precision = 10)
    public Integer getTolleranzaMensile() {
        return tolleranzaMensile;
    }

    public void setTolleranzaMensile(Integer tolleranzaMensile) {
        this.tolleranzaMensile = tolleranzaMensile;
    }

    public CpsQuoteResponse tolleranzaMensile(Integer tolleranzaMensile) {
        setTolleranzaMensile(tolleranzaMensile);
        return this;
    }

    // -- [volumiGiornalieriAssegnati] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "volumiGiornalieriAssegnati", precision = 10)
    public Integer getVolumiGiornalieriAssegnati() {
        return volumiGiornalieriAssegnati;
    }

    public void setVolumiGiornalieriAssegnati(Integer volumiGiornalieriAssegnati) {
        this.volumiGiornalieriAssegnati = volumiGiornalieriAssegnati;
    }

    public CpsQuoteResponse volumiGiornalieriAssegnati(Integer volumiGiornalieriAssegnati) {
        setVolumiGiornalieriAssegnati(volumiGiornalieriAssegnati);
        return this;
    }

    // -- [tolleranzaGiornaliera] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "tolleranzaGiornaliera", precision = 10)
    public Integer getTolleranzaGiornaliera() {
        return tolleranzaGiornaliera;
    }

    public void setTolleranzaGiornaliera(Integer tolleranzaGiornaliera) {
        this.tolleranzaGiornaliera = tolleranzaGiornaliera;
    }

    public CpsQuoteResponse tolleranzaGiornaliera(Integer tolleranzaGiornaliera) {
        setTolleranzaGiornaliera(tolleranzaGiornaliera);
        return this;
    }

    // -- [giorniLavorativi] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "giorniLavorativi", precision = 10)
    public Integer getGiorniLavorativi() {
        return giorniLavorativi;
    }

    public void setGiorniLavorativi(Integer giorniLavorativi) {
        this.giorniLavorativi = giorniLavorativi;
    }

    public CpsQuoteResponse giorniLavorativi(Integer giorniLavorativi) {
        setGiorniLavorativi(giorniLavorativi);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CpsQuoteResponse.file ==> SbcFileResponse.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "file_id")
    @ManyToOne(cascade = { PERSIST, MERGE }, fetch = LAZY)
    public SbcFileResponse getFile() {
        return file;
    }

    /**
     * Set the {@link #file} without adding this CpsQuoteResponse instance on the passed {@link #file}
     */
    public void setFile(SbcFileResponse file) {
        this.file = file;
    }

    public CpsQuoteResponse file(SbcFileResponse file) {
        setFile(file);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CpsQuoteResponse.olo ==> OloCps.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "olo")
    @ManyToOne(cascade = { PERSIST, MERGE }, fetch = LAZY)
    public OloCps getOlo() {
        return olo;
    }

    /**
     * Set the {@link #olo} without adding this CpsQuoteResponse instance on the passed {@link #olo}
     */
    public void setOlo(OloCps olo) {
        this.olo = olo;
    }

    public CpsQuoteResponse olo(OloCps olo) {
        setOlo(olo);
        return this;
    }

    /**
     * Apply the default values.
     */
    public CpsQuoteResponse withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof CpsQuoteResponse && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this CpsQuoteResponse instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("id", getId()) //
                .add("codiceArea", getCodiceArea()) //
                .add("descrizioneArea", getDescrizioneArea()) //
                .add("quantitaRichesta", getQuantitaRichesta()) //
                .add("volumiMensiliAssegnati", getVolumiMensiliAssegnati()) //
                .add("tolleranzaMensile", getTolleranzaMensile()) //
                .add("volumiGiornalieriAssegnati", getVolumiGiornalieriAssegnati()) //
                .add("tolleranzaGiornaliera", getTolleranzaGiornaliera()) //
                .add("giorniLavorativi", getGiorniLavorativi()) //
                .toString();
    }
}