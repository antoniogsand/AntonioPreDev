import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        


Scanner sc= new Scanner(System.in);
System.out.println("introudce algo");
//String palabra= sc.nextLine();

int contarPalabras= 0;

String [] listaPalabras = new String[3];

System.out.println("introudce algo");
listaPalabras[0]= sc.nextLine();
System.out.println("introudce algo");
listaPalabras[1]= sc.nextLine();
System.out.println("introudce algo");
listaPalabras[2]= sc.nextLine();


System.out.println("Pideme una palabra");
String pedirPalabra= sc.nextLine();

for(int i=0; i<listaPalabras.length; i++){

    if (pedirPalabra.contains(pedirPalabra)){
        contarPalabras ++;
    }
}
        

    }




    



}
