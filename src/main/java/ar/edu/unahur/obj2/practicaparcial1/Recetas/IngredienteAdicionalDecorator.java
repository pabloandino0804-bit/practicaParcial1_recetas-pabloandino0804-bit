package ar.edu.unahur.obj2.practicaparcial1.Recetas;

import ar.edu.unahur.obj2.practicaparcial1.RecetaNulaException;

public abstract class IngredienteAdicionalDecorator implements Receta {
    protected final Receta recetaBase;

    public IngredienteAdicionalDecorator(Receta recetaBase) {
        if (null == recetaBase) {
            throw new RecetaNulaException("Receta base no debe ser nula");
        }
        this.recetaBase = recetaBase;
    }

    @Override
    public String getNombre() {
        return recetaBase.getNombre() + "con" + doGetNombre();
    }

    protected abstract String doGetNombre();

    @Override
    public String getNombreAutor() {
        return recetaBase.getNombreAutor();
    }

    @Override
    public void setAutor(String unAutor) {
        recetaBase.setAutor(unAutor);
    }

    @Override
    public Integer getValorNutricional() {
        return recetaBase.getValorNutricional() + this.doGetValorNutricional();
    }

    protected abstract Integer doGetValorNutricional();

    @Override
    public void setValorNutricional(Integer valorNutricional) {
        recetaBase.setValorNutricional(valorNutricional);
    }

    @Override
    public Integer getAniosTradicion() {
        return recetaBase.getAniosTradicion();
    }

    @Override
    public Boolean esTradicional() {
        return recetaBase.esTradicional();
    }
}
