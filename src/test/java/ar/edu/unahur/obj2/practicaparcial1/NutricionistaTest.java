package ar.edu.unahur.obj2.practicaparcial1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Humanos.Nutricionista;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.RecetaBase;

public class NutricionistaTest {
    @Test
    void Test() {
        RecetaBase risotto = new RecetaBase("Risotto", "Michelle", 25000, 50); 
        Nutricionista nutri = Nutricionista.getInstance();
        Nutricionista.getInstance().agregarReceta(risotto);
        assertTrue(nutri.getRecetasDisponibles().contains(risotto));
    }
}
