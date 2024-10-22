import java.util.Scanner;
public class CalculadoraHuellaEcologica {
    public static void main(String[] args) throws Exception {
        

        /* Objetivo: Desarrollar un programa en Java que simula una calculadora básica de huella ecológica.

Enunciado:

La huella ecológica mide la cantidad de recursos que una persona consume y su impacto en el medioambiente. La actividad consiste en implementar un programa que realice una versión simplificada de una calculadora de huella ecológica.

Crea un programa en Java llamado CalculadoraHuellaEcologica.java que haga lo siguiente:

Entrada de datos: 

El programa deberá solicitar al usuario información sobre:

¿Cuántas veces a la semana comes carne?
¿Cuántas veces a la semana usas transporte privado (como coche o moto)?
¿Cuántas veces a la semana usas transporte público?
¿Cuántos productos reciclables (plástico, papel, vidrio) sueles reciclar cada semana?
¿Dejas las luces encendidas al salir de una habitación? (Sí/No)
¿Cuántos litros de agua crees que usas al día? (ej.: 50, 100, 150)
Cálculo de la puntuación total:

Carne: +5 puntos por cada día que consumes carne.
Transporte privado: +2 puntos por cada día.
Transporte público: +1 punto por cada día.
Reciclaje: -2 puntos por cada producto reciclado.
Luces encendidas: +10 puntos si la respuesta es "Sí".
Consumo de agua: +1 punto por cada 10 litros (ej.: si responde 100, son +10 puntos).
Salida del resultado: 

La puntuación: El resultado será un número entero que representa la huella ecológica total del usuario.
Representación con estrellas: Cada estrella representa 10 puntos de la huella.
Redondea hacia arriba si la puntuación no es múltiplo de 10 (Usar Math.ceil).
Ejemplo: Puntuación 53 → 6 estrellas
Ejemplo: Puntuación 47 → 5 estrellas
Mensajes personalizados según la puntuación:
Menos de 30 puntos: "¡Excelente! Estás contribuyendo al medio ambiente."
Entre 30 y 60 puntos: "Bien, pero hay margen para mejorar."
Más de 60 puntos: "Tu huella es alta, intenta mejorar algunos hábitos."
Nota: Ejemplo de uso de Math.Ceil:

int ejemplo = (int) Math.ceil(numero)

System.out.println(ejemplo)

Si numero=4,6 -> ejemplo=5

Forma de entrega

Subir el archivo CalculadoraHuellaEcologica.java
Subir captura de pantalla de realizar la encuesta de huella digital: https://www.urjc2030.es/ov/mejora-y-reduce-tu-huella-ecologica/calculadora-huella-ecologica/Links to an external site. */


Scanner sc = new Scanner (System.in);

System.out.println("¿Cuántas veces a la semana comes carne?");
int carneSemana = sc.nextInt();

System.out.println("¿Cuántas veces a la semana usas transporte privado (como coche o moto)?");
int transportePrivado = sc.nextInt();

System.out.println("¿Cuántas veces a la semana usas transporte público?");
int transportePublico = sc.nextInt();

System.out.println("¿Cuántos productos reciclables (plástico, papel, vidrio) sueles reciclar cada semana?");
int reciclaje = sc.nextInt();

System.out.println("¿Dejas las luces encendidas al salir de una habitación? (Sí = 0 / No= 1)");
int luces= sc.nextInt();

System.out.println("¿Cuántos litros de agua crees que usas al día? (ej.: 50, 100, 150)");
int litrosAguaDia = sc.nextInt();
double litrosAguaDiaResultado= litrosAguaDia*0.1;



double totalPositivos= (carneSemana*5) + (transportePrivado*2) + (transportePublico) + (luces) + (litrosAguaDiaResultado);
double totalSumas = totalPositivos - (reciclaje*2);

if( totalSumas >= 53){
    System.out.println("******");
}
else if (totalSumas >= 47 && totalSumas <=52){
    System.out.println("*****");
}
else if(totalSumas<30){
    System.out.println("¡Excelente! Estás contribuyendo al medio ambiente");
}
else if (totalSumas>=30 && totalSumas<=60){
    System.out.println("Bien, pero hay margen para mejorar");
}
else if(totalSumas>60){
    System.out.println("Tu huella es alta, intenta mejorar algunos hábitos");
}











    }
}
