package com.montiepy.DatasetStructure;

import com.montiepy.DTO.DatasetLeavesDTO.RootLeavesDTO.RootDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public abstract class Root extends DatasetDTO{
    private static final String PROVIDER_DATA = "mdk1:Beauftragung";

    protected final RootDTO rootDTO;


    public Root(RootDTO rootDTO) {
        super(PROVIDER_DATA, rootDTO);
        this.rootDTO = rootDTO;
    }

}
