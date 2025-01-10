import java.io.FileWriter;

public class EscrituraCaracterCaracter {
    public static void main(String[] args) {
        FileWriter fw= null;

    try {
        fw= new FileWriter("archivo.txt");
        for(int i = 65; i<91; i++){
            //caracter a caracter
            fw.wait((char)i);
        }
    } catch(Exception e){
    System.out.println("Fallo");   
    
    }

    }
}
