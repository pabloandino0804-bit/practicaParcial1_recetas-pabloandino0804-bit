package ar.edu.unahur.obj2.practicaparcial1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Criterios.ComeTutti;
import ar.edu.unahur.obj2.practicaparcial1.Criterios.CriterioPref;
import ar.edu.unahur.obj2.practicaparcial1.Criterios.RecetaTradicional;
import ar.edu.unahur.obj2.practicaparcial1.Humanos.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.RecetaBase;

public class ClienteTest {
    private RecetaBase receta;

    @BeforeEach
    void setup() {
        receta = new RecetaBase(
            "Hamburgesa Criolla Con Queso", "rodriguez dario", 2500, 25
        );
    }

    @Test
    @DisplayName("Que se guarde correctamiente el criterio del cliente")
    void dadoUnClienteConCriterio_CuandoSePregutaSuDNI_DevuelveUnString() {
        CriterioPref criterio = new ComeTutti();
        Cliente cliente = new Cliente("1234", criterio);
        assertEquals(cliente.getDNI(), "1234");
    }

    @Test
    @DisplayName("Que devuelva true cuando le consulta al cliente si le gusta la receta dependiendo su criterio")
    void testCriterio() {
        CriterioPref criterio = new ComeTutti();
        Cliente cliente = new Cliente("1234", criterio);
        assertTrue(cliente.leGustaReceta(receta));
                assertTrue(cliente.getCriterio().leGusta(receta)); //Equivalente de la funcion leGustaReceta(receta)
    }

    @Test 
    void dadoUnCliente_sePuedeCambiarElCriterioQueSeDesee_GuardandoUnNuevoCritero() {
        CriterioPref criterio = new ComeTutti();
        Cliente cliente = new Cliente("1234", criterio);
        cliente.setCriterio(new RecetaTradicional());
        assertTrue(cliente.leGustaReceta(receta));
        assertTrue(cliente.getCriterio().leGusta(receta)); //Equivalente de la funcion leGustaReceta(receta)
    }

    @Test 
    void dadoUnCliente_sePuedeCambiarElCriterioQueSeDesee_GuardandoUnElCriterioTradicional() {
        CriterioPref criterio = new ComeTutti();
        Cliente cliente = new Cliente("1234", criterio);
        RecetaBase otraReceta = new RecetaBase("batido nutritivo", "yo y ms amigos", 4170, 10); 
        cliente.setCriterio(new RecetaTradicional());
        assertFalse(cliente.leGustaReceta(otraReceta));
        assertFalse(cliente.getCriterio().leGusta(otraReceta)); //Equivalente de la funcion leGustaReceta(receta)
    }

    @Test
    void dadoUnCliente_DevuelveUnaListaDeRecetasGustadas_EnDondeEstaGuardado_LaRecetaDada() {
        CriterioPref criterio = new ComeTutti();
        Cliente cliente = new Cliente("1234", criterio);
        cliente.recibirReceta(receta);
        assertTrue(cliente.getRecetasRecibidas().contains(receta));
    }
}
