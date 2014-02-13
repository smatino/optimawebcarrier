package com.optima.opticarrier.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@StaticMetamodel(DbuRequest.class)
public class DbuRequest_ {

    // Raw attributes
    public static volatile SingularAttribute<DbuRequest, Integer> id;
    public static volatile SingularAttribute<DbuRequest, String> optProgressivo;
    public static volatile SingularAttribute<DbuRequest, String> dn;
    public static volatile SingularAttribute<DbuRequest, String> idContratto;
    public static volatile SingularAttribute<DbuRequest, Boolean> flagPubblicazione;
    public static volatile SingularAttribute<DbuRequest, Boolean> flagCancellazione;
    public static volatile SingularAttribute<DbuRequest, Boolean> flagModifica;
    public static volatile SingularAttribute<DbuRequest, String> ragSociale;
    public static volatile SingularAttribute<DbuRequest, String> indirizzo;
    public static volatile SingularAttribute<DbuRequest, String> localita;
    public static volatile SingularAttribute<DbuRequest, String> provincia;
    public static volatile SingularAttribute<DbuRequest, String> cap;
    public static volatile SingularAttribute<DbuRequest, String> codFisc;
    public static volatile SingularAttribute<DbuRequest, String> pIva;
    public static volatile SingularAttribute<DbuRequest, String> telefono;
    public static volatile SingularAttribute<DbuRequest, String> fax;
    public static volatile SingularAttribute<DbuRequest, String> titoloStudio;
    public static volatile SingularAttribute<DbuRequest, String> attivita;
    public static volatile SingularAttribute<DbuRequest, Boolean> flagReverse;
    public static volatile SingularAttribute<DbuRequest, Boolean> flagPubblicita;
    public static volatile SingularAttribute<DbuRequest, Date> dateInsert;

}
