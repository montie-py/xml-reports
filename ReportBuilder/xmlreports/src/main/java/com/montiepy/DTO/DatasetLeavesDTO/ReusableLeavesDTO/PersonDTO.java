package com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO;

import com.montiepy.DTO.DatasetLeavesDTO.AbstractDatasetLeafDTO;
import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class PersonDTO extends AbstractDatasetLeafDTO {
    private static final String LASTNAME = "mdk2:Name";
    private static final String FIRSTNAME = "mdk2:Name";
    private static final String TITLE = "mdk2:Name";
    private static final String GENDER = "mdk2:Name";
    private static final String DATE_OF_BIRTH = "mdk2:Name";
    private static final String SUFFIX = "mdk2:Name";
    private static final String PREFIX = "mdk2:Name";

    private LeafDTO firstName;
    private LeafDTO lastName;
    private LeafDTO title;
    private LeafDTO gender;
    private LeafDTO dateOfBirth;
    private LeafDTO suffix;
    private LeafDTO prefix;


    public LeafDTO getFirstName() {
        return this.firstName;
    }

    public PersonDTO setFirstName(String firstName) {
        this.firstName = new LeafDTO(FIRSTNAME, firstName);
        return this;
    }

    public LeafDTO getLastName() {
        return this.lastName;
    }

    public PersonDTO setLastName(String lastName) {
        this.lastName = new LeafDTO(LASTNAME, lastName);
        return this;
    }

    public LeafDTO getTitle() {
        return this.title;
    }

    public PersonDTO setTitle(String title) {
        this.title = new LeafDTO(TITLE, title);
        return this;
    }

    public LeafDTO getGender() {
        return this.gender;
    }

    public PersonDTO setGender(String gender) {
        this.gender = new LeafDTO(GENDER, gender);
        return this;
    }

    public LeafDTO getDateOfBirth() {
        return this.dateOfBirth;
    }

    public PersonDTO setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = new LeafDTO(DATE_OF_BIRTH, dateOfBirth);
        return this;
    }

    public LeafDTO getSuffix() {
        return this.suffix;
    }

    public PersonDTO setSuffix(String suffix) {
        this.suffix = new LeafDTO(SUFFIX, suffix);
        return this;
    }

    public LeafDTO getPrefix() {
        return this.prefix;
    }

    public PersonDTO setPrefix(String prefix) {
        this.prefix = new LeafDTO(PREFIX, prefix);
        return this;
    }

}
