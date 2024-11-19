public class Rectangulo extends Figura{
    private double ladoUno;
    private double ladoDos;
    
    public Rectangulo(String color, double grosor, double ladoUno, double ladoDos) {
        super(color, grosor);
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
    }

    public double getLadoUno() {
        return ladoUno;
    }

    public void setLadoUno(double ladoUno) {
        this.ladoUno = ladoUno;
    }

    public double getLadoDos() {
        return ladoDos;
    }

    public void setLadoDos(double ladoDos) {
        this.ladoDos = ladoDos;
    }

    @Override
    public String toString() {
        return "Rectangulo [ladoUno=" + ladoUno + ", ladoDos=" + ladoDos + "]";
    }









}
