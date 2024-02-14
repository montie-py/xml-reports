package com.montiepy.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.montiepy.DTO.DatasetLeavesDTO.ProceduralDataDTO;

public class GeneratingDTOService {
    private HashMap<String, Map> x3Array;


    public GeneratingDTOService() {
    }

    public ProceduralDataDTO generateProceduralDTO() {
        Map<String, String> proceduralData = (Map<String,String>)x3Array.get("proceduralData");
        ProceduralDataDTO proceduralDataDTO = new ProceduralDataDTO();
        proceduralDataDTO
            .setOrderNumber(proceduralData.get("orderNumber"))
            .setRecipientIk(proceduralData.get("recipientIk"))
            .setSenderIk(proceduralData.get("senderIk"))
            .setCreationDate(proceduralData.get("creationDate"))
            .setCreationTime(proceduralData.get("creationTime"))
            .setTaVersion(proceduralData.get("taVersion"))
            .setProcessIndicator(proceduralData.get("processIndicator"));
            
        return proceduralDataDTO;
    }

    public CostBearerDTO generateCostBearerDTO() {
        HashMap<String, Object> costBearerData = (HashMap)x3Array.get("costbearer");

        HashMap<String, String> costBearerContactData = (HashMap<String, String>) costBearerData.get("contactData");
        HashMap<String, String> costBearerAddressData = (HashMap<String, String>) costBearerData.get("addressData");
        HashMap<String, String> sfbLocationData = (HashMap<String, String>) costBearerData.get("sfbLocationData");
        HashMap<String, String> sfbPreviousData = (HashMap<String, String>) costBearerData.get("sfbPreviousData");
        HashMap<String, String> orderNumberData = (HashMap<String, String>) costBearerData.get("orderNumberData");

        return (new CostBearerDTO())
            .setClerk(costBearerData.get("clerk"))
            .setSalutation(costBearerData.get("salutation"))
            .setCaseNumber(costBearerData.get("caseNumber"))
            .setKtIk(costBearerData.get("ik"))
            .setKtName(costBearerData.get("name"))
            .setSfbLocationData(
                (new SFBLocationDTO())
                    .setZip(sfbLocationData.get("zip"))
                    .setCity(sfbLocationData.get("city"))
                    .setName(sfbLocationData.get("name"))
                    .setStreet(sfbLocationData.get("street"))
            )
            .setSfbPreviousData(
                (new SFBPreviousDTO())
                .setNameMdk(sfbPreviousData.get("name"))
                .setDatum(sfbPreviousData.get("date"))
                .setCity(sfbPreviousData.get("city"))
            )
            .setExtensionData(
                (new ExtensionDTO())
                .setName(((HashMap<String, String>)costBearerData.get("extension")).get("name"))
                .setNumber(((HashMap<String, String>)costBearerData.get("extension")).get("number"))
            )
            .setContactData(
                (new ContactDTO())
                .setPhone(costBearerContactData.get("phone"))
                .setMobile(costBearerContactData.get("mobile"))
                .setFax(costBearerContactData.get("fax"))
                .setEmail(costBearerContactData.get("email"))
            )
            .setAddressData(
                (new AddressDTO())
                .setStreetHousenumber(costBearerAddressData.get("street"))
                .setLkz(costBearerAddressData.get("lkz"))
                .setAddition(costBearerAddressData.get("addition"))
                .setCity(costBearerAddressData.get("city"))
                .setPostOffice(costBearerAddressData.get("postOffice"))
                .setZip(costBearerAddressData.get("zipcode"))
                .setDistrict(costBearerAddressData.get("district"))
            )
            .setOrderNumberData(
                (new OrderNumberDTO())
                .setOrderNumber(orderNumberData.get("orderNumber"))
                .setOrderNumber1Episode(orderNumberData.get("orderNumber1Episode"))
                .setOrderNumber2Episode(orderNumberData.get("orderNumber2Episode"))
            );
    }

