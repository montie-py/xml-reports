package com.montiepy.DTO.DatasetLeavesDTO;

import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class PreSupplyAidsDTO extends AbstractDatasetLeafDTO{
    private static final String NUMBER = "mdk1:Nummer";
    private static final String DESCRIPTION = "mdk1:Bezeichnung";
    private static final String DATE = "mdk1:Date";
    private static final String STATUS = "mdk1:Status";

    private LeafDTO number;
    private LeafDTO description;
    private LeafDTO date;
    private LeafDTO status;


    public LeafDTO getNumber() {
        return this.number;
    }

    public PreSupplyAidsDTO setNumber(String number) {
        this.number = new LeafDTO(NUMBER, number);
        return this;
    }

    public LeafDTO getDescription() {
        return this.description;
    }

    public PreSupplyAidsDTO setDescription(String description) {
        this.description = new LeafDTO(DESCRIPTION, description);
        return this;
    }

    public LeafDTO getDate() {
        return this.date;
    }

    public PreSupplyAidsDTO setDate(String date) {
        this.date = new LeafDTO(DATE, date);
        return this;
    }

    public LeafDTO getStatus() {
        return this.status;
    }

    public PreSupplyAidsDTO setStatus(String status) {
        this.status = new LeafDTO(STATUS, status);
        return this;
    }

}
