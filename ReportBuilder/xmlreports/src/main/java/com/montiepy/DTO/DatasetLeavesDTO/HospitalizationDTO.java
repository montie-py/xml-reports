package com.montiepy.DTO.DatasetLeavesDTO;

import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;
import com.montiepy.DatasetStructure.Diagnose;

public class HospitalizationDTO extends AbstractDatasetLeafDTO{
    private static final String IK = "mdk1:IK";
    private static final String NAME = "mdk1:Name";
    private static final String RELEASE = "mdk1:Entlassung";
    private static final String INTAKE = "mdk1:Aufnahme";

    private LeafDTO ik;
    private LeafDTO name;
    private LeafDTO release;
    private LeafDTO intake;
    private Diagnose diagnose;


    public LeafDTO getIk() {
        return this.ik;
    }

    public HospitalizationDTO setIk(String ik) {
        this.ik = new LeafDTO(IK, ik);
        return this;
    }

    public LeafDTO getName() {
        return this.name;
    }

    public HospitalizationDTO setName(String name) {
        this.name = new LeafDTO(NAME, name);
        return this;
    }

    public LeafDTO getRelease() {
        return this.release;
    }

    public HospitalizationDTO setRelease(String release) {
        this.release = new LeafDTO(RELEASE, release);
        return this;
    }

    public LeafDTO getIntake() {
        return this.intake;
    }

    public HospitalizationDTO setIntake(String intake) {
        this.intake = new LeafDTO(INTAKE, intake);
        return this;
    }

    public Diagnose getDiagnose() {
        return this.diagnose;
    }

    public HospitalizationDTO setDiagnose(DiagnoseDTO diagnoseDTO) {
        this.diagnose = new Diagnose(diagnoseDTO);
        return this;
    }

}