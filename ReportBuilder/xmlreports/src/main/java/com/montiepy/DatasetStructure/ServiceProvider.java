package com.montiepy.DatasetStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.Composite.XMLParent;
import com.montiepy.DTO.DatasetLeavesDTO.ServiceProviderDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class ServiceProvider extends DatasetDTO{
    private static final String PROVIDER_DATA = "mdk1:Leistungserbringer";
    private final ServiceProviderDTO serviceProviderDTO;


    public ServiceProvider(ServiceProviderDTO serviceProviderDTO) {
        super(PROVIDER_DATA, serviceProviderDTO);
        this.serviceProviderDTO = serviceProviderDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(serviceProviderDTO.getIk()),
                new XMLNode(serviceProviderDTO.getName()),
                new XMLNode(serviceProviderDTO.getNameLocation()),
                new XMLParent(serviceProviderDTO.getContactData()),
                new XMLParent(serviceProviderDTO.getAddressData())
            )
        );
    }
}
