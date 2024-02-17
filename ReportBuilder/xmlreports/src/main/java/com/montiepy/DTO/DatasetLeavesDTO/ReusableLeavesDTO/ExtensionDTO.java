package com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO;

import com.montiepy.DTO.DatasetLeavesDTO.AbstractDatasetLeafDTO;
import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class ExtensionDTO extends AbstractDatasetLeafDTO{
    private static final String EXTENSION_NAME = "mdk2:Nebenstelle_Name";
    private static final String EXTENSION_NUMBER = "mdk2:Nebenstelle_Nummer";

    private LeafDTO name;
    private LeafDTO number;

    public LeafDTO getName() {
        return this.name;
    }

    public ExtensionDTO setName(String name) {
        this.name = new LeafDTO(EXTENSION_NAME, name);
        return this;
    }

    public LeafDTO getNumber() {
        return this.number;
    }

    public ExtensionDTO setNumber(String number) {
        this.number = new LeafDTO(EXTENSION_NUMBER, number);
        return this;
    }

}
