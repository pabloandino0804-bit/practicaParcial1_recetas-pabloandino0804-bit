package ar.edu.unahur.obj2.practicaparcial1.Recetas;

public class FrutosSecos extends IngredienteAdicionalDecorator{

    public FrutosSecos(Receta recetaBase) {
        super(recetaBase);
    }

    @Override
    protected String doGetNombre() {
        return "Frutos secos";
    }

    @Override
    protected Integer doGetValorNutricional() {
        return 594;
    }
}