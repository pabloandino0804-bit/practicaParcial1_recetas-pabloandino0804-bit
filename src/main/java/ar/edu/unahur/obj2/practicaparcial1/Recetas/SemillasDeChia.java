package ar.edu.unahur.obj2.practicaparcial1.Recetas;

public class SemillasDeChia extends IngredienteAdicionalDecorator {
    
    public SemillasDeChia(Receta recetaBase) {
        super(recetaBase);
    }

    @Override
    protected String doGetNombre() {
        return "Semillas de chia";
    }

    @Override
    public Integer doGetValorNutricional() {
        return 490;
    }
}