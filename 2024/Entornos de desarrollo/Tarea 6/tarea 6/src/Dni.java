import java.util.ArrayList;

public class Dni {
    private int numeros;
    private char letra;
 


    public Dni (){
        this.numeros= 45740671;
        this.letra= 'L';
    }

    public Dni (int num, char letr){
        this.numeros= num;
        this.letra= letr;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }    



    public static void tamanyoDni (String dni){
        if(dni.length() ==9 && dni.charAt(8)== 'A'){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }

    
    @Override
    public String toString() {
        return "Dni [numeros=" + numeros + ", letra=" + letra + "]";
    }
    










}
