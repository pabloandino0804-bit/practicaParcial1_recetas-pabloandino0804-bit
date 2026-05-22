package ar.edu.unahur.obj2.practicaparcial1.Criterios;

import ar.edu.unahur.obj2.practicaparcial1.Receta;

public class AltoValorNutri implements ICriterio{
    private Double calorias;

    public AltoValorNutri(Double caloriasInicial){ 
        this.calorias = caloriasInicial;
    }

    @Override
    public Boolean criterio(Receta receta) {
        return receta.getValorNutricional() >= calorias;
    }

    public Double getCalorias(){
        return calorias;
    }

}
