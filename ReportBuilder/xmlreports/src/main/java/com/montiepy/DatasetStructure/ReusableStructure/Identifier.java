package com.montiepy.DatasetStructure.ReusableStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.IdentifierDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class Identifier extends DatasetDTO{
    private static final String IDENTIFIER = "mdk2:Identifikationsmerkmal";

    private final IdentifierDTO identifierDTO;


    public Identifier(IdentifierDTO identifierDTO) {
        super(IDENTIFIER, identifierDTO);
        this.identifierDTO = identifierDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                identifierDTO.getBsnr(),
                identifierDTO.getIk(),
                identifierDTO.getKzvArea(),
                identifierDTO.getLanr(),
                identifierDTO.getDentistNumber()
            )
        );
    }
}
