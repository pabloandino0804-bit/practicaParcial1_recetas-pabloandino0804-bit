package ar.edu.unahur.obj2.practicaparcial1.Humanos;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.Criterios.ComeTutti;
import ar.edu.unahur.obj2.practicaparcial1.Criterios.CriterioPref;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;

public class Cliente {
    private String dni;
    private CriterioPref criterio;
    private List<Receta> recetasRecibidas = new ArrayList<Receta>();

    public Cliente (String dni, CriterioPref criterio) {
        this.dni = dni;
        this.criterio = new ComeTutti();
    }

    public String getDNI() {
        return dni;   
    }

    public CriterioPref getCriterio() {
        return criterio;
    }

    public Boolean leGustaReceta(Receta unaReceta) {
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