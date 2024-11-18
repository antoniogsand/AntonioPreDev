public class App {
    public static void main(String[] args) throws Exception {
        /*  Este sigue en ejecución constantemente, pero se queda parado hasta que el segundo no se rompa
        por eso filas va decrementándose en cada vuelta*/ 
        for(int filas = 9; filas>0; filas--){
            // Este se rompe y por eso vuelve a valer columnas 0 una y otra vez
            for(int columnas=0; columnas<filas; columnas++){
        
                System.out.print('*' + " ");
            
            
            }
            System.out.println("");
            
        }




    }
}
