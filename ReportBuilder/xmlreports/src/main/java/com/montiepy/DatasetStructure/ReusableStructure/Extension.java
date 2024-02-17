package com.montiepy.DatasetStructure.ReusableStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.ExtensionDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class Extension extends DatasetDTO{
    private static final String EXTENSION = "mdk2:Nebenstelle";

    private final ExtensionDTO extensionDTO;


    public Extension(ExtensionDTO extensionDTO) {
        super(EXTENSION, extensionDTO);
        this.extensionDTO = extensionDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(Arrays.asList(
            new XMLNode(extensionDTO.getName()),
            new XMLNode(extensionDTO.getNumber())
        ));
    }

}
