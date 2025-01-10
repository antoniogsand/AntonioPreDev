import java.io.FileOutputStream;

public class FicheroBinario {
    public static void main(String[] args) {
        
    FileOutputStream fichero= null;

    try {
        fichero= new FileOutputStream("prueba.dat");

        //Escribimos byte a byte los siguientes números
        // 00000000, 00000001, 00000010, 00000011, 00000101
        for(int i = 0; i<8; i++){
            fichero.write(15);
            
        }
    } catch (Exception e) {
        // TODO: handle exception
    }



    }
}
