package com.optima.opticarrier.web.domain;

import com.optima.opticarrier.domain.DbuRequest;
import com.optima.opticarrier.repository.DbuRequestRepository;
import com.optima.opticarrier.service.FileContentWriter;
import com.optima.opticarrier.util.CsvUtil;
import com.optima.opticarrier.web.domain.support.GenericEditForm;
import com.optima.opticarrier.web.faces.ConversationContextScoped;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Date;

@Named
@ConversationContextScoped
public class DbuRequestEditForm extends GenericEditForm<DbuRequest, Integer> {

    @Value("${dbuRequest.path.inputFolder}")
    protected String pathToCsv;

    @Value("${dbuRequest.fileName.pattern}")
    protected String fileNamePattern;

    protected boolean toCsv = true;

    @Inject
    protected DbuRequestController dbuRequestController;

    @Inject
    protected FileContentWriter fileContentWriter;

    @Inject
    public DbuRequestEditForm(DbuRequestRepository dbuRequestRepository) {
        super(dbuRequestRepository);
    }

    public DbuRequest getDbuRequest() {
        return getEntity();
    }

    public String print() {
        return dbuRequestController.print(getDbuRequest());
    }

    @Override
    protected DbuRequest saveEntity(DbuRequest entity) {

        long time = new Date().getTime();

        if(StringUtils.isBlank(entity.getOptProgressivo())){
            String optProgressivo = "OPTDBU_" + time;
            entity.setOptProgressivo(optProgressivo);
        }

        if(toCsv){
            String fileName = String.format(fileNamePattern, time);

            String[] fields = {"optProgressivo", "dn", "idContratto" , "flagPubblicazione", "flagCancellazione", "flagModifica", "ragSociale",
                    "indirizzo", "localita", "provincia", "cap", "codFisc", "pIva", "telefono", "fax", "titoloStudio",
                    "attivita", "flagReverse", "flagPubblicita" };

            String csv = CsvUtil.makeCsv(entity, fields);
            fileContentWriter.saveToFile(pathToCsv, fileName, csv);

        } else {
            entity = super.saveEntity(entity);
        }
        return entity;
    }

    public boolean isToCsv() {
        return toCsv;
    }

    public void setToCsv(boolean toCsv) {
        this.toCsv = toCsv;
    }
}
