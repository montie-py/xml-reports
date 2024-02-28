package com.montiepy.DTO.DatasetLeavesDTO;

import java.util.List;
import java.util.stream.Collectors;

import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;
import com.montiepy.DatasetStructure.Aids;
import com.montiepy.DatasetStructure.AssignmentQuestion;
import com.montiepy.DatasetStructure.FrontLoading;
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
    private FrontLoading frontLoading;


    public LeafDTO getKvaDate() {
        return this.kvaDate;
    }

    public CommissionExpertOpinionToolsDTO setKvaDate(String kvaDate) {
        this.kvaDate = new LeafDTO(KVA_DATE, kvaDate);
        return this;
    }

    public LeafDTO getRequestReceiveDate() {
        return this.requestReceiveDate;
    }

    public CommissionExpertOpinionToolsDTO setRequestReceiveDate(String requestReceiveDate) {
        this.requestReceiveDate = new LeafDTO(REQUEST_RECEIVED_DATE, requestReceiveDate);
        return this;
    }

    public LeafDTO getPrescriptionDate() {
        return this.prescriptionDate;
    }

    public CommissionExpertOpinionToolsDTO setPrescriptionDate(String prescriptionDate) {
        this.prescriptionDate = new LeafDTO(PRESCRIPTION_DATE, prescriptionDate);
        return this;
    }

    public LeafDTO getAnnotation() {
        return this.annotation;
    }

    public CommissionExpertOpinionToolsDTO setAnnotation(String annotation) {
        this.annotation = new LeafDTO(ANNOTATION, annotation);
        return this;
    }

    public ServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    public CommissionExpertOpinionToolsDTO setServiceProvider(ServiceProviderDTO serviceProviderDTO) {
        serviceProvider = new ServiceProvider(serviceProviderDTO);
        return this;
    }

    public Prescriber getPrescriber() {
        return this.prescriber;
    }

    public CommissionExpertOpinionToolsDTO setPrescriber(PrescriberDTO prescriberDTO) {
        prescriber = new Prescriber(prescriberDTO);
        return this;
    }

    public Aids getAids() {
        return this.aids;
    }

    public CommissionExpertOpinionToolsDTO setAids(AidsDTO aidsDTO) {
        aids = new Aids(aidsDTO);
        return this;
    }

    public List<AssignmentQuestion> getAssignmentQuestions() {
        return this.assignmentQuestions;
    }

    public CommissionExpertOpinionToolsDTO setAssignmentQuestions(List<AssignmentQuestionDTO> assignmentQuestionsDTOs) {
        assignmentQuestions = assignmentQuestionsDTOs.stream()
                                .map(AssignmentQuestion::new)
                                .collect(Collectors.toList());
        return this;
    }

    public List<MiMaRecord> getMimaRecords() {
        return this.mimaRecords;
    }

    public CommissionExpertOpinionToolsDTO setMimaRecords(List<MiMaRecordDTO> mimaRecordsDTOs) {
        mimaRecords = mimaRecordsDTOs.stream()
                        .map(MiMaRecord::new)
                        .collect(Collectors.toList());
        return this;
    }

    public FrontLoading getFrontLoading() {
        return this.frontLoading;
    }

    public CommissionExpertOpinionToolsDTO setFrontLoading(FrontLoadingDTO frontLoadingDTO) {
        frontLoading = new FrontLoading(frontLoadingDTO);
        return this;
    }

}
