public class Persona {
    private int telefono = 0;
    private String email = "";
    private String fechaNac = "";
    private String DNI= "";

    public Persona(){
        this.telefono= 677063461;
        this.email= "hola@adios.com";
        this.fechaNac= "21/07/1917";
        this.DNI= "11111111J";
    }
    public Persona (int telf, String correo, String fechaNacimiento, String dni){
        this.telefono= telf;
        this.email= correo;
        this.fechaNac= fechaNacimiento;
        this.DNI= dni;

    }

    public int getTelefono(){
        return telefono;
    }

    public void setTelefono (int telf){
        this.telefono= telf;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail (String correo){
        this.email= correo;
    }
    public String getFechaNac(){
        return fechaNac;
    }

    public void setFechaNac (String  fechaNacimiento){
        this.fechaNac= fechaNacimiento;
    }
    public String getDni(){
        return DNI;
    }

    public void setDNI (String dni){
        this.DNI= dni;
    }
    @Override
    public String toString() {
        return "Persona [telefono=" + telefono + ", email=" + email + ", fechaNac=" + fechaNac + ", DNI=" + DNI + "]";
    }





}
