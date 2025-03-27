public class EjercicioTres {
    public static void main(String[] args) throws Exception{
        //  ¿Qué diferencia existe entre un casting y un parse? Explícalo con ejemplos realizados en Java.

        /* Tanto uno como otro sirven para convertir un tipo de dato a otro en Java, pero lo hacen de manera diferente
         * 
         * El Casting 
         * 
         * Es una conversión implícita o explícita entre tipos de datos compatibles.
         * Se usa de forma utomático por ejemplo cuando se asigna un valor de un tipo más pequeño a uno más grande (por ejemplo, de int a long).
         * O de forma manual, cuando se asigna un valor de un tipo más grande a uno más pequeño (por ejemplo, de double a int).
         * En este caso, se pierde información
         */
        int numEntero = 10;
        double numDecimal = numEntero; // Casting implícito
        System.out.println(numDecimal);

        double valorDecimal = 3.14;
        int valorEntero = (int) valorDecimal; // Casting explícito (se pierde la parte decimal)
        System.out.println(valorEntero);

        /* El Parsing

        Es el proceso de convertir una cadena de caracteres (String) en un tipo de dato numérico (int, double, etc.).
        funciona utilizando un método específico del tipo de dato al que se quiere convertir (por ejemplo, Integer.parseInt(), Double.parseDouble())
        Este método analiza la cadena y si es válido, devuelve el valor numérico correspondiente.
        */
        String numeroComoCadena = "123";
        int numeroEntero = Integer.parseInt(numeroComoCadena);
        System.out.println(numeroEntero);
    }
}
