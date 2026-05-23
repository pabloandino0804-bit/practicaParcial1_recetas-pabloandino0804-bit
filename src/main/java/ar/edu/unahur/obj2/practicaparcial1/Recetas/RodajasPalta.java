package ar.edu.unahur.obj2.practicaparcial1.Recetas;

public abstract class RodajasPalta extends IngredienteAdicionalDecorator {

    public RodajasPalta(Receta recetaBase) {
        super(recetaBase);
    }

    @Override
    public Integer getValorNutricional() {
        return recetaBase.getValorNutricional() + 160;
    }
}