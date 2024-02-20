package com.montiepy.DTO.DatasetLeavesDTO;

import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;
import com.montiepy.DatasetStructure.ReusableStructure.Address;
import com.montiepy.DatasetStructure.ReusableStructure.Contact;

public class InsurantDTO extends AbstractDatasetLeafDTO{
    private static final String INSURANCE_NUMBER = "mdk2:KV_PV_Nummer";

    private LeafDTO insuranceNumber;
    private Person person;
    private Address address;
    private Contact contact;
    private LegalGuardian legalGuardian;
}
