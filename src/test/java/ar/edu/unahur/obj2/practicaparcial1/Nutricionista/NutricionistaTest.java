package ar.edu.unahur.obj2.practicaparcial1.Nutricionista;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Humanos.Nutricionista;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.RecetaBase;
import ar.edu.unahur.obj2.practicaparcial1.clientes.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.clientes.Criterios.AltoValorNutri;
import ar.edu.unahur.obj2.practicaparcial1.clientes.Criterios.RecetaTradicional;

public class NutricionistaTest {
    @Test
    void dadoUnaNutricionista_CuandoAlCambiarSuNombreSeCambiaraAlNombreOriginal() {
        Nutricionista nutricionista = Nutricionista.getInstance();

        nutricionista.setNombre("Antonio Perez");
        
        assertEquals("Antonio Perez", nutricionista.getNombre());
    }

    @Test
    void alVisitarDebeEntregarLaComidaSICumple() {
        Nutricionista nutricionista2 = Nutricionista.getInstance();

        Receta miReceta = new RecetaBase("Sopa de espinaca", "Yo Mismo", 2500, 50);

        nutricionista2.agregarReceta(miReceta);
        
        

        Nutricionista nutri = Nutricionista.getInstance();

        Cliente cliente = new Cliente("1234564", new RecetaTradicional());
        
        nutri.visitarAUnCliente(cliente);
        
        Receta recetaCliente = cliente.getRecetasRecibidas().get(0);
        
        assertTrue(!nutricionista2.getRecetasDisponibles().contains(miReceta));
        assertTrue(cliente.getRecetasRecibidas().contains(recetaCliente));
        assertEquals("Sopa de espinaca", recetaCliente.getNombre());
    }


    @Test
    void alVisitarDebeCrearBatidoMagigo() {
        Nutricionista nutri = Nutricionista.getInstance();

        Cliente cliente = new Cliente("1234564", new AltoValorNutri(5000));
        
        nutri.visitarAUnCliente(cliente);
        
        Receta recetaCliente = cliente.getRecetasRecibidas().get(0);
        
        assertTrue(cliente.getRecetasRecibidas().contains(recetaCliente));
        assertEquals("batido magico", recetaCliente.getNombre());
    }
}