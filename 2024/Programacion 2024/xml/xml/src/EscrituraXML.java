
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class EscrituraXML {
    public static void main(String[] args) throws Exception {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            
                DocumentBuilder db = dbf.newDocumentBuilder();
                Document doc = db.newDocument();
                // definimos el elemento raiz del documento
                Element eRaiz = doc.createElement("concesionario");
                doc.appendChild(eRaiz);

                // definimos el nodo que contendra los elementos
                Element eCoche = doc.createElement("coche");
                eRaiz.appendChild(eCoche);
                // atributo para el modo coche
                Attr attr = doc.createAttribute("id");
                attr.setValue("1");
                eCoche.setAttributeNode(attr);
                // definimos cada uno de los elementos y le asignamos un atributo
                Element eMarca = doc.createElement("marca");
                eMarca.appendChild(doc.createTextNode("Renault"));
                eCoche.appendChild(eMarca);

                Element eModelo = doc.createElement("modelo");
                eModelo.appendChild(doc.createTextNode("Megano"));
                eCoche.appendChild(eModelo);
                Element eCilindrada = doc.createElement("cilindrada");
                eCilindrada.appendChild((doc.createTextNode("1.5")));
                eCoche.appendChild(eCilindrada);
                
                // clases necesarias para finalizar la creación del archivo xml
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                // (DOM = Document Objet Moldel = árbol invertido de etiquetas)
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File("ejercicio3.xml"));
                transformer.transform(source, result);
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