    public InsurantDTO generateDataInsurantDTO() {
        HashMap<String, Object> insurantData = (HashMap)x3Array.get("insurant");
        HashMap<String, String> insurantPersonData = (HashMap<String, String>)insurantData.get("personData");
        HashMap<String, String> insurantAddressData = (HashMap<String, String>)insurantData.get("addressData");
        HashMap<String, String> insurantContactData = (HashMap<String, String>)insurantData.get("contactData");

        return (new InsurantDTO())
            .setInsuranceNumber(insurantData.get("kvnr"))
            .setPersonData(
                (new PersonDTO())
                    .setFirstname(insurantPersonData.get("firstName"))
                    .setLastname(insurantPersonData.get("lastName"))
                    .setTitle(insurantPersonData.get("title"))
                    .setGender(insurantPersonData.get("gender"))
                    .setDateOfBirth(insurantPersonData.get("birthDate"))
                    .setNameSuffix(insurantPersonData.get("additionalName"))
                    .setPrefix(insurantPersonData.get("prefix"))
            )
            .setAddressData(
                (new AddressDTO())
                    .setStreetHousenumber(insurantAddressData.get("street"))
                    .setLkz(insurantAddressData.get("lkz"))
                    .setAddition(insurantAddressData.get("additionalAddress"))
                    .setCity(insurantAddressData.get("city"))
                    .setZip(insurantAddressData.get("zip"))
                    .setDistrict(insurantAddressData.get("district"))
            )
            .setContactData((new ContactDTO())
                    .setPhone(insurantContactData.get("phone"))
                    .setMobile(insurantContactData.get("mobile"))
                    .setFax(insurantContactData.get("fax"))
                    .setEmail(insurantContactData.get("email"))
            )
            .setLegalGuardian(generateLegalGuardianDTO());
    }

    private LegalGuardianDTO generateLegalGuardianDTO() {
        HashMap<String, Object> legalGuardianData = (HashMap)x3Array.get("legalGuardian");
        HashMap<String, String> legalGuardianPersonData = (HashMap<String, String>)legalGuardianData.get("personData");
        HashMap<String, String> legalGuardianAddressData = (HashMap<String, String>)legalGuardianData.get("addressData");
        HashMap<String, String> legalGuardianContactData = (HashMap<String, String>)legalGuardianData.get("contactData");

        return (new LegalGuardianDTO())
            .setOtherAdressat(legalGuardianData.get("otherAdressat"))
            .setSpecialNotes(legalGuardianData.get("specialNotes"))
            .setPersonData(
                (new PersonDTO())
                    .setFirstname(legalGuardianPersonData.get("firstName"))
                    .setLastname(legalGuardianPersonData.get("lastName"))
                    .setTitle(legalGuardianPersonData.get("title"))
                    .setGender(legalGuardianPersonData.get("gender"))
                    .setDateOfBirth(legalGuardianPersonData.get("birthDate"))
                    .setNameSuffix(legalGuardianPersonData.get("additionalName"))
                    .setPrefix(legalGuardianPersonData.get("prefix"))
            )
            .setAddressData(
                (new AddressDTO())
                    .setStreetHousenumber(legalGuardianAddressData.get("street"))
                    .setLkz(legalGuardianAddressData.get("lkz"))
                    .setAddition(legalGuardianAddressData.get("additionalAddress"))
                    .setCity(legalGuardianAddressData.get("city"))
                    .setZip(legalGuardianAddressData.get("zip"))
                    .setDistrict(legalGuardianAddressData.get("district"))
            )
            .setContactData((new ContactDTO())
                    .setPhone(legalGuardianContactData.get("phone"))
                    .setMobile(legalGuardianContactData.get("mobile"))
                    .setFax(legalGuardianContactData.get("fax"))
                    .setEmail(legalGuardianContactData.get("email"))
            );
    }

