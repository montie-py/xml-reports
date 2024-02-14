package com.montiepy.DTO.DatasetStructureDTO;

public class LeafAttributesDTO {
    private final String name;

    private final String value;


    public LeafAttributesDTO(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

}
