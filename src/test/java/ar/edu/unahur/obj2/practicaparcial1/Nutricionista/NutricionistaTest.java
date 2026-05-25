package ar.edu.unahur.obj2.practicaparcial1.Nutricionista;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Criterios.RecetaTradicional;
import ar.edu.unahur.obj2.practicaparcial1.Humanos.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.Humanos.Nutricionista;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;

public class NutricionistaTest {
    @Test
    void dadoUnaNutricionista_CuandoAlCambiarSuNombreSeCambiaraAlNombreOriginal() {
        Nutricionista nutricionista = Nutricionista.getInstance();

        nutricionista.setNombre("Antonio Perez");
        
        assertEquals("Antonio Perez", nutricionista.getNombre());
    }

    @Test
    void alVisitarDebeCrearBatidoMagigo() {
        Nutricionista nutri = Nutricionista.getInstance();

        Cliente cliente = new Cliente("1234564", new RecetaTradicional());
        
        nutri.visitarAUnCliente(cliente);
        
        Receta recetaCliente = cliente.getRecetasRecibidas().get(0);
        
        assertTrue(cliente.getRecetasRecibidas().contains(recetaCliente));
        assertEquals("batido magico", recetaCliente.getNombre());
    }
}