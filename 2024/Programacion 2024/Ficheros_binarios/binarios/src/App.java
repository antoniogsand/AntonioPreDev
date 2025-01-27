import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

/* if (p.get() > 20) {
 * sout (p)
 * en operador ternario
 * ESTA ES LA CONDICIÓN A CUMPLIR (p.get() > 20) ? // HAZ ESTO  System.out.println(p)  SI NO : null;
} */

        ArrayList <Persona> personas = new ArrayList<Persona>();

        for(int i= 0; i<5; i++){
            Persona p = new Persona(i, "Nombre"+i, "Apellidos"+i, i+18);
            personas.add(p);
        }
        FileWriter fw = new FileWriter("personas.txt");
        BufferedWriter br = new BufferedWriter(fw);

        for (int i = 0; i<personas.size(); i++){
            br.write(personas.get(i).toString());
            br.newLine();
        }
        br.close();
        fw.close();

        FileReader fr= new FileReader("personas.txt");
        BufferedWriter brr = new BufferedWriter(br);

        String linea = "";
         while ((linea= brr.readLine))

        FileOutputStream fo = new FileOutputStream("datos.dat");

        ObjectOutputStream op = new ObjectOutputStream(fo);

        Persona p1 = new Persona(32, "Antonio", "Garcia", 18);

        op.writeObject(p1);
        op.close();
        fo.close();

        FileInputStream fi = new FileInputStream("datos.dat");
        ObjectInputStream oi = new ObjectInputStream(fi);

        Persona pFichero= (Persona) oi.readObject();
        pFichero.setId(5);
        System.out.println(pFichero);
    }
}
