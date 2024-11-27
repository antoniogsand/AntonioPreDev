public class Factorial {

    public static void main(String[] args) {
       
        int resultado = sumatorio(5);
        System.out.println("El sumatorio de los números del 1 al " + 5 + " es: " + resultado);

    }




    public static int sumatorio(int n) {
        if (n == 1) {
            return 1; // Caso base: el sumatorio de 1 es 1
        } else {
            return n + sumatorio(n - 1); // Caso recursivo
        }
    }

}
