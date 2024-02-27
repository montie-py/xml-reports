package com.montiepy.DatasetStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.DTO.DatasetLeavesDTO.RemedyDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class Remedy extends DatasetDTO{
    private static final String REMEDY = "mdk1:Heilmittel";
    private final RemedyDTO remedyDTO;

    public Remedy(RemedyDTO remedyDTO) {
        super(REMEDY, remedyDTO);
        this.remedyDTO = remedyDTO;
    }


    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(remedyDTO.getStart()),
                new XMLNode(remedyDTO.getEnd()),
                new XMLNode(remedyDTO.getNumber()),
                new XMLNode(remedyDTO.getDescription()),
                new XMLNode(remedyDTO.getQuantity())
            )
        );
    }
}
