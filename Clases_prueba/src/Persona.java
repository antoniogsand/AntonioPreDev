public class Persona {
    private int edad;

    //Constructor
    public Persona (int e){
        this.edad= e;
    }
    //Métodos
    public void setEdad (int e){
        if(validarEdad(e)){
            this.edad= e;
        }
    }

    public String  toString(){
        return "Edad: " + this.edad;
    }

    private boolean validarEdad (int ed){

        if(ed>=0 && ed<=100){
            this.edad= ed;
            return true;
        }
        return false;
    }
}
