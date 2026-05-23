package ar.edu.unahur.obj2.practicaparcial1.Recetas;

public abstract class SemillasDeChia extends IngredienteAdicionalDecorator {
    
    public SemillasDeChia(Receta recetaBase) {
        super(recetaBase);
    }

    @Override
    public Integer getValorNutricional() {
        return recetaBase.getValorNutricional() + 594;
    }
}