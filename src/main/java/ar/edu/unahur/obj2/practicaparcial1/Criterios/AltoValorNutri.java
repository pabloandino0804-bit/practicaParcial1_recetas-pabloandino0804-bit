package ar.edu.unahur.obj2.practicaparcial1.Criterios;

import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;

public class AltoValorNutri implements CriterioPref{
    private Integer calorias;

    public AltoValorNutri(Integer caloriasInicial){ 
        this.calorias = caloriasInicial;
    }

    @Override
    public Boolean leGusta(Receta receta) {
        return receta.getValorNutricional() > calorias;
    }

    public Integer getCalorias(){
        return calorias;
    }

}
