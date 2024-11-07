public class Contador {
    private int numero = 0;

    // constructor por defecto
    public Contador (){
        this.numero= 0;
    }
    // constructor por parámetros
    public Contador (int num){
        this.numero= num;
    }

    public int  getNumero (){
        return numero;
    }

    public void setNumero (int num){
        this.numero = num;
    }
    
    public void increment(){
        this.numero ++;
    }
    
    public void decrementar (){
        this.numero --;
    }
    @Override
    public String toString() {
        return this.numero + "";
    }
    
}
