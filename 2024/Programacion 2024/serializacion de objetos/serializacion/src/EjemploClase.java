import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EjemploClase {
    
        public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Por favor, elige una opción:");
            System.out.println("0| Salir");
            System.out.println("1| Agregar producto");
            System.out.println("2| Buscar producto");
            System.out.println("3| Listar producto");
            opcion = input.nextInt();

            switch (opcion) {

                case 1:
                // Sin esta clase no se puede serializar un objeto
                ObjectOutputStream objecOut = null;
                FileOutputStream fileOut = null;
        
                try{
                    fileOut = new FileOutputStream("productos.dat", true);
                    objecOut = new ObjectOutputStream(fileOut);

                    System.out.println("Introduce el id ");
                    int id=input.nextInt();
                    System.out.println("Introduce el nombre ");
                    String nombre=input.nextLine();
                    input.next();
                    System.out.println("Introduce el precio ");
                    double precio = input.nextDouble(); 
                    System.out.println("Introduce el cantidad ");
                    int cantidad= input.nextInt();

                    // en este constructor le entran los valores de arriba
                    Producto p = new Producto(id, nombre, precio, cantidad);

                    objecOut.writeObject(p);
        
                } catch (Exception e){
                    System.out.println(e.getMessage());

                } finally {
                    try {
                        objecOut.close();
                        fileOut.close();
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }

                    break;

                case 2:

                System.out.println("Introduce la id del prodcuto buscar ");
                int id = input.nextInt();
                /* leer objetos serializados. Los deserializa */
                ObjectInputStream objecImput = null;
                // lee archivos binarios
                FileInputStream fileImput = null;
        
                try{
                    // recibe el archivo que se ha creado antes y que contiene los objetos
                    fileImput = new FileInputStream("productos.dat");
                    /* dice cuántos bytes están disponibles para leer
                    inmediatamente desde el archivo o flujo asociado a fileImput.
                    mientras siga habiendo bytes disponibles se va ejecutando*/
                    while (fileImput.available()>0) {
                        objecImput = new ObjectInputStream(fileImput);
                        // casting
                        Producto p = (Producto) objecImput.readObject();
                        // si la id del objeto producto es igual a la id introducida para buscar
                        // se podría buscar por otro atributo
                        if (p.getId() == id) {
                            System.out.println(p);
                        }
                    } 
        
                } catch (Exception e){
                    System.out.println(e.getMessage());
        
                } finally {
                    try {
                        fileImput.close();
                        objecImput.close();
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                    break;

                case 3:

                ObjectInputStream ois = null;
                FileInputStream fis = null;
        
                try{

                    fis = new FileInputStream("productos.dat");
                    while (fis.available()>0) {
                        ois = new ObjectInputStream(fis);
                        /*en vez de devolver un objeto de la clase Object al hacer un casting devuelve un objeto de la clase Producto */
                        System.out.println((Producto)ois.readObject());
                    }
        
                } catch (Exception e){
                    System.out.println(e.getMessage());
        
                } finally {
                    try {
                        fis.close();
                        ois.close();
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 0:

                    System.out.println("Programa finalizado");

                    break;

                default:

                    System.out.println("Introduce una opción válida");
                    break;
            }

        } while (opcion != 0);

        input.close();
    }





 
    
}