package com.montiepy.DTO.DatasetLeavesDTO;

import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.AddressDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.ContactDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.PersonDTO;
import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;
import com.montiepy.DatasetStructure.ReusableStructure.Address;
import com.montiepy.DatasetStructure.ReusableStructure.Contact;
import com.montiepy.DatasetStructure.ReusableStructure.Person;

public class LegalGuardianDTO extends AbstractDatasetLeafDTO{
    private static final String OTHER_ADRESSAT = "mdk2:Adressatsart";  
    private static final String SPECIAL_NOTES = "mdk2:Besondere_Hinweise";

    private LeafDTO otherAdressat;
    private LeafDTO specialNotes;
    private Person personData;
    private Address addressData;
    private Contact contactData;


    public LeafDTO getOtherAdressat() {
        return this.otherAdressat;
    }

    public LegalGuardianDTO setOtherAdressat(String otherAdressat) {
        this.otherAdressat = new LeafDTO(OTHER_ADRESSAT, otherAdressat);
        return this;
    }

    public LeafDTO getSpecialNotes() {
        return this.specialNotes;
    }

    public LegalGuardianDTO setSpecialNotes(String specialNotes) {
        this.specialNotes = new LeafDTO(SPECIAL_NOTES, specialNotes);
        return this;
    }

    public Person getPersonData() {
        return this.personData;
    }

    public LegalGuardianDTO setPersonData(PersonDTO personData) {
        this.personData = new Person(personData);
        return this;
    }

    public Address getAddressData() {
        return this.addressData;
    }

    public LegalGuardianDTO setAddressData(AddressDTO addressData) {
        this.addressData = new Address(addressData);
        return this;
    }

    public Contact getContactData() {
        return this.contactData;
    }

    public LegalGuardianDTO setContactData(ContactDTO contactData) {
        this.contactData = new Contact(contactData);
        return this;
    }

}
