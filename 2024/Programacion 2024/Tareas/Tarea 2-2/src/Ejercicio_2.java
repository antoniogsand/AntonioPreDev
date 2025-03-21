import java.util.Scanner;

public class Ejercicio_2 {
   public static void main(String[] args) throws Exception {

       /* Suma dos días a una fecha introducida por el usuario en este formato dd/mm/yyyy */
      Scanner sc = new Scanner (System.in);
      
      System.out.println("Introduce una fecha con este formato dd/mm/yyyy");
      String fecha = sc.nextLine();

      String diaPosiciones = fecha.charAt(0) + "" + fecha.charAt(1);
      String mesPosiciones =  "" + fecha.charAt(3)  + fecha.charAt(4);
      /*No admite la barra porque intenta convertir a entero un caracter*/
      String anyoPosiciones = "" + fecha.charAt(6) + fecha.charAt(7) + fecha.charAt(8) + fecha.charAt(9);

      int dia = Integer.parseInt(diaPosiciones) +2;
      int mes = Integer.parseInt(mesPosiciones);
      int anyo = Integer.parseInt(anyoPosiciones);
      System.out.println(dia + "/" + mes + "/" + anyo);

   
   }
   }