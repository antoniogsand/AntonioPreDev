public class Figura {
    protected String color;
    protected double grosor;

    public Figura (String color, double grosor){
        this.color= color;
        this.grosor= grosor;
    }

    // constructor de copia
    public Figura(Figura otraFigura) {
        this.color= otraFigura.color;
        this.grosor= otraFigura.grosor;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    public double calcularArea(){
        return 0;
    }


    @Override
    public String toString() {
        return "Figura [color=" + color + ", grosor=" + grosor + "]";
    }














}