    public PrescriberDTO generatePrescriberDTO() {
        HashMap<String, Object> prescriberData = (HashMap)x3Array.get("prescriber");
        HashMap<String, String> prescriberPersonData = (HashMap<String, String>)prescriberData.get("personData");
        HashMap<String, String> prescriberAddressData = (HashMap<String, String>)prescriberData.get("addressData");
        HashMap<String, String> prescriberContactData = (HashMap<String, String>)prescriberData.get("contactData");

        return (new PrescriberDTO())
        .setDifferentDesignation(prescriberData.get("otherAdressat"))
        .setSpecialistDesignation(prescriberData.get("specialNotes"))
        .setIdentifierData(
            (new IdentifierDTO())
                .setLanr(prescriberPersonData.get("lanr"))
                .setKzvArea(prescriberPersonData.get("kzvArea"))
                .setDentistNumber(prescriberPersonData.get("dentistNumber"))
                .setBnsr(prescriberPersonData.get("bnsr"))
                .setIk(prescriberPersonData.get("ik"))
        )
        .setPersonData(
            (new PersonDTO())
                .setFirstname(prescriberPersonData.get("firstName"))
                .setLastname(prescriberPersonData.get("lastName"))
                .setTitle(prescriberPersonData.get("title"))
                .setGender(prescriberPersonData.get("gender"))
                .setDateOfBirth(prescriberPersonData.get("birthDate"))
                .setNameSuffix(prescriberPersonData.get("additionalName"))
                .setPrefix(prescriberPersonData.get("prefix"))
        )
        .setAddressData(
            (new AddressDTO())
                .setStreetHousenumber(prescriberAddressData.get("street"))
                .setLkz(prescriberAddressData.get("lkz"))
                .setAddition(prescriberAddressData.get("additionalAddress"))
                .setCity(prescriberAddressData.get("city"))
                .setZip(prescriberAddressData.get("zip"))
                .setDistrict(prescriberAddressData.get("district"))
        )
        .setContactData((new ContactDTO())
                .setPhone(prescriberContactData.get("phone"))
                .setMobile(prescriberContactData.get("mobile"))
                .setFax(prescriberContactData.get("fax"))
                .setEmail(prescriberContactData.get("email"))
        );
    }

    public ServiceProviderDTO generateServiceProviderDTO() {
        HashMap<String, Object> serviceProviderData = (HashMap)x3Array.get("serviceProvider");
        HashMap<String, String> serviceProviderAddressData = (HashMap<String, String>)serviceProviderData.get("addressData");
        HashMap<String, String> serviceProviderContactData = (HashMap<String, String>)serviceProviderData.get("contactData");

        return (new ServiceProviderDTO())
        .setIk(serviceProviderData.get("ik"))
        .setName(serviceProviderData.get("name"))
        .setNameLocation(serviceProviderData.get("nameLocation"))
        .setAddressData(
            (new AddressDTO())
                .setStreetHousenumber(serviceProviderAddressData.get("street"))
                .setLkz(serviceProviderAddressData.get("lkz"))
                .setAddition(serviceProviderAddressData.get("additionalAddress"))
                .setCity(serviceProviderAddressData.get("city"))
                .setZip(serviceProviderAddressData.get("zip"))
                .setDistrict(serviceProviderAddressData.get("district"))
        )
        .setContactData((new ContactDTO())
                .setPhone(serviceProviderContactData.get("phone"))
                .setMobile(serviceProviderContactData.get("mobile"))
                .setFax(serviceProviderContactData.get("fax"))
                .setEmail(serviceProviderContactData.get("email"))
        );
    }

    public CommissionExpertOpinionToolsDTO generateCommissionExpertOpinionToolsDTO() {
        HashMap<String, Object> commissionExpertOpinionToolsData = (HashMap)x3Array.get("commissionExpertOpinionTools");

        return (new CommissionExpertOpinionToolsDTO())
            .setAnnotation(commissionExpertOpinionToolsData.get("annotation"))
            .setRequestReceivedDate(commissionExpertOpinionToolsData.get("requestReceivedDate"))
            .setNumberPlants(commissionExpertOpinionToolsData.get("numberPlants"))
            .setNumberInstallationsPost(commissionExpertOpinionToolsData.get("numberInstallationsPost"))
            .setOrderType(commissionExpertOpinionToolsData.get("orderType"))
            .setAssessmentType(commissionExpertOpinionToolsData.get("assessmentType"))
            .setExplanationAttachmentsDa(commissionExpertOpinionToolsData.get("explanationAttachmentsDA"))
            .setExplanationAttachmentsPost(commissionExpertOpinionToolsData.get("explanationAttachmentsPost"))
            .setExplanationDocumentsMd(commissionExpertOpinionToolsData.get("explanationDocumentsMD"))
            .setPreparerPvReport(commissionExpertOpinionToolsData.get("preparerPvReport"))
            .setDeadline(commissionExpertOpinionToolsData.get("deadline"))
            .setDeadlineDate(commissionExpertOpinionToolsData.get("deadlineDate"))
            .setKvaAmount(commissionExpertOpinionToolsData.get("kvaAmount"))
            .setKvaDate(commissionExpertOpinionToolsData.get("kvaDate"))
            .setOpData(commissionExpertOpinionToolsData.get("opDate"))
            .setLevelOfCare(commissionExpertOpinionToolsData.get("careLevel"))
            .setLevelOfCareFromTo(commissionExpertOpinionToolsData.get("careLevelDateFrom"))
            .setCareService(commissionExpertOpinionToolsData.get("careService"))
            .setDocumentsAtMd(commissionExpertOpinionToolsData.get("documentsAtMD"))
            .setPrescriptionDate(commissionExpertOpinionToolsData.get("prescriptionDate"));
    }

