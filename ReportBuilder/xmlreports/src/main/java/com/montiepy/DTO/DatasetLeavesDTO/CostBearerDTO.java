package com.montiepy.DTO.DatasetLeavesDTO;

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
    private LeafDTO Salutation;
    private LeafDTO clerk;
    private SFBLocation sfbLocationData;
    private SFBPrevious sfbPreviousData;
    private Extension extension;
    private Contact contactData;
    private Address addressData;
    private OrderNumber orderNumber;
    
}

