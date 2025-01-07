public class Primero {
    public static void main(String[] args) throws Exception {
    
        int [] array = {1,2,3,4,5};

        int [] segundoArray= devolverArrayInvertido(array);


        
       // System.out.println(segundoArray.toString());

        

    }





    public static  int[] devolverArrayInvertido (int [] array){

  /* String convertir=  String.valueOf(array);
    String alReves= new StringBuilder(convertir).reverse().toString();


 */ 

 /* importante recordar que se pone .length -1 porque en este caso tiene cinco valores,
  * pero cuando a través del bucle accede a las posiciones no existen 5 posiciones si no 4
  importante distinguir entre valores y posiciones 
  */
for(int i=array.length-1; i>-1; i--){
    System.out.println(array[i]);

} 
    return array;
        }
    }

