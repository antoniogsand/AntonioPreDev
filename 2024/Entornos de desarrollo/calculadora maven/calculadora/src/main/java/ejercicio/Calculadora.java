package ejercicio;

public class Calculadora {
    
public static int suma (int a, int b){
    return a + b;
}

public static boolean esPar (int numero){
  
    return numero % 2 ==0;
}

public static String obtenerMensaje (String nombre, int edad){
if (edad <18){
return "Hola " + nombre + " eres menor de edad";
}
else if (edad >= 18 && edad < 60){
return "Hola " + nombre + " bienvenido al sistema";
}
else  {
return "Hola " + nombre + " esperamos que tengás un buen día";
}
}
}
