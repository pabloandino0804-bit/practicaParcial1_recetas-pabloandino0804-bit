package ar.edu.unahur.obj2.practicaparcial1.Recetas;

public abstract class IngredienteAdicionalDecorator implements Receta {
    protected Receta recetaBase;

    public IngredienteAdicionalDecorator(Receta recetaBase) {
        if (null == recetaBase) {
            throw new NullPointerException();
        }
        this.recetaBase = recetaBase;
    }
}