    public ArrayList<RehabilitationDTO> generateRehabilitationDTO() {
        HashMap<String, Object> rehabilitation = (HashMap)x3Array.get("rehabilitation");
        ArrayList<RehabilitationDTO> result = new ArrayList<>();

        var fullDiagnoseData = (ArrayList<HashMap<String, String>>)rehabilitation.get("diagnoseData");

        DiagnoseDTO diagnoseDTO;
        RehabilitationDTO rehabilitationDTOItem;
        int j = 0;
        for (HashMap<String, String> rehabilitationData : (ArrayList<HashMap<String, String>>)rehabilitation.get("items")) {
            var diagnoseData = fullDiagnoseData.get(j++);
            diagnoseDTO = (new DiagnoseDTO())
                .setIcd(diagnoseData.get("icd"))
                .setIcdVersion(diagnoseData.get("icdVersion"))
                .setLocalization(diagnoseData.get("localization"))
                .setPlainText(diagnoseData.get("plainText"));
            
            rehabilitationDTOItem = (new RehabilitationDTO())
                .setIk(rehabilitationData.get("ik"))
                .setIntake(rehabilitationData.get("intake"))
                .setRelease(rehabilitationData.get("release"))
                .setName(rehabilitationData.get("name"))
                .setExecution(rehabilitationData.get("execution"))
                .setPerformance(rehabilitationData.get("performance"))
                .setDiagnose(diagnoseDTO);
            result.add(rehabilitationDTOItem);
        }
        return result;
    }

    public ArrayList<MiMaRecordDTO> generateMiMaRecordDTO() {
        ArrayList<HashMap<String, String>> mimaData = (ArrayList)x3Array.get("mima");

        ArrayList<MiMaRecordDTO> result = new ArrayList<>();

        MiMaRecordDTO mimaRecordDTOItem;
        for (HashMap<String, String> mimaDatum : mimaData) {
            mimaRecordDTOItem = (new MiMaRecordDTO())
                .setorderNumber(mimaDatum.get("orderNumber"));
            result.add(mimaRecordDTOItem);
        }
        return result;
    }

    public ArrayList<RemedyDTO> generateRemedyDTO() {
        ArrayList<HashMap<String, String>> remediesData = (ArrayList)x3Array.get("remedies");

        ArrayList<RemedyDTO> result = new ArrayList<>();

        RemedyDTO remedyDTOItem;
        for (HashMap<String, String> remediesDatum : remediesData) {
            remedyDTOItem = (new RemedyDTO())
                .setStart(remedyDatum.get("start"))
                .setEnd(remedyDatum.get("end"))
                .setNumber(remedyDatum.get("number"))
                .setDescription(remedyDatum.get("description"))
                .setQuantity(remedyDatum.get("quantity"));
            result.add(remedyDTOItem);
        }

        return result;
    }

    public ArrayList<AssignmentQuestionDTO> generateAssignmentQuestionDTO() {
        ArrayList<HashMap<String, String>> assignmentQuestions = (ArrayList)x3Array.get("questions");

        ArrayList<AssignmentQuestionDTO> result = new ArrayList<>();

        AssignmentQuestionDTO assignmentQuestionDTOItem;
        for (HashMap<String, String> assignmentQuestion : assignmentQuestions) {
            assignmentQuestionDTOItem = (new AssignmentQuestionDTO())
                .setQuestion(assignmentQuestion.get("question"))
                .setJustification(assignmentQuestion.get("justification"));
            result.add(assignmentQuestionDTOItem);
        }
        
        return result;
    }

