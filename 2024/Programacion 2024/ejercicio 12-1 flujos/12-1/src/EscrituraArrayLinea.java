import java.io.FileWriter;
import java.util.ArrayList;

public class EscrituraArrayLinea {
    public static void main(String[] args) {
        

    ArrayList<Persona> listaPersonas= new ArrayList<Persona>();

    Persona p1 = new Persona("Antonio", "Hombre");
    Persona p2 = new Persona("María", "Mujer");
    Persona p3 = new Persona("Elena", "Mujer");
   // listaPersonas.add(new Persona("jose", "Hombre"));

    listaPersonas.add(p1);
    listaPersonas.add(p2);
    listaPersonas.add(p3);

    try {
        FileWriter escritura = new FileWriter("listadoPersonasLinea.txt");
    
        for (int i = 0; i<listaPersonas.size(); i++){
            Persona obtenerPersona = listaPersonas.get(i);
            String datosPersona = obtenerPersona.getNombre() + obtenerPersona.getSexo();
            for (int j= 0; j<datosPersona.length(); j++){
            escritura.write(datosPersona.charAt(j) + "\n");
            }
        }
        escritura.close();
    } catch (Exception e) {
        System.out.println("No se encuentra el archivo");
    }






    }
}
