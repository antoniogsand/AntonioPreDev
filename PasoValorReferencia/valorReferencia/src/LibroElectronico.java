public class LibroElectronico extends Libro{
    private String formato;
    private String tamanyoArchivo;

    public LibroElectronico (String titulo, String autor, int anyoPublicacion, int numeroPaginas, String formato, String tamanyoArchivo){
        super(titulo, autor, anyoPublicacion, numeroPaginas);
        this.formato= formato;
        this.tamanyoArchivo= tamanyoArchivo;
    }

    public String getFormato(){
        return formato;
    }
    public void setFormato (String formato){
        this.formato= formato;
    }
    
    public String getTamanyoArchivo (){
        return tamanyoArchivo;
    }

    public void setTamanioArchivo (String tamanioArchivo){
        this.tamanyoArchivo= tamanioArchivo;
    }

    @Override
    public String toString() {
        return super.toString() + "formato=" + formato + ", tamanyoArchivo=" + tamanyoArchivo;
    }

    
}
