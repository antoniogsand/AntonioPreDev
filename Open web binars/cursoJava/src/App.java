public class App {
    public static void main(String[] args) throws Exception {

        /* Escribir un programa que calcule el área y el perímetro de un rectángulo y la muestre por consola.
        La `altura` y la `anchura` del mismo la puedes proporcionar como valores iniciales de las variables correspondientes.
        */

        var base= 4;
        int altura= 6;

        var area = base*altura;

        int perímetro= (base + base) + (altura + altura);
        
        System.out.println("El area del rectángulo es " + area + " y su perímetro es " + perímetro);




    }
}
