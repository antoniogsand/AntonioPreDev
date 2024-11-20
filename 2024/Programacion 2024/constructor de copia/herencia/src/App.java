import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
/* 
Constructor de copia hay que crear un objeto con un constructor normal y luego el constructor de copia crea una replica exacta de un objeto

*/
Cuadrado cuadradoUno= new Cuadrado("rojo", 4, 10, 12);
Cuadrado cuadradoDos= new Cuadrado(cuadradoUno);

cuadradoDos.setColor("verde");

System.out.println(cuadradoUno);
System.out.println(cuadradoDos);

}

}





