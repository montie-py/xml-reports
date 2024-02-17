package com.montiepy.DatasetStructure.ReusableStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.DTO.DatasetLeavesDTO.AbstractDatasetLeafDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.ContactDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class Contact extends DatasetDTO implements ReusableLeafInterface{
    protected static final String CONTACT = "mdk2:Kontakt";

    private final ContactDTO contactDTO;


    public Contact(ContactDTO contactDTO) {
        super(CONTACT, contactDTO);
        this.contactDTO = contactDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(contactDTO.getEmail()),
                new XMLNode(contactDTO.getFax()),
                new XMLNode(contactDTO.getMobile()),
                new XMLNode(contactDTO.getPhone())
                )
        );
    }

    @Override
    public AbstractDatasetLeafDTO getDTO() {
       return contactDTO;
    }
}
