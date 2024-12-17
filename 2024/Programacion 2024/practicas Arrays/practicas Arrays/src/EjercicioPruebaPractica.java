public class EjercicioPruebaPractica {
    
    public static void main(String[] args) {
        
/* Crea una funcion que devuelva un array con todoslos numeros que contienen el 7 que se encuentren en otro array
despues imprime los numeros por consola.
El tamaño del array que se devuelve sera menor o igual al que se pasa como parametro  */

int [] array = buscarElSiete();

for(int i= 0; i< array.length; i++){
    System.out.println(array[i]);
}


    }



public static int[] buscarElSiete (){

int array [] = new int[8];
array[0]= 5;
array[1]= 7;
array[2]= 22;
array[3]= 83;
array[4]= 67;
array[5]= 1;
array[6]= 275;
array[7]= 9;

int contador = 0;


/* valueOf lo que hace es convertir cada elemento del array que se encuentre en un String
 * después con contains analiza ese String carácter a carácter para ver si alguna carácter es el 7 en este caso
 * contado suma uno por cada string que contiene un 7 ya que luego se usará para calcular el tamaño del nuevo array 
 */
for (int i= 0; i<array.length; i++){
    if(String.valueOf(array[i]).contains("7")){
        contador++;
    }
}

int [] arrayContiene7 = new int[contador];

int indice=0;

for (int i=0; i<array.length; i++){
    if(String.valueOf(array[i]).contains("7")){
        /* aquí es cuando se añaden los números que contienen un 7
         * indice sirve para indicar que parte desde la posición 0 y que cada vez que se añada uno se incrementa
         * así va rellenando posiciones
         */
        arrayContiene7[indice] = array[i];
        indice++;
    }
}



return array;
}
/* este contador será para ver cuantos 7 hay y en base a eso hacer un array con ese tamaño */





}
