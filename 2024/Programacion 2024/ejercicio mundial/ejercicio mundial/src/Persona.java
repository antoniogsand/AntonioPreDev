public abstract class Persona {
    protected int id= 0;
    protected String nombre= "";
    protected String apellidos= "";
    protected String fechaNacimiento= "";
    protected double peso= 0;
    protected double altura= 0;

    public Persona (int id, String nombre, String apellidos, String fechaNac, double peso, double altura){
        this.id= id;
        this.nombre= nombre;
        this.apellidos= apellidos;
        this.fechaNacimiento= fechaNac;
        this.peso= peso;
        this.altura= altura;
    }

   
    public int getId (){
        return id;
    }
    public void setId (int id){
        this.id= id;
    }

    public String getNombre (){
        return nombre;
    }

    public void  setNombre (String nombre){
        this.nombre= nombre;
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

    public abstract void viajar();






}
