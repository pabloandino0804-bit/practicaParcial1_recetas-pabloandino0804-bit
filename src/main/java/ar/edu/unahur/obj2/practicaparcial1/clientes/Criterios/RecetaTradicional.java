package ar.edu.unahur.obj2.practicaparcial1.clientes.Criterios;

import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.RodajasPalta;

public class RecetaTradicional implements CriterioPref{

    @Override
    public Boolean leGusta(Receta receta) {
       return receta.esTradicional();
    }

    @Override
    public Receta personalizar(Receta receta){
        return new RodajasPalta(receta);
    }
}
