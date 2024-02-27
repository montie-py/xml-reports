package com.montiepy.DatasetStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.DTO.DatasetLeavesDTO.MiMaRecordDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class MiMaRecord extends DatasetDTO{
    private static final String MIMA_RECORD = "mdk1:Datensatz_MiMa";
    private final MiMaRecordDTO miMaRecordDTO;


    public MiMaRecord(MiMaRecordDTO miMaRecordDTO) {
        super(MIMA_RECORD, miMaRecordDTO);
        this.miMaRecordDTO = miMaRecordDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(miMaRecordDTO.getOrderNumber())
            )
        );
    }
}
