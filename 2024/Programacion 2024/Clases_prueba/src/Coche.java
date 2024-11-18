public class Coche {
    private String matricula;
    private String modelo;
    private String marca;
    private String color;
    private int velocidadActual;
    private boolean arrancado;
/* el atributo ESTÁTICO de abajo con static quiere decir que todos los objetos creados de la clase Coche van a ir a 120 como máximo */
    private final static int velocidadMaxima= 120;

    public Coche (String matricula, String modelo, String marca, String color){
        this.matricula= matricula;
        this.modelo= modelo;
        this.marca= marca;
        this.color= color;
        this.velocidadActual=0;
        this.arrancado=false;
    }

    public boolean arrancar (){
        if(this.velocidadActual ==0 && this.arrancado == false){
            this.arrancado=true;
            return true;
        }
        return false;
    }
    public boolean parar (){
        if(this.velocidadActual ==0 && this.arrancado == true){
            this.arrancado=false;
            return true;
        }
        return false;
    }

    public void acelar (int velocidad){
        //Primero comprobar si está arrancado
        if(this.arrancado){
            if(this.velocidadActual+velocidad >=120){
                this.velocidadActual=velocidadMaxima;
            }
            else {
                this.velocidadActual= velocidadActual+velocidad;
            }
        }
    }



    public String toString(){
        return "Matricula " + this.matricula +
                " Marca " + this.marca +
                " Modelo " + this.modelo +
                " Color " + this.color + 
                " Velocidad Actual " +this.velocidadActual +
                " Arrancado " + this. arrancado;
    }





}
