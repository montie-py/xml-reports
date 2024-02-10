package com.montiepy.mddatasetbuilder;

import java.util.HashMap;

import org.jdom2.Element;

import com.montiepy.services.XMLHandlerService;

/**
 * ReportBuilder
 */
public abstract class ReportBuilder {
    protected Element xmlRoot;
    protected Element xmlData;
    protected GeneratingDTOService generatingDTOService;
    protected RootDTO rootDTO;
    protected Root rootData;
    protected XMLHandlerService xmlHandlerService;


    abstract protected void map(HashMap<String, Object> requestData);
    abstract protected void fill();
    public void generate() {
        xmlHandlerService = new XMLHandlerService(rootData);
        xmlData = xmlHandlerService.handleXMLStructure();
    }

    public void create() {
        xmlRoot = xmlHandlerService.getXmlCreator(xmlData);
    }

    public String getXmlString() {
        xmlRoot.saveXml();
    }
}