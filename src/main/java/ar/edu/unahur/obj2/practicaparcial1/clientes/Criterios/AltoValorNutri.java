package ar.edu.unahur.obj2.practicaparcial1.clientes.Criterios;

import ar.edu.unahur.obj2.practicaparcial1.Recetas.FrutosSecos;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;
import ar.edu.unahur.obj2.practicaparcial1.Recetas.SemillasDeChia;

public class AltoValorNutri implements CriterioPref{
    private Integer calorias;

    public AltoValorNutri(Integer caloriasInicial){ 
        this.calorias = caloriasInicial;
    }

    @Override
    public Boolean leGusta(Receta receta) {
        return receta.getValorNutricional() > calorias;
    }

    @Override
    public Receta personalizar(Receta receta){
        return new FrutosSecos( new SemillasDeChia(receta));
    }
}
