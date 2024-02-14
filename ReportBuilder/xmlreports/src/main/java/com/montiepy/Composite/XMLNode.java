package com.montiepy.Composite;

import org.jdom2.Element;

import com.montiepy.DTO.DatasetStructureDTO.LeafDTO;

public class XMLNode extends XMLElement{

    private String value;

    public XMLNode(LeafDTO leafDTO) {
        tagname = leafDTO.getTagname();
        value = leafDTO.getContent();
        attributes = leafDTO.getAttributes();
    }

    @Override
    public Element getValue() {
        final Element newElement = new Element(tagname);
        newElement.addContent(value);
        addAttributes(newElement);

        return newElement;
    }
}
