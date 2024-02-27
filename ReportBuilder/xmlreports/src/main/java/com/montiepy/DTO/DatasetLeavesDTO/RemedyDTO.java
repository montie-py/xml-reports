package com.montiepy.DTO.DatasetLeavesDTO;

import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class RemedyDTO extends AbstractDatasetLeafDTO{
    private static final String NUMBER = "mdk1:Nummer";
    private static final String DESCRIPTION = "mdk1:Bezeichnung";
    private static final String START = "mdk1:Beginn";
    private static final String END = "mdk1:Ende";
    private static final String QUANTITY = "mdk1:Menge";

    private LeafDTO number;
    private LeafDTO description;
    private LeafDTO start;
    private LeafDTO end;
    private LeafDTO quantity;


    public LeafDTO getNumber() {
        return this.number;
    }

    public RemedyDTO setNumber(String number) {
        this.number = new LeafDTO(NUMBER, number);
        return this;
    }

    public LeafDTO getDescription() {
        return this.description;
    }

    public RemedyDTO setDescription(String description) {
        this.description = new LeafDTO(DESCRIPTION, description);
        return this;
    }

    public LeafDTO getStart() {
        return this.start;
    }

    public RemedyDTO setStart(String start) {
        this.start = new LeafDTO(START, start);
        return this;
    }

    public LeafDTO getEnd() {
        return this.end;
    }

    public RemedyDTO setEnd(String end) {
        this.end = new LeafDTO(END, end);
        return this;
    }

    public LeafDTO getQuantity() {
        return this.quantity;
    }

    public RemedyDTO setQuantity(String quantity) {
        this.quantity = new LeafDTO(QUANTITY, quantity);
        return this;
    }

}
