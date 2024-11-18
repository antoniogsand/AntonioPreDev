public class Persona {
    private int edad;
    private String nombre;
   
    //Constructor
    public Persona(){
        this.nombre= "Pepe";
        this.edad= 18;
    }
    
    public Persona (int e, String n){
        this.edad= e;
        this.nombre= n;
    }


    //Métodos
    public int getEdad(){
        return this.edad;
    }
    public void setEdad (int e){
        if(validarEdad(e)){
            this.edad= e;
        }
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String n){
        this.nombre= n;
    }

    public String  toString(){
        return "Edad: " + this.edad + " Nombre " + this.nombre;
    
    }

    private boolean validarEdad (int ed){

        if(ed>=0 && ed<=100){
            this.edad= ed;
            return true;
        }
        return false;
    }
}
