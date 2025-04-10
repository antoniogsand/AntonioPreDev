import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Container;

public class LayOut {
    public static void main(String[] args) {
        

JFrame frame = new JFrame("Ventaja de ejemplo"); // Crear ventana
frame.setSize(500, 400); // Definir tamaño
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar al salir
frame.setLocationRelativeTo(null); //centrar la ventana

frame.setVisible(true);

   // 2. Crear el botón
        JButton miBoton = new JButton("Haz clic aquí"); // Crear un botón con el texto "Haz clic aquí"

        // 3. Obtener el panel de contenido de la ventana
        Container contentPane = frame.getContentPane();

        // 4. Establecer el Layout Manager (FlowLayout por defecto para el Content Pane)
        contentPane.setLayout(new FlowLayout()); // Aunque es el layout por defecto, es explícito aquí

        // 5. Agregar el botón al panel de contenido
        contentPane.add(miBoton);

        // 6. Hacer visible la ventana
        frame.setVisible(true);


    }
}
