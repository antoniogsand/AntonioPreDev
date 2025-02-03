import java.util.Scanner;

public class PruebaAbecedario {
    public static void main(String[] args) {
       
       /* 
        Scanner sc = new Scanner(System.in);

        String abecedario ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasMinusculas= abecedario.toLowerCase(); 
        System.out.println(letrasMinusculas);
        System.out.println("introduce una frase");
        String fraseUsuario= sc.nextLine();
        System.out.println("introduce una clave para cifrar");
        int clave= sc.nextInt();
        
        */
    
       
        
        System.out.println(adelantarNumeros(2, 'A'));
        
        
    }

    public static char adelantarNumeros (int numero, char letra){

        int numeroLetra= (int) letra;

        int avance = numeroLetra +numero;
        char letraFinal = (char) avance;
        return letraFinal;
    }
}
