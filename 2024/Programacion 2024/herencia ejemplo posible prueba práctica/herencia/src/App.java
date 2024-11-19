import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

    Cuadrado c1 = new Cuadrado("blanco", 2, 4);
    System.out.println(c1.calcularArea());

Triangulo t1 = new Triangulo("negro", 4, 5, 3);
System.out.println(t1.calcularArea());

 ArrayList<Figura> figuras = new ArrayList<Figura>();
 figuras.add(t1);

 for (int i= 0; i<figuras.size(); i++){
    System.out.println(figuras.get(i).calcularArea());
 }

 Figura figura1= new Figura(t1);

 System.out.println(figura1);

    }
}
