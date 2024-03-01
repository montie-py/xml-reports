package com.montiepy.DatasetStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.DTO.DatasetLeavesDTO.DelayDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class Delay extends DatasetDTO{
    private static final String DELAY = "Verzoegerung";
    private final DelayDTO delayDTO;

    public Delay(DelayDTO delayDTO) {
        super(DELAY, delayDTO);
        this.delayDTO = delayDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(delayDTO.getReason()),
                new XMLNode(delayDTO.getComment()),
                new XMLNode(delayDTO.getDate()),
                new XMLNode(delayDTO.getTime()),
                new XMLNode(delayDTO.getCity()),
                new XMLNode(delayDTO.getZip())
            )
        );
    }
}
