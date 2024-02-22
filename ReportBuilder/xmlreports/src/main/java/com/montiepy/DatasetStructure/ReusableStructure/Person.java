package com.montiepy.DatasetStructure.ReusableStructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.montiepy.Composite.XMLNode;
import com.montiepy.DTO.DatasetLeavesDTO.AbstractDatasetLeafDTO;
import com.montiepy.DTO.DatasetLeavesDTO.ReusableLeavesDTO.PersonDTO;
import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class Person extends DatasetDTO implements ReusableLeafInterface{

    protected static final String PERSON = "mdk2:Person";
    protected final PersonDTO personDTO;


    public Person(PersonDTO personDTO) {
        super(PERSON, personDTO);
        this.personDTO = personDTO;
    }

    @Override
    public ArrayList<Object> getChildren() {
        return new ArrayList<>(
            Arrays.asList(
                new XMLNode(personDTO.getFirstName()),
                new XMLNode(personDTO.getLastName()),
                new XMLNode(personDTO.getTitle()),
                new XMLNode(personDTO.getDateOfBirth()),
                new XMLNode(personDTO.getGender()),
                new XMLNode(personDTO.getPrefix()),
                new XMLNode(personDTO.getSuffix())
            )
        );
    }

    @Override
    public AbstractDatasetLeafDTO getDTO() {
        return personDTO;
    }
    
}
