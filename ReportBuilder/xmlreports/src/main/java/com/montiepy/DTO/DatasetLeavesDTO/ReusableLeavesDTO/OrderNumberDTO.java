package com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO;

import com.montiepy.DTO.DatasetLeavesDTO.AbstractDatasetLeafDTO;
import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class OrderNumberDTO extends AbstractDatasetLeafDTO{
    private static final String ORDER_NUMBER_SYN = "mdk2:Aktenzeichen";
    private static final String ORDER_NUMBER_EP_1 = "mdk2:Aktenzeichen_1Folge";
    private static final String ORDER_NUMBER_EP_2 = "mdk2:Aktenzeichen_2Folge";

    private LeafDTO orderNumber;
    private LeafDTO orderNumber1Episode;
    private LeafDTO orderNumber2Episode;


    public LeafDTO getOrderNumber() {
        return this.orderNumber;
    }

    public OrderNumberDTO setOrderNumber(String orderNumber) {
        this.orderNumber = new LeafDTO(ORDER_NUMBER_SYN, orderNumber);
        return this;
    }

    public LeafDTO getOrderNumber1Episode() {
        return this.orderNumber1Episode;
    }

    public OrderNumberDTO setOrderNumber1Episode(String orderNumber1Episode) {
        this.orderNumber1Episode = new LeafDTO(ORDER_NUMBER_EP_1, orderNumber1Episode);
        return this;
    }

    public LeafDTO getOrderNumber2Episode() {
        return this.orderNumber2Episode;
    }

    public OrderNumberDTO setOrderNumber2Episode(String orderNumber2Episode) {
        this.orderNumber2Episode = new LeafDTO(ORDER_NUMBER_EP_2, orderNumber2Episode);
        return this;
    }

}
