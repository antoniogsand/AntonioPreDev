public class App {
    public static void main(String[] args) throws Exception {

        //casting implicito (ampliar)
        int entero = 100;

        // entero a long
        long num1 = entero;
        // entero a float
        float num2 = entero;
        // entero a double
        double num3 = entero;

        /*casting explicito (para reduicir)*/
        double  decimal = 100.55;

        //double a float
        float num4 = (float)decimal;
        
        /*conversión de tipo de dato char a int y de int a char de nuevo según la tabla ascii */
        char letra = 'A';
        int letraN= letra;
        System.out.println((char)(letraN+32));

        /*casting convertir un tipo de dato en otro compatible
        ºparseo un String en otro tipo de dato siempre que se pueda */

        int edad = 5;
        if(edad <18){
            System.out.println("Es menor de edad");
        }
        else if(edad>=18 && edad <65){
            System.out.println("eres adulto");
        }
        else{
            System.out.println("eres mayor de edad");
        }

        switch(edad){
            case 17:
            System.out.println("Menor de edad");
            break;
            case 18:
            System.out.println("Mayor de edad");
            break;
        default:
        System.out.println("dato incorrecto");

        }
    }
}
