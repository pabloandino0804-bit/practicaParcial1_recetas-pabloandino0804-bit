package ar.edu.unahur.obj2.practicaparcial1.Humanos;

import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.Criterios.ComeTutti;
import ar.edu.unahur.obj2.practicaparcial1.Criterios.CriterioPref;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;

public class Cliente {
    private String dni;
    private CriterioPref criterio;
    private List<Receta> recetasRecibidas;

    public Cliente (String dni, CriterioPref criterio, List<Receta> recetasRecibidas) {
        this.dni = dni;
        this.criterio = new ComeTutti();
        this.recetasRecibidas = recetasRecibidas;
    }

    public String getDNI() {
        return dni;   
    }

    public CriterioPref getCriterio() {
        return criterio;
    }

    public Boolean loSatiface(Receta unaReceta) {
        return this.criterio.leGusta(unaReceta);
    }

    public List<Receta> getRecetasRecibidas() {
        return recetasRecibidas;
    }

    public void setCriterio(CriterioPref nuevoCriterio) {
        this.criterio = nuevoCriterio;
    }

    public void recibirReceta(Receta unarReceta) {
        this.recetasRecibidas.add(unarReceta);
    }
}