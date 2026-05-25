package ar.edu.unahur.obj2.practicaparcial1.Recetas;

public class RodajasPalta extends IngredienteAdicionalDecorator {

    public RodajasPalta(Receta recetaBase) {
        super(recetaBase);
    }

    @Override
    protected String doGetNombre() {
        return "Rodajas de palta";
    }

    @Override
    protected Integer doGetValorNutricional() {
        return 160;
    }
}