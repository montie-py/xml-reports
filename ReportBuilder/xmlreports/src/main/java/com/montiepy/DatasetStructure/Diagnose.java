package com.montiepy.DatasetStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.DTO.DatasetLeavesDTO.DiagnoseDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class Diagnose extends DatasetDTO{
    private static final String DIAGNOSE = "mdk1:Diagnose";
    private final DiagnoseDTO diagnoseDTO;

    public Diagnose(DiagnoseDTO diagnoseDTO) {
        super(DIAGNOSE, diagnoseDTO);
        this.diagnoseDTO = diagnoseDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(diagnoseDTO.getIcd()),
                new XMLNode(diagnoseDTO.getIcdVersion()),
                new XMLNode(diagnoseDTO.getLocalization()),
                new XMLNode(diagnoseDTO.getPlainText())
            )
        );
    }
}
