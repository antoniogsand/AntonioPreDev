public class App {
    public static void main(String[] args) throws Exception {

    Persona p1= new Persona();
    System.out.println(p1);
    System.out.println("El teléfono es " + p1.getTelefono());

    Persona p2= new Persona(677063461, "ags@hotmail.com", "21/07/2482", "45740671L");
        System.out.println(p2);

    }

    public static boolean validarDNI (String dni){
        return DNI.Matches("")
    }





}
