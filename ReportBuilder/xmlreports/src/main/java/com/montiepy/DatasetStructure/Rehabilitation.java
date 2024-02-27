package com.montiepy.DatasetStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.DTO.DatasetLeavesDTO.RehabilitationDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class Rehabilitation extends DatasetDTO {
    private static final String REHABILITATION = "mdk1:Rehabilitation";
    private final RehabilitationDTO rehabilitationDTO;
    

    public Rehabilitation(RehabilitationDTO rehabilitationDTO) {
        super(REHABILITATION, rehabilitationDTO);
        this.rehabilitationDTO = rehabilitationDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(rehabilitationDTO.getIk()),
                new XMLNode(rehabilitationDTO.getName()),
                new XMLNode(rehabilitationDTO.getIntake()),
                new XMLNode(rehabilitationDTO.getRelease()),
                new XMLNode(rehabilitationDTO.getExecution()),
                new XMLNode(rehabilitationDTO.getPerformance())
            )
        );
    }
}
