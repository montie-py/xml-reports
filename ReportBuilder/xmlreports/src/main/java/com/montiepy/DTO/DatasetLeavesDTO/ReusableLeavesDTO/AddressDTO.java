package com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO;

import com.montiepy.DTO.DatasetLeavesDTO.AbstractDatasetLeafDTO;
import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class AddressDTO extends AbstractDatasetLeafDTO{
    private static final String DISTRICT = "mdk2:Ortsteil";
    private static final String STREET_HOUSENUMBER = "mdk2:Strasse_Hausnummer";
    private static final String ADDITION = "mdk2:Zusatz";
    private static final String ZIP = "mdk2:PLZ";
    private static final String CITY = "mdk2:Ort";
    private static final String LKZ = "mdk2:LKZ";

    private LeafDTO street_housenumber; 
    private LeafDTO addition; 
    private LeafDTO zip; 
    private LeafDTO city; 
    private LeafDTO lkz; 
    private LeafDTO district;


    public LeafDTO getStreetHousenumber() {
        return this.street_housenumber;
    }

    public AddressDTO setStreetHousenumber(String street_housenumber) {
        this.street_housenumber = new LeafDTO(STREET_HOUSENUMBER, street_housenumber);
        return this;
    }

    public LeafDTO getAddition() {
        return this.addition;
    }

    public AddressDTO setAddition(String addition) {
        this.addition = new LeafDTO(ADDITION, addition);
        return this;
    }

    public LeafDTO getZip() {
        return this.zip;
    }

    public AddressDTO setZip(String zip) {
        this.zip = new LeafDTO(ZIP, zip);
        return this;
    }

    public LeafDTO getCity() {
        return this.city;
    }

    public AddressDTO setCity(String city) {
        this.city = new LeafDTO(CITY, city);
        return this;
    }

    public LeafDTO getLkz() {
        return this.lkz;
    }

    public AddressDTO setLkz(String lkz) {
        this.lkz = new LeafDTO(LKZ, lkz);
        return this;
    }

    public LeafDTO getDistrict() {
        return this.district;
    }

    public AddressDTO setDistrict(String district) {
        this.district = new LeafDTO(DISTRICT, district);
        return this;
    }

}
