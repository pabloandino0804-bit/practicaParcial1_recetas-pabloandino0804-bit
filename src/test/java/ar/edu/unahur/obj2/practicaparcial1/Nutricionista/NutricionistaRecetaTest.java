package ar.edu.unahur.obj2.practicaparcial1.Nutricionista;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Criterios.AltoValorNutri;
import ar.edu.unahur.obj2.practicaparcial1.Humanos.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.Humanos.Nutricionista;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.RecetaBase;

public class NutricionistaRecetaTest {
    @Test
    void alRecibirUnaReceta_SeVaAGuardarseEnLaListaDeRecetas() {
        Nutricionista nutricionista2 = Nutricionista.getInstance();

        Receta miReceta = new RecetaBase("Sopa de espinaca", "Yo Mismo", 2500, 12);

        nutricionista2.agregarReceta(miReceta);
        
        assertTrue(nutricionista2.getRecetasDisponibles().contains(miReceta));
    }

    @Test
    void alVisitarDebeCrearBatidoMagigo() {
        Nutricionista nutri = Nutricionista.getInstance();

        Cliente cliente = new Cliente("1234564", new AltoValorNutri(50));
        
        nutri.visitarAUnCliente(cliente);
        
        Receta recetaCliente = cliente.getRecetasRecibidas().get(0);
        
        assertTrue(cliente.getRecetasRecibidas().contains(recetaCliente));
        assertEquals("Sopa de espinaca", recetaCliente.getNombre());
    }
}
