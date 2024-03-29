package com.montiepy.DTO.DatasetLeavesDTO;

import java.util.List;
import java.util.stream.Collectors;

import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;
import com.montiepy.DatasetStructure.Hospitalization;
import com.montiepy.DatasetStructure.PreSupplyAids;
import com.montiepy.DatasetStructure.Rehabilitation;
import com.montiepy.DatasetStructure.Remedy;

public class FrontLoadingDTO extends AbstractDatasetLeafDTO{
    private List<DatasetDTO> hospitalizations;
    private List<DatasetDTO> rehabilitations;
    private List<DatasetDTO> preSupplyAids;
    private List<DatasetDTO> remedies;


    public List<DatasetDTO> getHospitalizations() {
        return this.hospitalizations;
    }

    public FrontLoadingDTO setHospitalizations(List<HospitalizationDTO> hospitalizationsDTOs) {
        hospitalizations = hospitalizationsDTOs.stream()
                            .map(Hospitalization::new)
                            .collect(Collectors.toList());
        return this;
    }

    public List<DatasetDTO> getRehabilitations() {
        return this.rehabilitations;
    }

    public FrontLoadingDTO setRehabilitations(List<RehabilitationDTO> rehabilitationDTOs) {
        rehabilitations = rehabilitationDTOs.stream()
                            .map(Rehabilitation::new)
                            .collect(Collectors.toList());
        return this;
    }

    public List<DatasetDTO> getPreSupplyAids() {
        return this.preSupplyAids;
    }

    public FrontLoadingDTO setPreSupplyAids(List<PreSupplyAidsDTO> preSupplyAidsDTOs) {
        preSupplyAids = preSupplyAidsDTOs.stream()
                            .map(PreSupplyAids::new)
                            .collect(Collectors.toList());
        return this;
    }

    public List<DatasetDTO> getRemedies() {
        return this.remedies;
    }

    public FrontLoadingDTO setRemedies(List<RemedyDTO> remediesDTOs) {
        remedies = remediesDTOs.stream()
                    .map(Remedy::new)
                    .collect(Collectors.toList());
        return this;
    }

}
