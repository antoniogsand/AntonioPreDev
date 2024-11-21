public class App {
    public static void main(String[] args) throws Exception {
       
       
        Autobus autobusUno = new Autobus("1726cks", false, 0.17);
    // cambio el estado inicial del alquile (se encuentra alquilado ahora)
        autobusUno.setEstadoAlquiler(true);
    // puedo devolverlo porque está alquilado
        System.out.println(autobusUno.devolver());

        int opcion=0;

        do{
        System.out.println("Elige una opción");
            System.out.println("1 alquilar");
            System.out.println("2 devolver");
          
            switch (opcion){
                case 1:
                autobusUno.alquilar();
                break;
                
                case 2:
                autobusUno.devolver();
                break;

            } 


        }
        while (opcion != 0);

       
  












    }
}
