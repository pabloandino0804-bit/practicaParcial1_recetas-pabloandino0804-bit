package ar.edu.unahur.obj2.practicaparcial1.Criterios;

import java.util.Set;

import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;

public class Premium implements CriterioPref{
    private Set<String> autoresPreferidos;
    
    public Premium(Set<String> autoresPreferidos) {
        this.autoresPreferidos = autoresPreferidos;
    }

    @Override
    public Boolean leGusta(Receta receta) {
        return autoresPreferidos.contains(receta.getNombre());
    }

}
