package com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO;

import com.montiepy.DTO.DatasetLeavesDTO.AbstractDatasetLeafDTO;
import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class SFBPreviousDTO extends AbstractDatasetLeafDTO{
    private static final String NAME_MDK = "mdk2:Name_MDK";
    private static final String DATUM = "mdk2:Datum";
    private static final String CITY = "mdk2:Ort";

    private LeafDTO datum;
    private LeafDTO city;
    private LeafDTO nameMdk;


    public LeafDTO getDatum() {
        return this.datum;
    }

    public SFBPreviousDTO setDatum(String datum) {
        this.datum = new LeafDTO(DATUM, datum);
        return this;
    }

    public LeafDTO getCity() {
        return this.city;
    }

    public SFBPreviousDTO setCity(String city) {
        this.city = new LeafDTO(CITY, city);
        return this;
    }

    public LeafDTO getNameMdk() {
        return this.nameMdk;
    }

    public SFBPreviousDTO setNameMdk(String nameMdk) {
        this.nameMdk = new LeafDTO(NAME_MDK, nameMdk);
        return this;
    }

}
