public class RecursividadEjemplo {
   public static void main(String[] args) {
    
  /*sumar elementos de un array mediante recursividad */
       int[] numeros = {1,2,3,4,5}; 
       int[] numeros1 = {3,5}; 
       int[] numeros2 = {3,4,5,8,9};
       
       System.out.println(numeros);
       System.out.println(numeros2);

       for(int i = 0; i<elemento_menos(numeros).length; i++){
        System.out.println(elemento_menos(numeros)[i]);
       }

        for(int i= 0; i<numeros1.length; i++){
            System.out.println(numeros1[i]);
        }
   }

   public static int suma (int [] arr){
    if(arr.length==1) return arr [0];
    if(arr.length==1) return arr [0];
    int[] aux= elemento_menos(arr);
    return arr[0] +suma(aux);
   }

   public static int [] elemento_menos(int[] array){
    int[] nuevoArray= new int [array.length -1];
    for(int i=1; i<array.length; i++){
        nuevoArray[i-1]= array[i];
    }
    return nuevoArray;
   }
}