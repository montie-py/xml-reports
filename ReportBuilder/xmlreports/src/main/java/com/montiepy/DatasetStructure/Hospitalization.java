package com.montiepy.DatasetStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.DTO.DatasetLeavesDTO.HospitalizationDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class Hospitalization extends DatasetDTO{
    private static final String HOSPITALIZATION = "mdk1:KH_Behandlung";
    private final HospitalizationDTO hospitalizationDTO;


    public Hospitalization(HospitalizationDTO hospitalizationDTO) {
        super(HOSPITALIZATION, hospitalizationDTO);
        this.hospitalizationDTO = hospitalizationDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(hospitalizationDTO.getIk()),
                new XMLNode(hospitalizationDTO.getName()),
                new XMLNode(hospitalizationDTO.getIntake()),
                new XMLNode(hospitalizationDTO.getRelease())
            )
        );
    }
}
