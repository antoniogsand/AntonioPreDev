public class App {
    public static void main(String[] args) throws Exception {
    

        // Implicito

        int numeroEntero = 10;

        double numeroDecimal = numeroEntero;

        System.out.println(numeroDecimal);


        // Explícito

        double numDecimal = 10.12;
        int numEntero = (int) numDecimal;

        System.out.println(numEntero);


    
        
        for(int i = 0; i<=127; i++){
            char letra = (char)i;
            System.out.println(letra); 
        }
    }
}
