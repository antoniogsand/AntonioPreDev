public class Libro {
    
    protected String titulo;
    protected String autor;
    protected int anyoPublicacion;
    protected int numeroPaginas;

    public Libro (String titulo, String autor, int anyoPublicacion, int numeroPaginas){
        this.titulo = titulo;
        this.autor= autor;
        this.anyoPublicacion= anyoPublicacion;
        this.numeroPaginas= numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean contienePalabraClave (String buscarPalabra){
        String textoBusqueda= autor.toLowerCase() + "" + titulo.toLowerCase();
        buscarPalabra= buscarPalabra.toLowerCase();
        return textoBusqueda.contains(buscarPalabra);
    }

    /* no es la mejor solución porque lo que hace contains es buscar una subcadena de caracteres
    valdría con 1984 pero también solo con el 9 solamente */
    public boolean tienePalabraClave (String buscarPalabra){
        String textoBusqueda= autor  + "" + titulo;
        return textoBusqueda.contains(buscarPalabra);
        
    }

    public void mostrarInformacon(){
        System.out.println("El título es " + this.titulo + " El autor es " + this.autor + " el año de publicación es " + anyoPublicacion + " tiene " + numeroPaginas + " páginas");
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", anyoPublicacion=" + anyoPublicacion
                + ", numeroPaginas=" + numeroPaginas + "]";
    }

    

}
