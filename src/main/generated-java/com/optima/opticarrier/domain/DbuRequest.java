package com.optima.opticarrier.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "DBU_REQUEST")
public class DbuRequest implements Identifiable<Integer>, Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "optProgressivo")
    private String optProgressivo;

    @Column(name = "dn")
    private String dn;

    @Column(name = "flagPubblicazione")
    private Boolean flagPubblicazione;

    @Column(name = "flagCancellazione")
    private Boolean flagCancellazione;

    @Column(name = "flagModifica")
    private Boolean flagModifica;

    @Column(name = "ragSociale")
    private String ragSociale;

    @Column(name = "indirizzo")
    private String indirizzo;

    @Column(name = "localita")
    private String localita;

    @Column(name = "provincia")
    private String provincia;

    @Column(name = "cap")
    private String cap;

    @Column(name = "codFisc")
    private String codFisc;

    @Column(name = "pIva")
    private String pIva;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "fax")
    private String fax;

    @Column(name = "titoloStudio")
    private String titoloStudio;

    @Column(name = "attivita")
    private String attivita;

    @Column(name = "flagReverse")
    private Boolean flagReverse;

    @Column(name = "flagPubblicita")
    private Boolean flagPubblicita;

    @Column(name = "date_insert")
    private Date dateInsert;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean isIdSet() {
        return id != null;
    }

    public DbuRequest withDefaults() {
        return this;
    }

    public String getOptProgressivo() {
        return optProgressivo;
    }

    public void setOptProgressivo(String optProgressivo) {
        this.optProgressivo = optProgressivo;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public Boolean getFlagPubblicazione() {
        return flagPubblicazione;
    }

    public void setFlagPubblicazione(Boolean flagPubblicazione) {
        this.flagPubblicazione = flagPubblicazione;
    }

    public Boolean getFlagCancellazione() {
        return flagCancellazione;
    }

    public void setFlagCancellazione(Boolean flagCancellazione) {
        this.flagCancellazione = flagCancellazione;
    }

    public Boolean getFlagModifica() {
        return flagModifica;
    }

    public void setFlagModifica(Boolean flagModifica) {
        this.flagModifica = flagModifica;
    }

    public String getRagSociale() {
        return ragSociale;
    }

    public void setRagSociale(String ragSociale) {
        this.ragSociale = ragSociale;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getLocalita() {
        return localita;
    }

    public void setLocalita(String localita) {
        this.localita = localita;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCodFisc() {
        return codFisc;
    }

    public void setCodFisc(String codFisc) {
        this.codFisc = codFisc;
    }

    public String getpIva() {
        return pIva;
    }

    public void setpIva(String pIva) {
        this.pIva = pIva;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTitoloStudio() {
        return titoloStudio;
    }

    public void setTitoloStudio(String titoloStudio) {
        this.titoloStudio = titoloStudio;
    }

    public String getAttivita() {
        return attivita;
    }

    public void setAttivita(String attivita) {
        this.attivita = attivita;
    }

    public Boolean getFlagReverse() {
        return flagReverse;
    }

    public void setFlagReverse(Boolean flagReverse) {
        this.flagReverse = flagReverse;
    }

    public Boolean getFlagPubblicita() {
        return flagPubblicita;
    }

    public void setFlagPubblicita(Boolean flagPubblicita) {
        this.flagPubblicita = flagPubblicita;
    }

    public Date getDateInsert() {
        return dateInsert;
    }

    public void setDateInsert(Date dateInsert) {
        this.dateInsert = dateInsert;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DbuRequest that = (DbuRequest) o;

        if (dateInsert != null ? !dateInsert.equals(that.dateInsert) : that.dateInsert != null) return false;
        if (dn != null ? !dn.equals(that.dn) : that.dn != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (optProgressivo != null ? !optProgressivo.equals(that.optProgressivo) : that.optProgressivo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (optProgressivo != null ? optProgressivo.hashCode() : 0);
        result = 31 * result + (dn != null ? dn.hashCode() : 0);
        result = 31 * result + (dateInsert != null ? dateInsert.hashCode() : 0);
        return result;
    }
}
