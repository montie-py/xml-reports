package com.montiepy.DatasetStructure.ReusableStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.DTO.DatasetLeavesDTO.AbstractDatasetLeafDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.AddressDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class Address extends DatasetDTO implements ReusableLeafInterface{

    protected static final String ADDRESS = "mdk2:Adresse";

    protected final AddressDTO addressDTO;


    public Address(AddressDTO addressDTO) {
        super(ADDRESS, addressDTO);
        this.addressDTO = addressDTO;
    }


    @Override
    public AbstractDatasetLeafDTO getDTO() {
        return addressDTO;
    }


    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(addressDTO.getZip()),
                new XMLNode(addressDTO.getCity()),
                new XMLNode(addressDTO.getAddition()),
                new XMLNode(addressDTO.getLkz()),
                new XMLNode(addressDTO.getDistrict()),
                new XMLNode(addressDTO.getStreetHousenumber())
            )
        );
    }
}
