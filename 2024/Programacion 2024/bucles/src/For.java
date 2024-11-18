public class For {
    public static void main(String[] args) throws Exception {
            for (int i =1; i<13; i++){
   
        System.out.println(i * 2);
    }
    
    System.out.println("siguiente");
    int contador = 5 ;
    for (int i = 1; i<10; i++){
            contador = contador +i;
            System.out.println(contador);
        }

        System.out.println("siguiente");

    int numero = 6;
    boolean accion = false;

    for (int i =0; i<8; i++){
        System.out.println(numero);

        if (accion == false){
            numero = numero*3;
            accion= true;
        }

        else{
            numero = numero+2;
            accion= false;
            }
        
        }


 
    int [] array = {9,4,7,5};

    for(int i=0; i<6; i++){}
        System.out.println(array);






    }
}
