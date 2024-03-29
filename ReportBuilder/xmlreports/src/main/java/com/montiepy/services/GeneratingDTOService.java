package com.montiepy.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.montiepy.DTO.DatasetLeavesDTO.AidsDTO;
import com.montiepy.DTO.DatasetLeavesDTO.AssignmentQuestionDTO;
import com.montiepy.DTO.DatasetLeavesDTO.CommissionExpertOpinionToolsDTO;
import com.montiepy.DTO.DatasetLeavesDTO.CostBearerDTO;
import com.montiepy.DTO.DatasetLeavesDTO.DelayDTO;
import com.montiepy.DTO.DatasetLeavesDTO.DiagnoseDTO;
import com.montiepy.DTO.DatasetLeavesDTO.FrontLoadingDTO;
import com.montiepy.DTO.DatasetLeavesDTO.HospitalizationDTO;
import com.montiepy.DTO.DatasetLeavesDTO.InsurantDTO;
import com.montiepy.DTO.DatasetLeavesDTO.LegalGuardianDTO;
import com.montiepy.DTO.DatasetLeavesDTO.MiMaRecordDTO;
import com.montiepy.DTO.DatasetLeavesDTO.PreSupplyAidsDTO;
import com.montiepy.DTO.DatasetLeavesDTO.PrescriberDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ProceduralDataDTO;
import com.montiepy.DTO.DatasetLeavesDTO.RehabilitationDTO;
import com.montiepy.DTO.DatasetLeavesDTO.RemedyDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ServiceProviderDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.AddressDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.ContactDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.ExtensionDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.IdentifierDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.OrderNumberDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.PersonDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.SFBLocationDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.SFBPreviousDTO;

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
        HashMap<String, HashMap<String, String>> costBearerData = (HashMap)x3Array.get("costbearer");

        HashMap<String, String> data = costBearerData.get("data");
        HashMap<String, String> costBearerContactData = costBearerData.get("contactData");
        HashMap<String, String> costBearerAddressData = costBearerData.get("addressData");
        HashMap<String, String> sfbLocationData = costBearerData.get("sfbLocationData");
        HashMap<String, String> sfbPreviousData = costBearerData.get("sfbPreviousData");
        HashMap<String, String> orderNumberData = costBearerData.get("orderNumberData");

        return (new CostBearerDTO())
            .setClerk(data.get("clerk"))
            .setSalutation(data.get("salutation"))
            .setCaseNumber(data.get("caseNumber"))
            .setKtIk(data.get("ik"))
            .setKtName(data.get("name"))
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
        HashMap<String, HashMap<String, String>> insurantData = (HashMap)x3Array.get("insurant");
        HashMap<String, String> data = insurantData.get("data");
        HashMap<String, String> insurantPersonData = insurantData.get("personData");
        HashMap<String, String> insurantAddressData = insurantData.get("addressData");
        HashMap<String, String> insurantContactData = insurantData.get("contactData");

        return (new InsurantDTO())
            .setInsuranceNumber(data.get("kvnr"))
            .setPersonData(
                (new PersonDTO())
                    .setFirstName(insurantPersonData.get("firstName"))
                    .setLastName(insurantPersonData.get("lastName"))
                    .setTitle(insurantPersonData.get("title"))
                    .setGender(insurantPersonData.get("gender"))
                    .setDateOfBirth(insurantPersonData.get("birthDate"))
                    .setSuffix(insurantPersonData.get("additionalName"))
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
        HashMap<String, HashMap<String, String>> legalGuardianData = (HashMap)x3Array.get("legalGuardian");
        HashMap<String, String> data = legalGuardianData.get("data");
        HashMap<String, String> legalGuardianPersonData = legalGuardianData.get("personData");
        HashMap<String, String> legalGuardianAddressData = legalGuardianData.get("addressData");
        HashMap<String, String> legalGuardianContactData = legalGuardianData.get("contactData");

        return (new LegalGuardianDTO())
            .setOtherAdressat(data.get("otherAdressat"))
            .setSpecialNotes(data.get("specialNotes"))
            .setPersonData(
                (new PersonDTO())
                    .setFirstName(legalGuardianPersonData.get("firstName"))
                    .setLastName(legalGuardianPersonData.get("lastName"))
                    .setTitle(legalGuardianPersonData.get("title"))
                    .setGender(legalGuardianPersonData.get("gender"))
                    .setDateOfBirth(legalGuardianPersonData.get("birthDate"))
                    .setSuffix(legalGuardianPersonData.get("additionalName"))
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
        HashMap<String, HashMap<String, String>> prescriberData = (HashMap)x3Array.get("prescriber");
        HashMap<String, String> data = prescriberData.get("data");
        HashMap<String, String> prescriberPersonData = prescriberData.get("personData");
        HashMap<String, String> prescriberAddressData = prescriberData.get("addressData");
        HashMap<String, String> prescriberContactData = prescriberData.get("contactData");

        return (new PrescriberDTO())
        .setDifferentDesignation(data.get("otherAdressat"))
        .setSpecialistDesignation(data.get("specialNotes"))
        .setIdentifierData(
            (new IdentifierDTO())
                .setLanr(prescriberPersonData.get("lanr"))
                .setKzvArea(prescriberPersonData.get("kzvArea"))
                .setDentistNumber(prescriberPersonData.get("dentistNumber"))
                .setBsnr(prescriberPersonData.get("bnsr"))
                .setIk(prescriberPersonData.get("ik"))
        )
        .setPersonData(
            (new PersonDTO())
                .setFirstName(prescriberPersonData.get("firstName"))
                .setLastName(prescriberPersonData.get("lastName"))
                .setTitle(prescriberPersonData.get("title"))
                .setGender(prescriberPersonData.get("gender"))
                .setDateOfBirth(prescriberPersonData.get("birthDate"))
                .setSuffix(prescriberPersonData.get("additionalName"))
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
        HashMap<String, HashMap<String, String>> serviceProviderData = (HashMap)x3Array.get("serviceProvider");
        HashMap<String, String> data = serviceProviderData.get("data");
        HashMap<String, String> serviceProviderAddressData = serviceProviderData.get("addressData");
        HashMap<String, String> serviceProviderContactData = serviceProviderData.get("contactData");

        return (new ServiceProviderDTO())
        .setIk(data.get("ik"))
        .setName(data.get("name"))
        .setNameLocation(data.get("nameLocation"))
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
        HashMap<String, String> commissionExpertOpinionToolsData = (HashMap)x3Array.get("commissionExpertOpinionTools");

        return (new CommissionExpertOpinionToolsDTO())
            .setAnnotation(commissionExpertOpinionToolsData.get("annotation"))
            .setRequestReceiveDate(commissionExpertOpinionToolsData.get("requestReceiveDate"))
            .setKvaDate(commissionExpertOpinionToolsData.get("kvaDate"))
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
                .setOrderNumber(mimaDatum.get("orderNumber"));
            result.add(mimaRecordDTOItem);
        }
        return result;
    }

    public ArrayList<RemedyDTO> generateRemedyDTO() {
        ArrayList<HashMap<String, String>> remediesData = (ArrayList)x3Array.get("remedies");

        ArrayList<RemedyDTO> result = new ArrayList<>();

        RemedyDTO remedyDTOItem;
        for (HashMap<String, String> remedyDatum : remediesData) {
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
            .setOrderNumberData(cancellationData.get("orderNumber"))
            .setOrderType(cancellationData.get("orderType"))
            .setComment(cancellationData.get("comment"));
    }

    public FrontLoadingDTO generateFrontLoadingDTO() {
        return new FrontLoadingDTO();
    }
}
