import java.util.Scanner;

public class MetodoDivision {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner (System.in);

        System.out.println("Primer número");
        int numUno = sc.nextInt();

        System.out.println("Segundo número");
        int numDos = sc.nextInt();


        int resultadoDivision = division(numUno, numDos);

        System.out.println(resultadoDivision);

    }


    public static int division (int x, int y){
        return x/y;
    }
}
