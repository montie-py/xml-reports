package com.montiepy.DTO.DatasetLeavesDTO;

import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class MiMaRecordDTO extends AbstractDatasetLeafDTO{
    private static final String ORDER_NUMBER_SYN = "mdk1:Aktenzeichen";

    private LeafDTO orderNumber;


    public LeafDTO getOrderNumber() {
        return this.orderNumber;
    }

    public MiMaRecordDTO setOrderNumber(String orderNumber) {
        this.orderNumber = new LeafDTO(ORDER_NUMBER_SYN, orderNumber);
        return this;
    }

}
