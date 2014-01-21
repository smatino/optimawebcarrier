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
import static javax.persistence.TemporalType.TIMESTAMP;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Objects;
import com.optima.opticarrier.audit.AuditContextHolder;

@Entity
@Table(name = "SBC_WLR_REQUEST")
public class SbcWlrRequest implements Identifiable<Integer>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(SbcWlrRequest.class);

    // Raw attributes
    private Integer id;
    private String progressivoRichiesta;
    private Integer actionType;
    private Integer wlrType;
    private String dn;
    private Integer flagmantenimentoProdotto;
    private Date datasottoscrizioneContratto;
    private String customerSurname;
    private String particellaToponomastica;
    private String via;
    private String civico;
    private String localita;
    private String codiceComune;
    private String cfPiva;
    private Date dataDac;
    private String typeService;
    private String tipeLine;
    private Integer amount;
    private String customerPhone;
    private String error;
    private Date creationDate;
    private Integer rientro;
    private Boolean btExecuted;
    private Boolean sentToTelecom;

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

    public SbcWlrRequest id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [progressivoRichiesta] ------------------------

    @Size(max = 20)
    @Column(name = "progressivo_richiesta", unique = true, length = 20)
    public String getProgressivoRichiesta() {
        return progressivoRichiesta;
    }

    public void setProgressivoRichiesta(String progressivoRichiesta) {
        this.progressivoRichiesta = progressivoRichiesta;
    }

    public SbcWlrRequest progressivoRichiesta(String progressivoRichiesta) {
        setProgressivoRichiesta(progressivoRichiesta);
        return this;
    }

    // -- [actionType] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "action_type", precision = 10)
    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public SbcWlrRequest actionType(Integer actionType) {
        setActionType(actionType);
        return this;
    }

    // -- [wlrType] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "wlr_type", precision = 10)
    public Integer getWlrType() {
        return wlrType;
    }

    public void setWlrType(Integer wlrType) {
        this.wlrType = wlrType;
    }

    public SbcWlrRequest wlrType(Integer wlrType) {
        setWlrType(wlrType);
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

    public SbcWlrRequest dn(String dn) {
        setDn(dn);
        return this;
    }

    // -- [flagmantenimentoProdotto] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "flagMantenimento_prodotto", precision = 10)
    public Integer getFlagmantenimentoProdotto() {
        return flagmantenimentoProdotto;
    }

    public void setFlagmantenimentoProdotto(Integer flagmantenimentoProdotto) {
        this.flagmantenimentoProdotto = flagmantenimentoProdotto;
    }

    public SbcWlrRequest flagmantenimentoProdotto(Integer flagmantenimentoProdotto) {
        setFlagmantenimentoProdotto(flagmantenimentoProdotto);
        return this;
    }

    // -- [datasottoscrizioneContratto] ------------------------

    @Column(name = "dataSottoscrizione_contratto", length = 10)
    @Temporal(DATE)
    public Date getDatasottoscrizioneContratto() {
        return datasottoscrizioneContratto;
    }

    public void setDatasottoscrizioneContratto(Date datasottoscrizioneContratto) {
        this.datasottoscrizioneContratto = datasottoscrizioneContratto;
    }

    public SbcWlrRequest datasottoscrizioneContratto(Date datasottoscrizioneContratto) {
        setDatasottoscrizioneContratto(datasottoscrizioneContratto);
        return this;
    }

    // -- [customerSurname] ------------------------

    @Size(max = 80)
    @Column(name = "customer_surname", length = 80)
    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public SbcWlrRequest customerSurname(String customerSurname) {
        setCustomerSurname(customerSurname);
        return this;
    }

    // -- [particellaToponomastica] ------------------------

    @Size(max = 10)
    @Column(name = "particella_toponomastica", length = 10)
    public String getParticellaToponomastica() {
        return particellaToponomastica;
    }

    public void setParticellaToponomastica(String particellaToponomastica) {
        this.particellaToponomastica = particellaToponomastica;
    }

    public SbcWlrRequest particellaToponomastica(String particellaToponomastica) {
        setParticellaToponomastica(particellaToponomastica);
        return this;
    }

    // -- [via] ------------------------

    @Size(max = 20)
    @Column(name = "via", length = 20)
    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public SbcWlrRequest via(String via) {
        setVia(via);
        return this;
    }

    // -- [civico] ------------------------

    @Size(max = 20)
    @Column(name = "civico", length = 20)
    public String getCivico() {
        return civico;
    }

    public void setCivico(String civico) {
        this.civico = civico;
    }

    public SbcWlrRequest civico(String civico) {
        setCivico(civico);
        return this;
    }

    // -- [localita] ------------------------

    @Size(max = 30)
    @Column(name = "localita", length = 30)
    public String getLocalita() {
        return localita;
    }

    public void setLocalita(String localita) {
        this.localita = localita;
    }

    public SbcWlrRequest localita(String localita) {
        setLocalita(localita);
        return this;
    }

    // -- [codiceComune] ------------------------

    @Size(max = 20)
    @Column(name = "codice_comune", length = 20)
    public String getCodiceComune() {
        return codiceComune;
    }

    public void setCodiceComune(String codiceComune) {
        this.codiceComune = codiceComune;
    }

    public SbcWlrRequest codiceComune(String codiceComune) {
        setCodiceComune(codiceComune);
        return this;
    }

    // -- [cfPiva] ------------------------

    @Size(max = 20)
    @Column(name = "cf_piva", length = 20)
    public String getCfPiva() {
        return cfPiva;
    }

    public void setCfPiva(String cfPiva) {
        this.cfPiva = cfPiva;
    }

    public SbcWlrRequest cfPiva(String cfPiva) {
        setCfPiva(cfPiva);
        return this;
    }

    // -- [dataDac] ------------------------

    @Column(name = "data_dac", length = 10)
    @Temporal(DATE)
    public Date getDataDac() {
        return dataDac;
    }

    public void setDataDac(Date dataDac) {
        this.dataDac = dataDac;
    }

    public SbcWlrRequest dataDac(Date dataDac) {
        setDataDac(dataDac);
        return this;
    }

    // -- [typeService] ------------------------

    @Size(max = 10)
    @Column(name = "type_service", length = 10)
    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public SbcWlrRequest typeService(String typeService) {
        setTypeService(typeService);
        return this;
    }

    // -- [tipeLine] ------------------------

    @Size(max = 10)
    @Column(name = "tipe_line", length = 10)
    public String getTipeLine() {
        return tipeLine;
    }

    public void setTipeLine(String tipeLine) {
        this.tipeLine = tipeLine;
    }

    public SbcWlrRequest tipeLine(String tipeLine) {
        setTipeLine(tipeLine);
        return this;
    }

    // -- [amount] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "amount", precision = 10)
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public SbcWlrRequest amount(Integer amount) {
        setAmount(amount);
        return this;
    }

    // -- [customerPhone] ------------------------

    @Size(max = 16)
    @Column(name = "customer_phone", length = 16)
    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public SbcWlrRequest customerPhone(String customerPhone) {
        setCustomerPhone(customerPhone);
        return this;
    }

    // -- [error] ------------------------

    @Size(max = 200)
    @Column(name = "error", length = 200)
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public SbcWlrRequest error(String error) {
        setError(error);
        return this;
    }

    // -- [creationDate] ------------------------

    @Column(name = "creation_date", nullable = false, length = 19)
    @Temporal(TIMESTAMP)
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public SbcWlrRequest creationDate(Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    // -- [rientro] ------------------------

    @Digits(integer = 10, fraction = 0)
    @Column(name = "rientro", precision = 10)
    public Integer getRientro() {
        return rientro;
    }

    public void setRientro(Integer rientro) {
        this.rientro = rientro;
    }

    public SbcWlrRequest rientro(Integer rientro) {
        setRientro(rientro);
        return this;
    }

    // -- [btExecuted] ------------------------

    @Column(name = "btExecuted", length = 1)
    public Boolean getBtExecuted() {
        return btExecuted;
    }

    public void setBtExecuted(Boolean btExecuted) {
        this.btExecuted = btExecuted;
    }

    public SbcWlrRequest btExecuted(Boolean btExecuted) {
        setBtExecuted(btExecuted);
        return this;
    }

    // -- [sentToTelecom] ------------------------

    @Column(name = "sent_to_telecom", length = 1)
    public Boolean getSentToTelecom() {
        return sentToTelecom;
    }

    public void setSentToTelecom(Boolean sentToTelecom) {
        this.sentToTelecom = sentToTelecom;
    }

    public SbcWlrRequest sentToTelecom(Boolean sentToTelecom) {
        setSentToTelecom(sentToTelecom);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: SbcWlrRequest.olo ==> OloCps.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "olo")
    @ManyToOne(cascade = { PERSIST, MERGE }, fetch = LAZY)
    public OloCps getOlo() {
        return olo;
    }

    /**
     * Set the {@link #olo} without adding this SbcWlrRequest instance on the passed {@link #olo}
     */
    public void setOlo(OloCps olo) {
        this.olo = olo;
    }

    public SbcWlrRequest olo(OloCps olo) {
        setOlo(olo);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: SbcWlrRequest.file ==> SbcFileRequest.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "file_id")
    @ManyToOne(cascade = { PERSIST, MERGE }, fetch = LAZY)
    public SbcFileRequest getFile() {
        return file;
    }

    /**
     * Set the {@link #file} without adding this SbcWlrRequest instance on the passed {@link #file}
     */
    public void setFile(SbcFileRequest file) {
        this.file = file;
    }

    public SbcWlrRequest file(SbcFileRequest file) {
        setFile(file);
        return this;
    }

    /**
     * Apply the default values.
     */
    public SbcWlrRequest withDefaults() {
        setBtExecuted(false);
        setSentToTelecom(false);
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof SbcWlrRequest && hashCode() == other.hashCode());
    }

    private volatile int previousHashCode = 0;

    @Override
    public int hashCode() {
        int hashCode = Objects.hashCode(getProgressivoRichiesta());

        if (previousHashCode != 0 && previousHashCode != hashCode) {
            log.warn("DEVELOPER: hashCode has changed!." //
                    + "If you encounter this message you should take the time to carefuly review equals/hashCode for: " //
                    + getClass().getCanonicalName());
        }

        previousHashCode = hashCode;
        return hashCode;
    }

    /**
     * Construct a readable string representation for this SbcWlrRequest instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("id", getId()) //
                .add("progressivoRichiesta", getProgressivoRichiesta()) //
                .add("actionType", getActionType()) //
                .add("wlrType", getWlrType()) //
                .add("dn", getDn()) //
                .add("flagmantenimentoProdotto", getFlagmantenimentoProdotto()) //
                .add("datasottoscrizioneContratto", getDatasottoscrizioneContratto()) //
                .add("customerSurname", getCustomerSurname()) //
                .add("particellaToponomastica", getParticellaToponomastica()) //
                .add("via", getVia()) //
                .add("civico", getCivico()) //
                .add("localita", getLocalita()) //
                .add("codiceComune", getCodiceComune()) //
                .add("cfPiva", getCfPiva()) //
                .add("dataDac", getDataDac()) //
                .add("typeService", getTypeService()) //
                .add("tipeLine", getTipeLine()) //
                .add("amount", getAmount()) //
                .add("customerPhone", getCustomerPhone()) //
                .add("error", getError()) //
                .add("creationDate", getCreationDate()) //
                .add("rientro", getRientro()) //
                .add("btExecuted", getBtExecuted()) //
                .add("sentToTelecom", getSentToTelecom()) //
                .toString();
    }

    @PrePersist
    protected void prePersist() {
        if (AuditContextHolder.audit()) {
            setCreationDate(new Date());
        }
    }
}