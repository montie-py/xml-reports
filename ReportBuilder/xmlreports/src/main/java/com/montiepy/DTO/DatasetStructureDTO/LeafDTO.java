package com.montiepy.DTO.DatasetStructureDTO;

import java.util.ArrayList;

import com.montiepy.DTO.DatasetLeavesDTO.AbstractDatasetLeafDTO;

public class LeafDTO extends DatasetDTO{
    
    private String content;

    
    public LeafDTO(String tagname, AbstractDatasetLeafDTO datasetLeafDTO) {
        super(tagname, datasetLeafDTO);
        //TODO Auto-generated constructor stub
    }

    public LeafDTO(String tagname, String content) {
        this(tagname, content, null);
    }

    public LeafDTO(String tagname, String content, ArrayList<LeafAttributesDTO> attributes) {
        this.tagname = tagname;
        this.content = content;
        this.attributes = attributes;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
