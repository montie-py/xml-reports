package com.montiepy.DatasetStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.DTO.DatasetLeavesDTO.FrontLoadingDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class FrontLoading extends DatasetDTO{
    private static final String FRONT_LOADING = "mdk1:Vorversorgung";
    private final FrontLoadingDTO frontLoadingDTO;


    public FrontLoading(FrontLoadingDTO frontLoadingDTO) {
        super(FRONT_LOADING, frontLoadingDTO);
        this.frontLoadingDTO = frontLoadingDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                getXMLParentsArray(frontLoadingDTO.getHospitalizations()),
                getXMLParentsArray(frontLoadingDTO.getRehabilitations()),
                getXMLParentsArray(frontLoadingDTO.getPreSupplyAids()),
                getXMLParentsArray(frontLoadingDTO.getRemedies())
            )
        );
    }
}
