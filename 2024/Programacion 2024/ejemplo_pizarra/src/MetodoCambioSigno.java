import java.util.Scanner;

public class MetodoCambioSigno {
    
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número que quieres cambiar de signo");
        int numUno = sc.nextInt();

        int signoCambiado = cambioSigno(numUno);

        System.out.println(signoCambiado);
    }

    public static int cambioSigno (int x){
        return x*-1;
    }
}
