public abstract class Persona {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected String fechaNacimiento;
    protected double peso;
    protected double altura;

    public Persona (){
        this.id = 0;
        this.nombre = "";
        this.apellidos = "";
        this.fechaNacimiento = "";
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona (int identificador, String nom, String ape, String fechaNa, double peso, double altura){
        this.id = identificador;
        this.nombre = nom;
        this.apellidos = ape;
        this.fechaNacimiento = fechaNa;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona (Persona otraPersona){
        this.id = otraPersona.id;
        this.nombre = otraPersona.nombre;
        this.apellidos = otraPersona.apellidos;
        this.fechaNacimiento = otraPersona.fechaNacimiento;
        this.peso = otraPersona.peso;
        this.altura = otraPersona.altura;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean asignarSelección (SeleccionFutbol s){

    }

    public boolean quitarSeleccion (int id){

    }

    public abstract void viajar ();

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
                + fechaNacimiento + ", peso=" + peso + ", altura=" + altura + "]";
    }

    



}
