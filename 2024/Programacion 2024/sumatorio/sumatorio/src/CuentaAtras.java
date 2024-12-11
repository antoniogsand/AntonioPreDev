import java.util.Scanner;

public class CuentaAtras {
public static void main(String[] args) {


Scanner sc = new Scanner(System.in);


System.out.println("Introduce los segundos");
int segundos= sc.nextInt();

int segundosMinuto= segundos/60;
int segundosHora= segundos/3600;  



for (int i= segundos; i>0; i-- ){

System.out.println("en  " + segundos + " Hay " + segundosMinuto + "Minutos");

}



    }
}
