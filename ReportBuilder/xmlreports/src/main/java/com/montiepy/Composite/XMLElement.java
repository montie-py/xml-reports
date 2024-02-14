package com.montiepy.Composite;

import java.util.ArrayList;

import org.jdom2.Document;
import org.jdom2.Element;

import com.montiepy.DTO.DatasetStructureDTO.LeafAttributesDTO;

public abstract class XMLElement {
    
    protected static Document xml;

    protected String tagname;

    protected ArrayList<LeafAttributesDTO> attributes;

    public abstract Element getValue();


    public String getTagname() {
        return this.tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public ArrayList<LeafAttributesDTO> getAttributes() {
        return this.attributes;
    }

    public void setAttributes(ArrayList<LeafAttributesDTO> attributes) {
        this.attributes = attributes;
    }

    protected void addAttributes(Element xmlNode) {
        if (!attributes.isEmpty()) {
            for (LeafAttributesDTO attribute : attributes) {
                xmlNode.setAttribute(attribute.getName(), attribute.getValue());
            }
        }
    }

}
