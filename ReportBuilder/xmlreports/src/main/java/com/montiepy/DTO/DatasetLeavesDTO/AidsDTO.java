package com.montiepy.DTO.DatasetLeavesDTO;

import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class AidsDTO extends AbstractDatasetLeafDTO{
    private static final String LFD_NR_HM = "mdk1:Lfd_Nr";
    private static final String HMNR = "mdk1:Nummer";
    private static final String DESCRIPTION = "mdk1:Bezeichnung:";
    private static final String AMOUNT = "mdk1:Menge";
    private static final String UNIT = "mdk1:Einheit";
    private static final String FROM = "mdk1:Versorgungsbeginn";
    private static final String TO = "mdk1:Versorgungsende";

    private LeafDTO lfdNrHm;
    private LeafDTO hmnr;
    private LeafDTO description;
    private LeafDTO amount;
    private LeafDTO unit;
    private LeafDTO from;
    private LeafDTO to;


    public LeafDTO getLfdNrHm() {
        return this.lfdNrHm;
    }

    public AidsDTO setLfdNrHm(String lfdNrHm) {
        this.lfdNrHm = new LeafDTO(LFD_NR_HM, lfdNrHm);
        return this;
    }

    public LeafDTO getHmnr() {
        return this.hmnr;
    }

    public AidsDTO setHmnr(String hmnr) {
        this.hmnr = new LeafDTO(HMNR, hmnr);
        return this;
    }

    public LeafDTO getDescription() {
        return this.description;
    }

    public AidsDTO setDescription(String description) {
        this.description = new LeafDTO(DESCRIPTION, description);
        return this;
    }

    public LeafDTO getAmount() {
        return this.amount;
    }

    public AidsDTO setAmount(String amount) {
        this.amount = new LeafDTO(AMOUNT, amount);
        return this;
    }

    public LeafDTO getUnit() {
        return this.unit;
    }

    public AidsDTO setUnit(String unit) {
        this.unit = new LeafDTO(UNIT, unit);
        return this;
    }

    public LeafDTO getFrom() {
        return this.from;
    }

    public AidsDTO setFrom(String from) {
        this.from = new LeafDTO(FROM, from);
        return this;
    }

    public LeafDTO getTo() {
        return this.to;
    }

    public AidsDTO setTo(String to) {
        this.to = new LeafDTO(TO, to);
        return this;
    }

}
