import java.util.Scanner;
public class Cuatro {
    public static void main(String[] args) throws Exception{

    //Calcular la hipotenusa de un triángulo rectángulo, pidiendo al usuario el valor de los dos catetos. 
    Scanner sc = new Scanner (System.in);

    System.out.println("Introduce el primer cateto");
    double catetoA = sc.nextDouble();
    System.out.println("Introduce el segundo catero");;
    double catetoB = sc.nextDouble();

double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));   
System.out.println("El valor de la hipotenusa es " + hipotenusa);
sc.close();
}
}
