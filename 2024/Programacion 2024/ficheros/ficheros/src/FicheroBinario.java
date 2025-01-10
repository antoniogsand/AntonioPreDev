import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FicheroBinario {
    public static void main(String[] args) {
        
    FileOutputStream fichero= null;

    try {
        fichero= new FileOutputStream("prueba.dat");

        //Escribimos byte a byte los siguientes números
        // 00000000, 00000001, 00000010, 00000011, 00000101
        for(int i = 0; i<6; i++){
            fichero.write(i);
            
        }
    } catch (Exception e) {
       System.out.println("fallo");
    }
/* 
    FileInputStream ficheroDos = null;

    
        ficheroDos = new FileInputStream("prueba.data");

        while (ficheroDos.available()>0) {
            //lee un byte, solo podremos lerr correctamente  del 0 al 255
            System.out.println(ficheroDos.read());
        }
   
    */


    }
}
