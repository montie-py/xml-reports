package com.montiepy.DatasetStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.DTO.DatasetLeavesDTO.PreSupplyAidsDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class PreSupplyAids extends DatasetDTO{
    private static final String PRESUPPLY_AIDS = "mdk1:Hilfsmittel_Vorversorgung";
    private final PreSupplyAidsDTO preSupplyAidsDTO;


    public PreSupplyAids(PreSupplyAidsDTO preSupplyAidsDTO) {
        super(PRESUPPLY_AIDS, preSupplyAidsDTO);
        this.preSupplyAidsDTO = preSupplyAidsDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(preSupplyAidsDTO.getNumber()),
                new XMLNode(preSupplyAidsDTO.getDescription()),
                new XMLNode(preSupplyAidsDTO.getDate()),
                new XMLNode(preSupplyAidsDTO.getStatus())
            )
        );
    }
}
