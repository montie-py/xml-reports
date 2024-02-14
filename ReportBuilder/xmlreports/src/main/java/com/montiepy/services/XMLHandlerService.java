package com.montiepy.services;

import org.jdom2.Element;

import com.montiepy.Composite.XMLParent;

public class XMLHandlerService {
    private Element rootXML;

    private Root rootData;


    public XMLHandlerService(Root rootDTO) {
        rootData = rootDTO;
        rootXML = new Element("root");
        XMLElement.setXml(rootXML);
    }

    public Element handleXMLStructure() {
        return (new XMLParent(rootData)).getValue();
    }

    public Element getXmlCreator(Element xmlData) {
        rootXML.appendChild(xmlData);
        return rootXML;
    }
}
