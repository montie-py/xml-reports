package com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO;

import com.montiepy.DTO.DatasetLeavesDTO.AbstractDatasetLeafDTO;
import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class SFBLocationDTO extends AbstractDatasetLeafDTO{
    private static final String NAME = "mdk2:Name";
    private static final String ZIP = "mdk2:PLZ";
    private static final String CITY = "mdk2:Ort";
    private static final String STREET_HOUSENUMBER = "mdk2:Strasse_Hausnummer";

    private LeafDTO name;
    private LeafDTO zip;
    private LeafDTO city;
    private LeafDTO street;


    public LeafDTO getName() {
        return this.name;
    }

    public SFBLocationDTO setName(String name) {
        this.name = new LeafDTO(NAME, name);
        return this;
    }

    public LeafDTO getZip() {
        return this.zip;
    }

    public SFBLocationDTO setZip(String zip) {
        this.zip = new LeafDTO(ZIP, zip);
        return this;
    }

    public LeafDTO getCity() {
        return this.city;
    }

    public SFBLocationDTO setCity(String city) {
        this.city = new LeafDTO(CITY, city);
        return this;
    }

    public LeafDTO getStreet() {
        return this.street;
    }

    public SFBLocationDTO setStreet(String street) {
        this.street = new LeafDTO(STREET_HOUSENUMBER, street);
        return this;
    }

}
