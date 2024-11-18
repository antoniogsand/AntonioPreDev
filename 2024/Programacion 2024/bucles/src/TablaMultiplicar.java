import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numeroUsuario = sc.nextInt();

        for(int i = 0; i<11; i++){
            System.out.println(numeroUsuario + "x"+ i + "=" + numeroUsuario*i);
        }
    }
}
