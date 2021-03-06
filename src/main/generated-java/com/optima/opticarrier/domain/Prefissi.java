/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/domain/Entity.e.vm.java
 */
package com.optima.opticarrier.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Objects;

@Entity
@Table(name = "prefissi")
public class Prefissi implements Identifiable<String>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Prefissi.class);

    // Raw attributes
    private String id;
    private String comune;
    private String provincia;
    private String regione;
    private String prefisso;
    private String cap;
    private String codFisco;
    private Integer abitanti;
    private String link;

    // -- [id] ------------------------

    @Override
    @Size(max = 15)
    @Column(name = "codice_istat", length = 15)
    @Id
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public Prefissi id(String id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null && !id.isEmpty();
    }

    // -- [comune] ------------------------

    @Size(max = 50)
    @Column(name = "comune", length = 50)
    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public Prefissi comune(String comune) {
        setComune(comune);
        return this;
    }

    // -- [provincia] ------------------------

    @Size(max = 50)
    @Column(name = "provincia", length = 50)
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Prefissi provincia(String provincia) {
        setProvincia(provincia);
        return this;
    }

    // -- [regione] ------------------------

    @Size(max = 50)
    @Column(name = "regione", length = 50)
    public String getRegione() {
        return regione;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    public Prefissi regione(String regione) {
        setRegione(regione);
        return this;
    }

    // -- [prefisso] ------------------------

    @Size(max = 5)
    @Column(name = "prefisso", length = 5)
    public String getPrefisso() {
        return prefisso;
    }

    public void setPrefisso(String prefisso) {
        this.prefisso = prefisso;
    }

    public Prefissi prefisso(String prefisso) {
        setPrefisso(prefisso);
        return this;
    }

    // -- [cap] ------------------------

    @Size(max = 7)
    @Column(name = "CAP", length = 7)
    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public Prefissi cap(String cap) {
        setCap(cap);
        return this;
    }

    // -- [codFisco] ------------------------

    @Size(max = 10)
    @Column(name = "cod_fisco", length = 10)
    public String getCodFisco() {
        return codFisco;
    }

    public void setCodFisco(String codFisco) {
        this.codFisco = codFisco;
    }

    public Prefissi codFisco(String codFisco) {
        setCodFisco(codFisco);
        return this;
    }

    // -- [abitanti] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "abitanti", precision = 10)
    public Integer getAbitanti() {
        return abitanti;
    }

    public void setAbitanti(Integer abitanti) {
        this.abitanti = abitanti;
    }

    public Prefissi abitanti(Integer abitanti) {
        setAbitanti(abitanti);
        return this;
    }

    // -- [link] ------------------------

    @Size(max = 50)
    @Column(name = "`link`", length = 50)
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Prefissi link(String link) {
        setLink(link);
        return this;
    }

    /**
     * Apply the default values.
     */
    public Prefissi withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof Prefissi && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this Prefissi instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("id", getId()) //
                .add("comune", getComune()) //
                .add("provincia", getProvincia()) //
                .add("regione", getRegione()) //
                .add("prefisso", getPrefisso()) //
                .add("cap", getCap()) //
                .add("codFisco", getCodFisco()) //
                .add("abitanti", getAbitanti()) //
                .add("link", getLink()) //
                .toString();
    }
}