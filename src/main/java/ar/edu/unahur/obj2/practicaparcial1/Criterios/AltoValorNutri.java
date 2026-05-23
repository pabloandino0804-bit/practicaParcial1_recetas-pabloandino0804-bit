package ar.edu.unahur.obj2.practicaparcial1.Criterios;

import ar.edu.unahur.obj2.practicaparcial1.Recetas.Receta;

public class AltoValorNutri implements CriterioPref{
    private Double calorias;

    public AltoValorNutri(Double caloriasInicial){ 
        this.calorias = caloriasInicial;
    }

    @Override
    public Boolean leGusta(Receta receta) {
        return receta.getValorNutricional() > calorias;
    }

    public Double getCalorias(){
        return calorias;
    }

}
