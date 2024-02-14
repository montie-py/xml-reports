package com.montiepy.DatasetStructure.ReusableStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.SfbLocationDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class SFBLocation extends DatasetDTO{
    private final static String SFB_LOCATION = "mdk2:SFB_Standort";
    
    private final SfbLocationDTO sfbLocationDTO;


    public SFBLocation(SfbLocationDTO sfbLocationDTO) {
        super(SFB_LOCATION, sfbLocationDTO);
        this.sfbLocationDTO = sfbLocationDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(Arrays.asList(
            new XMLNode(sfbLocationDTO.getName()),
            new XMLNode(sfbLocationDTO.getStreet()),
            new XMLNode(sfbLocationDTO.getZip()),
            new XMLNode(sfbLocationDTO.getCity())
        ));
    }
}
