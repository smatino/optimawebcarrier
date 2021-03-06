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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Objects;

@Entity
@Table(name = "BT_REQUEST")
public class BtRequest implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(BtRequest.class);

    // Raw attributes
    private Integer id;
    private String xml;
    private String status;
    private Date dateInsert;
    private Integer fileId;

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

    public BtRequest id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [xml] ------------------------

    @Size(max = 3000)
    @Column(name = "xml", length = 3000)
    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public BtRequest xml(String xml) {
        setXml(xml);
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

    public BtRequest status(String status) {
        setStatus(status);
        return this;
    }

    // -- [dateInsert] ------------------------

    @Column(name = "date_insert", length = 19)
    @Temporal(TIMESTAMP)
    public Date getDateInsert() {
        return dateInsert;
    }

    public void setDateInsert(Date dateInsert) {
        this.dateInsert = dateInsert;
    }

    public BtRequest dateInsert(Date dateInsert) {
        setDateInsert(dateInsert);
        return this;
    }

    // -- [fileId] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "file_id", precision = 10)
    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public BtRequest fileId(Integer fileId) {
        setFileId(fileId);
        return this;
    }

    /**
     * Apply the default values.
     */
    public BtRequest withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof BtRequest && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this BtRequest instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("id", getId()) //
                .add("xml", getXml()) //
                .add("status", getStatus()) //
                .add("dateInsert", getDateInsert()) //
                .add("fileId", getFileId()) //
                .toString();
    }
}