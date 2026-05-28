package ar.edu.unahur.obj2.practicaparcial1.clientes.Criterios;

import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;

public class ComeTutti implements CriterioPref{

    @Override
    public Boolean leGusta(Receta receta) {
        return true;
    }

    @Override
    public Receta personalizar(Receta receta){
        return receta;
    }
}
