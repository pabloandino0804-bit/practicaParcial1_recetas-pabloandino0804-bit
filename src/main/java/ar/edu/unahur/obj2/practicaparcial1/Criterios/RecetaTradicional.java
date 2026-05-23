package ar.edu.unahur.obj2.practicaparcial1.Criterios;

import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;

public class RecetaTradicional implements CriterioPref{

    @Override
    public Boolean leGusta(Receta receta) {
       return receta.esTradicional();
    }

}
