package com.montiepy.DatasetStructure;

import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.DTO.DatasetLeavesDTO.AidsDTO;

public class Aids extends DatasetDTO{
    private static final String AIDS = "mdk1:Hilfsmittel";
    private final AidsDTO aidsDTO;


    public Aids(AidsDTO aidsDTO) {
        super(AIDS, aidsDTO);
        this.aidsDTO = aidsDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(aidsDTO.getAmount()),
                new XMLNode(aidsDTO.getDescription()),
                new XMLNode(aidsDTO.getLfdNrHm()),
                new XMLNode(aidsDTO.getUnit()),
                new XMLNode(aidsDTO.getHmnr()),
                new XMLNode(aidsDTO.getFrom()),
                new XMLNode(aidsDTO.getTo())
            )
        );
    }
}
