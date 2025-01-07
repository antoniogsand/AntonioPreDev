import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int contadorListaUno=0;
int contadorListaDos=0;
String palabrasListaUNo="";
String palabrasListaDos= "";


String [] listaUno= new String[3];

for(int i=0; i<listaUno.length; i++){
    System.out.println("Introduce las 3 palabras para la lista uno");
    palabrasListaUNo= sc.nextLine();
    contadorListaUno++;
}

String[] listaDos= new String[3];

for(int i=0; i<listaDos.length; i++){
    System.out.println("Introduce las 3 palabras para la lista dos");
    palabrasListaDos= sc.nextLine();
    contadorListaDos++;
}


if (String.valueOf(listaUno).contains(palabrasListaDos)){
System.out.println(listaUno);
}


    }
}
