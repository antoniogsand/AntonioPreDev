import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    ArrayList <Libro> listaLibros = new ArrayList<>();

    Libro libroUno= new Libro("1984", "miPrimo", 1960, 10);
    LibroFisico fisicoUno = new LibroFisico("la granja", "pepe", 1999, 11, "395kdk", "nuevo");
    LibroElectronico electronicoUno = new LibroElectronico("la informatica", "varios", 2009, 1000, "pdf", "500 megas");
    
    fisicoUno.mostrarInformacon();

    listaLibros.add(libroUno);
    listaLibros.add(fisicoUno);
    listaLibros.add(electronicoUno);

    for (int i = 0; i<listaLibros.size(); i++){
        System.out.println(listaLibros.get(i));
    }
    // System.out.println(libroUno.contienePalabraClave("m"));
    // System.out.println(libroUno.contienePalabraClave("1984"));

    }
}
