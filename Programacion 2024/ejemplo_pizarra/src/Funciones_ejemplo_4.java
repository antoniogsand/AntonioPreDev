public class Funciones_ejemplo_4 {
    public static void main(String[] args) throws Exception{
        int [] numeros = {3,6,7,11};
        int cantTotalPrimos = 0;
        for(int i=0; i<numeros.length; i++){
            if (esPrimo(numeros[i])==true){
                cantTotalPrimos ++;
            }
        }
        System.out.println("Hay " + cantTotalPrimos + " numeros primos");
    }
// que hace, que recibe, que devuelve
public static boolean esPrimo (int numero){
    //La función comprueba si un número es primo, pero solo un número.
    int cantParaSaberSiEsPrimo= 0; 
    for(int i =numero; i>= 1; i--){
        if(numero%i==0){
            cantParaSaberSiEsPrimo ++;
        }
    }
    if (cantParaSaberSiEsPrimo== 2){
        return true;
    }else {return false;}
}
}
