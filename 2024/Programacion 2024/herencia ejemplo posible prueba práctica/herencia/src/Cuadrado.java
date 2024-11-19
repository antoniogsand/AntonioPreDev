public class Cuadrado extends Figura{
    private double lado;

 
    public Cuadrado(String color, double grosor, double lado) {
        super(color, grosor);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        double area = this.lado*this.lado;
        return area;
    }

    @Override
    public String toString() {
        return "Cuadrado [lado=" + lado + "]";
    }

    



















}
