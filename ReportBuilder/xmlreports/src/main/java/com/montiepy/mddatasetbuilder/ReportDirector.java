package com.montiepy.mddatasetbuilder;

import java.util.HashMap;

public class ReportDirector {

    public static String build(ReportBuilder datasetBuilder, HashMap<String, Object> requestData) {
        datasetBuilder.map(requestData);
        datasetBuilder.fill();
        datasetBuilder.generate();
        datasetBuilder.create();

        return datasetBuilder.getXmlString();
    }
    
}
