package com.montiepy.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GeneratingDTOService {
    private HashMap<String, Map> x3Array;


    public GeneratingDTOService() {
    }

    public ProceduralDataDTO generateProceduralDTO() {
        Map proceduralData = x3Array.get("proceduralData");
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
}
