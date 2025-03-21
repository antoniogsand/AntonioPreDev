public class Futbolista extends Persona implements Deportista {
    
    private int dorsal;
    private String demarcacion;

    public Futbolista (int id, String nombre, String apellidos, String fechaNacimiento, double peso, double altura, int dorsal, String demarcacion){
        super(id, nombre, apellidos, fechaNacimiento,peso, altura);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void entrenar (){

    }

    public void jugarPartido(){

    }

    public boolean tieneSobrepeso (){
        
    }
}
