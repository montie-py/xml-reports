package com.montiepy.DTO.DatasetLeavesDTO;

import java.util.List;
import java.util.stream.Collectors;

import com.montiepy.DatasetStructure.Hospitalization;
import com.montiepy.DatasetStructure.PreSupplyAids;
import com.montiepy.DatasetStructure.Rehabilitation;
import com.montiepy.DatasetStructure.Remedy;

public class FrontLoadingDTO extends AbstractDatasetLeafDTO{
    private List<Hospitalization> hospitalizations;
    private List<Rehabilitation> rehabilitations;
    private List<PreSupplyAids> preSupplyAids;
    private List<Remedy> remedies;


    public List<Hospitalization> getHospitalizations() {
        return this.hospitalizations;
    }

    public FrontLoadingDTO setHospitalizations(List<HospitalizationDTO> hospitalizationsDTOs) {
        hospitalizations = hospitalizationsDTOs.stream()
                            .map(hospitalizationDTO -> new Hospitalization(hospitalizationDTO))
                            .collect(Collectors.toList());
        return this;
    }

    public List<Rehabilitation> getRehabilitations() {
        return this.rehabilitations;
    }

    public void setRehabilitations(List<Rehabilitation> rehabilitations) {
        this.rehabilitations = rehabilitations;
    }

    public List<PreSupplyAids> getPreSupplyAids() {
        return this.preSupplyAids;
    }

    public void setPreSupplyAids(List<PreSupplyAids> preSupplyAids) {
        this.preSupplyAids = preSupplyAids;
    }

    public List<Remedy> getRemedies() {
        return this.remedies;
    }

    public void setRemedies(List<Remedy> remedies) {
        this.remedies = remedies;
    }

}
