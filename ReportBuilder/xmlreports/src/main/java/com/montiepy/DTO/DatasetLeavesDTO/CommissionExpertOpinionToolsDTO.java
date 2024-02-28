package com.montiepy.DTO.DatasetLeavesDTO;

import java.util.List;

import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;
import com.montiepy.DatasetStructure.Aids;
import com.montiepy.DatasetStructure.AssignmentQuestion;
import com.montiepy.DatasetStructure.MiMaRecord;
import com.montiepy.DatasetStructure.Prescriber;
import com.montiepy.DatasetStructure.ServiceProvider;

public class CommissionExpertOpinionToolsDTO extends AbstractDatasetLeafDTO{
    private static final String KVA_DATE = "mdk1:Antragsdatum";
    private static final String REQUEST_RECEIVED_DATE = "mdk1:Eingangsdatum";
    private static final String PRESCRIPTION_DATE = "mdk1:Eingangsdatum";
    private static final String ANNOTATION = "mdk1:Eingangsdatum";

    private LeafDTO kvaDate;
    private LeafDTO requestReceiveDate;
    private LeafDTO prescriptionDate;
    private LeafDTO annotation;
    private ServiceProvider serviceProvider;
    private Prescriber prescriber;
    private Aids aids;
    private List<AssignmentQuestion> assignmentQuestions;
    private List<MiMaRecord> mimaRecords;
    private FrontLoadingDTO FrontLoading;
}
