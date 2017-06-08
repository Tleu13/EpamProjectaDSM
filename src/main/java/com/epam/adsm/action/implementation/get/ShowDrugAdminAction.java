package com.epam.adsm.action.implementation.get;

import com.epam.adsm.action.Action;
import com.epam.adsm.action.ActionResult;
import com.epam.adsm.model.DiagnosisDate;
import com.epam.adsm.model.Drug;
import com.epam.adsm.model.Receipt;
import com.epam.adsm.service.ChemisterService;
import com.epam.adsm.service.CordinatorService;
import com.epam.adsm.service.ServiceExeption;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

import static com.epam.adsm.action.ActionConstants.*;

/**
 * Created by akmatleu on 23.05.17.
 */
public class ShowDrugAdminAction implements Action {

    private static final Logger LOG = LoggerFactory.getLogger(ShowDrugAdminAction.class);

    @Override
    public ActionResult execute(HttpServletRequest request, HttpServletResponse response) {
        List<Receipt> receipts;
        List<Drug> drugs;
        List<String> administrationOptions;
        CordinatorService cordinatorService = new CordinatorService();
        String patientCode = request.getParameter(PATIENT_CODE);
        ChemisterService chemisterService = new ChemisterService();
        try {
            DiagnosisDate diagnosisDate = cordinatorService.getDiagnosisDate();
            administrationOptions = diagnosisDate.getAdministrationOption();
            receipts = chemisterService.getAllRecieptsByPatientCode(patientCode);
            drugs = chemisterService.getAllDrugs();
            request.setAttribute(RECEIPTS, receipts);
            request.setAttribute(DRUGS, drugs);
            request.setAttribute(ADMINISTRATION_OPTIONS,administrationOptions);
        } catch (ServiceExeption e) {
            LOG.error("Cannot find receipt by patientCode" + patientCode, e);
        }
        return new ActionResult(DRUG_ADMINISTRATION_PAGE);
    }
}