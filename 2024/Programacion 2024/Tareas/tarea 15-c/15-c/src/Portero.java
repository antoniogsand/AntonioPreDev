public class Portero extends Jugador implements Entrenable {
    
    public Portero (String nombre, int numeroCamiseta, String posicion){
        super(nombre, numeroCamiseta, posicion);
    }

    @Override
    public void accionEspecial (){
        System.out.println("El portero realizada una parada espectacular");
    }

    public void entrenar (){
        System.out.println("El portero entrena poco, fuma mucho");
    }

    @Override
    public String toString() {
        return "Los datos del portero son estos: " + super.toString();
    }


}
