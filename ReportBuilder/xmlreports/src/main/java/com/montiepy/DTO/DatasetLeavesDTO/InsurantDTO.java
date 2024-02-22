package com.montiepy.DTO.DatasetLeavesDTO;

import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.AddressDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.ContactDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.PersonDTO;
import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;
import com.montiepy.DatasetStructure.LegalGuardian;
import com.montiepy.DatasetStructure.ReusableStructure.Address;
import com.montiepy.DatasetStructure.ReusableStructure.Contact;
import com.montiepy.DatasetStructure.ReusableStructure.Person;

public class InsurantDTO extends AbstractDatasetLeafDTO{
    private static final String INSURANCE_NUMBER = "mdk2:KV_PV_Nummer";

    private LeafDTO insuranceNumber;
    private Person person;
    private Address address;
    private Contact contact;
    private LegalGuardian legalGuardian;


    public LeafDTO getInsuranceNumber() {
        return this.insuranceNumber;
    }

    public InsurantDTO setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = new LeafDTO(INSURANCE_NUMBER, insuranceNumber);
        return this;
    }

    public Person getPersonData() {
        return this.person;
    }

    public InsurantDTO setPersonData(PersonDTO personDTO) {
        this.person = new Person(personDTO);
        return this;
    }

    public Address getAddressData() {
        return this.address;
    }

    public InsurantDTO setAddressData(AddressDTO addressDTO) {
        this.address = new Address(addressDTO);
        return this;
    }

    public Contact getContactData() {
        return this.contact;
    }

    public InsurantDTO setContactData(ContactDTO contactDTO) {
        this.contact = new Contact(contactDTO);
        return this;
    }

    public LegalGuardian getLegalGuardian() {
        return this.legalGuardian;
    }

    public InsurantDTO setLegalGuardian(LegalGuardianDTO legalGuardianDTO) {
        this.legalGuardian = new LegalGuardian(legalGuardianDTO);
        return this;
    }

}
