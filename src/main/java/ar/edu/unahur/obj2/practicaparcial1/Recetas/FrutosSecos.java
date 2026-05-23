package ar.edu.unahur.obj2.practicaparcial1.Recetas;

public abstract class FrutosSecos extends IngredienteAdicionalDecorator{

    public FrutosSecos(Receta recetaBase) {
        super(recetaBase);
    }

    @Override
    public Integer getValorNutricional() {
        return recetaBase.getValorNutricional() + 594;
    }
}
