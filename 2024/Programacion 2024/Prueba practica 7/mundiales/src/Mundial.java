public class Mundial {
    private int id;
    private int anyo;

    public Mundial (){
        this.id = 0;
        this.anyo = 0;
    }

    public Mundial (int id, int anyo){
        this.id = id;
        this.anyo = anyo;
    }

    public Mundial (Mundial otroMundial){
        this.id = otroMundial.id;
        this.anyo = otroMundial.anyo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public boolean anyadirSeleccion (SeleccionFutbol s){

    }

    public boolean quitarSeleccion (int id){

    }

    public SeleccionFutbol getSeleccion (int id){

    }

    public void listarSelecciones (){
        
    }



    @Override
    public String toString() {
        return "Mundial [id=" + id + ", anyo=" + anyo + "]";
    }

    
}
