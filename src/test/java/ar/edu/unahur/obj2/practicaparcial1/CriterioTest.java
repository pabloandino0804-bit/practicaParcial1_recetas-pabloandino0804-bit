package ar.edu.unahur.obj2.practicaparcial1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Criterios.AltoValorNutri;
import ar.edu.unahur.obj2.practicaparcial1.Criterios.ComeTutti;
import ar.edu.unahur.obj2.practicaparcial1.Criterios.CriterioPref;
import ar.edu.unahur.obj2.practicaparcial1.Criterios.Premium;
import ar.edu.unahur.obj2.practicaparcial1.Criterios.RecetaTradicional;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.RecetaBase;

public class CriterioTest {
    private RecetaBase receta;

    @BeforeEach
    void setup() {
        receta = new RecetaBase("Hamburgesa Criolla Con Queso", "rodriguez dario", 2500, 45);
    }

    @Test
    @DisplayName("Que se guarde correctamiente el criterio del cliente")
    void testCriterio_ComeTutti() {
        CriterioPref criterio = new ComeTutti();
        assertTrue(criterio.leGusta(receta));
    }

    @Test
    void testCriterio_AltoValorNutricional() {
        CriterioPref criterio = new AltoValorNutri(2350);
        assertTrue(criterio.leGusta(receta));
    }

    @Test
    void testCriterio_Premium() {
        List<String> autores = new ArrayList<>();
        autores.add("rodriguez dario");
        CriterioPref criterio = new Premium(autores);
        assertTrue(criterio.leGusta(receta));
    }

    @Test
    void testCriterio_RecetaTradicional() {
        CriterioPref recetaTradicional = new RecetaTradicional();
        assertTrue(recetaTradicional.leGusta(receta));
    }
}
