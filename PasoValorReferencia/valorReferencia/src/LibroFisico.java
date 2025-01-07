public class LibroFisico extends Libro {

    private String isbn;
    private String estado;

    public LibroFisico (String titulo, String autor, int anyoPublicacion, int numeroPaginas, String isbn, String estado){
        super(titulo, autor, anyoPublicacion, numeroPaginas );
        this.isbn= isbn;
        this.estado= estado;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarInformacon (){
        super.mostrarInformacon();
        System.out.println("el isbn del libro es " + this.isbn + " el estado del libro es " + this.estado);
    }
    @Override
    public String toString() {
        return super.toString() + "isbn=" + isbn + ", estado=" + estado;
    }





}
