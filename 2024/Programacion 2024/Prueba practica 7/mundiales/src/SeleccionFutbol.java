public class SeleccionFutbol {
    
    private int id;
    private String nombre;

    public SeleccionFutbol (){
        this.id = 0;
        this.nombre = "";
    }

    public SeleccionFutbol ( int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public SeleccionFutbol (SeleccionFutbol otraSeleccion){
        this.id = otraSeleccion.id;
        this.nombre = otraSeleccion.nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean asignarMundial (Mundial m){

    }

    public boolean quitarMundial (){

    }

    public boolean anadirPersona (Persona p){

    }

    public boolean borrarPersona (int id){

    }

    public Entrenador getEntrenador (){
        return Entrenador;
    }

    public Fisioterapeuta getFisioterapeuta (){
        return Fisioterapeuta
    }

    public void listarIntegrantes (){

    }

    public void listarFutbolistasSobrepeso (){
        
    }


    @Override
    public String toString() {
        return "SeleccionFutbol [id=" + id + ", nombre=" + nombre + "]";
    }

    
}
