package com.montiepy.DTO.DatasetLeavesDTO;

import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.AddressDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.ContactDTO;
import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;
import com.montiepy.DatasetStructure.ReusableStructure.Address;
import com.montiepy.DatasetStructure.ReusableStructure.Contact;

public class ServiceProviderDTO extends AbstractDatasetLeafDTO{
    private static final String IK = "mdk2:IK";
    private static final String NAME = "mdk2:Name";
    private static final String NAME_LOCATION = "mdk2:Name_Geschaeft";

    private LeafDTO ik;
    private LeafDTO name;
    private LeafDTO nameLocation;
    private Address addressData;
    private Contact contactData;


    public LeafDTO getIk() {
        return this.ik;
    }

    public ServiceProviderDTO setIk(String ik) {
        this.ik = new LeafDTO(IK, ik);
        return this;
    }

    public LeafDTO getName() {
        return this.name;
    }

    public ServiceProviderDTO setName(String name) {
        this.name = new LeafDTO(NAME, name);
        return this;
    }

    public LeafDTO getNameLocation() {
        return this.nameLocation;
    }

    public ServiceProviderDTO setNameLocation(String nameLocation) {
        this.nameLocation = new LeafDTO(NAME_LOCATION, nameLocation);
        return this;
    }

    public Address getAddressData() {
        return this.addressData;
    }

    public ServiceProviderDTO setAddressData(AddressDTO addressDTO) {
        this.addressData = new Address(addressDTO);
        return this;
    }

    public Contact getContactData() {
        return this.contactData;
    }

    public ServiceProviderDTO setContactData(ContactDTO contactDTO) {
        this.contactData = new Contact(contactDTO);
        return this;
    }

}
