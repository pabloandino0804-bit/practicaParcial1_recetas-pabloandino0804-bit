package ar.edu.unahur.obj2.practicaparcial1.Criterios;

import java.util.List;
import java.util.Arrays;

import ar.edu.unahur.obj2.practicaparcial1.Receta;

public class CPremium  implements ICriterio{
    private List<String> autoresPreferidos =  Arrays.asList("Gato Dumas", "Francis Mallmann","Germán Martitegui");

    @Override
    public Boolean criterio(Receta receta) {
        return autoresPreferidos.contains(receta.getNombre());
    }

}
