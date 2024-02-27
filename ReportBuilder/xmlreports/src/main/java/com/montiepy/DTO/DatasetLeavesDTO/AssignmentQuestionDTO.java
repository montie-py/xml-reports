package com.montiepy.DTO.DatasetLeavesDTO;

import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class AssignmentQuestionDTO extends AbstractDatasetLeafDTO{
    private static final String QUESTION = "mdk1:Fragestellung";
    private static final String JUSTIFICATION = "mdk1:Begruendung";

    private LeafDTO question;
    private LeafDTO justification;


    public LeafDTO getQuestion() {
        return this.question;
    }

    public AssignmentQuestionDTO setQuestion(String question) {
        this.question = new LeafDTO(QUESTION, question);
        return this;
    }

    public LeafDTO getJustification() {
        return this.justification;
    }

    public AssignmentQuestionDTO setJustification(String justification) {
        this.justification = new LeafDTO(JUSTIFICATION, justification);
        return this;
    }

}
