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
import static javax.persistence.TemporalType.DATE;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "SBC_WLR_REQUEST_VARIATION")
public class SbcWlrRequestVariation implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(SbcWlrRequestVariation.class);

    // Raw attributes
    private Integer id;
    private String progressiveRichiesta;
    private Integer actionType;
    private Integer wlrType;
    private String dn;
    private Date dataSottoscrizioneContratto;
    private String customerSurname;
    private String serviceNumber;
    private String numberAdditional;
    private String codicePrestazione;
    private String aggiuntivo1;
    private String aggiuntivo2;
    private String aggiuntivo3;
    private String aggiuntivo4;
    private String aggiuntivo5;
    private String aggiuntivo6;
    private String aggiuntivo7;
    private String codeMove;
    private String lineNumber;
    private String directionality;
    private String codeDriveType;
    private String status;
    private Integer waits;
    private Boolean elaborated;

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

    public SbcWlrRequestVariation id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [progressiveRichiesta] ------------------------

    @Size(max = 30)
    @Column(name = "progressiveRichiesta", length = 30)
    public String getProgressiveRichiesta() {
        return progressiveRichiesta;
    }

    public void setProgressiveRichiesta(String progressiveRichiesta) {
        this.progressiveRichiesta = progressiveRichiesta;
    }

    public SbcWlrRequestVariation progressiveRichiesta(String progressiveRichiesta) {
        setProgressiveRichiesta(progressiveRichiesta);
        return this;
    }

    // -- [actionType] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "actionType", precision = 10)
    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public SbcWlrRequestVariation actionType(Integer actionType) {
        setActionType(actionType);
        return this;
    }

    // -- [wlrType] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "wlrType", precision = 10)
    public Integer getWlrType() {
        return wlrType;
    }

    public void setWlrType(Integer wlrType) {
        this.wlrType = wlrType;
    }

    public SbcWlrRequestVariation wlrType(Integer wlrType) {
        setWlrType(wlrType);
        return this;
    }

    // -- [dn] ------------------------

    @Size(max = 30)
    @Column(name = "dn", length = 30)
    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public SbcWlrRequestVariation dn(String dn) {
        setDn(dn);
        return this;
    }

    // -- [dataSottoscrizioneContratto] ------------------------

    @Column(name = "dataSottoscrizioneContratto", length = 10)
    @Temporal(DATE)
    public Date getDataSottoscrizioneContratto() {
        return dataSottoscrizioneContratto;
    }

    public void setDataSottoscrizioneContratto(Date dataSottoscrizioneContratto) {
        this.dataSottoscrizioneContratto = dataSottoscrizioneContratto;
    }

    public SbcWlrRequestVariation dataSottoscrizioneContratto(Date dataSottoscrizioneContratto) {
        setDataSottoscrizioneContratto(dataSottoscrizioneContratto);
        return this;
    }

    // -- [customerSurname] ------------------------

    @Size(max = 70)
    @Column(name = "customerSurname", length = 70)
    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public SbcWlrRequestVariation customerSurname(String customerSurname) {
        setCustomerSurname(customerSurname);
        return this;
    }

    // -- [serviceNumber] ------------------------

    @Size(max = 30)
    @Column(name = "serviceNumber", length = 30)
    public String getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public SbcWlrRequestVariation serviceNumber(String serviceNumber) {
        setServiceNumber(serviceNumber);
        return this;
    }

    // -- [numberAdditional] ------------------------

    @Size(max = 30)
    @Column(name = "numberAdditional", length = 30)
    public String getNumberAdditional() {
        return numberAdditional;
    }

    public void setNumberAdditional(String numberAdditional) {
        this.numberAdditional = numberAdditional;
    }

    public SbcWlrRequestVariation numberAdditional(String numberAdditional) {
        setNumberAdditional(numberAdditional);
        return this;
    }

    // -- [codicePrestazione] ------------------------

    @Size(max = 30)
    @Column(name = "codicePrestazione", length = 30)
    public String getCodicePrestazione() {
        return codicePrestazione;
    }

    public void setCodicePrestazione(String codicePrestazione) {
        this.codicePrestazione = codicePrestazione;
    }

    public SbcWlrRequestVariation codicePrestazione(String codicePrestazione) {
        setCodicePrestazione(codicePrestazione);
        return this;
    }

    // -- [aggiuntivo1] ------------------------

    @Size(max = 30)
    @Column(name = "aggiuntivo1", length = 30)
    public String getAggiuntivo1() {
        return aggiuntivo1;
    }

    public void setAggiuntivo1(String aggiuntivo1) {
        this.aggiuntivo1 = aggiuntivo1;
    }

    public SbcWlrRequestVariation aggiuntivo1(String aggiuntivo1) {
        setAggiuntivo1(aggiuntivo1);
        return this;
    }

    // -- [aggiuntivo2] ------------------------

    @Size(max = 30)
    @Column(name = "aggiuntivo2", length = 30)
    public String getAggiuntivo2() {
        return aggiuntivo2;
    }

    public void setAggiuntivo2(String aggiuntivo2) {
        this.aggiuntivo2 = aggiuntivo2;
    }

    public SbcWlrRequestVariation aggiuntivo2(String aggiuntivo2) {
        setAggiuntivo2(aggiuntivo2);
        return this;
    }

    // -- [aggiuntivo3] ------------------------

    @Size(max = 30)
    @Column(name = "aggiuntivo3", length = 30)
    public String getAggiuntivo3() {
        return aggiuntivo3;
    }

    public void setAggiuntivo3(String aggiuntivo3) {
        this.aggiuntivo3 = aggiuntivo3;
    }

    public SbcWlrRequestVariation aggiuntivo3(String aggiuntivo3) {
        setAggiuntivo3(aggiuntivo3);
        return this;
    }

    // -- [aggiuntivo4] ------------------------

    @Size(max = 30)
    @Column(name = "aggiuntivo4", length = 30)
    public String getAggiuntivo4() {
        return aggiuntivo4;
    }

    public void setAggiuntivo4(String aggiuntivo4) {
        this.aggiuntivo4 = aggiuntivo4;
    }

    public SbcWlrRequestVariation aggiuntivo4(String aggiuntivo4) {
        setAggiuntivo4(aggiuntivo4);
        return this;
    }

    // -- [aggiuntivo5] ------------------------

    @Size(max = 30)
    @Column(name = "aggiuntivo5", length = 30)
    public String getAggiuntivo5() {
        return aggiuntivo5;
    }

    public void setAggiuntivo5(String aggiuntivo5) {
        this.aggiuntivo5 = aggiuntivo5;
    }

    public SbcWlrRequestVariation aggiuntivo5(String aggiuntivo5) {
        setAggiuntivo5(aggiuntivo5);
        return this;
    }

    // -- [aggiuntivo6] ------------------------

    @Size(max = 30)
    @Column(name = "aggiuntivo6", length = 30)
    public String getAggiuntivo6() {
        return aggiuntivo6;
    }

    public void setAggiuntivo6(String aggiuntivo6) {
        this.aggiuntivo6 = aggiuntivo6;
    }

    public SbcWlrRequestVariation aggiuntivo6(String aggiuntivo6) {
        setAggiuntivo6(aggiuntivo6);
        return this;
    }

    // -- [aggiuntivo7] ------------------------

    @Size(max = 30)
    @Column(name = "aggiuntivo7", length = 30)
    public String getAggiuntivo7() {
        return aggiuntivo7;
    }

    public void setAggiuntivo7(String aggiuntivo7) {
        this.aggiuntivo7 = aggiuntivo7;
    }

    public SbcWlrRequestVariation aggiuntivo7(String aggiuntivo7) {
        setAggiuntivo7(aggiuntivo7);
        return this;
    }

    // -- [codeMove] ------------------------

    @Size(max = 30)
    @Column(name = "codeMove", length = 30)
    public String getCodeMove() {
        return codeMove;
    }

    public void setCodeMove(String codeMove) {
        this.codeMove = codeMove;
    }

    public SbcWlrRequestVariation codeMove(String codeMove) {
        setCodeMove(codeMove);
        return this;
    }

    // -- [lineNumber] ------------------------

    @Size(max = 30)
    @Column(name = "lineNumber", length = 30)
    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public SbcWlrRequestVariation lineNumber(String lineNumber) {
        setLineNumber(lineNumber);
        return this;
    }

    // -- [directionality] ------------------------

    @Size(max = 30)
    @Column(name = "directionality", length = 30)
    public String getDirectionality() {
        return directionality;
    }

    public void setDirectionality(String directionality) {
        this.directionality = directionality;
    }

    public SbcWlrRequestVariation directionality(String directionality) {
        setDirectionality(directionality);
        return this;
    }

    // -- [codeDriveType] ------------------------

    @Size(max = 30)
    @Column(name = "codeDriveType", length = 30)
    public String getCodeDriveType() {
        return codeDriveType;
    }

    public void setCodeDriveType(String codeDriveType) {
        this.codeDriveType = codeDriveType;
    }

    public SbcWlrRequestVariation codeDriveType(String codeDriveType) {
        setCodeDriveType(codeDriveType);
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

    public SbcWlrRequestVariation status(String status) {
        setStatus(status);
        return this;
    }

    // -- [waits] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "waits", precision = 10)
    public Integer getWaits() {
        return waits;
    }

    public void setWaits(Integer waits) {
        this.waits = waits;
    }

    public SbcWlrRequestVariation waits(Integer waits) {
        setWaits(waits);
        return this;
    }

    // -- [elaborated] ------------------------

    @Column(name = "elaborated", length = 1)
    public Boolean getElaborated() {
        return elaborated;
    }

    public void setElaborated(Boolean elaborated) {
        this.elaborated = elaborated;
    }

    public SbcWlrRequestVariation elaborated(Boolean elaborated) {
        setElaborated(elaborated);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: SbcWlrRequestVariation.olo ==> OloCps.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "olo")
    @ManyToOne(cascade = { PERSIST, MERGE }, fetch = LAZY)
    public OloCps getOlo() {
        return olo;
    }

    /**
     * Set the {@link #olo} without adding this SbcWlrRequestVariation instance on the passed {@link #olo}
     */
    public void setOlo(OloCps olo) {
        this.olo = olo;
    }

    public SbcWlrRequestVariation olo(OloCps olo) {
        setOlo(olo);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: SbcWlrRequestVariation.file ==> SbcFileRequest.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "file_Id")
    @ManyToOne(cascade = { PERSIST, MERGE }, fetch = LAZY)
    public SbcFileRequest getFile() {
        return file;
    }

    /**
     * Set the {@link #file} without adding this SbcWlrRequestVariation instance on the passed {@link #file}
     */
    public void setFile(SbcFileRequest file) {
        this.file = file;
    }

    public SbcWlrRequestVariation file(SbcFileRequest file) {
        setFile(file);
        return this;
    }

    /**
     * Apply the default values.
     */
    public SbcWlrRequestVariation withDefaults() {
        setElaborated(false);
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof SbcWlrRequestVariation && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this SbcWlrRequestVariation instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("id", getId()) //
                .add("progressiveRichiesta", getProgressiveRichiesta()) //
                .add("actionType", getActionType()) //
                .add("wlrType", getWlrType()) //
                .add("dn", getDn()) //
                .add("dataSottoscrizioneContratto", getDataSottoscrizioneContratto()) //
                .add("customerSurname", getCustomerSurname()) //
                .add("serviceNumber", getServiceNumber()) //
                .add("numberAdditional", getNumberAdditional()) //
                .add("codicePrestazione", getCodicePrestazione()) //
                .add("aggiuntivo1", getAggiuntivo1()) //
                .add("aggiuntivo2", getAggiuntivo2()) //
                .add("aggiuntivo3", getAggiuntivo3()) //
                .add("aggiuntivo4", getAggiuntivo4()) //
                .add("aggiuntivo5", getAggiuntivo5()) //
                .add("aggiuntivo6", getAggiuntivo6()) //
                .add("aggiuntivo7", getAggiuntivo7()) //
                .add("codeMove", getCodeMove()) //
                .add("lineNumber", getLineNumber()) //
                .add("directionality", getDirectionality()) //
                .add("codeDriveType", getCodeDriveType()) //
                .add("status", getStatus()) //
                .add("waits", getWaits()) //
                .add("elaborated", getElaborated()) //
                .toString();
    }
}