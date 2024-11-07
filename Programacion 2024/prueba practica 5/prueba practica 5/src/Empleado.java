public class Empleado {
    
    private String nombre;
    private String apellidos;
    private String telefono;
    private ContratoLaboral contrato;
    
    public Empleado (){
        this.nombre= validarNombre(nombre);
        this.apellidos=validarApellidos(apellidos);
        this.telefono= validarTelefono(telefono);
        this.contrato= new ContratoLaboral();
    }

    public Empleado (String nom, String apell, String telef, ContratoLaboral contr) {
        this.nombre = nom;
        this.apellidos = apell;
        this.telefono = telef;
        this.contrato = contr;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ContratoLaboral getContrato() {
        return contrato;
    }

    public void setContrato(ContratoLaboral contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", contrato="
                + contrato + "]";
    }

    // metodos personalizados

    public String validarNombre (String nomb){
        if (nomb.length() >=3 || nomb.length()<=20){
            this.nombre= nomb;
        }
        return nomb;
    }

    public String validarApellidos (String apell){
        if (apell.length()>=3 || apell.length()<=60){
            this.apellidos=apell;
        }
        return apell;
    }

    public String validarTelefono (String telef){
        if (telef.charAt(0) == '+' && telef.charAt(1) == 3 && telef.charAt(2) == 4 && telef.length() == 12){
            this.telefono=telef;
        }
        return telef;
    }




}
