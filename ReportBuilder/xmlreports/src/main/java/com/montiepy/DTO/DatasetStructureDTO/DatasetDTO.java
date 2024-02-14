package com.montiepy.DTO.DatasetStructureDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.montiepy.Composite.XMLParent;
import com.montiepy.DTO.DatasetLeavesDTO.AbstractDatasetLeafDTO;

import com.montiepy.DatasetStructure.XMLParentInterface;

public abstract class DatasetDTO implements XMLParentInterface{
    protected String tagname;

    protected ArrayList<LeafAttributesDTO> attributes;


    public DatasetDTO() {
    }


    public DatasetDTO(String tagname, AbstractDatasetLeafDTO datasetLeafDTO) {
        this.tagname = tagname;

        if (!datasetLeafDTO.leafAttributes.isEmpty()) {
            attributes = datasetLeafDTO.getLeafAttributes();
        }
    }

    protected static List<XMLParent> getXMLParentsArray(List<DatasetDTO> parentDTOs) {
        return parentDTOs.stream()
            .map(parentDTO -> new XMLParent(parentDTO))
            .collect(Collectors.toList());
    }

    public String getTagname() {
        return tagname;
    }

    public ArrayList<LeafAttributesDTO> getAttributes() {
        return attributes;
    }

    public ArrayList<Object> getChildren() {
        return new ArrayList<>();
    }

}
