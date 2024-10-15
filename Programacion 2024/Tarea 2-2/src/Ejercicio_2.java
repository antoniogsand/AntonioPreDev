import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) throws Exception {

       /* Suma dos días a una fecha introducida por el usuario en este formato dd/mm/yyyy */
       
        Scanner sc = new Scanner (System.in);

        String fecha = sc.next();

        String dia = fecha.charAt(0) + "" + fecha.charAt(1);
        String mes =  ""+ fecha.charAt(3)  + fecha.charAt(4);
        /*No admite la barra porque intenta convertir a entero un caracter*/
        String anyo = "/" + fecha.charAt(6) + fecha.charAt(7) + fecha.charAt(8) + fecha.charAt(9);

        int d = Integer.parseInt(dia);
        System.out.println(d);
        System.out.println("gjdpfgjdpfgj");

        int m = Integer.parseInt(mes);
        System.out.println(m);
        int a = Integer.parseInt(anyo);
        System.out.println(a);

       // System.out.println(dia + mes + anyo);
    }