public class Persona {
    private int telefono = 0;
    private String mail = "";
    private String fechaNac = "";
    private String DNI= "";

    public Persona (){
        this.telefono= 677063461;
        this.mail= "Antoniogs83@hotmail.com";
        this.fechaNac= "21/07/1983";
        this.DNI= "45740671L";
    }

    public Persona (int telef, String correo, String fechaNacimiento, String DocumentoIdentidad){
        this.telefono= telef;
        this.mail= correo;
        this.fechaNac= fechaNacimiento;
        this.DNI= DocumentoIdentidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI (String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona [telefono=" + telefono + ", mail=" + mail + ", fechaNac=" + fechaNac + ", DNI=" + DNI + "]";
    }
    
    }
    





