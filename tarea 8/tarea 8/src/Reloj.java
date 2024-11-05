public class Reloj {
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

    @Override
    public String toString() {
        return this.horas + ":" + this.minutos + ":" + this.segundos;
    }


}