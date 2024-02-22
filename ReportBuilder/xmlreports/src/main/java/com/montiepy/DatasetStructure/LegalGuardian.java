package com.montiepy.DatasetStructure;

import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.Composite.XMLParent;
import com.montiepy.DTO.DatasetLeavesDTO.LegalGuardianDTO;

public class LegalGuardian extends DatasetDTO{
    private static final String OTHER_ADRESSAT_AS_INSURED = "mdk1:Anderer_Adressat";
    private final LegalGuardianDTO LegalGuardianDTO;


    public LegalGuardian(LegalGuardianDTO LegalGuardianDTO) {
        super(OTHER_ADRESSAT_AS_INSURED, LegalGuardianDTO);
        this.LegalGuardianDTO = LegalGuardianDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(LegalGuardianDTO.getOtherAdressat()),
                new XMLParent(LegalGuardianDTO.getPersonData()),
                new XMLParent(LegalGuardianDTO.getAddressData()),
                new XMLParent(LegalGuardianDTO.getContactData()),
                new XMLNode(LegalGuardianDTO.getSpecialNotes())
            )
        );
    }
}
