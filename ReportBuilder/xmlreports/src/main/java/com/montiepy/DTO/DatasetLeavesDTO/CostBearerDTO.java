package com.montiepy.DTO.DatasetLeavesDTO;

import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.AddressDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.ContactDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.ExtensionDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.OrderNumberDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.SFBLocationDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.SFBPreviousDTO;
import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;
import com.montiepy.DatasetStructure.ReusableStructure.Address;
import com.montiepy.DatasetStructure.ReusableStructure.Contact;
import com.montiepy.DatasetStructure.ReusableStructure.Extension;
import com.montiepy.DatasetStructure.ReusableStructure.OrderNumber;
import com.montiepy.DatasetStructure.ReusableStructure.SFBLocation;
import com.montiepy.DatasetStructure.ReusableStructure.SFBPrevious;

public class CostBearerDTO extends AbstractDatasetLeafDTO {
    private final static String KT_IK = "mdk2:IK";
    private final static String KT_NAME = "mdk2:Name";
    private final static String CASE_NUMBER = "mdk2:Fallnummer";
    private final static String SALUTATION = "mdk2:Anrede";
    private final static String CLERK = "mdk2:Sachbearbeiter";

    private LeafDTO ktIk;
    private LeafDTO ktName;
    private LeafDTO caseNumber;
    private LeafDTO salutation;
    private LeafDTO clerk;
    private SFBLocation sfbLocationData;
    private SFBPrevious sfbPreviousData;
    private Extension extension;
    private Contact contactData;
    private Address addressData;
    private OrderNumber orderNumberData;


    public LeafDTO getKtIk() {
        return this.ktIk;
    }

    public CostBearerDTO setKtIk(String ktIk) {
        this.ktIk = new LeafDTO(KT_IK, ktIk);
        return this;
    }

    public LeafDTO getKtName() {
        return this.ktName;
    }

    public CostBearerDTO setKtName(String ktName) {
        this.ktName = new LeafDTO(KT_NAME, ktName);
        return this;
    }

    public LeafDTO getCaseNumber() {
        return this.caseNumber;
    }

    public CostBearerDTO setCaseNumber(String caseNumber) {
        this.caseNumber = new LeafDTO(CASE_NUMBER, caseNumber);
        return this;
    }

    public LeafDTO getSalutation() {
        return this.salutation;
    }

    public CostBearerDTO setSalutation(String salutation) {
        this.salutation = new LeafDTO(SALUTATION, salutation);
        return this;
    }

    public LeafDTO getClerk() {
        return this.clerk;
    }

    public CostBearerDTO setClerk(String clerk) {
        this.clerk = new LeafDTO(CLERK, clerk);
        return this;
    }

    public SFBLocation getSfbLocationData() {
        return this.sfbLocationData;
    }

    public CostBearerDTO setSfbLocationData(SFBLocationDTO sfbLocationData) {
        this.sfbLocationData = new SFBLocation(sfbLocationData);
        return this;
    }

    public SFBPrevious getSfbPreviousData() {
        return this.sfbPreviousData;
    }

    public CostBearerDTO setSfbPreviousData(SFBPreviousDTO sfbPreviousData) {
        this.sfbPreviousData = new SFBPrevious(sfbPreviousData);
        return this;
    }

    public Extension getExtensionData() {
        return this.extension;
    }

    public CostBearerDTO setExtensionData(ExtensionDTO extensionData) {
        this.extension = new Extension(extensionData);
        return this;
    }

    public Contact getContactData() {
        return this.contactData;
    }

    public CostBearerDTO setContactData(ContactDTO contactData) {
        this.contactData = new Contact(contactData);
        return this;
    }

    public Address getAddressData() {
        return this.addressData;
    }

    public CostBearerDTO setAddressData(AddressDTO addressData) {
        this.addressData = new Address(addressData);
        return this;
    }

    public OrderNumber getOrderNumberData() {
        return this.orderNumberData;
    }

    public CostBearerDTO setOrderNumberData(OrderNumberDTO orderNumberData) {
        this.orderNumberData = new OrderNumber(orderNumberData);
        return this;
    }

}

