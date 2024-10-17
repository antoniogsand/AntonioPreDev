import java.util.Scanner;
public class Arrays_tres {
    public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    System.out.println("tamaño del array");
    int tamanioArray = sc.nextInt();
        int [] numeros = new int[tamanioArray];

        for (int i=0; i<tamanioArray; i++){
            System.out.println("Introduce los valores");
            int valores= sc.nextInt();
            numeros[i]= valores;
            System.out.println("los valores son "+numeros[i]);
        }




    }
}
