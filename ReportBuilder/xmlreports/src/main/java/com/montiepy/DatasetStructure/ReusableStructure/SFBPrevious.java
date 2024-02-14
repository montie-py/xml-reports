package com.montiepy.DatasetStructure.ReusableStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.SFBPreviousDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class SFBPrevious extends DatasetDTO{
    private static final String SFB_PREVIOUS = "mdk2:Vorherige_SFB";
    private final SFBPreviousDTO sFBPreviousDTO;

    public SFBPrevious(SFBPreviousDTO sFBPreviousDTO) {
        this.sFBPreviousDTO = sFBPreviousDTO;
    }    
    
    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(sFBPreviousDTO.getCity()),
                new XMLNode(sFBPreviousDTO.getDatum()),
                new XMLNode(sFBPreviousDTO.getNameMdk())
            )
        );
    }
}
