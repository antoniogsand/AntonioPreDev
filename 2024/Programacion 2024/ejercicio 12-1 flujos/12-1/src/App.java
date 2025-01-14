import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    
    
        /* Realiza un programa que escriba en el fichero “personas.txt” ” con flujo de escritura carácter por carácter,
        un ArrayList de 5 personas creado previamente y guarde cada persona en una línea del fichero.  */



    ArrayList<Persona> listaPersonas= new ArrayList<Persona>();

    Persona p1 = new Persona("Antonio", "Hombre");
    Persona p2 = new Persona("María", "Mujer");
    Persona p3 = new Persona("Elena", "Mujer");
   // listaPersonas.add(new Persona("jose", "Hombre"));

    listaPersonas.add(p1);
    listaPersonas.add(p2);
    listaPersonas.add(p3);

    try {
        FileWriter escritura = new FileWriter("listadoPersonas.txt");
    
        for (int i = 0; i<listaPersonas.size(); i++){
            Persona obtenerPersona = listaPersonas.get(i);
            String datosPersona = obtenerPersona.toString();
            for (int j= 0; j<datosPersona.length(); j++){
            escritura.write(datosPersona.charAt(j));
            
            }
            
        }
        escritura.close();
    } catch (Exception e) {
        System.out.println("No se encuentra el archivo");
    }
   
   
    
        /* 
        String [] personas = new String[5];

        personas [0]= "Antonio";
        personas [1]= "Luis";
        personas [2]= "Pedro";
        personas [3]= "Juan";
        personas [4]= "Carlos";



    

         */

        /* 
        escritura.write("Una segunda prueba");
        FileReader lectura = new FileReader("Escribiendo.txt");
        char caracter = (char) lectura.read();
    
        System.out.println(caracter);
    } */
    }
}
    