    public ArrayList<HospitalizationDTO> generateHospitalizationDTO() {
        HashMap<String, Object> hospitalization = (HashMap)x3Array.get("hospitalizationData");
        
        ArrayList<HospitalizationDTO> result = new ArrayList<>();

        var fullDiagnoseData = (ArrayList<HashMap<String, String>>)hospitalization.get("diagnoseData");

        HospitalizationDTO hospitalizationDTOItem;
        DiagnoseDTO diagnoseDTO;
        int j = 0;
        for (HashMap<String, String> hospitalizationData : (ArrayList<HashMap<String, String>>)hospitalization.get("items")) {
            var diagnoseData = fullDiagnoseData.get(j++);
            diagnoseDTO = (new DiagnoseDTO())
                .setIcd(diagnoseData.get("icd"))
                .setIcdVersion(diagnoseData.get("icdVersion"))
                .setLocalization(diagnoseData.get("localization"))
                .setPlainText(diagnoseData.get("plainText"));
            
            hospitalizationDTOItem = (new HospitalizationDTO())
                .setIk(hospitalizationData.get("ik"))
                .setIntake(hospitalizationData.get("intake"))
                .setRelease(hospitalizationData.get("release"))
                .setName(hospitalizationData.get("name"))
                .setDiagnose(diagnoseDTO);
            result.add(hospitalizationDTOItem);
        }

        return result;
    }

    public ArrayList<PreSupplyAidsDTO> generatePreSupplyAidsDTO() {
        ArrayList<HashMap<String, String>> preSupplyAidsData = (ArrayList)x3Array.get("preSupplyAidsData");

        PreSupplyAidsDTO preSupplyAidsDTOItem;
        ArrayList<PreSupplyAidsDTO> result = new ArrayList<>();

        for (HashMap<String, String> preSupplyAidsDatum : preSupplyAidsData) {
            preSupplyAidsDTOItem = (new PreSupplyAidsDTO())
                .setNumber(preSupplyAidsDatum.get("number"))
                .setDate(preSupplyAidsDatum.get("date"))
                .setDescription(preSupplyAidsDatum.get("description"))
                .setStatus(preSupplyAidsDatum.get("status"));
            result.add(preSupplyAidsDTOItem);
        }

        return result;
    }

    public AidsDTO generateAidsDTO() {
        HashMap<String, String> aidsData = (HashMap)x3Array.get("aids");

        return (new AidsDTO())
            .setDescription(aidsData.get("description"))
            .setTo(aidsData.get("to"))
            .setUnit(aidsData.get("unit"))
            .setHmnr(aidsData.get("hmnr"))
            .setKzh(aidsData.get("kzh"))
            .setLfdNrHm(aidsData.get("lfdNr"))
            .setAmount(aidsData.get("amount")/*,$attributes*/)
            .setFrom(aidsData.get("from"));
    }

    public DelayDTO generateDelayDTO() {
        HashMap<String, String> delayData = (HashMap)x3Array.get("delay");

        return (new DelayDTO())
            .setReason(delayData.get("reason"))
            .setComment(delayData.get("comment"))
            .setAddress(delayData.get("address"))
            .setTime(delayData.get("time"))
            .setDate(delayData.get("date"))
            .setCity(delayData.get("city"))
            .setZip(delayData.get("zip"));
    }

    public SendPrintDTO generateSendPrintDTO() {
        HashMap<String, String> sendPrintData = (HashMap)x3Array.get("parkInformation");
        return (new SendPrintDTO())
            .setReason(sendPrintData.get("reason"))
            .setParkMode(sendPrintData.get("parkMode"))
            .setParkUntil(sendPrintData.get("parkUntil"));
    }

    public CancellationDTO generateCancellationDTO() {
        HashMap<String, String> cancellationData = (HashMap)x3Array.get("cancellation");

        return (new CancellationDTO())
            .setOrderNumber(cancellationData.get("orderNumber"))
            .setOrderType(cancellationData.get("orderType"))
            .setComment(cancellationData.get("comment"));
    }

    public FrontLoadingDTO generateFrontLoadingDTO() {
        return new FrontLoadingDTO();
    }
}
