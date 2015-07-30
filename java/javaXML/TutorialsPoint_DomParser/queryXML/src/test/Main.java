package test;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * from http://www.tutorialspoint.com/java_xml/java_dom_query_document.htm
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
            
            NodeList nList = doc.getElementsByTagName("supercars");
            System.out.println("------------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node node = nList.item(temp);
                System.out.println("\nCurrent element: "+node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Company: "+element.getAttribute("company"));
                    NodeList carNameList = element.getElementsByTagName("carname");
                    for (int count = 0; count < carNameList.getLength(); count++) {
                        Node node1 = carNameList.item(count);
                        if (node1.getNodeType() == Node.ELEMENT_NODE) {
                            Element car = (Element) node1;
                            System.out.println("Car name: "+ car.getTextContent());
                            System.out.println("Car type: "+ car.getAttribute("type"));
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
