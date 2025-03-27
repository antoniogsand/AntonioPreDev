public class Delantero  extends Jugador implements Entrenable{
    
    public Delantero (String nombre, int numeroCamiseta, String posicion){
        super(nombre, numeroCamiseta, posicion);
    }

    @Override
    public void accionEspecial(){
        System.out.println("Dispara a la portería");
    }

    public void entrenar (){
        System.out.println("El delantero está entrenando");
    }

    @Override
    public String toString() {
        return "Los datos del delantero son estos: " + super.toString();
    }
    
}
