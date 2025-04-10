package ejercicio;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileNotFoundException;

import org.junit.Test;

public class CalculadoraTest {
    
Calculadora calculadora = new Calculadora();

@Test
public void testSuma () {
    assertEquals(7, Calculadora.suma(4, 3));
}

 @Test
    void testEsPar_True() {
        assertTrue(calculadora.esPar(4));
    }

    @Test
    void testEsPar_False() {
        assertFalse(calculadora.esPar(7));
    }

    // 3. Pruebas unitarias para obtenerMensaje
    @Test
    void testObtenerMensaje_MenorEdad() {
        assertEquals("Hola Juan, eres menor de edad.", calculadora.obtenerMensaje("Juan", 16));
    }

    @Test
    void testObtenerMensaje_Adulto() {
        assertEquals("Hola Ana, bienvenido al sistema.", calculadora.obtenerMensaje("Ana", 30));
    }

    @Test
    void testObtenerMensaje_AdultoMayor() {
        assertEquals("Hola Luis, esperamos que tengas un gran día.", calculadora.obtenerMensaje("Luis", 65));
    }

    // 4. Prueba unitaria para validar que se lanza FileNotFoundException
    @Test
    void testLeerArchivo_NoExiste() {
        assertThrows(FileNotFoundException.class, () -> {
            calculadora.leerArchivo("archivo_inexistente.txt");
        });
    }
}


}
