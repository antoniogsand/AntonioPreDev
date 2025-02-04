import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class LecturaXML {

    public static void main(String[] args) throws Exception {
        
        File file = new File("ejercicio3.xml");

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(file);

    // almacenamos los nodos para luego mostrar la cantidad de ellos con el metodo getLength ()
    NodeList nList = doc.getElementsByTagName("coche");
    System.out.println("numero de coches" + nList.getLength());

    // Ler todo su contenido conociendo la estructura del xml
     for  (int i = 0; i<nList.getLength(); i++){
        Node nNode= nList.item(i);

        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
            Element eElement = (Element) nNode;

            System.out.println("\nCoche id: " + eElement.getAttribute("id"));
            System.out.println("Marca: " + eElement.getElementsByTagName("marca").item(0).getTextContent());
            System.out.println("Modelo: " + eElement.getElementsByTagName("modelo").item(0).getTextContent());
            System.out.println("Cilindrada: " + eElement.getElementsByTagName("cilindrada").item(0).getTextContent());
           
        }








     }
    }
}
