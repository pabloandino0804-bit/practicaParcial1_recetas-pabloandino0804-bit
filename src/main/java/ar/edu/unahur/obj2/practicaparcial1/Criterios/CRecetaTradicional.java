package ar.edu.unahur.obj2.practicaparcial1.Criterios;

import ar.edu.unahur.obj2.practicaparcial1.Receta;

public class CRecetaTradicional implements ICriterio{

    @Override
    public Boolean criterio(Receta receta) {
       return receta.esTradicional();
    }

}
