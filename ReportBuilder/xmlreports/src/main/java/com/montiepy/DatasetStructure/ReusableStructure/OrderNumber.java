package com.montiepy.DatasetStructure.ReusableStructure;

import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.OrderNumberDTO;

public class OrderNumber extends DatasetDTO{
    private static final String ORDER_NUMBER_SYN = "mdk2:Aktenzeichen";

    private final OrderNumberDTO orderNumberDTO;

    
    public OrderNumber(OrderNumberDTO orderNumberDTO) {
        super(ORDER_NUMBER_SYN, orderNumberDTO);
        this.orderNumberDTO = orderNumberDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(orderNumberDTO.getOrderNumber()),
                new XMLNode(orderNumberDTO.getOrderNumber1Episode()),
                new XMLNode(orderNumberDTO.getOrderNumber2Episode())
            )
        );
    }
}
