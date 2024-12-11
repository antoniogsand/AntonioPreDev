import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

Scanner sc = new Scanner(System.in);

System.out.println("Introduce un número");
int numero = sc.nextInt();

int sumatorio =0;

for (int i =0; i<numero; numero-- ){

    sumatorio= sumatorio+numero;
}

System.out.println(sumatorio);

    }
}
