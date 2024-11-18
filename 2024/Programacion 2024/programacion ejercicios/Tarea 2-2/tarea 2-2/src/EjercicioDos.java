import java.util.Scanner;
public class EjercicioDos {
    public static void main(String[] args) throws Exception{

        // Suma dos días a una fecha introducida por el usuario en este formato dd/mm/yyyy

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce el día");
        int dia = sc.nextInt();

        System.out.println("Introduce el mes");
        int mes = sc.nextInt();
        
        System.out.println("Introduce el año");
        int anyo = sc.nextInt();
        
        String fecha = dia +2 + "/" + mes + "/" + anyo;
        System.out.println(fecha);
    
        if(dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7 || dia == 8 || dia == 9 || dia == 10 || dia == 11 || dia == 13 || dia == 14 || dia == 15 || dia == 16 || dia == 17 || dia == 18 || dia == 19 || dia == 20 || dia == 21 || dia == 22 || dia == 23 || dia == 24 || dia == 25 || dia == 26 || dia == 27 && mes== 1 || mes== 3 || mes==4 || mes==5 || mes==6 || mes==7 || mes==8 || mes==9 || mes==10 || mes==11 || mes== 12){
            System.out.println(fecha);
        }

        else if (dia == 28 && mes == 4 || mes == 6 || mes == 9 || mes == 11){
            dia = 30;
            String fechaUno = dia + "/" + mes + "/" + anyo;
            System.out.println(fechaUno);
        }
        else if (dia == 29 && mes == 4 || mes == 6 || mes == 9 || mes == 11){
            dia = 1;
            mes = mes +1;
            String fechaDos = dia + "/" + mes + "/" + anyo;
            System.out.println(fechaDos);
        }
        else if (dia == 30 && mes == 4 || mes == 6 || mes == 9 || mes == 11){
            dia =2;
            mes = mes +1;
            String fechaTres = dia + "/" + mes + "/" + anyo;
            System.out.println(fechaTres);
        } 
        else if (dia == 30 && mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10){
            dia = 1;
            mes = mes +1;
            String fechaCinco = dia + "/" + mes + "/" + anyo;
            System.out.println(fechaCinco);
        }
        else if (dia == 31 && mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10){
            dia =2;
            mes = mes +1;
            String fechaSeis = dia + "/" + mes + "/" + anyo;
            System.out.println(fechaSeis);
        }
        else if (dia == 30 && mes == 12){
            dia =1;
            mes = mes -11;
            String fechaSiete = dia + "/" + mes + "/" + anyo;
            System.out.println(fechaSiete);
        }
        else if (dia == 31 && mes == 12){
            dia =2;
            mes = mes -11;
            String fechaOcho = dia + "/" + mes + "/" + anyo;
            System.out.println(fechaOcho);
        }
        else if (dia == 27 && mes == 2 && anyo % 2 == 0 || anyo % 4 == 0){
            dia = 29;
            String fechaNueve = dia + "/" + mes + "/" + anyo;
            System.out.println(fechaNueve);
        }
        else if (dia == 28 && mes == 2 && anyo % 2 == 0 || anyo % 4 == 0){
            dia = 1;
            mes = mes +1;
            String fechaDiez = dia + "/" + mes + "/" + anyo;
            System.out.println(fechaDiez);
        }
        else if (dia == 27 && mes == 2){
            dia = 1;
            mes = mes + 1;
            String fechaOnce = dia + "/" + mes + "/" + anyo;
            System.out.println(fechaOnce);
        }
        else if (dia == 28 && mes == 2){
            dia = 2;
            mes = mes + 1;
            String fechaDoce = dia + "/" + mes + "/" + anyo;
            System.out.println(fechaDoce);
        } 
    } 
}
