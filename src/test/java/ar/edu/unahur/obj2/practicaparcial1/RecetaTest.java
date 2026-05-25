package ar.edu.unahur.obj2.practicaparcial1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Recetas.FrutosSecos;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.SemillasDeChia;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.RodajasPalta;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.RecetaBase;

public class RecetaTest {
    private Receta receta;

    @BeforeEach
    void setup() {
        receta = new RecetaBase("Atun horneado con oregano", "rodriguez dario", 2500, 45);
    }

    @AfterEach
    void teardown() {
        receta = null;
    }

    @Test
    void testNombre() {
        assertEquals(receta.getNombre(), "Atun horneado con oregano");
    }

    @Test
    void daoUnaReceta_AlCambiarElNombreDelAutor_SeGUardaraElNombreCambiado() {
        receta.setAutor("Lucia Fernandez");
        assertEquals(receta.getNombreAutor(), "Lucia Fernandez");
    }

    @Test
    void nutricionTest() {
        receta.setValorNutricional(3570);
        assertEquals(receta.getValorNutricional(), 3570);
    }

    @Test
    void dadoUnaReceta_esTradicionalSiTieneAlMenos_20AñosDeTradicion() {
        assertTrue(receta.esTradicional());
        assertEquals(receta.getAniosTradicion(), 45);
    }

    @Test
    void dadoUnaRecetaDecorator_siElAtribusoInterfazEsNulo_LanzaraUnException() {
        assertThrows(RecetaNulaException.class, () -> new SemillasDeChia(null));
    }

    @Test
    void daoUnaRecetaDecorator_alCambiarElNombreDelAutor_SeGUardaraElNombreCambiado() {
        Receta recetaAdicional = new FrutosSecos(receta);
        recetaAdicional.setAutor("Lucia Fernandez");
        assertEquals(recetaAdicional.getNombreAutor(), "Lucia Fernandez");
    }

    @Test
    void dadoUnaRecetaDecorator_esTradicionalSiTieneAlMenos_20AñosDeTradicion() {
        Receta recetaAdicional = new FrutosSecos(receta);
        assertTrue(recetaAdicional.esTradicional());
        assertEquals(recetaAdicional.getAniosTradicion(), 45);
    }

    @Test 
    void dadoUnaRecetaConValor3570EnNutri_LeAgregaSemillasDeChiaComoIngredienteAdicional_MinetrasSeMantegaLaRecetaOriginalConAdicionDe490() {
        Receta recetaSemillas = new SemillasDeChia(receta);
        recetaSemillas.setValorNutricional(3570);
        assertEquals(recetaSemillas.getValorNutricional(), 4060);
    }

    @Test
    void dadoUnaRecetaConSemillasDeChia_CuandoDescribeSuNombreLeApareceConSemmilasDeChia() {
        Receta recetaSemillas = new SemillasDeChia(receta);
        assertEquals(recetaSemillas.getNombre(), receta.getNombre() + "con" + "Semillas de chia");
    }

    @Test 
    void dadoUnaReceta_LeAgregaRodajasDePaltaComoIngredienteAdicional_MinetrasSeMantegaLaRecetaOriginalConAdicionDe160() {
        Receta recetaPalta = new RodajasPalta(receta);
        assertEquals(recetaPalta.getValorNutricional(), 2660);
    }

    @Test
    void dadoUnaRecetaConPalta_CuandoDescribeSuNombreLeApareceConRodajasDePalta() {
        Receta recetaPalta = new RodajasPalta(receta);
        assertEquals(recetaPalta.getNombre(), receta.getNombre() + "con" + "Rodajas de palta");
    }

    @Test 
    void dadoUnaReceta_LeAgregaFrutosSecosComoIngredienteAdicional_MinetrasSeMantegaLaRecetaOriginalConAdicionDe594() {
        Receta recetaFrutosSecos = new FrutosSecos(receta);
        assertEquals(recetaFrutosSecos.getValorNutricional(), 3094);
    }

    @Test
    void dadoUnaReceta_() {
        Receta recetaFrutosSecos = new FrutosSecos(receta);
        assertEquals(recetaFrutosSecos.getNombre(), receta.getNombre() + "con" + "Frutos secos");
    }
}
