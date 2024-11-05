public class Contador {
    private int numero = 0;

    public Contador (){
        this.numero= 0;
    }

    public Contador (int num){
        this.numero= num;
    }
    public int  getNumero (){
        return numero;
    }
    public void setNumero (int num){
        this.numero = num;
    }

    public void incrementar (){
        this.numero ++;
    }
    @Override
    public String toString() {
        return this.numero + "";
    }
    
}
