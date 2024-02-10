package com.montiepy.DTO.DatasetLeavesDTO;

import java.util.ArrayList;

public abstract class AbstractDatasetLeafDTO {
    public ArrayList<String> leafAttributes;

    public ArrayList<String> getLeafAttributes() {
        return this.leafAttributes;
    }

    public void setLeafAttributes(ArrayList<String> leafAttributes) {
        this.leafAttributes = leafAttributes;
    }

}
