public class Funciones_ejemplo5 {
    public static void main(String[] args) throws Exception{


System.out.println(esPrimo(6));


    }

    public static boolean esPrimo (int numero){
        //La función comprueba si un número es primo, pero solo un número.
        int cantParaSaberSiEsPrimo= 0; 
        for(int i =numero; i>= 1; i--){
            /* primera vuelta 6/6 divisible
             * segunda vuelta 6/5
             * tercera vuelta 6/4 divisible
             * cuarta vuelta 6/3
             * quinta vuelta 6/2 divisible
             * sexta vuelta 6/1
             * 
             * primera vuelta 7/7 divisible
             * segunda vuelta 7/6
             * tercera vuelta 7/5
             * cuarta vuelta 7/4
             * quinta vuelta 7/3 
             * sexta vuelta 7/2
             * septima vuelta 7/1 divisible
             * ¿?
             */
            if(numero%i==0){
                cantParaSaberSiEsPrimo ++;
            }
        }
        if (cantParaSaberSiEsPrimo== 2){
            return true;
        }else {return false;}
    }

}
