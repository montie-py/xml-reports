package com.montiepy.DTO.DatasetLeavesDTO.RootLeavesDTO;

import com.montiepy.DTO.DatasetLeavesDTO.AbstractDatasetLeafDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ProceduralDataDTO;

public class RootDTO extends AbstractDatasetLeafDTO{
    
    private CommissionExpertOpinionTools commissionExpertOpinionTools;
    private ProceduralData proceduralData;
    private CostBearer costbearer;
    private Insurant insurant;
    private SendPrint sendPrint;
    private Cancellation cancellation;
    private Delay delay;

    public CommissionExpertOpinionTools getCommissionExpertOpinionTools() {
        return this.commissionExpertOpinionTools;
    }

    public RootDTO setCommissionExpertOpinionTools(CommissionExpertOpinionToolsDTO commissionExpertOpinionToolsDTO) {
        commissionExpertOpinionTools = new CommissionExpertOpinionTools(commissionExpertOpinionToolsDTO);
        return this;
    }

    public ProceduralData getProceduralData() {
        return this.proceduralData;
    }

    public RootDTO setProceduralData(ProceduralDataDTO proceduralDataDTO) {
        proceduralData = new ProceduralData(proceduralDataDTO);
        return this;
    }

    public CostBearer getCostbearer() {
        return this.costbearer;
    }

    public RootDTO setCostbearer(CostBearerDTO costbearerDTO) {
        costbearer = new CostBearer(costbearerDTO);
        return this;
    }

    public Insurant getInsurant() {
        return this.insurant;
    }

    public RootDTO setInsurant(InsurantDTO insurantDTO) {
        insurant = new Insurant(insurantDTO);
        return this;
    }

    public SendPrint getSendPrint() {
        return this.SendPrint;
    }

    public RootDTO setSendPrint(SendPrintDTO SendPrintDTO) {
        sendPrint = new SendPrint(SendPrintDTO);
        return this;
    }

    public Cancellation getCancellation() {
        return this.cancellation;
    }

    public RootDTO setCancellation(CancellationDTO cancellationDTO) {
        cancellation = new Cancellation(cancellationDTO);
        return this;
    }

    public Delay getDelay() {
        return this.delay;
    }

    public RootDTO setDelay(DelayDTO delayDTO) {
        delay = new Delay(delayDTO);
        return this;
    }
    
    
}
