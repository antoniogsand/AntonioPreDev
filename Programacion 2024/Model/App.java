import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Perro perroUno= new Perro("Toby");
        Perro perroDos= new Perro("Tob");

        Persona personaUno= new Persona("Antonio");
        Persona personaDos= new Persona("María");

        perroUno.asiganarPropietario(personaUno);
        personaUno.agregarMascota(perroUno);
        perroDos.asiganarPropietario(personaUno);

       
    }
}
