public class App {
    public static void main(String[] args) throws Exception {
        /*    Este sigue en ejecución constantemente, pero se queda parado hasta que el segundo no se rompa
            por eso filas va decrementándose en cada vuelta*/ 
        for(int filas = 0; filas<9; filas++){
    
            // Este se rompe y por eso vuelve a valer columnas 0 una y otra vez
            for(int columnas=9; filas<columnas; columnas--){
        
                System.out.print('*');
            }

            System.out.println("");
            
        }
    

        // segunda pirámide
        for (int contador = 9; contador > 0; contador --) {
        /* en la primera vuelta no se cumple y salta al siguiente for. */
            for (int espacios = 0; espacios < (9 - contador); espacios ++){
            System.out.print(" ");
            }
            for (int asteriscos = 0; asteriscos < contador; asteriscos ++){

            System.out.print("*");

            }


        System.out.println("");
    }

        // tercera pirámide

for(int filas = 9; filas>0; filas --){
    for(int asteriscos= 0; asteriscos<=9 - filas; asteriscos++){
        System.out.print('*');
        for(int espacios=0; espacios<filas-1; espacios++){
            System.out.print(' ');
        }
    }
    System.out.println("");
}





        // quinta pirámide
/*        int filas = 10; // Ajusta el número de filas según necesites

        for (int i = 1; i <= filas; i++) { // Bucle externo (filas)
            for (int j = 1; j <= 2 * filas - 1; j++) { // Bucle interno (columnas)
                if (j >= filas - i + 1 && j <= filas + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
*/ 
        // tercera pirámide
/*      for(int filas = 0; filas<9; filas++){
    
            // Este se rompe y por eso vuelve a valer columnas 0 una y otra vez
            for(int columnas=0; columnas<filas; columnas++){
        
                System.out.print('*' );
            
            
            }
            System.out.println("");
            
        }
*/



    }
}
