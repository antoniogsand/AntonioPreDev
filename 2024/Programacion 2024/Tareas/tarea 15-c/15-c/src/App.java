public class App {
    public static void main(String[] args) throws Exception {
      
Jugador [] jugadores= new Jugador[3];

Portero portero1 = new Portero("Juan", 1, "Portero");
Delantero delantero1 = new Delantero("pelé", 10, "delantero");
Delantero delantero2 = new Delantero("Romario", 9, "delantero");

portero1.entrenar();
delantero1.accionEspecial();

jugadores [0] = portero1;
jugadores [1] = delantero1;
jugadores [2] = delantero2;

for (int i = 0; i<jugadores.length; i++){
    System.out.println(jugadores[i].nombre + jugadores[i].numeroCamiseta + jugadores[i].posicion );
    
}


    }
}
