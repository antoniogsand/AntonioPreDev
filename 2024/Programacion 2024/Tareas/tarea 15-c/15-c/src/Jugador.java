public abstract class Jugador {
    
    protected String nombre;
    protected int numeroCamiseta;
    protected String posicion;

    public Jugador (String n, int numCami, String  posi){
        this.nombre = n;
        this.numeroCamiseta = numCami;
        this.posicion = posi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
//Método abstracto que se implementa en otra clase
    public abstract void accionEspecial();

    public String mostrarInfo (){
        return this.getNombre() + this.getPosicion() + this.getNumeroCamiseta(); 
    }

    @Override
    public String toString() {
        return "El nombre del jugado es: " + nombre + " su numero de camiseta es " + numeroCamiseta + " y su posición es " + posicion;
    }

    
}
