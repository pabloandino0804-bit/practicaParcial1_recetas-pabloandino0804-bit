package ar.edu.unahur.obj2.practicaparcial1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Criterios.ComeTutti;
import ar.edu.unahur.obj2.practicaparcial1.Criterios.CriterioPref;
import ar.edu.unahur.obj2.practicaparcial1.Humanos.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.RecetaBase;

public class ClienteTest {
    private RecetaBase receta;

    @BeforeEach
    void setup() {
        receta = new RecetaBase("Hamburgesa Criolla Con Queso", "rodriguez dario", 2500, 45);
    }

    @Test
    @DisplayName("Que se guarde correctamiente el criterio del cliente")
    void dadoUnClienteConCriterio_CuandoSePregutaSuDNI_DevuelveUnString() {
        CriterioPref criterio = new ComeTutti();
        Cliente cliente = new Cliente("1234", criterio);
        assertEquals(cliente.getDNI(), "1234");
    }

    @Test
    void test() {
        CriterioPref criterio = new ComeTutti();
        Cliente cliente = new Cliente("1234", criterio);
        assertTrue(cliente.leGustaReceta(receta));
    }
}
