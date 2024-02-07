package com.montiepy;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Collections;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        // System.out.println( "Hello World!" );
        Document document = new Document();
        Element root = new Element("root");
        Element child1 = new Element("child1").addContent("child1content");
        Element child2 = new Element("child2").addContent("child2content");
        root.addContent(child1);
        root.addContent(child2);
        document.setRootElement(root);
        XMLOutputter outputter = new XMLOutputter();
        outputter.setFormat(Format.getPrettyFormat());
        StringWriter sw = new StringWriter();
        outputter.output(document, sw);
        System.out.println(sw.toString());
    }
}
