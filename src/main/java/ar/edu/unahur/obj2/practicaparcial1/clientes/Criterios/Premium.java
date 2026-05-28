package ar.edu.unahur.obj2.practicaparcial1.clientes.Criterios;

import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;

public class Premium implements CriterioPref{
    private List<String> autoresPreferidos;
    
    public Premium(List<String> autoresPreferidos) {
        this.autoresPreferidos = autoresPreferidos;
    }

    @Override
    public Boolean leGusta(Receta receta) {
        return autoresPreferidos.contains(receta.getNombreAutor());
    }

    @Override
    public Receta personalizar(Receta receta){
        return receta;
    }
}
