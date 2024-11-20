public class Cuadrado extends Figura{
    private double lado;
    private int altura;


    public Cuadrado(String color, double grosor, double lado, int altura) {
        super(color, grosor);
        this.lado = lado;
        this.altura= altura;
    }
    // constructor de copia
    public Cuadrado (Cuadrado otroCuadrado){
        super(otroCuadrado);
        this.lado= otroCuadrado.lado;
        this.altura= otroCuadrado.altura;
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
        return "Cuadrado [color= "+ color + " grosor= " + grosor + " lado=" + lado + ", altura=" + altura + "]";
    }

    
    



















}
