package com.montiepy.Composite;

import java.util.ArrayList;
import java.util.List;

import org.jdom2.Element;

import com.montiepy.DTO.DatasetStructureDTO.DatasetDTO;

public class XMLParent extends XMLElement{

    protected ArrayList<Object> children;


    public XMLParent(DatasetDTO datasetDTO) {
        tagname = datasetDTO.getTagname();
        children = datasetDTO.getChildren();
        attributes = datasetDTO.getAttributes();
    }

    public ArrayList<Object> getChildren() {
        return children;
    }


    @Override
    public Element getValue() {
        final Element newElement = new Element(tagname);
        addAttributes(newElement);

        if (!children.isEmpty()) {
            for (Object child : children) {
                if (child instanceof List) {
                    ((List<XMLNode>)child).stream().forEach(
                        subchild -> newElement.addContent(subchild.getValue())
                    );
                } else {
                    newElement.addContent(((XMLNode)child).getValue());
                }
            }
        }
        xml.addContent(newElement);

        return newElement;
    }
    
}
