public class Coche {
    public static void main(String[] args)  {

        Coche c1= new Coche(2, "audi", "q3");
        
        
        /* al usar el método me pedirá que gestione esa 
        excepción bien sea controlándola con un try y un catch o propagándola con un throws Exception
        ahora mismo no tiene sentido propargarla porque aquí es el último escalón con lo cual sería mejor controlarla con try y catch */
        try {
            c1.setId(4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    private int id; 
    private String marca;
    private String modelo;
    public Coche(int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }
    public int getId() {
        return id;
    }
    /* en este método lo que hacemos es lanzar la excepción NO PROPAGARLA */
    public void setId(int id) throws Exception{
       if(id <=0){
        throw new Exception ("el id no puede ser menor a cero");
       }  
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public String toString() {
        return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + "]";
    }



    
}
