package com.montiepy.mddatasetbuilder;

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


    abstract protected void mapping(String[] requestData);
    abstract protected void filling();
    public void generating() {
        xmlHandlerService = new XMLHandlerService(rootData);
        xmlData = xmlHandlerService.handleXMLStructure();
    }

    public void creating() {
        xmlRoot = xmlHandlerService.getXmlCreator(xmlData);
    }

    public String getXmlString() {
        xmlRoot.saveXml();
    }
}