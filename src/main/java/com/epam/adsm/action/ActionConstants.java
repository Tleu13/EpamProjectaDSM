package com.epam.adsm.action;

/**
 * Created by akmatleu on 18.05.17.
 */
public final class ActionConstants {
// Pages
    public static final String HOME_PAGE = "homePage";
    public static final String LOGIN_PAGE = "login";
    public static final String CREATE_STAFF_PAGE = "createStaff";
    public static final String CREATE_PATIENT_PAGE = "createPatient";
    public static final String CREATE_RECEIPT = "createReceipt";
    public static final String GET_ALL_STAFF_PAGE = "getStaffList";
    public static final String STAFF_EDIT_PAGE = "staffEdit";
    public static final String GET_ALL_PATIENTS_PAGE = "getPatientList";
    public static final String PATIENTS_EDIT_PAGE = "patientEdit";
    public static final String DRUG_ADMINISTRATION_PAGE = "createDrugAdministration";
    public static final String ADVERSE_EVENT_PAGE = "createAdverseEvent";
    public static final String PATIENT_HOME_PAGE = "patientHomePage";
    public static final String DETAIL_EVENT_PAGE = "patientEventDetails";
    public static final String DOCTOR_SCHEDULE_PAGE = "doctorSchedule";
    public static final String DOCTOR_PATIENTS_PAGE = "getMyPatients";
    public static final String DOCTOR_PATIENTS_ADVERSE_PAGE = "getMyPatientsAdverse";
    public static final String CREATE_ADMINISTRATION_PATIENT_PAGE = "/do/createAdministration/drug?patientCode=";
    public static final String PATIENT_EVENT_DETAILS = "/do/event/details?eventId=";
    public static final String PATIENT_EDIT_PAGE = "/do/patient/edit?patientCode=";
    public static final String STAFF_STAFF_EDIT_PAGE = "/do/staff/edit?staff_id=";
// Staff fields
    public static final String STAFF = "staff";
    public static final String STAFF_ID = "staff_id";
    public static final String NAME = "name";
    public static final String SURNAME = "surname";
    public static final String PHONE = "phone";
    public static final String ROLE = "role";
    public static final String DOCTOR = "doctor";
    public static final String DOCTORS = "doctors";
    public static final String PASSWORD = "password";
    public static final String CONFIRMED_PASS = "confirmedPassword";
    public static final String STATUS ="activity_status";
    public static final String ALL_STAFF = "staffList";
    public static final String COORDINATOR = "coordinator";
    public static final String ACTIVATION_STATUSES = "activaionStatuses";
// Patient and Diagnosis fields
    public static final String PATIENT =  "patient";
    public static final String RESEARCH = "research";
    public static final String RESEARCH_STATUS = "activationStatus";
    public static final String PATIENT_CODE = "patientCode";
    public static final String PATIENT_ROLE = "patient";
    public static final String PATIENT_DOCTOR_SURNAME = "patientDoctorSurname";
    public static final String PATIENT_EVENTS = "patientEvents";
    public static final String INITIAL = "initial";
    public static final String EMAIL = "email";
    public static final String DATE_BIRTHDAY = "dateBirthday";
    public static final String RISK_FACTOR = "riskfactor";
    public static final String RISK_FACTORS = "riskFactors";
    public static final String ROLE_OPTIONS = "roleOptions";
    public static final String GENDER = "gender";
    public static final String GENDERS = "genders";
    public static final String CLINICAL_FORMS = "clinicalForms";
    public static final String CLINICAL_FORM= "clinicalForm";
    public static final String LOCALIZATION = "localization";
    public static final String DST_STATUS = "dstStatus";
    public static final String DSTS_STATUS = "dstsStatus";
    public static final String LOCALIZATIONS = "localizatoins";
    public static final String PREVALENCE = "prevalence";
    public static final String PREVALENCES = "prevalences";
    public static final String MBT_STATUS = "mbtStatus";
    public static final String MBT_STATUSES = "mbtStatuses";
    public static final String PATIENT_TYPE = "patientType";
    public static final String PATIENTTYPES = "patientTypes";
    public static final String LOGIN_ERROR = "login_error";
    public static final String ALL_PATIENTS = "patientList";
    public static final String ALL_DIAGNOSIS = "diagnosisList";
    public static final String ALL_RESEARCH = "researchList";
    public static final double INCOMPLETE = 0;
    public static final String ENROLLMENT_DATE = "enrollmentDate";
//Event
    public static final String EVENT="event";
    public static final String EVENT_ID="eventId";
    public static final String TASKS_NAME="tasksName";
    public static final String TASKS_PROGRESS="tasksProgress";
    public static final String TASKS_ID = "tasksId";
    public static final String TASK_ID = "taskId";
    public static final String DOCTOR_PATIENTS_ADVERSE_EVENTS = "adverseEvents";
    public static final String ADVERSE_EVENT_ID = "adverseEventId";
    public static final String ADVERSE_EVENT_STATUS = "adverseStatus";
    public static final String ADVERSE_STATUSES = "adverseStatuses";
// Drug
    public static final String DRUGS = "drugs";
    public static final String DRUG_ID ="drug_id";
    public static final String DRUG_DOZE = "drug_doze";
    public static final String RECEIPTS = "receipts";
    public static final String RECEIPT_ID = "receiptId";
    public static final String DRUG_STATUS = "drugStatus";
    public static final String ADMINISTRATION_OPTIONS = "administrationOptions";
// Adverse Event
    public static final String ADVERSE_EVENT = "adverseEventName";
    public static final String ADVERSE_DATE = "adverseEventDate";
    public static final String ADVERSE_COMMENT = "adverseEventComment";
    public static final String ADVERSE_ALCOHOL = "isAlcohol";
    public static final String ADVERSE_DRUG = "isDrug";
// Action path
    public static final String PATH_JSP = "/WEB-INF/jsp/";
    public static final String JSP = ".jsp";
    public static final String LANG = "lang";
    public static final int HOUR = 24;
    public static final int MINUTE = 60;
    public static final int SEC = 60;
    public static final String REFERER ="referer";
    public static final String VALIDATION_PROPERTIES = "validation.properties";
    public static final String PASSWORD_VALIDATION = "password.regex";
    public static final String WORD_VALIDATION = "word.regex";
    public static final String NUMBER_VALIDATION = "number.regex";
    public static final String DOUBLE_VALIDATION ="doubleNumber.regex";
// Error
    public static final String ERROR = "error";
    public static final String ERROR_NULL_FIELDS = "errorNull";
    public static final String ERROR_PASSWORD = "errorPassword";
    public static final String ERROR_PHONE_EXIST = "errorPhoneExist";

    private ActionConstants() {}
}
