package com.montiepy.DTO.DatasetLeavesDTO;

import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.AddressDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.ContactDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.IdentifierDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.PersonDTO;
import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;
import com.montiepy.DatasetStructure.ReusableStructure.Address;
import com.montiepy.DatasetStructure.ReusableStructure.Contact;
import com.montiepy.DatasetStructure.ReusableStructure.Identifier;
import com.montiepy.DatasetStructure.ReusableStructure.Person;

public class PrescriberDTO extends AbstractDatasetLeafDTO{
    private static final String SPECIALIST_DESIGNATION = "mdk2:Facharztbezeichnung";
    private static final String DIFFERENT_DESIGNATION = "mdk2:Abw_Bez_Anschrift";

    private LeafDTO specialistDesignation;
    private LeafDTO differentDesignation;
    private Identifier identifierData;
    private Contact contactData;
    private Address addressData;
    private Person personData;
    

    public LeafDTO getSpecialistDesignation() {
        return this.specialistDesignation;
    }

    public PrescriberDTO setSpecialistDesignation(String specialistDesignation) {
        this.specialistDesignation = new LeafDTO(SPECIALIST_DESIGNATION, specialistDesignation);
        return this;
    }

    public LeafDTO getDifferentDesignation() {
        return this.differentDesignation;
    }

    public PrescriberDTO setDifferentDesignation(String differentDesignation) {
        this.differentDesignation = new LeafDTO(DIFFERENT_DESIGNATION, differentDesignation);
        return this;
    }

    public Identifier getIdentifierData() {
        return this.identifierData;
    }

    public PrescriberDTO setIdentifierData(IdentifierDTO identifierData) {
        this.identifierData = new Identifier(identifierData);
        return this;
    }

    public Contact getContactData() {
        return this.contactData;
    }

    public PrescriberDTO setContactData(ContactDTO contactData) {
        this.contactData = new Contact(contactData);
        return this;
    }

    public Address getAddressData() {
        return this.addressData;
    }

    public PrescriberDTO setAddressData(AddressDTO addressData) {
        this.addressData = new Address(addressData);
        return this;
    }

    public Person getPersonData() {
        return this.personData;
    }

    public PrescriberDTO setPersonData(PersonDTO personData) {
        this.personData = new Person(personData);
        return this;
    }

}
