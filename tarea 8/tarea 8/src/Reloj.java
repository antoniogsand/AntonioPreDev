public class Reloj {
/*los atributos son objetos de la clase Contador y se les valor (por defecto o por parámetros en los constructores) */
    private Contador horas;
    private Contador minutos;
    private Contador segundos;

    public Reloj (){
        this.horas= new Contador();
        this.minutos= new Contador();
        this.segundos= new Contador();
    }

    public Contador getHoras() {
        return horas;
    }

    public void setHoras(Contador horas) {
        this.horas = horas;
    }

    public Contador getMinutos() {
        return minutos;
    }

    public void setMinutos(Contador minutos) {
        this.minutos = minutos;
    }

    public Contador getSegundos() {
        return segundos;
    }

    public void setSegundos(Contador segundos) {
        this.segundos = segundos;
    }
    /* se está creando un metodo incrementar y dentro del mismo se está usando el que se creo en la clase Contador */
    public void incrementar (){
        segundos.increment();
        if (segundos.getNumero() == 60) {
            segundos.setNumero(0);
            minutos.increment();
            if (minutos.getNumero() == 60) {
                minutos.setNumero(0);
                horas.increment();
                if (horas.getNumero() == 24) {
                    horas.setNumero(0);
                }
            }
        }
    }


    @Override
    public String toString() {
        return this.horas + ":" + this.minutos + ":" + this.segundos;
    }


}