package com.montiepy.DatasetStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.Composite.XMLParent;
import com.montiepy.DTO.DatasetLeavesDTO.PrescriberDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class Prescriber extends DatasetDTO{
    private static final String PRESCRIBER_INFORMATION = "mdk1:Behandelnder_Arzt";
    private final PrescriberDTO prescriberDTO;


    public Prescriber(PrescriberDTO prescriberDTO) {
        super(PRESCRIBER_INFORMATION, prescriberDTO);
        this.prescriberDTO = prescriberDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(prescriberDTO.getSpecialistDesignation()),
                new XMLNode(prescriberDTO.getDifferentDesignation()),
                new XMLParent(prescriberDTO.getIdentifierData()),
                new XMLParent(prescriberDTO.getAddressData()),
                new XMLParent(prescriberDTO.getContactData()),
                new XMLParent(prescriberDTO.getPersonData())
            )
        );
    }

}
