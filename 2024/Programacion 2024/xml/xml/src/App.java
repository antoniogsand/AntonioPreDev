
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

public class App {
    public static void main(String[] args) throws Exception {
     

try {
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); {
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();

// clases necesarias para finalizar la creación del archivo xml
TransformerFactory transformerFactory = TransformerFactory.newInstance();
Transformer transformer = transformerFactory.newTransformer();
// (DOM = Document Objet Moldel = árbol invertido de etiquetas)
DOMSource source = new DOMSource(doc);
StreamResult result = new StreamResult(new File("ejercicio3.xml"));
transformer.transform(source, result);
}

}
catch (Exception e) {
   System.out.println(e.getMessage());
    };

    //

}






    }

