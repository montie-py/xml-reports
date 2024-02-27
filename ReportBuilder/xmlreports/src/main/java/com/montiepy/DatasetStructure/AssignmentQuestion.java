package com.montiepy.DatasetStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.DTO.DatasetLeavesDTO.AssignmentQuestionDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class AssignmentQuestion extends DatasetDTO{
    private static final String QUESTIONS = "mdk1:Fragen";
    private final AssignmentQuestionDTO assignmentQuestionDTO;


    public AssignmentQuestion(AssignmentQuestionDTO assignmentQuestionDTO) {
        super(QUESTIONS, assignmentQuestionDTO);
        this.assignmentQuestionDTO = assignmentQuestionDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(assignmentQuestionDTO.getQuestion()),
                new XMLNode(assignmentQuestionDTO.getJustification())
            )
        );
    }

}
