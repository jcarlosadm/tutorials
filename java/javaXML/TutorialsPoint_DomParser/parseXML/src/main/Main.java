package main;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * from http://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm
 */
public class Main {
    public static void main(String[] args) {
        try {
            
            File input = new File("test.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            
            Document doc = dBuilder.parse(input);
            doc.getDocumentElement().normalize();
            
            System.out.println("Root element: "+doc.getDocumentElement().getNodeName());
            
            NodeList nList = doc.getElementsByTagName("student");
            System.out.println("--------------------------------------");
            
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("Current element: "+nNode.getNodeName());
                
                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) nNode;
                    System.out.println("Student roll no: "+element.getAttribute("rollno"));
                    System.out.println("First name:"+element.getElementsByTagName("firstname")
                            .item(0).getTextContent());
                    System.out.println("Last name: "+element.getElementsByTagName("lastname")
                            .item(0).getTextContent());
                    System.out.println("Nick name: "+element.getElementsByTagName("nickname")
                            .item(0).getTextContent());
                    System.out.println("Marks: "+element.getElementsByTagName("marks")
                            .item(0).getTextContent());
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
