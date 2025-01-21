import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opciones = 0;
        Scanner sc = new Scanner (System.in);
        FileReader fr= new FileReader("alumnos.txt");
        BufferedReader br = new BufferedReader(fr);

        FileReader fr2 = new FileReader("notasPruebasPracticas.txt");
        BufferedReader br2= new BufferedReader(fr2);

        FileReader fr3 = new FileReader("notasMedias.txt");
        BufferedReader br3= new BufferedReader(fr3);

        double notaMedia =0.0;


        do {
            
            System.out.println("Mostrar el fichero de los alumnos");
            System.out.println("Mostrar el fichero con las notas de las pruebas prácticas");
            System.out.println("Muestra el fichero con las notas medias");
            System.out.println("Muestra el alumno con la mayor nota media");
            
            System.out.println("Selecciona la opción que quieras");
            opciones = sc.nextInt();
            switch (opciones) {
                case 1:        
                        try {
                            String linea;
                        while ((linea = br.readLine()) != null) {
                            System.out.println(linea);
                        }
                    } catch (Exception e) {
                        System.out.println("Archivo no encontrado");
                    }
              break;

              case 2:
                    try {
                            String linea;
                        while ((linea = br2.readLine()) != null) {
                                System.out.println(linea);
                        }
                    } catch (Exception e) {
                        System.out.println("Archivo no encontrado");
                    }
                break;

                case 3:

                try {
                            String linea;
                        while ((linea = br3.readLine()) != null) {
                       double mediaDos = Double.parseDouble((linea.charAt(4)+ "" + linea.charAt(5) + "" + linea.charAt(6)));
                       if (mediaDos>notaMedia){
                        notaMedia=mediaDos;
                         }
                            }
                        }
                } catch (Exception e) {
                        System.out.println("Archivo no encontrado");
                }

                default: System.out.println("opción incorrecta, introduce una opción correcta");
                    break;
               }
               

                }
}

while(opciones!=0);br3.close();fr3.close();br2.close();fr2.close();br.close();fr.close();}


