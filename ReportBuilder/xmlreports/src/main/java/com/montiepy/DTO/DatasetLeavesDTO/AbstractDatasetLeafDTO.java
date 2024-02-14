package com.montiepy.DTO.DatasetLeavesDTO;

import java.util.ArrayList;

import com.montiepy.DTO.DatasetStructureDTO.LeafAttributesDTO;

public abstract class AbstractDatasetLeafDTO {
    public ArrayList<LeafAttributesDTO> leafAttributes;

    public ArrayList<LeafAttributesDTO> getLeafAttributes() {
        return this.leafAttributes;
    }

    public void setLeafAttributes(ArrayList<LeafAttributesDTO> leafAttributes) {
        this.leafAttributes = leafAttributes;
    }

}
