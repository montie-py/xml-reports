package com.montiepy.DTO.DatasetLeavesDTO;

import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;
import com.montiepy.DatasetStructure.Diagnose;

public class RehabilitationDTO extends AbstractDatasetLeafDTO{
    private static final String IK = "mdk1:IK";
    private static final String NAME = "mdk1:Name";
    private static final String RELEASE = "mdk1:Entlassung";
    private static final String INTAKE = "mdk1:Aufnahme";
    private static final String EXECUTION = "mdk1:Ausfuehrung";
    private static final String PERFORMANCE = "mdk1:Ausfuehrung";

    private LeafDTO ik;
    private LeafDTO name;
    private LeafDTO release;
    private LeafDTO intake;
    private LeafDTO execution;
    private LeafDTO performance;
    private Diagnose diagnose;


    public LeafDTO getIk() {
        return this.ik;
    }

    public RehabilitationDTO setIk(String ik) {
        this.ik = new LeafDTO(IK, ik);
        return this;
    }

    public LeafDTO getName() {
        return this.name;
    }

    public RehabilitationDTO setName(String name) {
        this.name = new LeafDTO(NAME, name);
        return this;
    }

    public LeafDTO getRelease() {
        return this.release;
    }

    public RehabilitationDTO setRelease(String release) {
        this.release = new LeafDTO(RELEASE, release);
        return this;
    }

    public LeafDTO getIntake() {
        return this.intake;
    }

    public RehabilitationDTO setIntake(String intake) {
        this.intake = new LeafDTO(INTAKE, intake);
        return this;
    }

    public LeafDTO getExecution() {
        return this.execution;
    }

    public RehabilitationDTO setExecution(String execution) {
        this.execution = new LeafDTO(EXECUTION, execution);
        return this;
    }

    public LeafDTO getPerformance() {
        return this.performance;
    }

    public RehabilitationDTO setPerformance(String performance) {
        this.performance = new LeafDTO(PERFORMANCE, performance);
        return this;
    }

    public Diagnose getDiagnose() {
        return this.diagnose;
    }

    public RehabilitationDTO setDiagnose(DiagnoseDTO diagnoseDTO) {
        this.diagnose = new Diagnose(diagnoseDTO);
        return this;
    }

}
